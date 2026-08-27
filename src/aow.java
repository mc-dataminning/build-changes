import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aow implements aot {
   static final SuggestionProvider<ec> b = ($$0, $$1) -> eh.a(a($$0).a(), $$1);
   public static final Function<String, aou.c> a = $$0 -> new aou.c() {
         @Override
         public aot a(CommandContext<ec> $$0x) {
            return new aow(aow.a($$0), fd.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ec, ?> a(ArgumentBuilder<ec, ?> $$0x, Function<ArgumentBuilder<ec, ?>, ArgumentBuilder<ec, ?>> $$1) {
            return $$0.then(ed.a("storage").then($$1.apply(ed.a($$0, fd.a()).suggests(aow.b))));
         }
      };
   private final enh c;
   private final akf d;

   static enh a(CommandContext<ec> $$0) {
      return ((ec)$$0.getSource()).l().aL();
   }

   aow(enh $$0, akf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ty $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ty a() {
      return this.c.a(this.d);
   }

   @Override
   public ws b() {
      return ws.a("commands.data.storage.modified", ws.a(this.d));
   }

   @Override
   public ws a(uv $$0) {
      return ws.a("commands.data.storage.query", ws.a(this.d), un.c($$0));
   }

   @Override
   public ws a(eu.g $$0, double $$1, int $$2) {
      return ws.a("commands.data.storage.get", $$0.a(), ws.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
