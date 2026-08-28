import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqf implements aqd {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("commands.data.entity.invalid"));
   public static final Function<String, aqe.c> a = $$0 -> new aqe.c() {
         @Override
         public aqd a(CommandContext<ek> $$0x) throws CommandSyntaxException {
            return new aqf(ex.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
            return $$0.then(el.a("entity").then($$1.apply(el.a($$0, ex.a()))));
         }
      };
   private final bwv c;

   public aqf(bwv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ua $$0) throws CommandSyntaxException {
      if (this.c instanceof crz) {
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
   public xc b() {
      return xc.a("commands.data.entity.modified", this.c.m_());
   }

   @Override
   public xc a(va $$0) {
      return xc.a("commands.data.entity.query", this.c.m_(), up.b($$0));
   }

   @Override
   public xc a(fc.g $$0, double $$1, int $$2) {
      return xc.a("commands.data.entity.get", $$0.a(), this.c.m_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
