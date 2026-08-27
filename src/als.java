import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class als implements alt {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.data.block.invalid"));
   public static final Function<String, alu.c> a = $$0 -> new alu.c() {
         @Override
         public alt a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            hx $$1 = fm.a($$0, $$0 + "Pos");
            dgv $$2 = ((ds)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw als.b.create();
            } else {
               return new als($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("block").then($$1.apply(dt.a($$0 + "Pos", fm.a()))));
         }
      };
   private final dgv c;
   private final hx d;

   public als(dgv $$0, hx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sn $$0) {
      djh $$1 = this.c.i().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public sn a() {
      return this.c.o();
   }

   @Override
   public vf b() {
      return vf.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public vf a(tk $$0) {
      return vf.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), tc.c($$0));
   }

   @Override
   public vf a(ek.g $$0, double $$1, int $$2) {
      return vf.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
