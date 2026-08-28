import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aoy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  el.a("give")
                     .then(
                        ((RequiredArgumentBuilder)el.a("targets", ex.d())
                              .then(
                                 el.a("recipe", fk.a(mi.bv))
                                    .executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), Collections.singleton(fk.d($$0x, "recipe"))))
                              ))
                           .then(el.a("*").executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), ((ek)$$0x.getSource()).l().aI().d())))
                     )
               ))
            .then(
               el.a("take")
                  .then(
                     ((RequiredArgumentBuilder)el.a("targets", ex.d())
                           .then(
                              el.a("recipe", fk.a(mi.bv))
                                 .executes($$0x -> b((ek)$$0x.getSource(), ex.f($$0x, "targets"), Collections.singleton(fk.d($$0x, "recipe"))))
                           ))
                        .then(el.a("*").executes($$0x -> b((ek)$$0x.getSource(), ex.f($$0x, "targets"), ((ek)$$0x.getSource()).l().aI().d())))
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<asc> $$1, Collection<dfg<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (asc $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xg.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> xg.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ek $$0, Collection<asc> $$1, Collection<dfg<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (asc $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xg.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> xg.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
