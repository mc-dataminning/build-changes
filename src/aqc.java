import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqc implements apz {
   static final SuggestionProvider<ew> b = ($$0, $$1) -> fb.a(a($$0).a(), $$1);
   public static final Function<String, aqa.c> a = $$0 -> new aqa.c() {
         @Override
         public apz a(CommandContext<ew> $$0x) {
            return new aqc(aqc.a($$0), fx.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("storage").then($$1.apply(ex.a($$0, fx.a()).suggests(aqc.b))));
         }
      };
   private final ets c;
   private final alj d;

   static ets a(CommandContext<ew> $$0) {
      return ((ew)$$0.getSource()).l().aK();
   }

   aqc(ets $$0, alj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ul $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ul a() {
      return this.c.a(this.d);
   }

   @Override
   public xj b() {
      return xj.a("commands.data.storage.modified", xj.a(this.d));
   }

   @Override
   public xj a(vi $$0) {
      return xj.a("commands.data.storage.query", xj.a(this.d), va.c($$0));
   }

   @Override
   public xj a(fo.g $$0, double $$1, int $$2) {
      return xj.a("commands.data.storage.get", $$0.a(), xj.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
