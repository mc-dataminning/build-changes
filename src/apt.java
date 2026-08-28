import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apt implements apu {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.data.block.invalid"));
   public static final Function<String, apv.c> a = $$0 -> new apv.c() {
         @Override
         public apu a(CommandContext<ep> $$0x) throws CommandSyntaxException {
            iz $$1 = gl.a($$0, $$0 + "Pos");
            dph $$2 = ((ep)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apt.b.create();
            } else {
               return new apt($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("block").then($$1.apply(eq.a($$0 + "Pos", gl.a()))));
         }
      };
   private final dph c;
   private final iz d;

   public apt(dph $$0, iz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(us $$0) {
      dsc $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public us a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public xp b() {
      return xp.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xp a(vp $$0) {
      return xp.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), vh.c($$0));
   }

   @Override
   public xp a(fh.g $$0, double $$1, int $$2) {
      return xp.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
