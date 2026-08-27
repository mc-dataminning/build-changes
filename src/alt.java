import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class alt implements alu {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.data.block.invalid"));
   public static final Function<String, alv.c> a = $$0 -> new alv.c() {
         @Override
         public alu a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            hx $$1 = fm.a($$0, $$0 + "Pos");
            dhd $$2 = ((ds)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw alt.b.create();
            } else {
               return new alt($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("block").then($$1.apply(dt.a($$0 + "Pos", fm.a()))));
         }
      };
   private final dhd c;
   private final hx d;

   public alt(dhd $$0, hx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(so $$0) {
      djp $$1 = this.c.i().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public so a() {
      return this.c.o();
   }

   @Override
   public vg b() {
      return vg.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public vg a(tl $$0) {
      return vg.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), td.c($$0));
   }

   @Override
   public vg a(ek.g $$0, double $$1, int $$2) {
      return vg.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
