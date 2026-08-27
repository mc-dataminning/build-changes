import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class akj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  dt.a("give")
                     .then(
                        ((RequiredArgumentBuilder)dt.a("targets", ef.d())
                              .then(
                                 dt.a("recipe", et.a())
                                    .suggests(hn.b)
                                    .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), Collections.singleton(et.b($$0x, "recipe"))))
                              ))
                           .then(dt.a("*").executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), ((ds)$$0x.getSource()).l().aG().b())))
                     )
               ))
            .then(
               dt.a("take")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("targets", ef.d())
                           .then(
                              dt.a("recipe", et.a())
                                 .suggests(hn.b)
                                 .executes($$0x -> b((ds)$$0x.getSource(), ef.f($$0x, "targets"), Collections.singleton(et.b($$0x, "recipe"))))
                           ))
                        .then(dt.a("*").executes($$0x -> b((ds)$$0x.getSource(), ef.f($$0x, "targets"), ((ds)$$0x.getSource()).l().aG().b())))
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<anf> $$1, Collection<cqm<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (anf $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vg.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vg.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ds $$0, Collection<anf> $$1, Collection<cqm<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (anf $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vg.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vg.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
