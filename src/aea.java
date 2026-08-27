import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class aea {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), Collections.singleton(((ds)$$0x.getSource()).h()), $$0xx -> true, -1)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ec.d()).executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), $$0xx -> true, -1)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("item", fx.a($$1)).executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), fx.a($$0x, "item"), -1)))
                        .then(
                           dt.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), fx.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<aig> $$1, Predicate<cfz> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aig $$5 : $$1) {
         $$4 += $$5.fN().a($$2, $$3, $$5.bQ.q());
         $$5.bR.d();
         $$5.bQ.a($$5.fN());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().Z());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> sw.a("commands.clear.test.single", $$6, $$1.iterator().next().H_()), true);
            } else {
               $$0.a(() -> sw.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.clear.success.single", $$6, $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> sw.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
