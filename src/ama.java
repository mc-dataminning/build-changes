import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class ama {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  dv.a("give")
                     .then(
                        ((RequiredArgumentBuilder)dv.a("targets", eh.d())
                              .then(
                                 dv.a("recipe", ev.a())
                                    .suggests(hp.b)
                                    .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), Collections.singleton(ev.b($$0x, "recipe"))))
                              ))
                           .then(dv.a("*").executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), ((du)$$0x.getSource()).l().aG().b())))
                     )
               ))
            .then(
               dv.a("take")
                  .then(
                     ((RequiredArgumentBuilder)dv.a("targets", eh.d())
                           .then(
                              dv.a("recipe", ev.a())
                                 .suggests(hp.b)
                                 .executes($$0x -> b((du)$$0x.getSource(), eh.f($$0x, "targets"), Collections.singleton(ev.b($$0x, "recipe"))))
                           ))
                        .then(dv.a("*").executes($$0x -> b((du)$$0x.getSource(), eh.f($$0x, "targets"), ((du)$$0x.getSource()).l().aG().b())))
                  )
            )
      );
   }

   private static int a(du $$0, Collection<aow> $$1, Collection<csd<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aow $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vq.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vq.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(du $$0, Collection<aow> $$1, Collection<csd<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aow $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vq.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vq.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
