import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class alh implements alf {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.data.entity.invalid"));
   public static final Function<String, alg.c> a = $$0 -> new alg.c() {
         @Override
         public alf a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            return new alh(ee.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("entity").then($$1.apply(dt.a($$0, ee.a()))));
         }
      };
   private final blf c;

   public alh(blf $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sj $$0) throws CommandSyntaxException {
      if (this.c instanceof cer) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cw();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public sj a() {
      return cm.b(this.c);
   }

   @Override
   public vb b() {
      return vb.a("commands.data.entity.modified", this.c.Q_());
   }

   @Override
   public vb a(tg $$0) {
      return vb.a("commands.data.entity.query", this.c.Q_(), sy.c($$0));
   }

   @Override
   public vb a(ej.g $$0, double $$1, int $$2) {
      return vb.a("commands.data.entity.get", $$0.a(), this.c.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
