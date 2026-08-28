import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apv implements apt {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.data.entity.invalid"));
   public static final Function<String, apu.c> a = $$0 -> new apu.c() {
         @Override
         public apt a(CommandContext<ep> $$0x) throws CommandSyntaxException {
            return new apv(fc.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> $$0x, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> $$1) {
            return $$0.then(eq.a("entity").then($$1.apply(eq.a($$0, fc.a()))));
         }
      };
   private final bst c;

   public apv(bst $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ur $$0) throws CommandSyntaxException {
      if (this.c instanceof cmw) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cz();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ur a() {
      return dg.b(this.c);
   }

   @Override
   public xo b() {
      return xo.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public xo a(vo $$0) {
      return xo.a("commands.data.entity.query", this.c.O_(), vg.c($$0));
   }

   @Override
   public xo a(fh.g $$0, double $$1, int $$2) {
      return xo.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
