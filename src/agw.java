import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class agw implements agx {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.data.block.invalid"));
   public static final Function<String, agy.c> a = $$0 -> new agy.c() {
         @Override
         public agx a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            gu $$1 = fi.a($$0, $$0 + "Pos");
            czn $$2 = ((ds)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw agw.b.create();
            } else {
               return new agw($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("block").then($$1.apply(dt.a($$0 + "Pos", fi.a()))));
         }
      };
   private final czn c;
   private final gu d;

   public agw(czn $$0, gu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qr $$0) {
      dcb $$1 = this.c.k().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.k().a(this.d, $$1, $$1, 3);
   }

   @Override
   public qr a() {
      return this.c.m();
   }

   @Override
   public sw b() {
      return sw.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public sw a(rk $$0) {
      return sw.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), rd.c($$0));
   }

   @Override
   public sw a(eh.g $$0, double $$1, int $$2) {
      return sw.a("commands.data.block.get", $$0, this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
