import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aoy implements aow {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.data.entity.invalid"));
   public static final Function<String, aox.c> a = $$0 -> new aox.c() {
         @Override
         public aow a(CommandContext<ed> $$0x) throws CommandSyntaxException {
            return new aoy(eq.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$0x, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> $$1) {
            return $$0.then(ee.a("entity").then($$1.apply(ee.a($$0, eq.a()))));
         }
      };
   private final brh c;

   public aoy(brh $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ua $$0) throws CommandSyntaxException {
      if (this.c instanceof clh) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cx();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ua a() {
      return cv.b(this.c);
   }

   @Override
   public wu b() {
      return wu.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public wu a(ux $$0) {
      return wu.a("commands.data.entity.query", this.c.O_(), up.c($$0));
   }

   @Override
   public wu a(ev.g $$0, double $$1, int $$2) {
      return wu.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
