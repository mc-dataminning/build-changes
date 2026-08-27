import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aog implements aoh {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.c("commands.data.block.invalid"));
   public static final Function<String, aoi.c> a = $$0 -> new aoi.c() {
         @Override
         public aoh a(CommandContext<du> $$0x) throws CommandSyntaxException {
            ib $$1 = fo.a($$0, $$0 + "Pos");
            dmf $$2 = ((du)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aog.b.create();
            } else {
               return new aog($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("block").then($$1.apply(dv.a($$0 + "Pos", fo.a()))));
         }
      };
   private final dmf c;
   private final ib d;

   public aog(dmf $$0, ib $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tm $$0) {
      doz $$1 = this.c.i().a_(this.d);
      this.c.a($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public tm a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public wg b() {
      return wg.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wg a(uj $$0) {
      return wg.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), ub.c($$0));
   }

   @Override
   public wg a(em.g $$0, double $$1, int $$2) {
      return wg.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
