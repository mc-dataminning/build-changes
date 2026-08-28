import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqb implements apy {
   static final SuggestionProvider<ew> b = ($$0, $$1) -> fb.a(a($$0).a(), $$1);
   public static final Function<String, apz.c> a = $$0 -> new apz.c() {
         @Override
         public apy a(CommandContext<ew> $$0x) {
            return new aqb(aqb.a($$0), fx.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("storage").then($$1.apply(ex.a($$0, fx.a()).suggests(aqb.b))));
         }
      };
   private final eth c;
   private final ali d;

   static eth a(CommandContext<ew> $$0) {
      return ((ew)$$0.getSource()).l().aK();
   }

   aqb(eth $$0, ali $$1) {
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
   public xi b() {
      return xi.a("commands.data.storage.modified", xi.a(this.d));
   }

   @Override
   public xi a(vh $$0) {
      return xi.a("commands.data.storage.query", xi.a(this.d), uz.c($$0));
   }

   @Override
   public xi a(fo.g $$0, double $$1, int $$2) {
      return xi.a("commands.data.storage.get", $$0.a(), xi.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
