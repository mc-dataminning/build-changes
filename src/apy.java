import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apy implements apz {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.data.block.invalid"));
   public static final Function<String, aqa.c> a = $$0 -> new aqa.c() {
         @Override
         public apz a(CommandContext<ei> $$0x) throws CommandSyntaxException {
            iu $$1 = gf.a($$0, $$0 + "Pos");
            dxf $$2 = ((ei)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apy.b.create();
            } else {
               return new apy($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ei, ?> a(ArgumentBuilder<ei, ?> $$0x, Function<ArgumentBuilder<ei, ?>, ArgumentBuilder<ei, ?>> $$1) {
            return $$0.then(ej.a("block").then($$1.apply(ej.a($$0 + "Pos", gf.a()))));
         }
      };
   private final dxf c;
   private final iu d;

   public apy(dxf $$0, iu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tz $$0) {
      eah $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().F_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public tz a() {
      return this.c.b(this.c.i().F_());
   }

   @Override
   public wy b() {
      return wy.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wy a(uw $$0) {
      return wy.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uo.c($$0));
   }

   @Override
   public wy a(fa.g $$0, double $$1, int $$2) {
      return wy.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
