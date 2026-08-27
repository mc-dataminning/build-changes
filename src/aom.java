import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aom implements aoj {
   static final SuggestionProvider<dv> b = ($$0, $$1) -> ea.a(a($$0).a(), $$1);
   public static final Function<String, aok.c> a = $$0 -> new aok.c() {
         @Override
         public aoj a(CommandContext<dv> $$0x) {
            return new aom(aom.a($$0), ew.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dv, ?> a(ArgumentBuilder<dv, ?> $$0x, Function<ArgumentBuilder<dv, ?>, ArgumentBuilder<dv, ?>> $$1) {
            return $$0.then(dw.a("storage").then($$1.apply(dw.a($$0, ew.a()).suggests(aom.b))));
         }
      };
   private final emr c;
   private final ajv d;

   static emr a(CommandContext<dv> $$0) {
      return ((dv)$$0.getSource()).l().aL();
   }

   aom(emr $$0, ajv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(to $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public to a() {
      return this.c.a(this.d);
   }

   @Override
   public wi b() {
      return wi.a("commands.data.storage.modified", wi.a(this.d));
   }

   @Override
   public wi a(ul $$0) {
      return wi.a("commands.data.storage.query", wi.a(this.d), ud.c($$0));
   }

   @Override
   public wi a(en.g $$0, double $$1, int $$2) {
      return wi.a("commands.data.storage.get", $$0.a(), wi.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
