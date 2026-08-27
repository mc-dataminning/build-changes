import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class ale implements alf {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.data.block.invalid"));
   public static final Function<String, alg.c> a = $$0 -> new alg.c() {
         @Override
         public alf a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            hv $$1 = fk.a($$0, $$0 + "Pos");
            dgd $$2 = ((ds)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw ale.b.create();
            } else {
               return new ale($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("block").then($$1.apply(dt.a($$0 + "Pos", fk.a()))));
         }
      };
   private final dgd c;
   private final hv d;

   public ale(dgd $$0, hv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sj $$0) {
      dip $$1 = this.c.i().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public sj a() {
      return this.c.o();
   }

   @Override
   public vb b() {
      return vb.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public vb a(tg $$0) {
      return vb.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), sy.c($$0));
   }

   @Override
   public vb a(ej.g $$0, double $$1, int $$2) {
      return vb.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
