import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.OptionalInt;
import java.util.function.IntConsumer;
import org.apache.commons.lang3.mutable.MutableObject;

public class aes {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      ade $$2 = ((ds)$$0.getSource()).l().aA();
      du.a($$2.f(), $$1, "#");
      return du.a($$2.e(), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("function").requires($$0x -> $$0x.c(2)))
            .then(dt.a("name", ft.a()).suggests(a).executes($$0x -> a((ds)$$0x.getSource(), ft.a($$0x, "name"))))
      );
   }

   private static int a(ds $$0, Collection<dn> $$1) {
      int $$2 = 0;
      boolean $$3 = false;

      for (dn $$4 : $$1) {
         MutableObject<OptionalInt> $$5 = new MutableObject(OptionalInt.empty());
         int $$6 = $$0.l().aA().a($$4, $$0.a().b(2).a((IntConsumer)($$1x -> $$5.setValue(OptionalInt.of($$1x)))));
         OptionalInt $$7 = (OptionalInt)$$5.getValue();
         $$2 += $$7.orElse($$6);
         $$3 |= $$7.isPresent();
      }

      int $$8 = $$2;
      if ($$1.size() == 1) {
         if ($$3) {
            $$0.a(() -> sw.a("commands.function.success.single.result", $$8, $$1.iterator().next().a()), true);
         } else {
            $$0.a(() -> sw.a("commands.function.success.single", $$8, $$1.iterator().next().a()), true);
         }
      } else if ($$3) {
         $$0.a(() -> sw.a("commands.function.success.multiple.result", $$1.size()), true);
      } else {
         $$0.a(() -> sw.a("commands.function.success.multiple", $$8, $$1.size()), true);
      }

      return $$2;
   }
}
