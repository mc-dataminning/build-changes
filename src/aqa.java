import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqa implements apx {
   static final SuggestionProvider<ei> b = ($$0, $$1) -> en.a(a($$0).a(), $$1);
   public static final Function<String, apy.c> a = $$0 -> new apy.c() {
         @Override
         public apx a(CommandContext<ei> $$0x) {
            return new aqa(aqa.a($$0), fj.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ei, ?> a(ArgumentBuilder<ei, ?> $$0x, Function<ArgumentBuilder<ei, ?>, ArgumentBuilder<ei, ?>> $$1) {
            return $$0.then(ej.a("storage").then($$1.apply(ej.a($$0, fj.a()).suggests(aqa.b))));
         }
      };
   private final exs c;
   private final ale d;

   static exs a(CommandContext<ei> $$0) {
      return ((ei)$$0.getSource()).l().aK();
   }

   aqa(exs $$0, ale $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tx $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public tx a() {
      return this.c.a(this.d);
   }

   @Override
   public ww b() {
      return ww.a("commands.data.storage.modified", ww.a(this.d));
   }

   @Override
   public ww a(uu $$0) {
      return ww.a("commands.data.storage.query", ww.a(this.d), um.c($$0));
   }

   @Override
   public ww a(fa.g $$0, double $$1, int $$2) {
      return ww.a("commands.data.storage.get", $$0.a(), ww.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
