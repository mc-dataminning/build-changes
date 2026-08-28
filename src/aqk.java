import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqk implements aqh {
   static final SuggestionProvider<ew> b = ($$0, $$1) -> fb.a(a($$0).a(), $$1);
   public static final Function<String, aqi.c> a = $$0 -> new aqi.c() {
         @Override
         public aqh a(CommandContext<ew> $$0x) {
            return new aqk(aqk.a($$0), fx.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("storage").then($$1.apply(ex.a($$0, fx.a()).suggests(aqk.b))));
         }
      };
   private final evn c;
   private final alp d;

   static evn a(CommandContext<ew> $$0) {
      return ((ew)$$0.getSource()).l().aK();
   }

   aqk(evn $$0, alp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(um $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public um a() {
      return this.c.a(this.d);
   }

   @Override
   public xk b() {
      return xk.a("commands.data.storage.modified", xk.a(this.d));
   }

   @Override
   public xk a(vj $$0) {
      return xk.a("commands.data.storage.query", xk.a(this.d), vb.c($$0));
   }

   @Override
   public xk a(fo.g $$0, double $$1, int $$2) {
      return xk.a("commands.data.storage.get", $$0.a(), xk.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
