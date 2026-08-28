import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apt implements apu {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.data.block.invalid"));
   public static final Function<String, apv.c> a = $$0 -> new apv.c() {
         @Override
         public apu a(CommandContext<eu> $$0x) throws CommandSyntaxException {
            jf $$1 = gq.a($$0, $$0 + "Pos");
            drv $$2 = ((eu)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apt.b.create();
            } else {
               return new apt($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<eu, ?> a(ArgumentBuilder<eu, ?> $$0x, Function<ArgumentBuilder<eu, ?>, ArgumentBuilder<eu, ?>> $$1) {
            return $$0.then(ev.a("block").then($$1.apply(ev.a($$0 + "Pos", gq.a()))));
         }
      };
   private final drv c;
   private final jf d;

   public apt(drv $$0, jf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ug $$0) {
      dus $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().G_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ug a() {
      return this.c.b(this.c.i().G_());
   }

   @Override
   public xe b() {
      return xe.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xe a(vd $$0) {
      return xe.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uv.c($$0));
   }

   @Override
   public xe a(fm.g $$0, double $$1, int $$2) {
      return xe.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
