import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apw implements apu {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.data.entity.invalid"));
   public static final Function<String, apv.c> a = $$0 -> new apv.c() {
         @Override
         public apu a(CommandContext<ep> $$0x) throws CommandSyntaxException {
            return new apw(fc.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("entity").then($$1.apply(eq.a($$0, fc.a()))));
         }
      };
   private final bsv c;

   public apw(bsv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(us $$0) throws CommandSyntaxException {
      if (this.c instanceof cmy) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cz();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public us a() {
      return dg.b(this.c);
   }

   @Override
   public xp b() {
      return xp.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public xp a(vp $$0) {
      return xp.a("commands.data.entity.query", this.c.O_(), vh.c($$0));
   }

   @Override
   public xp a(fh.g $$0, double $$1, int $$2) {
      return xp.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
