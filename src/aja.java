import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aja implements ajb {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.data.block.invalid"));
   public static final Function<String, ajc.c> a = $$0 -> new ajc.c() {
         @Override
         public ajb a(CommandContext<dr> $$0x) throws CommandSyntaxException {
            gu $$1 = fi.a($$0, $$0 + "Pos");
            dcl $$2 = ((dr)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aja.b.create();
            } else {
               return new aja($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<dr, ?> a(ArgumentBuilder<dr, ?> $$0x, Function<ArgumentBuilder<dr, ?>, ArgumentBuilder<dr, ?>> $$1) {
            return $$0.then(ds.a("block").then($$1.apply(ds.a($$0 + "Pos", fi.a()))));
         }
      };
   private final dcl c;
   private final gu d;

   public aja(dcl $$0, gu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qr $$0) {
      dez $$1 = this.c.k().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.k().a(this.d, $$1, $$1, 3);
   }

   @Override
   public qr a() {
      return this.c.m();
   }

   @Override
   public tf b() {
      return tf.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public tf a(rk $$0) {
      return tf.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), rd.c($$0));
   }

   @Override
   public tf a(eh.g $$0, double $$1, int $$2) {
      return tf.a("commands.data.block.get", $$0, this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
