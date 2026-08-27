import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ant implements anq {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dz.a(a($$0).a(), $$1);
   public static final Function<String, anr.c> a = $$0 -> new anr.c() {
         @Override
         public anq a(CommandContext<du> $$0x) {
            return new ant(ant.a($$0), ev.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, ev.a()).suggests(ant.b))));
         }
      };
   private final ejf c;
   private final ajc d;

   static ejf a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).l().aL();
   }

   ant(ejf $$0, ajc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sy $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public sy a() {
      return this.c.a(this.d);
   }

   @Override
   public vs b() {
      return vs.a("commands.data.storage.modified", vs.a(this.d));
   }

   @Override
   public vs a(tv $$0) {
      return vs.a("commands.data.storage.query", vs.a(this.d), tn.c($$0));
   }

   @Override
   public vs a(em.g $$0, double $$1, int $$2) {
      return vs.a("commands.data.storage.get", $$0.a(), vs.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
