import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class app implements apq {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.data.block.invalid"));
   public static final Function<String, apr.c> a = $$0 -> new apr.c() {
         @Override
         public apq a(CommandContext<ep> $$0x) throws CommandSyntaxException {
            iz $$1 = gl.a($$0, $$0 + "Pos");
            dpc $$2 = ((ep)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw app.b.create();
            } else {
               return new app($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("block").then($$1.apply(eq.a($$0 + "Pos", gl.a()))));
         }
      };
   private final dpc c;
   private final iz d;

   public app(dpc $$0, iz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ur $$0) {
      drx $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ur a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public xl b() {
      return xl.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xl a(vo $$0) {
      return xl.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), vg.c($$0));
   }

   @Override
   public xl a(fh.g $$0, double $$1, int $$2) {
      return xl.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
