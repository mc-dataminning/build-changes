import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ail {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               du.a("pos", fk.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("block", fh.a($$1))
                                 .executes($$0x -> a((dt)$$0x.getSource(), fk.a($$0x, "pos"), fh.a($$0x, "block"), ail.b.a, null)))
                              .then(du.a("destroy").executes($$0x -> a((dt)$$0x.getSource(), fk.a($$0x, "pos"), fh.a($$0x, "block"), ail.b.b, null))))
                           .then(
                              du.a("keep")
                                 .executes($$0x -> a((dt)$$0x.getSource(), fk.a($$0x, "pos"), fh.a($$0x, "block"), ail.b.a, $$0xx -> $$0xx.c().t($$0xx.d())))
                           ))
                        .then(du.a("replace").executes($$0x -> a((dt)$$0x.getSource(), fk.a($$0x, "pos"), fh.a($$0x, "block"), ail.b.a, null)))
                  )
            )
      );
   }

   private static int a(dt $$0, gw $$1, ff $$2, ail.b $$3, @Nullable Predicate<dfp> $$4) throws CommandSyntaxException {
      aks $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dfp($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == ail.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dcx $$7 = $$5.c_($$1);
            bgr.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> tn.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      ff filter(dvc var1, gw var2, ff var3, aks var4);
   }

   public static enum b {
      a,
      b;
   }
}
