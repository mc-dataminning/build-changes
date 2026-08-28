import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aoe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  eq.a("give")
                     .then(
                        ((RequiredArgumentBuilder)eq.a("targets", fc.d())
                              .then(
                                 eq.a("recipe", fq.a())
                                    .suggests(io.b)
                                    .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), Collections.singleton(fq.b($$0x, "recipe"))))
                              ))
                           .then(eq.a("*").executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), ((ep)$$0x.getSource()).l().aJ().b())))
                     )
               ))
            .then(
               eq.a("take")
                  .then(
                     ((RequiredArgumentBuilder)eq.a("targets", fc.d())
                           .then(
                              eq.a("recipe", fq.a())
                                 .suggests(io.b)
                                 .executes($$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), Collections.singleton(fq.b($$0x, "recipe"))))
                           ))
                        .then(eq.a("*").executes($$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), ((ep)$$0x.getSource()).l().aJ().b())))
                  )
            )
      );
   }

   private static int a(ep $$0, Collection<arc> $$1, Collection<cys<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (arc $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xl.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> xl.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ep $$0, Collection<arc> $$1, Collection<cys<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (arc $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xl.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> xl.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
