import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class ams {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xp.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ep)$$0x.getSource(), Collections.singleton(((ep)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)eq.a("targets", fc.d()).executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)eq.a("item", hb.a($$1)).executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), hb.a($$0x, "item"))))
                        .then(
                           eq.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), hb.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, Collection<arg> $$1, Predicate<cup> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ep $$0, Collection<arg> $$1, Predicate<cup> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arg $$5 : $$1) {
         $$4 += $$5.gc().a($$2, $$3, $$5.ca.q());
         $$5.cb.d();
         $$5.ca.a($$5.gc());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().af());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> xp.a("commands.clear.test.single", $$6, $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> xp.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xp.a("commands.clear.success.single", $$6, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> xp.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
