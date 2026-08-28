import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aoa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ey.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ey.a("targets", fk.d())
                              .then(
                                 ey.a("recipe", fx.a(mc.bk))
                                    .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), Collections.singleton(fx.d($$0x, "recipe"))))
                              ))
                           .then(ey.a("*").executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), ((ex)$$0x.getSource()).l().aI().e())))
                     )
               ))
            .then(
               ey.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ey.a("targets", fk.d())
                           .then(
                              ey.a("recipe", fx.a(mc.bk))
                                 .executes($$0x -> b((ex)$$0x.getSource(), fk.f($$0x, "targets"), Collections.singleton(fx.d($$0x, "recipe"))))
                           ))
                        .then(ey.a("*").executes($$0x -> b((ex)$$0x.getSource(), fk.f($$0x, "targets"), ((ex)$$0x.getSource()).l().aI().e())))
                  )
            )
      );
   }

   private static int a(ex $$0, Collection<ard> $$1, Collection<dbh<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (ard $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wo.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> wo.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ex $$0, Collection<ard> $$1, Collection<dbh<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (ard $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wo.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> wo.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
