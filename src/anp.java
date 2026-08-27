import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class anp implements anq {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vs.c("commands.data.block.invalid"));
   public static final Function<String, anr.c> a = $$0 -> new anr.c() {
         @Override
         public anq a(CommandContext<du> $$0x) throws CommandSyntaxException {
            ib $$1 = fo.a($$0, $$0 + "Pos");
            djl $$2 = ((du)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw anp.b.create();
            } else {
               return new anp($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("block").then($$1.apply(dv.a($$0 + "Pos", fo.a()))));
         }
      };
   private final djl c;
   private final ib d;

   public anp(djl $$0, ib $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sy $$0) {
      dme $$1 = this.c.i().a_(this.d);
      this.c.a($$0, this.c.i().I_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public sy a() {
      return this.c.b(this.c.i().I_());
   }

   @Override
   public vs b() {
      return vs.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public vs a(tv $$0) {
      return vs.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), tn.c($$0));
   }

   @Override
   public vs a(em.g $$0, double $$1, int $$2) {
      return vs.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
