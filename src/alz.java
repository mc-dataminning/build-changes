import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class alz {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ee)$$0x.getSource(), Collections.singleton(((ee)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)ef.a("targets", er.d()).executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)ef.a("item", gq.a($$1)).executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), gq.a($$0x, "item"))))
                        .then(
                           ef.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), gq.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, Collection<aqn> $$1, Predicate<cto> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ee $$0, Collection<aqn> $$1, Predicate<cto> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqn $$5 : $$1) {
         $$4 += $$5.gc().a($$2, $$3, $$5.cb.q());
         $$5.cc.d();
         $$5.cb.a($$5.gc());
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
               $$0.a(() -> wx.a("commands.clear.test.single", $$6, $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wx.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.clear.success.single", $$6, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wx.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
