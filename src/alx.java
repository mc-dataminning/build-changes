import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class alx {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eq)$$0x.getSource(), Collections.singleton(((eq)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)er.a("targets", fd.d()).executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)er.a("item", hc.a($$1)).executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), hc.a($$0x, "item"))))
                        .then(
                           er.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), hc.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, Collection<aql> $$1, Predicate<cua> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(eq $$0, Collection<aql> $$1, Predicate<cua> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aql $$5 : $$1) {
         $$4 += $$5.fY().a($$2, $$3, $$5.cc.r());
         $$5.cd.d();
         $$5.cc.a($$5.fY());
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
               $$0.a(() -> wu.a("commands.clear.test.single", $$6, $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wu.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.clear.success.single", $$6, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
