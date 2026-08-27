import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ajc implements aiz {
   static final SuggestionProvider<ds> b = ($$0, $$1) -> dv.a(a($$0).a(), $$1);
   public static final Function<String, aja.c> a = $$0 -> new aja.c() {
         @Override
         public aiz a(CommandContext<ds> $$0x) {
            return new ajc(ajc.a($$0), er.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("storage").then($$1.apply(dt.a($$0, er.a()).suggests(ajc.b))));
         }
      };
   private final ebo c;
   private final aep d;

   static ebo a(CommandContext<ds> $$0) {
      return ((ds)$$0.getSource()).l().aG();
   }

   ajc(ebo $$0, aep $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qs $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public qs a() {
      return this.c.a(this.d);
   }

   @Override
   public te b() {
      return te.a("commands.data.storage.modified", this.d);
   }

   @Override
   public te a(rl $$0) {
      return te.a("commands.data.storage.query", this.d, re.c($$0));
   }

   @Override
   public te a(ei.g $$0, double $$1, int $$2) {
      return te.a("commands.data.storage.get", $$0, this.d, String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
