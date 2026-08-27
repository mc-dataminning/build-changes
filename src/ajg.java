import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class ajg implements ajh {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tm.c("commands.data.block.invalid"));
   public static final Function<String, aji.c> a = $$0 -> new aji.c() {
         @Override
         public ajh a(CommandContext<dt> $$0x) throws CommandSyntaxException {
            gw $$1 = fk.a($$0, $$0 + "Pos");
            dcv $$2 = ((dt)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw ajg.b.create();
            } else {
               return new ajg($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("block").then($$1.apply(du.a($$0 + "Pos", fk.a()))));
         }
      };
   private final dcv c;
   private final gw d;

   public ajg(dcv $$0, gw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qy $$0) {
      dfj $$1 = this.c.k().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.k().a(this.d, $$1, $$1, 3);
   }

   @Override
   public qy a() {
      return this.c.m();
   }

   @Override
   public tm b() {
      return tm.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public tm a(rr $$0) {
      return tm.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), rk.c($$0));
   }

   @Override
   public tm a(ej.g $$0, double $$1, int $$2) {
      return tm.a("commands.data.block.get", $$0, this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
