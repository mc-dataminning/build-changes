import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqg implements aqd {
   static final SuggestionProvider<ek> b = ($$0, $$1) -> ep.a(a($$0).a(), $$1);
   public static final Function<String, aqe.c> a = $$0 -> new aqe.c() {
         @Override
         public aqd a(CommandContext<ek> $$0x) {
            return new aqg(aqg.a($$0), fl.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
            return $$0.then(el.a("storage").then($$1.apply(el.a($$0, fl.a()).suggests(aqg.b))));
         }
      };
   private final ezo c;
   private final alk d;

   static ezo a(CommandContext<ek> $$0) {
      return ((ek)$$0.getSource()).l().aK();
   }

   aqg(ezo $$0, alk $$1) {
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
   public xc b() {
      return xc.a("commands.data.storage.modified", xc.a(this.d));
   }

   @Override
   public xc a(va $$0) {
      return xc.a("commands.data.storage.query", xc.a(this.d), up.b($$0));
   }

   @Override
   public xc a(fc.g $$0, double $$1, int $$2) {
      return xc.a("commands.data.storage.get", $$0.a(), xc.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
