import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class api implements apf {
   static final SuggestionProvider<et> b = ($$0, $$1) -> ey.a(a($$0).a(), $$1);
   public static final Function<String, apg.c> a = $$0 -> new apg.c() {
         @Override
         public apf a(CommandContext<et> $$0x) {
            return new api(api.a($$0), fu.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("storage").then($$1.apply(eu.a($$0, fu.a()).suggests(api.b))));
         }
      };
   private final eqq c;
   private final akq d;

   static eqq a(CommandContext<et> $$0) {
      return ((et)$$0.getSource()).l().aL();
   }

   api(eqq $$0, akq $$1) {
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
   public wy b() {
      return wy.a("commands.data.storage.modified", wy.a(this.d));
   }

   @Override
   public wy a(ux $$0) {
      return wy.a("commands.data.storage.query", wy.a(this.d), up.c($$0));
   }

   @Override
   public wy a(fl.g $$0, double $$1, int $$2) {
      return wy.a("commands.data.storage.get", $$0.a(), wy.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
