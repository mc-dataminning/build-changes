import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class akt implements akq {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dy.a(a($$0).a(), $$1);
   public static final Function<String, akr.c> a = $$0 -> new akr.c() {
         @Override
         public akq a(CommandContext<du> $$0x) {
            return new akt(akt.a($$0), eu.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, eu.a()).suggests(akt.b))));
         }
      };
   private final edt c;
   private final agg d;

   static edt a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).m().aG();
   }

   akt(edt $$0, agg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(rz $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public rz a() {
      return this.c.a(this.d);
   }

   @Override
   public ur b() {
      return ur.a("commands.data.storage.modified", ur.a(this.d));
   }

   @Override
   public ur a(sw $$0) {
      return ur.a("commands.data.storage.query", ur.a(this.d), so.c($$0));
   }

   @Override
   public ur a(el.g $$0, double $$1, int $$2) {
      return ur.a("commands.data.storage.get", $$0.a(), ur.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
