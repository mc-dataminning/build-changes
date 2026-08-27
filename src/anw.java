import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ei.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ei.a("targets", eu.d())
                              .then(
                                 ei.a("recipe", fi.a())
                                    .suggests(ig.b)
                                    .executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), Collections.singleton(fi.b($$0x, "recipe"))))
                              ))
                           .then(ei.a("*").executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), ((eh)$$0x.getSource()).l().aJ().b())))
                     )
               ))
            .then(
               ei.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ei.a("targets", eu.d())
                           .then(
                              ei.a("recipe", fi.a())
                                 .suggests(ig.b)
                                 .executes($$0x -> b((eh)$$0x.getSource(), eu.f($$0x, "targets"), Collections.singleton(fi.b($$0x, "recipe"))))
                           ))
                        .then(ei.a("*").executes($$0x -> b((eh)$$0x.getSource(), eu.f($$0x, "targets"), ((eh)$$0x.getSource()).l().aJ().b())))
                  )
            )
      );
   }

   private static int a(eh $$0, Collection<aqu> $$1, Collection<czc<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqu $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> xe.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(eh $$0, Collection<aqu> $$1, Collection<czc<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqu $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> xe.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
