import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class alb implements aky {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dy.a(a($$0).a(), $$1);
   public static final Function<String, akz.c> a = $$0 -> new akz.c() {
         @Override
         public aky a(CommandContext<du> $$0x) {
            return new alb(alb.a($$0), eu.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, eu.a()).suggests(alb.b))));
         }
      };
   private final eek c;
   private final agm d;

   static eek a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).l().aI();
   }

   alb(eek $$0, agm $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sd $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public sd a() {
      return this.c.a(this.d);
   }

   @Override
   public uv b() {
      return uv.a("commands.data.storage.modified", uv.a(this.d));
   }

   @Override
   public uv a(ta $$0) {
      return uv.a("commands.data.storage.query", uv.a(this.d), ss.c($$0));
   }

   @Override
   public uv a(el.g $$0, double $$1, int $$2) {
      return uv.a("commands.data.storage.get", $$0.a(), uv.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
