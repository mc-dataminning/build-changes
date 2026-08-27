import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class als implements alp {
   static final SuggestionProvider<ds> b = ($$0, $$1) -> dx.a(a($$0).a(), $$1);
   public static final Function<String, alq.c> a = $$0 -> new alq.c() {
         @Override
         public alp a(CommandContext<ds> $$0x) {
            return new als(als.a($$0), et.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("storage").then($$1.apply(dt.a($$0, et.a()).suggests(als.b))));
         }
      };
   private final efx c;
   private final ahd d;

   static efx a(CommandContext<ds> $$0) {
      return ((ds)$$0.getSource()).l().aI();
   }

   als(efx $$0, ahd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sl $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public sl a() {
      return this.c.a(this.d);
   }

   @Override
   public vd b() {
      return vd.a("commands.data.storage.modified", vd.a(this.d));
   }

   @Override
   public vd a(ti $$0) {
      return vd.a("commands.data.storage.query", vd.a(this.d), ta.c($$0));
   }

   @Override
   public vd a(ek.g $$0, double $$1, int $$2) {
      return vd.a("commands.data.storage.get", $$0.a(), vd.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
