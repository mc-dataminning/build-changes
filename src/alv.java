import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class alv implements alt {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.data.entity.invalid"));
   public static final Function<String, alu.c> a = $$0 -> new alu.c() {
         @Override
         public alt a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            return new alv(ef.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("entity").then($$1.apply(dt.a($$0, ef.a()))));
         }
      };
   private final blv c;

   public alv(blv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sn $$0) throws CommandSyntaxException {
      if (this.c instanceof cfi) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cw();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public sn a() {
      return cm.b(this.c);
   }

   @Override
   public vf b() {
      return vf.a("commands.data.entity.modified", this.c.Q_());
   }

   @Override
   public vf a(tk $$0) {
      return vf.a("commands.data.entity.query", this.c.Q_(), tc.c($$0));
   }

   @Override
   public vf a(ek.g $$0, double $$1, int $$2) {
      return vf.a("commands.data.entity.get", $$0.a(), this.c.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
