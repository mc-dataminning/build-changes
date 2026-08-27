import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class ahy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  du.a("give")
                     .then(
                        ((RequiredArgumentBuilder)du.a("targets", ee.d())
                              .then(
                                 du.a("recipe", es.a())
                                    .suggests(gm.b)
                                    .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), Collections.singleton(es.b($$0x, "recipe"))))
                              ))
                           .then(du.a("*").executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ((dt)$$0x.getSource()).l().aE().b())))
                     )
               ))
            .then(
               du.a("take")
                  .then(
                     ((RequiredArgumentBuilder)du.a("targets", ee.d())
                           .then(
                              du.a("recipe", es.a())
                                 .suggests(gm.b)
                                 .executes($$0x -> b((dt)$$0x.getSource(), ee.f($$0x, "targets"), Collections.singleton(es.b($$0x, "recipe"))))
                           ))
                        .then(du.a("*").executes($$0x -> b((dt)$$0x.getSource(), ee.f($$0x, "targets"), ((dt)$$0x.getSource()).l().aE().b())))
                  )
            )
      );
   }

   private static int a(dt $$0, Collection<aks> $$1, Collection<cmk<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aks $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tl.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tl.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(dt $$0, Collection<aks> $$1, Collection<cmk<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aks $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tl.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tl.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
