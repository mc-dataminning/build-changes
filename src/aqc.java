import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aqc implements aqd {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("commands.data.block.invalid"));
   public static final Function<String, aqe.c> a = $$0 -> new aqe.c() {
         @Override
         public aqd a(CommandContext<ek> $$0x) throws CommandSyntaxException {
            iw $$1 = gh.a($$0, $$0 + "Pos");
            dye $$2 = ((ek)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aqc.b.create();
            } else {
               return new aqc($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
            return $$0.then(el.a("block").then($$1.apply(el.a($$0 + "Pos", gh.a()))));
         }
      };
   private final dye c;
   private final iw d;

   public aqc(dye $$0, iw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ua $$0) {
      ebg $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().J_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ua a() {
      return this.c.b(this.c.i().J_());
   }

   @Override
   public xc b() {
      return xc.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xc a(va $$0) {
      return xc.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), up.b($$0));
   }

   @Override
   public xc a(fc.g $$0, double $$1, int $$2) {
      return xc.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
