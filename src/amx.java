import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class amx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  dw.a("give")
                     .then(
                        ((RequiredArgumentBuilder)dw.a("targets", ei.d())
                              .then(
                                 dw.a("recipe", ew.a())
                                    .suggests(ht.b)
                                    .executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), Collections.singleton(ew.b($$0x, "recipe"))))
                              ))
                           .then(dw.a("*").executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), ((dv)$$0x.getSource()).l().aJ().b())))
                     )
               ))
            .then(
               dw.a("take")
                  .then(
                     ((RequiredArgumentBuilder)dw.a("targets", ei.d())
                           .then(
                              dw.a("recipe", ew.a())
                                 .suggests(ht.b)
                                 .executes($$0x -> b((dv)$$0x.getSource(), ei.f($$0x, "targets"), Collections.singleton(ew.b($$0x, "recipe"))))
                           ))
                        .then(dw.a("*").executes($$0x -> b((dv)$$0x.getSource(), ei.f($$0x, "targets"), ((dv)$$0x.getSource()).l().aJ().b())))
                  )
            )
      );
   }

   private static int a(dv $$0, Collection<apv> $$1, Collection<cvu<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (apv $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wi.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wi.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(dv $$0, Collection<apv> $$1, Collection<cvu<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (apv $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wi.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wi.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
