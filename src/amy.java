import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class amy {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xj.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xj.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ew)$$0x.getSource(), Collections.singleton(((ew)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)ex.a("targets", fj.d()).executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)ex.a("item", hi.a($$1)).executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), hi.a($$0x, "item"))))
                        .then(
                           ex.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), hi.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, Collection<arq> $$1, Predicate<cwm> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ew $$0, Collection<arq> $$1, Predicate<cwm> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arq $$5 : $$1) {
         $$4 += $$5.gg().a($$2, $$3, $$5.cb.r());
         $$5.cc.d();
         $$5.cb.a($$5.gg());
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
               $$0.a(() -> xj.a("commands.clear.test.single", $$6, $$1.iterator().next().o_()), true);
            } else {
               $$0.a(() -> xj.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xj.a("commands.clear.success.single", $$6, $$1.iterator().next().o_()), true);
         } else {
            $$0.a(() -> xj.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
