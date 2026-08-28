import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class amt {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eu)$$0x.getSource(), Collections.singleton(((eu)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)ev.a("targets", fh.d()).executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)ev.a("item", hg.a($$1)).executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), hg.a($$0x, "item"))))
                        .then(
                           ev.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), hg.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eu $$0, Collection<ark> $$1, Predicate<cvs> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(eu $$0, Collection<ark> $$1, Predicate<cvs> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (ark $$5 : $$1) {
         $$4 += $$5.gd().a($$2, $$3, $$5.bY.r());
         $$5.bZ.d();
         $$5.bY.a($$5.gd());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().aj());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> xe.a("commands.clear.test.single", $$6, $$1.iterator().next().R_()), true);
            } else {
               $$0.a(() -> xe.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.clear.success.single", $$6, $$1.iterator().next().R_()), true);
         } else {
            $$0.a(() -> xe.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
