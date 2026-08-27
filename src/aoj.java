import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aoj implements aoh {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.c("commands.data.entity.invalid"));
   public static final Function<String, aoi.c> a = $$0 -> new aoi.c() {
         @Override
         public aoh a(CommandContext<du> $$0x) throws CommandSyntaxException {
            return new aoj(eh.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("entity").then($$1.apply(dv.a($$0, eh.a()))));
         }
      };
   private final bpv c;

   public aoj(bpv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tm $$0) throws CommandSyntaxException {
      if (this.c instanceof cjt) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cw();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public tm a() {
      return co.b(this.c);
   }

   @Override
   public wg b() {
      return wg.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public wg a(uj $$0) {
      return wg.a("commands.data.entity.query", this.c.O_(), ub.c($$0));
   }

   @Override
   public wg a(em.g $$0, double $$1, int $$2) {
      return wg.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
