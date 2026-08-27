import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aoj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ei.a("pos", gd.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("block", ga.a($$1))
                                 .executes($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "pos"), ga.a($$0x, "block"), aoj.b.a, null)))
                              .then(ei.a("destroy").executes($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "pos"), ga.a($$0x, "block"), aoj.b.b, null))))
                           .then(
                              ei.a("keep")
                                 .executes($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "pos"), ga.a($$0x, "block"), aoj.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ei.a("replace").executes($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "pos"), ga.a($$0x, "block"), aoj.b.a, null)))
                  )
            )
      );
   }

   private static int a(eh $$0, ir $$1, fy $$2, aoj.b $$3, @Nullable Predicate<dtg> $$4) throws CommandSyntaxException {
      aqt $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dtg($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aoj.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dqc $$7 = $$5.c_($$1);
            bpr.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> xe.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fy filter(ejl var1, ir var2, fy var3, aqt var4);
   }

   public static enum b {
      a,
      b;
   }
}
