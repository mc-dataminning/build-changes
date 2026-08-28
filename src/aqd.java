import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqd implements aqb {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.data.entity.invalid"));
   public static final Function<String, aqc.c> a = $$0 -> new aqc.c() {
         @Override
         public aqb a(CommandContext<ew> $$0x) throws CommandSyntaxException {
            return new aqd(fj.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("entity").then($$1.apply(ex.a($$0, fj.a()))));
         }
      };
   private final bui c;

   public aqd(bui $$0) {
      this.c = $$0;
   }

   @Override
   public void a(un $$0) throws CommandSyntaxException {
      if (this.c instanceof cor) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cI();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public un a() {
      return dm.b(this.c);
   }

   @Override
   public xl b() {
      return xl.a("commands.data.entity.modified", this.c.S_());
   }

   @Override
   public xl a(vk $$0) {
      return xl.a("commands.data.entity.query", this.c.S_(), vc.c($$0));
   }

   @Override
   public xl a(fo.g $$0, double $$1, int $$2) {
      return xl.a("commands.data.entity.get", $$0.a(), this.c.S_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
