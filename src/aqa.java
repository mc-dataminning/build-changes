import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqa implements apy {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.c("commands.data.entity.invalid"));
   public static final Function<String, apz.c> a = $$0 -> new apz.c() {
         @Override
         public apy a(CommandContext<ew> $$0x) throws CommandSyntaxException {
            return new aqa(fj.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("entity").then($$1.apply(ex.a($$0, fj.a()))));
         }
      };
   private final bue c;

   public aqa(bue $$0) {
      this.c = $$0;
   }

   @Override
   public void a(uk $$0) throws CommandSyntaxException {
      if (this.c instanceof com) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cH();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public uk a() {
      return dm.b(this.c);
   }

   @Override
   public xi b() {
      return xi.a("commands.data.entity.modified", this.c.S_());
   }

   @Override
   public xi a(vh $$0) {
      return xi.a("commands.data.entity.query", this.c.S_(), uz.c($$0));
   }

   @Override
   public xi a(fo.g $$0, double $$1, int $$2) {
      return xi.a("commands.data.entity.get", $$0.a(), this.c.S_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
