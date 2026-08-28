import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class amv {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ei)$$0x.getSource(), Collections.singleton(((ei)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)ej.a("targets", ev.d()).executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)ej.a("item", gv.a($$1)).executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), gv.a($$0x, "item"))))
                        .then(
                           ej.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), gv.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ei $$0, Collection<arr> $$1, Predicate<cyy> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ei $$0, Collection<arr> $$1, Predicate<cyy> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arr $$5 : $$1) {
         $$4 += $$5.gi().a($$2, $$3, $$5.bP.r());
         $$5.bQ.d();
         $$5.bP.a($$5.gi());
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
               $$0.a(() -> wy.a("commands.clear.test.single", $$6, $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> wy.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.clear.success.single", $$6, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wy.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
