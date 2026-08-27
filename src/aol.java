import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aol implements aoj {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.data.entity.invalid"));
   public static final Function<String, aok.c> a = $$0 -> new aok.c() {
         @Override
         public aoj a(CommandContext<dv> $$0x) throws CommandSyntaxException {
            return new aol(ei.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dv, ?> a(ArgumentBuilder<dv, ?> $$0x, Function<ArgumentBuilder<dv, ?>, ArgumentBuilder<dv, ?>> $$1) {
            return $$0.then(dw.a("entity").then($$1.apply(dw.a($$0, ei.a()))));
         }
      };
   private final bqa c;

   public aol(bqa $$0) {
      this.c = $$0;
   }

   @Override
   public void a(to $$0) throws CommandSyntaxException {
      if (this.c instanceof cka) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cw();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public to a() {
      return co.b(this.c);
   }

   @Override
   public wi b() {
      return wi.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public wi a(ul $$0) {
      return wi.a("commands.data.entity.query", this.c.O_(), ud.c($$0));
   }

   @Override
   public wi a(en.g $$0, double $$1, int $$2) {
      return wi.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
