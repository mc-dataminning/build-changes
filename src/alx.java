import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class alx implements alu {
   static final SuggestionProvider<ds> b = ($$0, $$1) -> dx.a(a($$0).a(), $$1);
   public static final Function<String, alv.c> a = $$0 -> new alv.c() {
         @Override
         public alu a(CommandContext<ds> $$0x) {
            return new alx(alx.a($$0), et.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("storage").then($$1.apply(dt.a($$0, et.a()).suggests(alx.b))));
         }
      };
   private final egm c;
   private final ahh d;

   static egm a(CommandContext<ds> $$0) {
      return ((ds)$$0.getSource()).l().aI();
   }

   alx(egm $$0, ahh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(so $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public so a() {
      return this.c.a(this.d);
   }

   @Override
   public vg b() {
      return vg.a("commands.data.storage.modified", vg.a(this.d));
   }

   @Override
   public vg a(tl $$0) {
      return vg.a("commands.data.storage.query", vg.a(this.d), td.c($$0));
   }

   @Override
   public vg a(ek.g $$0, double $$1, int $$2) {
      return vg.a("commands.data.storage.get", $$0.a(), vg.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
