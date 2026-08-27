import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ajk implements ajh {
   static final SuggestionProvider<dt> b = ($$0, $$1) -> dw.a(a($$0).a(), $$1);
   public static final Function<String, aji.c> a = $$0 -> new aji.c() {
         @Override
         public ajh a(CommandContext<dt> $$0x) {
            return new ajk(ajk.a($$0), es.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("storage").then($$1.apply(du.a($$0, es.a()).suggests(ajk.b))));
         }
      };
   private final ebz c;
   private final aex d;

   static ebz a(CommandContext<dt> $$0) {
      return ((dt)$$0.getSource()).l().aG();
   }

   ajk(ebz $$0, aex $$1) {
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
   public tm b() {
      return tm.a("commands.data.storage.modified", this.d);
   }

   @Override
   public tm a(rr $$0) {
      return tm.a("commands.data.storage.query", this.d, rk.c($$0));
   }

   @Override
   public tm a(ej.g $$0, double $$1, int $$2) {
      return tm.a("commands.data.storage.get", $$0, this.d, String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
