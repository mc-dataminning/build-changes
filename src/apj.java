import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apj implements apg {
   static final SuggestionProvider<et> b = ($$0, $$1) -> ey.a(a($$0).a(), $$1);
   public static final Function<String, aph.c> a = $$0 -> new aph.c() {
         @Override
         public apg a(CommandContext<et> $$0x) {
            return new apj(apj.a($$0), fu.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("storage").then($$1.apply(eu.a($$0, fu.a()).suggests(apj.b))));
         }
      };
   private final eqw c;
   private final akr d;

   static eqw a(CommandContext<et> $$0) {
      return ((et)$$0.getSource()).l().aL();
   }

   apj(eqw $$0, akr $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ub $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ub a() {
      return this.c.a(this.d);
   }

   @Override
   public wz b() {
      return wz.a("commands.data.storage.modified", wz.a(this.d));
   }

   @Override
   public wz a(uy $$0) {
      return wz.a("commands.data.storage.query", wz.a(this.d), uq.c($$0));
   }

   @Override
   public wz a(fl.g $$0, double $$1, int $$2) {
      return wz.a("commands.data.storage.get", $$0.a(), wz.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
