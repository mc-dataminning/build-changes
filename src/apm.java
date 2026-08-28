import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apm implements apn {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.data.block.invalid"));
   public static final Function<String, apo.c> a = $$0 -> new apo.c() {
         @Override
         public apn a(CommandContext<ex> $$0x) throws CommandSyntaxException {
            ji $$1 = gt.a($$0, $$0 + "Pos");
            dty $$2 = ((ex)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apm.b.create();
            } else {
               return new apm($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0x, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$1) {
            return $$0.then(ey.a("block").then($$1.apply(ey.a($$0 + "Pos", gt.a()))));
         }
      };
   private final dty c;
   private final ji d;

   public apm(dty $$0, ji $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tq $$0) {
      dww $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().K_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public tq a() {
      return this.c.b(this.c.i().K_());
   }

   @Override
   public wp b() {
      return wp.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wp a(un $$0) {
      return wp.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uf.c($$0));
   }

   @Override
   public wp a(fp.g $$0, double $$1, int $$2) {
      return wp.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
