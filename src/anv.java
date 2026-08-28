import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class anv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  eu.a("give")
                     .then(
                        ((RequiredArgumentBuilder)eu.a("targets", fg.d())
                              .then(
                                 eu.a("recipe", fu.a())
                                    .suggests(is.b)
                                    .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), Collections.singleton(fu.b($$0x, "recipe"))))
                              ))
                           .then(eu.a("*").executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), ((et)$$0x.getSource()).l().aJ().d())))
                     )
               ))
            .then(
               eu.a("take")
                  .then(
                     ((RequiredArgumentBuilder)eu.a("targets", fg.d())
                           .then(
                              eu.a("recipe", fu.a())
                                 .suggests(is.b)
                                 .executes($$0x -> b((et)$$0x.getSource(), fg.f($$0x, "targets"), Collections.singleton(fu.b($$0x, "recipe"))))
                           ))
                        .then(eu.a("*").executes($$0x -> b((et)$$0x.getSource(), fg.f($$0x, "targets"), ((et)$$0x.getSource()).l().aJ().d())))
                  )
            )
      );
   }

   private static int a(et $$0, Collection<aqv> $$1, Collection<czb<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqv $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wz.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> wz.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(et $$0, Collection<aqv> $$1, Collection<czb<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqv $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wz.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> wz.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
