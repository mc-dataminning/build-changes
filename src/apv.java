import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class apv implements aps {
   static final SuggestionProvider<et> b = ($$0, $$1) -> ey.a(a($$0).a(), $$1);
   public static final Function<String, apt.c> a = $$0 -> new apt.c() {
         @Override
         public aps a(CommandContext<et> $$0x) {
            return new apv(apv.a($$0), fu.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("storage").then($$1.apply(eu.a($$0, fu.a()).suggests(apv.b))));
         }
      };
   private final esm c;
   private final alc d;

   static esm a(CommandContext<et> $$0) {
      return ((et)$$0.getSource()).l().aK();
   }

   apv(esm $$0, alc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(uf $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public uf a() {
      return this.c.a(this.d);
   }

   @Override
   public xd b() {
      return xd.a("commands.data.storage.modified", xd.a(this.d));
   }

   @Override
   public xd a(vc $$0) {
      return xd.a("commands.data.storage.query", xd.a(this.d), uu.c($$0));
   }

   @Override
   public xd a(fl.g $$0, double $$1, int $$2) {
      return xd.a("commands.data.storage.get", $$0.a(), xd.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
