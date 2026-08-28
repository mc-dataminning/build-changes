import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class ame {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((et)$$0x.getSource(), Collections.singleton(((et)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)eu.a("targets", fg.d()).executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)eu.a("item", hf.a($$1)).executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), hf.a($$0x, "item"))))
                        .then(
                           eu.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), hf.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(et $$0, Collection<aqu> $$1, Predicate<cuo> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(et $$0, Collection<aqu> $$1, Predicate<cuo> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqu $$5 : $$1) {
         $$4 += $$5.fZ().a($$2, $$3, $$5.cc.r());
         $$5.cd.d();
         $$5.cc.a($$5.fZ());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().ah());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> wy.a("commands.clear.test.single", $$6, $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wy.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.clear.success.single", $$6, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wy.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
