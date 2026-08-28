import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apv implements apw {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.data.block.invalid"));
   public static final Function<String, apx.c> a = $$0 -> new apx.c() {
         @Override
         public apw a(CommandContext<ex> $$0x) throws CommandSyntaxException {
            jj $$1 = gu.a($$0, $$0 + "Pos");
            dvl $$2 = ((ex)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apv.b.create();
            } else {
               return new apv($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0x, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$1) {
            return $$0.then(ey.a("block").then($$1.apply(ey.a($$0 + "Pos", gu.a()))));
         }
      };
   private final dvl c;
   private final jj d;

   public apv(dvl $$0, jj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tw $$0) {
      dym $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().F_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public tw a() {
      return this.c.b(this.c.i().F_());
   }

   @Override
   public wv b() {
      return wv.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wv a(ut $$0) {
      return wv.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), ul.c($$0));
   }

   @Override
   public wv a(fp.g $$0, double $$1, int $$2) {
      return wv.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
