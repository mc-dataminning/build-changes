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

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ej.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ej.a("targets", ev.d())
                              .then(
                                 ej.a("recipe", fi.a(mg.bt))
                                    .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), Collections.singleton(fi.d($$0x, "recipe"))))
                              ))
                           .then(ej.a("*").executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), ((ei)$$0x.getSource()).l().aI().e())))
                     )
               ))
            .then(
               ej.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ej.a("targets", ev.d())
                           .then(
                              ej.a("recipe", fi.a(mg.bt))
                                 .executes($$0x -> b((ei)$$0x.getSource(), ev.f($$0x, "targets"), Collections.singleton(fi.d($$0x, "recipe"))))
                           ))
                        .then(ej.a("*").executes($$0x -> b((ei)$$0x.getSource(), ev.f($$0x, "targets"), ((ei)$$0x.getSource()).l().aI().e())))
                  )
            )
      );
   }

   private static int a(ei $$0, Collection<arr> $$1, Collection<ddu<?>> $$2) throws CommandSyntaxException {
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

   private static int b(ei $$0, Collection<arr> $$1, Collection<ddu<?>> $$2) throws CommandSyntaxException {
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
