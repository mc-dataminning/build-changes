import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqm implements aqk {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.data.entity.invalid"));
   public static final Function<String, aql.c> a = $$0 -> new aql.c() {
         @Override
         public aqk a(CommandContext<ek> $$0x) throws CommandSyntaxException {
            return new aqm(ex.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
            return $$0.then(el.a("entity").then($$1.apply(el.a($$0, ex.a()))));
         }
      };
   private final bxe c;

   public aqm(bxe $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ua $$0) throws CommandSyntaxException {
      if (this.c instanceof csi) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cG();
         this.c.i($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ua a() {
      return da.b(this.c);
   }

   @Override
   public xg b() {
      return xg.a("commands.data.entity.modified", this.c.P_());
   }

   @Override
   public xg a(va $$0) {
      return xg.a("commands.data.entity.query", this.c.P_(), up.b($$0));
   }

   @Override
   public xg a(fc.g $$0, double $$1, int $$2) {
      return xg.a("commands.data.entity.get", $$0.a(), this.c.P_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
