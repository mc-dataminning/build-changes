import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apl implements api {
   static final SuggestionProvider<eh> b = ($$0, $$1) -> em.a(a($$0).a(), $$1);
   public static final Function<String, apj.c> a = $$0 -> new apj.c() {
         @Override
         public api a(CommandContext<eh> $$0x) {
            return new apl(apl.a($$0), fi.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<eh, ?> a(ArgumentBuilder<eh, ?> $$0x, Function<ArgumentBuilder<eh, ?>, ArgumentBuilder<eh, ?>> $$1) {
            return $$0.then(ei.a("storage").then($$1.apply(ei.a($$0, fi.a()).suggests(apl.b))));
         }
      };
   private final eqw c;
   private final akt d;

   static eqw a(CommandContext<eh> $$0) {
      return ((eh)$$0.getSource()).l().aL();
   }

   apl(eqw $$0, akt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(uk $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public uk a() {
      return this.c.a(this.d);
   }

   @Override
   public xe b() {
      return xe.a("commands.data.storage.modified", xe.a(this.d));
   }

   @Override
   public xe a(vh $$0) {
      return xe.a("commands.data.storage.query", xe.a(this.d), uz.c($$0));
   }

   @Override
   public xe a(ez.g $$0, double $$1, int $$2) {
      return xe.a("commands.data.storage.get", $$0.a(), xe.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
