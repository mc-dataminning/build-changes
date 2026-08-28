import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aom {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ew.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ew.a("targets", fi.d())
                              .then(
                                 ew.a("recipe", fw.a())
                                    .suggests(iv.b)
                                    .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), Collections.singleton(fw.b($$0x, "recipe"))))
                              ))
                           .then(ew.a("*").executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), ((ev)$$0x.getSource()).l().aI().f())))
                     )
               ))
            .then(
               ew.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ew.a("targets", fi.d())
                           .then(
                              ew.a("recipe", fw.a())
                                 .suggests(iv.b)
                                 .executes($$0x -> b((ev)$$0x.getSource(), fi.f($$0x, "targets"), Collections.singleton(fw.b($$0x, "recipe"))))
                           ))
                        .then(ew.a("*").executes($$0x -> b((ev)$$0x.getSource(), fi.f($$0x, "targets"), ((ev)$$0x.getSource()).l().aI().f())))
                  )
            )
      );
   }

   private static int a(ev $$0, Collection<arn> $$1, Collection<dal<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (arn $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xh.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> xh.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ev $$0, Collection<arn> $$1, Collection<dal<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (arn $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xh.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> xh.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
