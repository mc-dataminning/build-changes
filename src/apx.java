import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apx implements apy {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.c("commands.data.block.invalid"));
   public static final Function<String, apz.c> a = $$0 -> new apz.c() {
         @Override
         public apy a(CommandContext<ew> $$0x) throws CommandSyntaxException {
            jh $$1 = gs.a($$0, $$0 + "Pos");
            dsm $$2 = ((ew)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apx.b.create();
            } else {
               return new apx($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("block").then($$1.apply(ex.a($$0 + "Pos", gs.a()))));
         }
      };
   private final dsm c;
   private final jh d;

   public apx(dsm $$0, jh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(uk $$0) {
      dvj $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public uk a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public xi b() {
      return xi.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xi a(vh $$0) {
      return xi.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uz.c($$0));
   }

   @Override
   public xi a(fo.g $$0, double $$1, int $$2) {
      return xi.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
