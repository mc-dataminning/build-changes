import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.function.IntConsumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public class ahb {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tm.a("commands.function.error.argument_not_compound", $$0));
   public static final SuggestionProvider<dt> a = ($$0, $$1) -> {
      afl $$2 = ((dt)$$0.getSource()).l().aA();
      dw.a($$2.f(), $$1, "#");
      return dw.a($$2.e(), $$1);
   };

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralArgumentBuilder<dt> $$1 = du.a("with");

      for (aji.c $$2 : aji.c) {
         $$2.a(
            $$1,
            $$1x -> $$1x.executes($$1xx -> a((dt)$$1xx.getSource(), fv.a($$1xx, "name"), $$2.a($$1xx).a()))
                  .then(du.a("path", ej.a()).executes($$1xx -> a((dt)$$1xx.getSource(), fv.a($$1xx, "name"), a(ej.a($$1xx, "path"), $$2.a($$1xx)))))
         );
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("function").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("name", fv.a())
                        .suggests(a)
                        .executes($$0x -> a((dt)$$0x.getSource(), fv.a($$0x, "name"), null)))
                     .then(du.a("arguments", eb.a()).executes($$0x -> a((dt)$$0x.getSource(), fv.a($$0x, "name"), eb.a($$0x, "arguments")))))
                  .then($$1)
            )
      );
   }

   private static qy a(ej.g $$0, ajh $$1) throws CommandSyntaxException {
      rr $$2 = aji.a($$0, $$1);
      if ($$2 instanceof qy) {
         return (qy)$$2;
      } else {
         throw b.create($$2.c().a());
      }
   }

   private static int a(dt $$0, Collection<dp> $$1, @Nullable qy $$2) {
      int $$3 = 0;
      boolean $$4 = false;
      boolean $$5 = false;

      for (dp $$6 : $$1) {
         try {
            ahb.a $$7 = a($$0, $$6, $$2);
            $$3 += $$7.a();
            $$4 |= $$7.b();
            $$5 = true;
         } catch (dv var9) {
            $$0.b(var9.a());
         }
      }

      if ($$5) {
         int $$9 = $$3;
         if ($$1.size() == 1) {
            if ($$4) {
               $$0.a(() -> tm.a("commands.function.success.single.result", $$9, $$1.iterator().next().a()), true);
            } else {
               $$0.a(() -> tm.a("commands.function.success.single", $$9, $$1.iterator().next().a()), true);
            }
         } else if ($$4) {
            $$0.a(() -> tm.a("commands.function.success.multiple.result", $$1.size()), true);
         } else {
            $$0.a(() -> tm.a("commands.function.success.multiple", $$9, $$1.size()), true);
         }
      }

      return $$3;
   }

   public static ahb.a a(dt $$0, dp $$1, @Nullable qy $$2) throws dv {
      MutableObject<ahb.a> $$3 = new MutableObject();
      int $$4 = $$0.l().aA().a($$1, $$0.a().b(2).a((IntConsumer)($$1x -> $$3.setValue(new ahb.a($$1x, true)))), null, $$2);
      ahb.a $$5 = (ahb.a)$$3.getValue();
      return $$5 != null ? $$5 : new ahb.a($$4, false);
   }

   public static record a(int a, boolean b) {
   }
}
