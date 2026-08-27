import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ali implements alf {
   static final SuggestionProvider<ds> b = ($$0, $$1) -> dw.a(a($$0).a(), $$1);
   public static final Function<String, alg.c> a = $$0 -> new alg.c() {
         @Override
         public alf a(CommandContext<ds> $$0x) {
            return new ali(ali.a($$0), es.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("storage").then($$1.apply(dt.a($$0, es.a()).suggests(ali.b))));
         }
      };
   private final efm c;
   private final agt d;

   static efm a(CommandContext<ds> $$0) {
      return ((ds)$$0.getSource()).l().aI();
   }

   ali(efm $$0, agt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sj $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public sj a() {
      return this.c.a(this.d);
   }

   @Override
   public vb b() {
      return vb.a("commands.data.storage.modified", vb.a(this.d));
   }

   @Override
   public vb a(tg $$0) {
      return vb.a("commands.data.storage.query", vb.a(this.d), sy.c($$0));
   }

   @Override
   public vb a(ej.g $$0, double $$1, int $$2) {
      return vb.a("commands.data.storage.get", $$0.a(), vb.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
