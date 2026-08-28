import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class apf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xv.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ex.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ex.a("targets", fj.d())
                              .then(
                                 ex.a("recipe", fw.a(mb.bk))
                                    .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), Collections.singleton(fw.d($$0x, "recipe"))))
                              ))
                           .then(ex.a("*").executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), ((ew)$$0x.getSource()).l().aI().e())))
                     )
               ))
            .then(
               ex.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ex.a("targets", fj.d())
                           .then(
                              ex.a("recipe", fw.a(mb.bk))
                                 .executes($$0x -> b((ew)$$0x.getSource(), fj.f($$0x, "targets"), Collections.singleton(fw.d($$0x, "recipe"))))
                           ))
                        .then(ex.a("*").executes($$0x -> b((ew)$$0x.getSource(), fj.f($$0x, "targets"), ((ew)$$0x.getSource()).l().aI().e())))
                  )
            )
      );
   }

   private static int a(ew $$0, Collection<asi> $$1, Collection<dcj<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (asi $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xv.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> xv.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ew $$0, Collection<asi> $$1, Collection<dcj<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (asi $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xv.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> xv.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
