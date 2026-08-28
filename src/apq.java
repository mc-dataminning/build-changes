import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apq implements apn {
   static final SuggestionProvider<ex> b = ($$0, $$1) -> fc.a(a($$0).a(), $$1);
   public static final Function<String, apo.c> a = $$0 -> new apo.c() {
         @Override
         public apn a(CommandContext<ex> $$0x) {
            return new apq(apq.a($$0), fy.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0x, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$1) {
            return $$0.then(ey.a("storage").then($$1.apply(ey.a($$0, fy.a()).suggests(apq.b))));
         }
      };
   private final euv c;
   private final akv d;

   static euv a(CommandContext<ex> $$0) {
      return ((ex)$$0.getSource()).l().aK();
   }

   apq(euv $$0, akv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tq $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public tq a() {
      return this.c.a(this.d);
   }

   @Override
   public wp b() {
      return wp.a("commands.data.storage.modified", wp.a(this.d));
   }

   @Override
   public wp a(un $$0) {
      return wp.a("commands.data.storage.query", wp.a(this.d), uf.c($$0));
   }

   @Override
   public wp a(fp.g $$0, double $$1, int $$2) {
      return wp.a("commands.data.storage.get", $$0.a(), wp.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
