import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class akv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("pos", fm.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("block", fj.a($$1))
                                 .executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), akv.b.a, null)))
                              .then(dt.a("destroy").executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), akv.b.b, null))))
                           .then(
                              dt.a("keep")
                                 .executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), akv.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(dt.a("replace").executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), akv.b.a, null)))
                  )
            )
      );
   }

   private static int a(ds $$0, hx $$1, fh $$2, akv.b $$3, @Nullable Predicate<djl> $$4) throws CommandSyntaxException {
      and $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new djl($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == akv.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dgv $$7 = $$5.c_($$1);
            bjs.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> vf.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fh filter(dyy var1, hx var2, fh var3, and var4);
   }

   public static enum b {
      a,
      b;
   }
}
