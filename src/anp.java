import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class anp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ef.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ef.a("targets", er.d())
                              .then(
                                 ef.a("recipe", ff.a())
                                    .suggests(ic.b)
                                    .executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), Collections.singleton(ff.b($$0x, "recipe"))))
                              ))
                           .then(ef.a("*").executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), ((ee)$$0x.getSource()).l().aJ().b())))
                     )
               ))
            .then(
               ef.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ef.a("targets", er.d())
                           .then(
                              ef.a("recipe", ff.a())
                                 .suggests(ic.b)
                                 .executes($$0x -> b((ee)$$0x.getSource(), er.f($$0x, "targets"), Collections.singleton(ff.b($$0x, "recipe"))))
                           ))
                        .then(ef.a("*").executes($$0x -> b((ee)$$0x.getSource(), er.f($$0x, "targets"), ((ee)$$0x.getSource()).l().aJ().b())))
                  )
            )
      );
   }

   private static int a(ee $$0, Collection<aqn> $$1, Collection<cxw<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqn $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wx.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ee $$0, Collection<aqn> $$1, Collection<cxw<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aqn $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wx.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
