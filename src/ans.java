import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class ans implements anq {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vs.c("commands.data.entity.invalid"));
   public static final Function<String, anr.c> a = $$0 -> new anr.c() {
         @Override
         public anq a(CommandContext<du> $$0x) throws CommandSyntaxException {
            return new ans(eh.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("entity").then($$1.apply(dv.a($$0, eh.a()))));
         }
      };
   private final bof c;

   public ans(bof $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sy $$0) throws CommandSyntaxException {
      if (this.c instanceof cia) {
         throw b.create();
      } else {
         UUID $$1 = this.c.ct();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public sy a() {
      return co.b(this.c);
   }

   @Override
   public vs b() {
      return vs.a("commands.data.entity.modified", this.c.Q_());
   }

   @Override
   public vs a(tv $$0) {
      return vs.a("commands.data.entity.query", this.c.Q_(), tn.c($$0));
   }

   @Override
   public vs a(em.g $$0, double $$1, int $$2) {
      return vs.a("commands.data.entity.get", $$0.a(), this.c.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
