import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aov {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               eq.a("pos", gl.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("block", gi.a($$1))
                                 .executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "pos"), gi.a($$0x, "block"), aov.b.a, null)))
                              .then(eq.a("destroy").executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "pos"), gi.a($$0x, "block"), aov.b.b, null))))
                           .then(
                              eq.a("keep")
                                 .executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "pos"), gi.a($$0x, "block"), aov.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(eq.a("replace").executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "pos"), gi.a($$0x, "block"), aov.b.a, null)))
                  )
            )
      );
   }

   private static int a(ep $$0, iz $$1, gg $$2, aov.b $$3, @Nullable Predicate<dsh> $$4) throws CommandSyntaxException {
      arf $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dsh($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aov.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dpi $$7 = $$5.c_($$1);
            bqm.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> xp.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      gg filter(eid var1, iz var2, gg var3, arf var4);
   }

   public static enum b {
      a,
      b;
   }
}
