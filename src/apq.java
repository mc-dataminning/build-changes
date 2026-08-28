import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apq implements apr {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.data.block.invalid"));
   public static final Function<String, aps.c> a = $$0 -> new aps.c() {
         @Override
         public apr a(CommandContext<et> $$0x) throws CommandSyntaxException {
            je $$1 = gp.a($$0, $$0 + "Pos");
            dre $$2 = ((et)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apq.b.create();
            } else {
               return new apq($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("block").then($$1.apply(eu.a($$0 + "Pos", gp.a()))));
         }
      };
   private final dre c;
   private final je d;

   public apq(dre $$0, je $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(uf $$0) {
      dua $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().F_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public uf a() {
      return this.c.b(this.c.i().F_());
   }

   @Override
   public xd b() {
      return xd.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xd a(vc $$0) {
      return xd.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uu.c($$0));
   }

   @Override
   public xd a(fl.g $$0, double $$1, int $$2) {
      return xd.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
