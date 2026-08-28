import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apz implements apw {
   static final SuggestionProvider<ex> b = ($$0, $$1) -> fc.a(a($$0).a(), $$1);
   public static final Function<String, apx.c> a = $$0 -> new apx.c() {
         @Override
         public apw a(CommandContext<ex> $$0x) {
            return new apz(apz.a($$0), fy.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0x, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$1) {
            return $$0.then(ey.a("storage").then($$1.apply(ey.a($$0, fy.a()).suggests(apz.b))));
         }
      };
   private final ewq c;
   private final ald d;

   static ewq a(CommandContext<ex> $$0) {
      return ((ex)$$0.getSource()).l().aK();
   }

   apz(ewq $$0, ald $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tw $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public tw a() {
      return this.c.a(this.d);
   }

   @Override
   public wv b() {
      return wv.a("commands.data.storage.modified", wv.a(this.d));
   }

   @Override
   public wv a(ut $$0) {
      return wv.a("commands.data.storage.query", wv.a(this.d), ul.c($$0));
   }

   @Override
   public wv a(fp.g $$0, double $$1, int $$2) {
      return wv.a("commands.data.storage.get", $$0.a(), wv.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
