import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class amj {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wp.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ex)$$0x.getSource(), Collections.singleton(((ex)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)ey.a("targets", fk.d()).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("item", hj.a($$1)).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), hj.a($$0x, "item"))))
                        .then(
                           ey.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), hj.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, Collection<are> $$1, Predicate<cxh> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ex $$0, Collection<are> $$1, Predicate<cxh> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (are $$5 : $$1) {
         $$4 += $$5.gl().a($$2, $$3, $$5.bP.r());
         $$5.bQ.d();
         $$5.bP.a($$5.gl());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().al());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> wp.a("commands.clear.test.single", $$6, $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> wp.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> wp.a("commands.clear.success.single", $$6, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wp.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
