import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class ahs {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ds.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ds.a("targets", ec.d())
                              .then(
                                 ds.a("recipe", eq.a())
                                    .suggests(gk.b)
                                    .executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), Collections.singleton(eq.b($$0x, "recipe"))))
                              ))
                           .then(ds.a("*").executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), ((dr)$$0x.getSource()).l().aE().b())))
                     )
               ))
            .then(
               ds.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ds.a("targets", ec.d())
                           .then(
                              ds.a("recipe", eq.a())
                                 .suggests(gk.b)
                                 .executes($$0x -> b((dr)$$0x.getSource(), ec.f($$0x, "targets"), Collections.singleton(eq.b($$0x, "recipe"))))
                           ))
                        .then(ds.a("*").executes($$0x -> b((dr)$$0x.getSource(), ec.f($$0x, "targets"), ((dr)$$0x.getSource()).l().aE().b())))
                  )
            )
      );
   }

   private static int a(dr $$0, Collection<akl> $$1, Collection<cma<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (akl $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tf.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> tf.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(dr $$0, Collection<akl> $$1, Collection<cma<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (akl $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tf.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> tf.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
