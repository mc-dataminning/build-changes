import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apy implements apw {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.data.entity.invalid"));
   public static final Function<String, apx.c> a = $$0 -> new apx.c() {
         @Override
         public apw a(CommandContext<ex> $$0x) throws CommandSyntaxException {
            return new apy(fk.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> $$0x, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> $$1) {
            return $$0.then(ey.a("entity").then($$1.apply(ey.a($$0, fk.a()))));
         }
      };
   private final bvs c;

   public apy(bvs $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tw $$0) throws CommandSyntaxException {
      if (this.c instanceof cqi) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cG();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public tw a() {
      return dn.b(this.c);
   }

   @Override
   public wv b() {
      return wv.a("commands.data.entity.modified", this.c.m_());
   }

   @Override
   public wv a(ut $$0) {
      return wv.a("commands.data.entity.query", this.c.m_(), ul.c($$0));
   }

   @Override
   public wv a(fp.g $$0, double $$1, int $$2) {
      return wv.a("commands.data.entity.get", $$0.a(), this.c.m_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
