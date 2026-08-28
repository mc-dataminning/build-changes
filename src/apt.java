import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apt implements apq {
   static final SuggestionProvider<ep> b = ($$0, $$1) -> eu.a(a($$0).a(), $$1);
   public static final Function<String, apr.c> a = $$0 -> new apr.c() {
         @Override
         public apq a(CommandContext<ep> $$0x) {
            return new apt(apt.a($$0), fq.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("storage").then($$1.apply(eq.a($$0, fq.a()).suggests(apt.b))));
         }
      };
   private final epi c;
   private final alb d;

   static epi a(CommandContext<ep> $$0) {
      return ((ep)$$0.getSource()).l().aL();
   }

   apt(epi $$0, alb $$1) {
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
   public xl b() {
      return xl.a("commands.data.storage.modified", xl.a(this.d));
   }

   @Override
   public xl a(vo $$0) {
      return xl.a("commands.data.storage.query", xl.a(this.d), vg.c($$0));
   }

   @Override
   public xl a(fh.g $$0, double $$1, int $$2) {
      return xl.a("commands.data.storage.get", $$0.a(), xl.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
