import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aok implements aoh {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dz.a(a($$0).a(), $$1);
   public static final Function<String, aoi.c> a = $$0 -> new aoi.c() {
         @Override
         public aoh a(CommandContext<du> $$0x) {
            return new aok(aok.a($$0), ev.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, ev.a()).suggests(aok.b))));
         }
      };
   private final emi c;
   private final ajt d;

   static emi a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).l().aL();
   }

   aok(emi $$0, ajt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tm $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public tm a() {
      return this.c.a(this.d);
   }

   @Override
   public wg b() {
      return wg.a("commands.data.storage.modified", wg.a(this.d));
   }

   @Override
   public wg a(uj $$0) {
      return wg.a("commands.data.storage.query", wg.a(this.d), ub.c($$0));
   }

   @Override
   public wg a(em.g $$0, double $$1, int $$2) {
      return wg.a("commands.data.storage.get", $$0.a(), wg.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
