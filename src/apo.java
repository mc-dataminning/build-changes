import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apo implements apm {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.c("commands.data.entity.invalid"));
   public static final Function<String, apn.c> a = $$0 -> new apn.c() {
         @Override
         public apm a(CommandContext<ex> $$0x) throws CommandSyntaxException {
            return new apo(fk.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0x, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$1) {
            return $$0.then(ey.a("entity").then($$1.apply(ey.a($$0, fk.a()))));
         }
      };
   private final buj c;

   public apo(buj $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tq $$0) throws CommandSyntaxException {
      if (this.c instanceof cov) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cG();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public tq a() {
      return dn.b(this.c);
   }

   @Override
   public wo b() {
      return wo.a("commands.data.entity.modified", this.c.p_());
   }

   @Override
   public wo a(un $$0) {
      return wo.a("commands.data.entity.query", this.c.p_(), uf.c($$0));
   }

   @Override
   public wo a(fp.g $$0, double $$1, int $$2) {
      return wo.a("commands.data.entity.get", $$0.a(), this.c.p_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
