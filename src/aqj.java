import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aqj implements aqk {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.data.block.invalid"));
   public static final Function<String, aql.c> a = $$0 -> new aql.c() {
         @Override
         public aqk a(CommandContext<ek> $$0x) throws CommandSyntaxException {
            iw $$1 = gh.a($$0, $$0 + "Pos");
            dyo $$2 = ((ek)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aqj.b.create();
            } else {
               return new aqj($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
            return $$0.then(el.a("block").then($$1.apply(el.a($$0 + "Pos", gh.a()))));
         }
      };
   private final dyo c;
   private final iw d;

   public aqj(dyo $$0, iw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ua $$0) {
      ebq $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().J_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ua a() {
      return this.c.b(this.c.i().J_());
   }

   @Override
   public xg b() {
      return xg.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xg a(va $$0) {
      return xg.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), up.b($$0));
   }

   @Override
   public xg a(fc.g $$0, double $$1, int $$2) {
      return xg.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
