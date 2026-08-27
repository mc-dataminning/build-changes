import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class alo implements alp {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vd.c("commands.data.block.invalid"));
   public static final Function<String, alq.c> a = $$0 -> new alq.c() {
         @Override
         public alp a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            hx $$1 = fm.a($$0, $$0 + "Pos");
            dgo $$2 = ((ds)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw alo.b.create();
            } else {
               return new alo($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("block").then($$1.apply(dt.a($$0 + "Pos", fm.a()))));
         }
      };
   private final dgo c;
   private final hx d;

   public alo(dgo $$0, hx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sl $$0) {
      dja $$1 = this.c.i().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public sl a() {
      return this.c.o();
   }

   @Override
   public vd b() {
      return vd.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public vd a(ti $$0) {
      return vd.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), ta.c($$0));
   }

   @Override
   public vd a(ek.g $$0, double $$1, int $$2) {
      return vd.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
