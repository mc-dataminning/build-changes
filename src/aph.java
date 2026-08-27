import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aph implements api {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.data.block.invalid"));
   public static final Function<String, apj.c> a = $$0 -> new apj.c() {
         @Override
         public api a(CommandContext<eh> $$0x) throws CommandSyntaxException {
            ir $$1 = gd.a($$0, $$0 + "Pos");
            dqc $$2 = ((eh)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aph.b.create();
            } else {
               return new aph($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<eh, ?> a(ArgumentBuilder<eh, ?> $$0x, Function<ArgumentBuilder<eh, ?>, ArgumentBuilder<eh, ?>> $$1) {
            return $$0.then(ei.a("block").then($$1.apply(ei.a($$0 + "Pos", gd.a()))));
         }
      };
   private final dqc c;
   private final ir d;

   public aph(dqc $$0, ir $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(uk $$0) {
      dtc $$1 = this.c.i().a_(this.d);
      this.c.a($$0, this.c.i().I_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public uk a() {
      return this.c.b(this.c.i().I_());
   }

   @Override
   public xe b() {
      return xe.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xe a(vh $$0) {
      return xe.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uz.c($$0));
   }

   @Override
   public xe a(ez.g $$0, double $$1, int $$2) {
      return xe.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
