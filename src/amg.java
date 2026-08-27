import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class amg {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("clear").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eh)$$0x.getSource(), Collections.singleton(((eh)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)ei.a("targets", eu.d()).executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)ei.a("item", gt.a($$1)).executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), gt.a($$0x, "item"))))
                        .then(
                           ei.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), gt.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eh $$0, Collection<aqu> $$1, Predicate<cuh> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(eh $$0, Collection<aqu> $$1, Predicate<cuh> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqu $$5 : $$1) {
         $$4 += $$5.gl().a($$2, $$3, $$5.cp.q());
         $$5.cq.d();
         $$5.cp.a($$5.gl());
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
               $$0.a(() -> xe.a("commands.clear.test.single", $$6, $$1.iterator().next().P_()), true);
            } else {
               $$0.a(() -> xe.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.clear.success.single", $$6, $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> xe.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
