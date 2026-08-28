import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apb implements aoy {
   static final SuggestionProvider<eq> b = ($$0, $$1) -> ev.a(a($$0).a(), $$1);
   public static final Function<String, aoz.c> a = $$0 -> new aoz.c() {
         @Override
         public aoy a(CommandContext<eq> $$0x) {
            return new apb(apb.a($$0), fr.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<eq, ?> a(ArgumentBuilder<eq, ?> $$0x, Function<ArgumentBuilder<eq, ?>, ArgumentBuilder<eq, ?>> $$1) {
            return $$0.then(er.a("storage").then($$1.apply(er.a($$0, fr.a()).suggests(apb.b))));
         }
      };
   private final epz c;
   private final akk d;

   static epz a(CommandContext<eq> $$0) {
      return ((eq)$$0.getSource()).l().aM();
   }

   apb(epz $$0, akk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tx $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public tx a() {
      return this.c.a(this.d);
   }

   @Override
   public wu b() {
      return wu.a("commands.data.storage.modified", wu.a(this.d));
   }

   @Override
   public wu a(uu $$0) {
      return wu.a("commands.data.storage.query", wu.a(this.d), um.c($$0));
   }

   @Override
   public wu a(fi.g $$0, double $$1, int $$2) {
      return wu.a("commands.data.storage.get", $$0.a(), wu.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
