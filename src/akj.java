import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class akj implements akg {
   static final SuggestionProvider<du> b = ($$0, $$1) -> dy.a(a($$0).a(), $$1);
   public static final Function<String, akh.c> a = $$0 -> new akh.c() {
         @Override
         public akg a(CommandContext<du> $$0x) {
            return new akj(akj.a($$0), eu.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("storage").then($$1.apply(dv.a($$0, eu.a()).suggests(akj.b))));
         }
      };
   private final ecr c;
   private final afw d;

   static ecr a(CommandContext<du> $$0) {
      return ((du)$$0.getSource()).m().aG();
   }

   akj(ecr $$0, afw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(rt $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public rt a() {
      return this.c.a(this.d);
   }

   @Override
   public ui b() {
      return ui.a("commands.data.storage.modified", ui.a(this.d));
   }

   @Override
   public ui a(sn $$0) {
      return ui.a("commands.data.storage.query", ui.a(this.d), sg.c($$0));
   }

   @Override
   public ui a(el.g $$0, double $$1, int $$2) {
      return ui.a("commands.data.storage.get", $$0.a(), ui.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
