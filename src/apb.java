import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apb implements apc {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.data.block.invalid"));
   public static final Function<String, apd.c> a = $$0 -> new apd.c() {
         @Override
         public apc a(CommandContext<ee> $$0x) throws CommandSyntaxException {
            io $$1 = ga.a($$0, $$0 + "Pos");
            doi $$2 = ((ee)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apb.b.create();
            } else {
               return new apb($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ee, ?> a(ArgumentBuilder<ee, ?> $$0x, Function<ArgumentBuilder<ee, ?>, ArgumentBuilder<ee, ?>> $$1) {
            return $$0.then(ef.a("block").then($$1.apply(ef.a($$0 + "Pos", ga.a()))));
         }
      };
   private final doi c;
   private final io d;

   public apb(doi $$0, io $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ud $$0) {
      drd $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ud a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public wx b() {
      return wx.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wx a(va $$0) {
      return wx.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), us.c($$0));
   }

   @Override
   public wx a(ew.g $$0, double $$1, int $$2) {
      return wx.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
