import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apw implements apx {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.data.block.invalid"));
   public static final Function<String, apy.c> a = $$0 -> new apy.c() {
         @Override
         public apx a(CommandContext<ei> $$0x) throws CommandSyntaxException {
            iu $$1 = gf.a($$0, $$0 + "Pos");
            dwn $$2 = ((ei)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apw.b.create();
            } else {
               return new apw($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ei, ?> a(ArgumentBuilder<ei, ?> $$0x, Function<ArgumentBuilder<ei, ?>, ArgumentBuilder<ei, ?>> $$1) {
            return $$0.then(ej.a("block").then($$1.apply(ej.a($$0 + "Pos", gf.a()))));
         }
      };
   private final dwn c;
   private final iu d;

   public apw(dwn $$0, iu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tx $$0) {
      dzo $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().F_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public tx a() {
      return this.c.b(this.c.i().F_());
   }

   @Override
   public ww b() {
      return ww.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public ww a(uu $$0) {
      return ww.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), um.c($$0));
   }

   @Override
   public ww a(fa.g $$0, double $$1, int $$2) {
      return ww.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
