import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqj implements aqh {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("commands.data.entity.invalid"));
   public static final Function<String, aqi.c> a = $$0 -> new aqi.c() {
         @Override
         public aqh a(CommandContext<ew> $$0x) throws CommandSyntaxException {
            return new aqj(fj.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("entity").then($$1.apply(ex.a($$0, fj.a()))));
         }
      };
   private final bvb c;

   public aqj(bvb $$0) {
      this.c = $$0;
   }

   @Override
   public void a(um $$0) throws CommandSyntaxException {
      if (this.c instanceof cpo) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cG();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public um a() {
      return dm.b(this.c);
   }

   @Override
   public xk b() {
      return xk.a("commands.data.entity.modified", this.c.p_());
   }

   @Override
   public xk a(vj $$0) {
      return xk.a("commands.data.entity.query", this.c.p_(), vb.c($$0));
   }

   @Override
   public xk a(fo.g $$0, double $$1, int $$2) {
      return xk.a("commands.data.entity.get", $$0.a(), this.c.p_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
