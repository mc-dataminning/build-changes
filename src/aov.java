import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aov {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ev.a("pos", gq.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("block", gn.a($$1))
                                 .executes($$0x -> a((eu)$$0x.getSource(), gq.a($$0x, "pos"), gn.a($$0x, "block"), aov.b.a, null)))
                              .then(ev.a("destroy").executes($$0x -> a((eu)$$0x.getSource(), gq.a($$0x, "pos"), gn.a($$0x, "block"), aov.b.b, null))))
                           .then(
                              ev.a("keep")
                                 .executes($$0x -> a((eu)$$0x.getSource(), gq.a($$0x, "pos"), gn.a($$0x, "block"), aov.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ev.a("replace").executes($$0x -> a((eu)$$0x.getSource(), gq.a($$0x, "pos"), gn.a($$0x, "block"), aov.b.a, null)))
                  )
            )
      );
   }

   private static int a(eu $$0, jf $$1, gl $$2, aov.b $$3, @Nullable Predicate<duw> $$4) throws CommandSyntaxException {
      arj $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new duw($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aov.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().l() || !$$5.a_($$1).l();
         } else {
            drv $$7 = $$5.c_($$1);
            brj.a_($$7);
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
      gl filter(eky var1, jf var2, gl var3, arj var4);
   }

   public static enum b {
      a,
      b;
   }
}
