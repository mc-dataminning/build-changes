import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ajh implements aje {
   static final SuggestionProvider<dt> b = ($$0, $$1) -> dw.a(a($$0).a(), $$1);
   public static final Function<String, ajf.c> a = $$0 -> new ajf.c() {
         @Override
         public aje a(CommandContext<dt> $$0x) {
            return new ajh(ajh.a($$0), es.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("storage").then($$1.apply(du.a($$0, es.a()).suggests(ajh.b))));
         }
      };
   private final ebu c;
   private final aeu d;

   static ebu a(CommandContext<dt> $$0) {
      return ((dt)$$0.getSource()).l().aG();
   }

   ajh(ebu $$0, aeu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qu $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public qu a() {
      return this.c.a(this.d);
   }

   @Override
   public ti b() {
      return ti.a("commands.data.storage.modified", this.d);
   }

   @Override
   public ti a(rn $$0) {
      return ti.a("commands.data.storage.query", this.d, rg.c($$0));
   }

   @Override
   public ti a(ej.g $$0, double $$1, int $$2) {
      return ti.a("commands.data.storage.get", $$0, this.d, String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
