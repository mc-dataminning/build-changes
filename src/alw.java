import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class alw implements alu {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.data.entity.invalid"));
   public static final Function<String, alv.c> a = $$0 -> new alv.c() {
         @Override
         public alu a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            return new alw(ef.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("entity").then($$1.apply(dt.a($$0, ef.a()))));
         }
      };
   private final blw c;

   public alw(blw $$0) {
      this.c = $$0;
   }

   @Override
   public void a(so $$0) throws CommandSyntaxException {
      if (this.c instanceof cfq) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cw();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public so a() {
      return cm.b(this.c);
   }

   @Override
   public vg b() {
      return vg.a("commands.data.entity.modified", this.c.Q_());
   }

   @Override
   public vg a(tl $$0) {
      return vg.a("commands.data.entity.query", this.c.Q_(), td.c($$0));
   }

   @Override
   public vg a(ek.g $$0, double $$1, int $$2) {
      return vg.a("commands.data.entity.get", $$0.a(), this.c.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
