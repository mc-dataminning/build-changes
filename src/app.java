import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class app implements apn {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.data.entity.invalid"));
   public static final Function<String, apo.c> a = $$0 -> new apo.c() {
         @Override
         public apn a(CommandContext<ex> $$0x) throws CommandSyntaxException {
            return new app(fk.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0x, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$1) {
            return $$0.then(ey.a("entity").then($$1.apply(ey.a($$0, fk.a()))));
         }
      };
   private final bum c;

   public app(bum $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tq $$0) throws CommandSyntaxException {
      if (this.c instanceof coy) {
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
   public wp b() {
      return wp.a("commands.data.entity.modified", this.c.p_());
   }

   @Override
   public wp a(un $$0) {
      return wp.a("commands.data.entity.query", this.c.p_(), uf.c($$0));
   }

   @Override
   public wp a(fp.g $$0, double $$1, int $$2) {
      return wp.a("commands.data.entity.get", $$0.a(), this.c.p_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
