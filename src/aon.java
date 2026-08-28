import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aon {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ek.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ek.a("targets", ew.d())
                              .then(
                                 ek.a("recipe", fj.a(mh.bu))
                                    .executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), Collections.singleton(fj.d($$0x, "recipe"))))
                              ))
                           .then(ek.a("*").executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), ((ej)$$0x.getSource()).l().aI().d())))
                     )
               ))
            .then(
               ek.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ek.a("targets", ew.d())
                           .then(
                              ek.a("recipe", fj.a(mh.bu))
                                 .executes($$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "targets"), Collections.singleton(fj.d($$0x, "recipe"))))
                           ))
                        .then(ek.a("*").executes($$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "targets"), ((ej)$$0x.getSource()).l().aI().d())))
                  )
            )
      );
   }

   private static int a(ej $$0, Collection<arr> $$1, Collection<deg<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (arr $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wy.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ej $$0, Collection<arr> $$1, Collection<deg<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (arr $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wy.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
