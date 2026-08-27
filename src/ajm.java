import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ajm implements ajj {
   static final SuggestionProvider<dt> b = ($$0, $$1) -> dw.a(a($$0).a(), $$1);
   public static final Function<String, ajk.c> a = $$0 -> new ajk.c() {
         @Override
         public ajj a(CommandContext<dt> $$0x) {
            return new ajm(ajm.a($$0), es.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("storage").then($$1.apply(du.a($$0, es.a()).suggests(ajm.b))));
         }
      };
   private final ebt c;
   private final aez d;

   static ebt a(CommandContext<dt> $$0) {
      return ((dt)$$0.getSource()).l().aG();
   }

   ajm(ebt $$0, aez $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qw $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public qw a() {
      return this.c.a(this.d);
   }

   @Override
   public tl b() {
      return tl.a("commands.data.storage.modified", tl.a(this.d));
   }

   @Override
   public tl a(rq $$0) {
      return tl.a("commands.data.storage.query", tl.a(this.d), rj.c($$0));
   }

   @Override
   public tl a(ej.g $$0, double $$1, int $$2) {
      return tl.a("commands.data.storage.get", $$0.a(), tl.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
