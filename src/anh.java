import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class anh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ed.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ed.a("targets", ep.d())
                              .then(
                                 ed.a("recipe", fd.a())
                                    .suggests(ia.b)
                                    .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), Collections.singleton(fd.b($$0x, "recipe"))))
                              ))
                           .then(ed.a("*").executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), ((ec)$$0x.getSource()).l().aJ().b())))
                     )
               ))
            .then(
               ed.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ed.a("targets", ep.d())
                           .then(
                              ed.a("recipe", fd.a())
                                 .suggests(ia.b)
                                 .executes($$0x -> b((ec)$$0x.getSource(), ep.f($$0x, "targets"), Collections.singleton(fd.b($$0x, "recipe"))))
                           ))
                        .then(ed.a("*").executes($$0x -> b((ec)$$0x.getSource(), ep.f($$0x, "targets"), ((ec)$$0x.getSource()).l().aJ().b())))
                  )
            )
      );
   }

   private static int a(ec $$0, Collection<aqf> $$1, Collection<cwi<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqf $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ws.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ws.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ec $$0, Collection<aqf> $$1, Collection<cwi<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqf $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ws.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ws.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
