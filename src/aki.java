import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aki implements akg {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ui.c("commands.data.entity.invalid"));
   public static final Function<String, akh.c> a = $$0 -> new akh.c() {
         @Override
         public akg a(CommandContext<du> $$0x) throws CommandSyntaxException {
            return new aki(eg.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("entity").then($$1.apply(dv.a($$0, eg.a()))));
         }
      };
   private final bjt c;

   public aki(bjt $$0) {
      this.c = $$0;
   }

   @Override
   public void a(rt $$0) throws CommandSyntaxException {
      if (this.c instanceof ccx) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cv();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public rt a() {
      return cn.b(this.c);
   }

   @Override
   public ui b() {
      return ui.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public ui a(sn $$0) {
      return ui.a("commands.data.entity.query", this.c.O_(), sg.c($$0));
   }

   @Override
   public ui a(el.g $$0, double $$1, int $$2) {
      return ui.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
