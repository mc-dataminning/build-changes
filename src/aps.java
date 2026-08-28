import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aps implements apt {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.data.block.invalid"));
   public static final Function<String, apu.c> a = $$0 -> new apu.c() {
         @Override
         public apt a(CommandContext<ep> $$0x) throws CommandSyntaxException {
            iz $$1 = gl.a($$0, $$0 + "Pos");
            dpg $$2 = ((ep)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aps.b.create();
            } else {
               return new aps($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("block").then($$1.apply(eq.a($$0 + "Pos", gl.a()))));
         }
      };
   private final dpg c;
   private final iz d;

   public aps(dpg $$0, iz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ur $$0) {
      dsb $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ur a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public xo b() {
      return xo.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xo a(vo $$0) {
      return xo.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), vg.c($$0));
   }

   @Override
   public xo a(fh.g $$0, double $$1, int $$2) {
      return xo.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
