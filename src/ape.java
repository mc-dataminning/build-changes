import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class ape implements apf {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.data.block.invalid"));
   public static final Function<String, apg.c> a = $$0 -> new apg.c() {
         @Override
         public apf a(CommandContext<et> $$0x) throws CommandSyntaxException {
            jd $$1 = gp.a($$0, $$0 + "Pos");
            dqf $$2 = ((et)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw ape.b.create();
            } else {
               return new ape($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("block").then($$1.apply(eu.a($$0 + "Pos", gp.a()))));
         }
      };
   private final dqf c;
   private final jd d;

   public ape(dqf $$0, jd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ua $$0) {
      dta $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ua a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public wy b() {
      return wy.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wy a(ux $$0) {
      return wy.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), up.c($$0));
   }

   @Override
   public wy a(fl.g $$0, double $$1, int $$2) {
      return wy.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
