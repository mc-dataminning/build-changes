import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class ape implements apb {
   static final SuggestionProvider<ee> b = ($$0, $$1) -> ej.a(a($$0).a(), $$1);
   public static final Function<String, apc.c> a = $$0 -> new apc.c() {
         @Override
         public apb a(CommandContext<ee> $$0x) {
            return new ape(ape.a($$0), ff.c($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ee, ?> a(ArgumentBuilder<ee, ?> $$0x, Function<ArgumentBuilder<ee, ?>, ArgumentBuilder<ee, ?>> $$1) {
            return $$0.then(ef.a("storage").then($$1.apply(ef.a($$0, ff.a()).suggests(ape.b))));
         }
      };
   private final eom c;
   private final akm d;

   static eom a(CommandContext<ee> $$0) {
      return ((ee)$$0.getSource()).l().aL();
   }

   ape(eom $$0, akm $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ud $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ud a() {
      return this.c.a(this.d);
   }

   @Override
   public wx b() {
      return wx.a("commands.data.storage.modified", wx.a(this.d));
   }

   @Override
   public wx a(va $$0) {
      return wx.a("commands.data.storage.query", wx.a(this.d), us.c($$0));
   }

   @Override
   public wx a(ew.g $$0, double $$1, int $$2) {
      return wx.a("commands.data.storage.get", $$0.a(), wx.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
