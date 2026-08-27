import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class alw implements alt {
   static final SuggestionProvider<ds> b = ($$0, $$1) -> dx.a(a($$0).a(), $$1);
   public static final Function<String, alu.c> a = $$0 -> new alu.c() {
         @Override
         public alt a(CommandContext<ds> $$0x) {
            return new alw(alw.a($$0), et.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("storage").then($$1.apply(dt.a($$0, et.a()).suggests(alw.b))));
         }
      };
   private final egd c;
   private final ahg d;

   static egd a(CommandContext<ds> $$0) {
      return ((ds)$$0.getSource()).l().aI();
   }

   alw(egd $$0, ahg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sn $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public sn a() {
      return this.c.a(this.d);
   }

   @Override
   public vf b() {
      return vf.a("commands.data.storage.modified", vf.a(this.d));
   }

   @Override
   public vf a(tk $$0) {
      return vf.a("commands.data.storage.query", vf.a(this.d), tc.c($$0));
   }

   @Override
   public vf a(ek.g $$0, double $$1, int $$2) {
      return vf.a("commands.data.storage.get", $$0.a(), vf.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
