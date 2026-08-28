import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class amz {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xc.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), Collections.singleton(((ek)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ex.d()).executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)el.a("item", gx.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), gx.a($$0x, "item"))))
                        .then(
                           el.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), gx.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<arv> $$1, Predicate<daa> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ek $$0, Collection<arv> $$1, Predicate<daa> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arv $$5 : $$1) {
         $$4 += $$5.gj().a($$2, $$3, $$5.bQ.r());
         $$5.bR.d();
         $$5.bQ.a($$5.gj());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().ai());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> xc.a("commands.clear.test.single", $$6, $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> xc.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xc.a("commands.clear.success.single", $$6, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xc.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
