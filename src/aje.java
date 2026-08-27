import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aje implements ajb {
   static final SuggestionProvider<dr> b = ($$0, $$1) -> du.a(a($$0).a(), $$1);
   public static final Function<String, ajc.c> a = $$0 -> new ajc.c() {
         @Override
         public ajb a(CommandContext<dr> $$0x) {
            return new aje(aje.a($$0), eq.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dr, ?> a(ArgumentBuilder<dr, ?> $$0x, Function<ArgumentBuilder<dr, ?>, ArgumentBuilder<dr, ?>> $$1) {
            return $$0.then(ds.a("storage").then($$1.apply(ds.a($$0, eq.a()).suggests(aje.b))));
         }
      };
   private final ebp c;
   private final aer d;

   static ebp a(CommandContext<dr> $$0) {
      return ((dr)$$0.getSource()).l().aG();
   }

   aje(ebp $$0, aer $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qr $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public qr a() {
      return this.c.a(this.d);
   }

   @Override
   public tf b() {
      return tf.a("commands.data.storage.modified", this.d);
   }

   @Override
   public tf a(rk $$0) {
      return tf.a("commands.data.storage.query", this.d, rd.c($$0));
   }

   @Override
   public tf a(eh.g $$0, double $$1, int $$2) {
      return tf.a("commands.data.storage.get", $$0, this.d, String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
