import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class anu implements anv {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("commands.data.block.invalid"));
   public static final Function<String, anw.c> a = $$0 -> new anw.c() {
         @Override
         public anv a(CommandContext<du> $$0x) throws CommandSyntaxException {
            ib $$1 = fo.a($$0, $$0 + "Pos");
            dki $$2 = ((du)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw anu.b.create();
            } else {
               return new anu($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("block").then($$1.apply(dv.a($$0 + "Pos", fo.a()))));
         }
      };
   private final dki c;
   private final ib d;

   public anu(dki $$0, ib $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ta $$0) {
      dnb $$1 = this.c.i().a_(this.d);
      this.c.a($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ta a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public vu b() {
      return vu.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public vu a(tx $$0) {
      return vu.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), tp.c($$0));
   }

   @Override
   public vu a(em.g $$0, double $$1, int $$2) {
      return vu.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
