import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class akx implements aky {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("commands.data.block.invalid"));
   public static final Function<String, akz.c> a = $$0 -> new akz.c() {
         @Override
         public aky a(CommandContext<du> $$0x) throws CommandSyntaxException {
            hx $$1 = fm.a($$0, $$0 + "Pos");
            dfi $$2 = ((du)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw akx.b.create();
            } else {
               return new akx($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("block").then($$1.apply(dv.a($$0 + "Pos", fm.a()))));
         }
      };
   private final dfi c;
   private final hx d;

   public akx(dfi $$0, hx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sd $$0) {
      dhn $$1 = this.c.i().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public sd a() {
      return this.c.o();
   }

   @Override
   public uv b() {
      return uv.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public uv a(ta $$0) {
      return uv.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), ss.c($$0));
   }

   @Override
   public uv a(el.g $$0, double $$1, int $$2) {
      return uv.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
