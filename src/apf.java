import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apf implements apg {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.data.block.invalid"));
   public static final Function<String, aph.c> a = $$0 -> new aph.c() {
         @Override
         public apg a(CommandContext<et> $$0x) throws CommandSyntaxException {
            jd $$1 = gp.a($$0, $$0 + "Pos");
            dqh $$2 = ((et)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apf.b.create();
            } else {
               return new apf($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("block").then($$1.apply(eu.a($$0 + "Pos", gp.a()))));
         }
      };
   private final dqh c;
   private final jd d;

   public apf(dqh $$0, jd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ub $$0) {
      dtc $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ub a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public wz b() {
      return wz.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wz a(uy $$0) {
      return wz.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uq.c($$0));
   }

   @Override
   public wz a(fl.g $$0, double $$1, int $$2) {
      return wz.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
