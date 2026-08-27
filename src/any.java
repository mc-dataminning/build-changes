import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class any implements anv {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dz.a(a($$0).a(), $$1);
   public static final Function<String, anw.c> a = $$0 -> new anw.c() {
         @Override
         public anv a(CommandContext<du> $$0x) {
            return new any(any.a($$0), ev.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, ev.a()).suggests(any.b))));
         }
      };
   private final ekd c;
   private final ajh d;

   static ekd a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).l().aL();
   }

   any(ekd $$0, ajh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ta $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ta a() {
      return this.c.a(this.d);
   }

   @Override
   public vu b() {
      return vu.a("commands.data.storage.modified", vu.a(this.d));
   }

   @Override
   public vu a(tx $$0) {
      return vu.a("commands.data.storage.query", vu.a(this.d), tp.c($$0));
   }

   @Override
   public vu a(em.g $$0, double $$1, int $$2) {
      return vu.a("commands.data.storage.get", $$0.a(), vu.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
