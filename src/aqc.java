import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqc implements apz {
   static final SuggestionProvider<ei> b = ($$0, $$1) -> en.a(a($$0).a(), $$1);
   public static final Function<String, aqa.c> a = $$0 -> new aqa.c() {
         @Override
         public apz a(CommandContext<ei> $$0x) {
            return new aqc(aqc.a($$0), fj.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ei, ?> a(ArgumentBuilder<ei, ?> $$0x, Function<ArgumentBuilder<ei, ?>, ArgumentBuilder<ei, ?>> $$1) {
            return $$0.then(ej.a("storage").then($$1.apply(ej.a($$0, fj.a()).suggests(aqc.b))));
         }
      };
   private final eym c;
   private final alg d;

   static eym a(CommandContext<ei> $$0) {
      return ((ei)$$0.getSource()).l().aK();
   }

   aqc(eym $$0, alg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tz $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public tz a() {
      return this.c.a(this.d);
   }

   @Override
   public wy b() {
      return wy.a("commands.data.storage.modified", wy.a(this.d));
   }

   @Override
   public wy a(uw $$0) {
      return wy.a("commands.data.storage.query", wy.a(this.d), uo.c($$0));
   }

   @Override
   public wy a(fa.g $$0, double $$1, int $$2) {
      return wy.a("commands.data.storage.get", $$0.a(), wy.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
