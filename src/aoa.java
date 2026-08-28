import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aoa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               er.a("pos", gm.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("block", gj.a($$1))
                                 .executes($$0x -> a((eq)$$0x.getSource(), gm.a($$0x, "pos"), gj.a($$0x, "block"), aoa.b.a, null)))
                              .then(er.a("destroy").executes($$0x -> a((eq)$$0x.getSource(), gm.a($$0x, "pos"), gj.a($$0x, "block"), aoa.b.b, null))))
                           .then(
                              er.a("keep")
                                 .executes($$0x -> a((eq)$$0x.getSource(), gm.a($$0x, "pos"), gj.a($$0x, "block"), aoa.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(er.a("replace").executes($$0x -> a((eq)$$0x.getSource(), gm.a($$0x, "pos"), gj.a($$0x, "block"), aoa.b.a, null)))
                  )
            )
      );
   }

   private static int a(eq $$0, ja $$1, gh $$2, aoa.b $$3, @Nullable Predicate<dsl> $$4) throws CommandSyntaxException {
      aqk $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dsl($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aoa.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dpn $$7 = $$5.c_($$1);
            bpu.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> wu.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      gh filter(eii var1, ja var2, gh var3, aqk var4);
   }

   public static enum b {
      a,
      b;
   }
}
