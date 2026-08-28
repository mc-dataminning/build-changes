import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apw implements apt {
   static final SuggestionProvider<ep> b = ($$0, $$1) -> eu.a(a($$0).a(), $$1);
   public static final Function<String, apu.c> a = $$0 -> new apu.c() {
         @Override
         public apt a(CommandContext<ep> $$0x) {
            return new apw(apw.a($$0), fq.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("storage").then($$1.apply(eq.a($$0, fq.a()).suggests(apw.b))));
         }
      };
   private final epl c;
   private final ale d;

   static epl a(CommandContext<ep> $$0) {
      return ((ep)$$0.getSource()).l().aL();
   }

   apw(epl $$0, ale $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ur $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ur a() {
      return this.c.a(this.d);
   }

   @Override
   public xo b() {
      return xo.a("commands.data.storage.modified", xo.a(this.d));
   }

   @Override
   public xo a(vo $$0) {
      return xo.a("commands.data.storage.query", xo.a(this.d), vg.c($$0));
   }

   @Override
   public xo a(fh.g $$0, double $$1, int $$2) {
      return xo.a("commands.data.storage.get", $$0.a(), xo.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
