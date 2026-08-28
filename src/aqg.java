import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aqg implements aqh {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("commands.data.block.invalid"));
   public static final Function<String, aqi.c> a = $$0 -> new aqi.c() {
         @Override
         public aqh a(CommandContext<ew> $$0x) throws CommandSyntaxException {
            jh $$1 = gs.a($$0, $$0 + "Pos");
            duq $$2 = ((ew)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aqg.b.create();
            } else {
               return new aqg($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("block").then($$1.apply(ex.a($$0 + "Pos", gs.a()))));
         }
      };
   private final duq c;
   private final jh d;

   public aqg(duq $$0, jh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(um $$0) {
      dxo $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().K_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public um a() {
      return this.c.b(this.c.i().K_());
   }

   @Override
   public xk b() {
      return xk.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xk a(vj $$0) {
      return xk.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), vb.c($$0));
   }

   @Override
   public xk a(fo.g $$0, double $$1, int $$2) {
      return xk.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
