import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aoz implements aow {
   static final SuggestionProvider<ed> b = ($$0, $$1) -> ei.a(a($$0).a(), $$1);
   public static final Function<String, aox.c> a = $$0 -> new aox.c() {
         @Override
         public aow a(CommandContext<ed> $$0x) {
            return new aoz(aoz.a($$0), fe.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$0x, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> $$1) {
            return $$0.then(ee.a("storage").then($$1.apply(ee.a($$0, fe.a()).suggests(aoz.b))));
         }
      };
   private final ens c;
   private final akh d;

   static ens a(CommandContext<ed> $$0) {
      return ((ed)$$0.getSource()).l().aL();
   }

   aoz(ens $$0, akh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ua $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ua a() {
      return this.c.a(this.d);
   }

   @Override
   public wu b() {
      return wu.a("commands.data.storage.modified", wu.a(this.d));
   }

   @Override
   public wu a(ux $$0) {
      return wu.a("commands.data.storage.query", wu.a(this.d), up.c($$0));
   }

   @Override
   public wu a(ev.g $$0, double $$1, int $$2) {
      return wu.a("commands.data.storage.get", $$0.a(), wu.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
