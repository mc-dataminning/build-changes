import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apx implements apu {
   static final SuggestionProvider<ep> b = ($$0, $$1) -> eu.a(a($$0).a(), $$1);
   public static final Function<String, apv.c> a = $$0 -> new apv.c() {
         @Override
         public apu a(CommandContext<ep> $$0x) {
            return new apx(apx.a($$0), fq.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("storage").then($$1.apply(eq.a($$0, fq.a()).suggests(apx.b))));
         }
      };
   private final epp c;
   private final alf d;

   static epp a(CommandContext<ep> $$0) {
      return ((ep)$$0.getSource()).l().aL();
   }

   apx(epp $$0, alf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(us $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public us a() {
      return this.c.a(this.d);
   }

   @Override
   public xp b() {
      return xp.a("commands.data.storage.modified", xp.a(this.d));
   }

   @Override
   public xp a(vp $$0) {
      return xp.a("commands.data.storage.query", xp.a(this.d), vh.c($$0));
   }

   @Override
   public xp a(fh.g $$0, double $$1, int $$2) {
      return xp.a("commands.data.storage.get", $$0.a(), xp.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
