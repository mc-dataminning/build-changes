import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqe implements aqb {
   static final SuggestionProvider<ew> b = ($$0, $$1) -> fb.a(a($$0).a(), $$1);
   public static final Function<String, aqc.c> a = $$0 -> new aqc.c() {
         @Override
         public aqb a(CommandContext<ew> $$0x) {
            return new aqe(aqe.a($$0), fx.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("storage").then($$1.apply(ex.a($$0, fx.a()).suggests(aqe.b))));
         }
      };
   private final etl c;
   private final all d;

   static etl a(CommandContext<ew> $$0) {
      return ((ew)$$0.getSource()).l().aK();
   }

   aqe(etl $$0, all $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(un $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public un a() {
      return this.c.a(this.d);
   }

   @Override
   public xl b() {
      return xl.a("commands.data.storage.modified", xl.a(this.d));
   }

   @Override
   public xl a(vk $$0) {
      return xl.a("commands.data.storage.query", xl.a(this.d), vc.c($$0));
   }

   @Override
   public xl a(fo.g $$0, double $$1, int $$2) {
      return xl.a("commands.data.storage.get", $$0.a(), xl.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
