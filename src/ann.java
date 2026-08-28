import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class ann {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  er.a("give")
                     .then(
                        ((RequiredArgumentBuilder)er.a("targets", fd.d())
                              .then(
                                 er.a("recipe", fr.a())
                                    .suggests(ip.b)
                                    .executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), Collections.singleton(fr.b($$0x, "recipe"))))
                              ))
                           .then(er.a("*").executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), ((eq)$$0x.getSource()).l().aJ().d())))
                     )
               ))
            .then(
               er.a("take")
                  .then(
                     ((RequiredArgumentBuilder)er.a("targets", fd.d())
                           .then(
                              er.a("recipe", fr.a())
                                 .suggests(ip.b)
                                 .executes($$0x -> b((eq)$$0x.getSource(), fd.f($$0x, "targets"), Collections.singleton(fr.b($$0x, "recipe"))))
                           ))
                        .then(er.a("*").executes($$0x -> b((eq)$$0x.getSource(), fd.f($$0x, "targets"), ((eq)$$0x.getSource()).l().aJ().d())))
                  )
            )
      );
   }

   private static int a(eq $$0, Collection<aql> $$1, Collection<cyi<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aql $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(eq $$0, Collection<aql> $$1, Collection<cyi<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aql $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
