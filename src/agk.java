import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class agk {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tl.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tl.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dt)$$0x.getSource(), Collections.singleton(((dt)$$0x.getSource()).h()), $$0xx -> true, -1)))
            .then(
               ((RequiredArgumentBuilder)du.a("targets", ee.d()).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), $$0xx -> true, -1)))
                  .then(
                     ((RequiredArgumentBuilder)du.a("item", fz.a($$1)).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), fz.a($$0x, "item"), -1)))
                        .then(
                           du.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), fz.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, Collection<aku> $$1, Predicate<cjl> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aku $$5 : $$1) {
         $$4 += $$5.fS().a($$2, $$3, $$5.bR.q());
         $$5.bS.d();
         $$5.bR.a($$5.fS());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().ab());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> tl.a("commands.clear.test.single", $$6, $$1.iterator().next().N_()), true);
            } else {
               $$0.a(() -> tl.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> tl.a("commands.clear.success.single", $$6, $$1.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tl.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
