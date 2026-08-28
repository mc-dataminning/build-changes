import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aoj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ev.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ev.a("targets", fh.d())
                              .then(
                                 ev.a("recipe", fv.a())
                                    .suggests(iu.b)
                                    .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), Collections.singleton(fv.b($$0x, "recipe"))))
                              ))
                           .then(ev.a("*").executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), ((eu)$$0x.getSource()).l().aI().f())))
                     )
               ))
            .then(
               ev.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ev.a("targets", fh.d())
                           .then(
                              ev.a("recipe", fv.a())
                                 .suggests(iu.b)
                                 .executes($$0x -> b((eu)$$0x.getSource(), fh.f($$0x, "targets"), Collections.singleton(fv.b($$0x, "recipe"))))
                           ))
                        .then(ev.a("*").executes($$0x -> b((eu)$$0x.getSource(), fh.f($$0x, "targets"), ((eu)$$0x.getSource()).l().aI().f())))
                  )
            )
      );
   }

   private static int a(eu $$0, Collection<ark> $$1, Collection<dam<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (ark $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().R_()), true);
         } else {
            $$0.a(() -> xe.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(eu $$0, Collection<ark> $$1, Collection<dam<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (ark $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().R_()), true);
         } else {
            $$0.a(() -> xe.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
