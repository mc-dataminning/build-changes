import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqu implements aqr {
   static final SuggestionProvider<ew> b = ($$0, $$1) -> fb.a(a($$0).a(), $$1);
   public static final Function<String, aqs.c> a = $$0 -> new aqs.c() {
         @Override
         public aqr a(CommandContext<ew> $$0x) {
            return new aqu(aqu.a($$0), fx.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("storage").then($$1.apply(ex.a($$0, fx.a()).suggests(aqu.b))));
         }
      };
   private final evm c;
   private final alz d;

   static evm a(CommandContext<ew> $$0) {
      return ((ew)$$0.getSource()).l().aK();
   }

   aqu(evm $$0, alz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ux $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ux a() {
      return this.c.a(this.d);
   }

   @Override
   public xv b() {
      return xv.a("commands.data.storage.modified", xv.a(this.d));
   }

   @Override
   public xv a(vu $$0) {
      return xv.a("commands.data.storage.query", xv.a(this.d), vm.c($$0));
   }

   @Override
   public xv a(fo.g $$0, double $$1, int $$2) {
      return xv.a("commands.data.storage.get", $$0.a(), xv.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
