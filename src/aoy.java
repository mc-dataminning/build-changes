import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aoy implements aoz {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.data.block.invalid"));
   public static final Function<String, apa.c> a = $$0 -> new apa.c() {
         @Override
         public aoz a(CommandContext<eq> $$0x) throws CommandSyntaxException {
            ja $$1 = gm.a($$0, $$0 + "Pos");
            dpn $$2 = ((eq)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aoy.b.create();
            } else {
               return new aoy($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<eq, ?> a(ArgumentBuilder<eq, ?> $$0x, Function<ArgumentBuilder<eq, ?>, ArgumentBuilder<eq, ?>> $$1) {
            return $$0.then(er.a("block").then($$1.apply(er.a($$0 + "Pos", gm.a()))));
         }
      };
   private final dpn c;
   private final ja d;

   public aoy(dpn $$0, ja $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tx $$0) {
      dsh $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public tx a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public wu b() {
      return wu.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wu a(uu $$0) {
      return wu.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), um.c($$0));
   }

   @Override
   public wu a(fi.g $$0, double $$1, int $$2) {
      return wu.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
