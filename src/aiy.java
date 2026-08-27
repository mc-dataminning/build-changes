import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aiy implements aiz {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.data.block.invalid"));
   public static final Function<String, aja.c> a = $$0 -> new aja.c() {
         @Override
         public aiz a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            gv $$1 = fj.a($$0, $$0 + "Pos");
            dck $$2 = ((ds)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aiy.b.create();
            } else {
               return new aiy($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("block").then($$1.apply(dt.a($$0 + "Pos", fj.a()))));
         }
      };
   private final dck c;
   private final gv d;

   public aiy(dck $$0, gv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qs $$0) {
      dey $$1 = this.c.k().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.k().a(this.d, $$1, $$1, 3);
   }

   @Override
   public qs a() {
      return this.c.m();
   }

   @Override
   public te b() {
      return te.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public te a(rl $$0) {
      return te.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), re.c($$0));
   }

   @Override
   public te a(ei.g $$0, double $$1, int $$2) {
      return te.a("commands.data.block.get", $$0, this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
