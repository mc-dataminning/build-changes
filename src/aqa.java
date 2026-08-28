import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aqa implements aqb {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.data.block.invalid"));
   public static final Function<String, aqc.c> a = $$0 -> new aqc.c() {
         @Override
         public aqb a(CommandContext<ej> $$0x) throws CommandSyntaxException {
            iv $$1 = gg.a($$0, $$0 + "Pos");
            dyc $$2 = ((ej)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aqa.b.create();
            } else {
               return new aqa($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ej, ?> a(ArgumentBuilder<ej, ?> $$0x, Function<ArgumentBuilder<ej, ?>, ArgumentBuilder<ej, ?>> $$1) {
            return $$0.then(ek.a("block").then($$1.apply(ek.a($$0 + "Pos", gg.a()))));
         }
      };
   private final dyc c;
   private final iv d;

   public aqa(dyc $$0, iv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tz $$0) {
      ebe $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().J_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public tz a() {
      return this.c.b(this.c.i().J_());
   }

   @Override
   public xa b() {
      return xa.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xa a(uy $$0) {
      return xa.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uo.b($$0));
   }

   @Override
   public xa a(fb.g $$0, double $$1, int $$2) {
      return xa.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
