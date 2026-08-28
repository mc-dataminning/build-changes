import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apx implements apu {
   static final SuggestionProvider<eu> b = ($$0, $$1) -> ez.a(a($$0).a(), $$1);
   public static final Function<String, apv.c> a = $$0 -> new apv.c() {
         @Override
         public apu a(CommandContext<eu> $$0x) {
            return new apx(apx.a($$0), fv.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<eu, ?> a(ArgumentBuilder<eu, ?> $$0x, Function<ArgumentBuilder<eu, ?>, ArgumentBuilder<eu, ?>> $$1) {
            return $$0.then(ev.a("storage").then($$1.apply(ev.a($$0, fv.a()).suggests(apx.b))));
         }
      };
   private final esq c;
   private final ale d;

   static esq a(CommandContext<eu> $$0) {
      return ((eu)$$0.getSource()).l().aK();
   }

   apx(esq $$0, ale $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ug $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ug a() {
      return this.c.a(this.d);
   }

   @Override
   public xe b() {
      return xe.a("commands.data.storage.modified", xe.a(this.d));
   }

   @Override
   public xe a(vd $$0) {
      return xe.a("commands.data.storage.query", xe.a(this.d), uv.c($$0));
   }

   @Override
   public xe a(fm.g $$0, double $$1, int $$2) {
      return xe.a("commands.data.storage.get", $$0.a(), xe.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
