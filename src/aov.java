import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aov implements aow {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.data.block.invalid"));
   public static final Function<String, aox.c> a = $$0 -> new aox.c() {
         @Override
         public aow a(CommandContext<ed> $$0x) throws CommandSyntaxException {
            in $$1 = fz.a($$0, $$0 + "Pos");
            dnm $$2 = ((ed)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aov.b.create();
            } else {
               return new aov($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$0x, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> $$1) {
            return $$0.then(ee.a("block").then($$1.apply(ee.a($$0 + "Pos", fz.a()))));
         }
      };
   private final dnm c;
   private final in d;

   public aov(dnm $$0, in $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ua $$0) {
      dqh $$1 = this.c.i().a_(this.d);
      this.c.a($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ua a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public wu b() {
      return wu.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wu a(ux $$0) {
      return wu.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), up.c($$0));
   }

   @Override
   public wu a(ev.g $$0, double $$1, int $$2) {
      return wu.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
