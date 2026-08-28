import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqn implements aqk {
   static final SuggestionProvider<ek> b = ($$0, $$1) -> ep.a(a($$0).a(), $$1);
   public static final Function<String, aql.c> a = $$0 -> new aql.c() {
         @Override
         public aqk a(CommandContext<ek> $$0x) {
            return new aqn(aqn.a($$0), fl.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
            return $$0.then(el.a("storage").then($$1.apply(el.a($$0, fl.a()).suggests(aqn.b))));
         }
      };
   private final ezy c;
   private final alr d;

   static ezy a(CommandContext<ek> $$0) {
      return ((ek)$$0.getSource()).l().aK();
   }

   aqn(ezy $$0, alr $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ua $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ua a() {
      return this.c.a(this.d);
   }

   @Override
   public xg b() {
      return xg.a("commands.data.storage.modified", xg.a(this.d));
   }

   @Override
   public xg a(va $$0) {
      return xg.a("commands.data.storage.query", xg.a(this.d), up.b($$0));
   }

   @Override
   public xg a(fc.g $$0, double $$1, int $$2) {
      return xg.a("commands.data.storage.get", $$0.a(), xg.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
