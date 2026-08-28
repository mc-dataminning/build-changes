import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aqa implements apx {
   static final SuggestionProvider<ev> b = ($$0, $$1) -> fa.a(a($$0).a(), $$1);
   public static final Function<String, apy.c> a = $$0 -> new apy.c() {
         @Override
         public apx a(CommandContext<ev> $$0x) {
            return new aqa(aqa.a($$0), fw.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ev, ?> a(ArgumentBuilder<ev, ?> $$0x, Function<ArgumentBuilder<ev, ?>, ArgumentBuilder<ev, ?>> $$1) {
            return $$0.then(ew.a("storage").then($$1.apply(ew.a($$0, fw.a()).suggests(aqa.b))));
         }
      };
   private final etb c;
   private final alh d;

   static etb a(CommandContext<ev> $$0) {
      return ((ev)$$0.getSource()).l().aK();
   }

   aqa(etb $$0, alh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(uj $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public uj a() {
      return this.c.a(this.d);
   }

   @Override
   public xh b() {
      return xh.a("commands.data.storage.modified", xh.a(this.d));
   }

   @Override
   public xh a(vg $$0) {
      return xh.a("commands.data.storage.query", xh.a(this.d), uy.c($$0));
   }

   @Override
   public xh a(fn.g $$0, double $$1, int $$2) {
      return xh.a("commands.data.storage.get", $$0.a(), xh.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
