import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class akp implements akq {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.data.block.invalid"));
   public static final Function<String, akr.c> a = $$0 -> new akr.c() {
         @Override
         public akq a(CommandContext<du> $$0x) throws CommandSyntaxException {
            ht $$1 = fm.a($$0, $$0 + "Pos");
            der $$2 = ((du)$$0.getSource()).f().c_($$1);
            if ($$2 == null) {
               throw akp.b.create();
            } else {
               return new akp($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("block").then($$1.apply(dv.a($$0 + "Pos", fm.a()))));
         }
      };
   private final der c;
   private final ht d;

   public akp(der $$0, ht $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(rz $$0) {
      dgw $$1 = this.c.k().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.k().a(this.d, $$1, $$1, 3);
   }

   @Override
   public rz a() {
      return this.c.m();
   }

   @Override
   public ur b() {
      return ur.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public ur a(sw $$0) {
      return ur.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), so.c($$0));
   }

   @Override
   public ur a(el.g $$0, double $$1, int $$2) {
      return ur.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
