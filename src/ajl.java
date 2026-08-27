import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ajl implements aji {
   static final SuggestionProvider<dt> b = ($$0, $$1) -> dw.a(a($$0).a(), $$1);
   public static final Function<String, ajj.c> a = $$0 -> new ajj.c() {
         @Override
         public aji a(CommandContext<dt> $$0x) {
            return new ajl(ajl.a($$0), es.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("storage").then($$1.apply(du.a($$0, es.a()).suggests(ajl.b))));
         }
      };
   private final ecb c;
   private final aey d;

   static ecb a(CommandContext<dt> $$0) {
      return ((dt)$$0.getSource()).l().aG();
   }

   ajl(ecb $$0, aey $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qy $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public qy a() {
      return this.c.a(this.d);
   }

   @Override
   public tn b() {
      return tn.a("commands.data.storage.modified", this.d);
   }

   @Override
   public tn a(rs $$0) {
      return tn.a("commands.data.storage.query", this.d, rl.c($$0));
   }

   @Override
   public tn a(ej.g $$0, double $$1, int $$2) {
      return tn.a("commands.data.storage.get", $$0, this.d, String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
