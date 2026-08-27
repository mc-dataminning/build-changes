import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class ank {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ee.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ee.a("targets", eq.d())
                              .then(
                                 ee.a("recipe", fe.a())
                                    .suggests(ib.b)
                                    .executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), Collections.singleton(fe.b($$0x, "recipe"))))
                              ))
                           .then(ee.a("*").executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), ((ed)$$0x.getSource()).l().aJ().b())))
                     )
               ))
            .then(
               ee.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ee.a("targets", eq.d())
                           .then(
                              ee.a("recipe", fe.a())
                                 .suggests(ib.b)
                                 .executes($$0x -> b((ed)$$0x.getSource(), eq.f($$0x, "targets"), Collections.singleton(fe.b($$0x, "recipe"))))
                           ))
                        .then(ee.a("*").executes($$0x -> b((ed)$$0x.getSource(), eq.f($$0x, "targets"), ((ed)$$0x.getSource()).l().aJ().b())))
                  )
            )
      );
   }

   private static int a(ed $$0, Collection<aqi> $$1, Collection<cxf<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqi $$4 : $$1) {
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

   private static int b(ed $$0, Collection<aqi> $$1, Collection<cxf<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqi $$4 : $$1) {
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
