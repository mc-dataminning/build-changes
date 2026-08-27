import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class ahr {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ur.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), Collections.singleton(((du)$$0x.getSource()).i()), $$0xx -> true, -1)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eg.d()).executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), $$0xx -> true, -1)))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("item", gb.a($$1)).executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), gb.a($$0x, "item"), -1)))
                        .then(
                           dv.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), gb.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, Collection<amb> $$1, Predicate<clb> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (amb $$5 : $$1) {
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
               $$0.a(() -> ur.a("commands.clear.test.single", $$6, $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ur.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> ur.a("commands.clear.success.single", $$6, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ur.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
