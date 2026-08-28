import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("pos", gp.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("block", gm.a($$1))
                                 .executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "pos"), gm.a($$0x, "block"), aog.b.a, null)))
                              .then(eu.a("destroy").executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "pos"), gm.a($$0x, "block"), aog.b.b, null))))
                           .then(
                              eu.a("keep")
                                 .executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "pos"), gm.a($$0x, "block"), aog.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(eu.a("replace").executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "pos"), gm.a($$0x, "block"), aog.b.a, null)))
                  )
            )
      );
   }

   private static int a(et $$0, jd $$1, gk $$2, aog.b $$3, @Nullable Predicate<dte> $$4) throws CommandSyntaxException {
      aqt $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dte($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aog.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dqf $$7 = $$5.c_($$1);
            bqh.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> wy.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      gk filter(eje var1, jd var2, gk var3, aqt var4);
   }

   public static enum b {
      a,
      b;
   }
}
