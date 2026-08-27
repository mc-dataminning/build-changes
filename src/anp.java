import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class anp implements anm {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dz.a(a($$0).a(), $$1);
   public static final Function<String, ann.c> a = $$0 -> new ann.c() {
         @Override
         public anm a(CommandContext<du> $$0x) {
            return new anp(anp.a($$0), ev.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, ev.a()).suggests(anp.b))));
         }
      };
   private final eij c;
   private final aiy d;

   static eij a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).l().aK();
   }

   anp(eij $$0, aiy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sw $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public sw a() {
      return this.c.a(this.d);
   }

   @Override
   public vq b() {
      return vq.a("commands.data.storage.modified", vq.a(this.d));
   }

   @Override
   public vq a(tt $$0) {
      return vq.a("commands.data.storage.query", vq.a(this.d), tl.c($$0));
   }

   @Override
   public vq a(em.g $$0, double $$1, int $$2) {
      return vq.a("commands.data.storage.get", $$0.a(), vq.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
