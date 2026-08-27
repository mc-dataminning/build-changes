import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class alr {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ec)$$0x.getSource(), Collections.singleton(((ec)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)ed.a("targets", ep.d()).executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)ed.a("item", gm.a($$1)).executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), gm.a($$0x, "item"))))
                        .then(
                           ed.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), gm.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ec $$0, Collection<aqf> $$1, Predicate<csd> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ec $$0, Collection<aqf> $$1, Predicate<csd> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqf $$5 : $$1) {
         $$4 += $$5.ga().a($$2, $$3, $$5.cb.q());
         $$5.cc.d();
         $$5.cb.a($$5.ga());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().ad());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> ws.a("commands.clear.test.single", $$6, $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ws.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> ws.a("commands.clear.success.single", $$6, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ws.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
