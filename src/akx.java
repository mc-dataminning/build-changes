import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class akx implements aku {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dy.a(a($$0).a(), $$1);
   public static final Function<String, akv.c> a = $$0 -> new akv.c() {
         @Override
         public aku a(CommandContext<du> $$0x) {
            return new akx(akx.a($$0), eu.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, eu.a()).suggests(akx.b))));
         }
      };
   private final eef c;
   private final agi d;

   static eef a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).m().aI();
   }

   akx(eef $$0, agi $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(rz $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public rz a() {
      return this.c.a(this.d);
   }

   @Override
   public ur b() {
      return ur.a("commands.data.storage.modified", ur.a(this.d));
   }

   @Override
   public ur a(sw $$0) {
      return ur.a("commands.data.storage.query", ur.a(this.d), so.c($$0));
   }

   @Override
   public ur a(el.g $$0, double $$1, int $$2) {
      return ur.a("commands.data.storage.get", $$0.a(), ur.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
