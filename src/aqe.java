import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqe implements aqb {
   static final SuggestionProvider<ej> b = ($$0, $$1) -> eo.a(a($$0).a(), $$1);
   public static final Function<String, aqc.c> a = $$0 -> new aqc.c() {
         @Override
         public aqb a(CommandContext<ej> $$0x) {
            return new aqe(aqe.a($$0), fk.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ej, ?> a(ArgumentBuilder<ej, ?> $$0x, Function<ArgumentBuilder<ej, ?>, ArgumentBuilder<ej, ?>> $$1) {
            return $$0.then(ek.a("storage").then($$1.apply(ek.a($$0, fk.a()).suggests(aqe.b))));
         }
      };
   private final ezm c;
   private final ali d;

   static ezm a(CommandContext<ej> $$0) {
      return ((ej)$$0.getSource()).l().aK();
   }

   aqe(ezm $$0, ali $$1) {
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
   public xa b() {
      return xa.a("commands.data.storage.modified", xa.a(this.d));
   }

   @Override
   public xa a(uy $$0) {
      return xa.a("commands.data.storage.query", xa.a(this.d), uo.b($$0));
   }

   @Override
   public xa a(fb.g $$0, double $$1, int $$2) {
      return xa.a("commands.data.storage.get", $$0.a(), xa.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
