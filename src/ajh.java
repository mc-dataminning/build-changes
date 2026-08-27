import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class ajh implements aji {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tn.c("commands.data.block.invalid"));
   public static final Function<String, ajj.c> a = $$0 -> new ajj.c() {
         @Override
         public aji a(CommandContext<dt> $$0x) throws CommandSyntaxException {
            gw $$1 = fk.a($$0, $$0 + "Pos");
            dcx $$2 = ((dt)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw ajh.b.create();
            } else {
               return new ajh($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("block").then($$1.apply(du.a($$0 + "Pos", fk.a()))));
         }
      };
   private final dcx c;
   private final gw d;

   public ajh(dcx $$0, gw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qy $$0) {
      dfl $$1 = this.c.k().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.k().a(this.d, $$1, $$1, 3);
   }

   @Override
   public qy a() {
      return this.c.m();
   }

   @Override
   public tn b() {
      return tn.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public tn a(rs $$0) {
      return tn.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), rl.c($$0));
   }

   @Override
   public tn a(ej.g $$0, double $$1, int $$2) {
      return tn.a("commands.data.block.get", $$0, this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
