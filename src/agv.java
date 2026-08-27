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

public class agv {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("commands.function.error.argument_not_compound", $$0));
   public static final SuggestionProvider<dr> a = ($$0, $$1) -> {
      aff $$2 = ((dr)$$0.getSource()).l().aA();
      du.a($$2.f(), $$1, "#");
      return du.a($$2.e(), $$1);
   };

   public static void a(CommandDispatcher<dr> $$0) {
      LiteralArgumentBuilder<dr> $$1 = ds.a("with");

      for (ajc.c $$2 : ajc.c) {
         $$2.a(
            $$1,
            $$1x -> $$1x.executes($$1xx -> a((dr)$$1xx.getSource(), ft.a($$1xx, "name"), $$2.a($$1xx).a()))
                  .then(ds.a("path", eh.a()).executes($$1xx -> a((dr)$$1xx.getSource(), ft.a($$1xx, "name"), a(eh.a($$1xx, "path"), $$2.a($$1xx)))))
         );
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("function").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("name", ft.a())
                        .suggests(a)
                        .executes($$0x -> a((dr)$$0x.getSource(), ft.a($$0x, "name"), null)))
                     .then(ds.a("arguments", dz.a()).executes($$0x -> a((dr)$$0x.getSource(), ft.a($$0x, "name"), dz.a($$0x, "arguments")))))
                  .then($$1)
            )
      );
   }

   private static qr a(eh.g $$0, ajb $$1) throws CommandSyntaxException {
      rk $$2 = ajc.a($$0, $$1);
      if ($$2 instanceof qr) {
         return (qr)$$2;
      } else {
         throw b.create($$2.c().a());
      }
   }

   private static int a(dr $$0, Collection<dm> $$1, @Nullable qr $$2) {
      int $$3 = 0;
      boolean $$4 = false;
      boolean $$5 = false;

      for (dm $$6 : $$1) {
         try {
            agv.a $$7 = a($$0, $$6, $$2);
            $$3 += $$7.a();
            $$4 |= $$7.b();
            $$5 = true;
         } catch (dt var9) {
            $$0.b(var9.a());
         }
      }

      if ($$5) {
         int $$9 = $$3;
         if ($$1.size() == 1) {
            if ($$4) {
               $$0.a(() -> tf.a("commands.function.success.single.result", $$9, $$1.iterator().next().a()), true);
            } else {
               $$0.a(() -> tf.a("commands.function.success.single", $$9, $$1.iterator().next().a()), true);
            }
         } else if ($$4) {
            $$0.a(() -> tf.a("commands.function.success.multiple.result", $$1.size()), true);
         } else {
            $$0.a(() -> tf.a("commands.function.success.multiple", $$9, $$1.size()), true);
         }
      }

      return $$3;
   }

   public static agv.a a(dr $$0, dm $$1, @Nullable qr $$2) throws dt {
      MutableObject<agv.a> $$3 = new MutableObject();
      int $$4 = $$0.l().aA().a($$1, $$0.a().b(2).a((IntConsumer)($$1x -> $$3.setValue(new agv.a($$1x, true)))), null, $$2);
      agv.a $$5 = (agv.a)$$3.getValue();
      return $$5 != null ? $$5 : new agv.a($$4, false);
   }

   public static record a(int a, boolean b) {
   }
}
