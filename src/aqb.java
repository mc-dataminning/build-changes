import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqb implements apz {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xj.c("commands.data.entity.invalid"));
   public static final Function<String, aqa.c> a = $$0 -> new aqa.c() {
         @Override
         public apz a(CommandContext<ew> $$0x) throws CommandSyntaxException {
            return new aqb(fj.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("entity").then($$1.apply(ex.a($$0, fj.a()))));
         }
      };
   private final bul c;

   public aqb(bul $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ul $$0) throws CommandSyntaxException {
      if (this.c instanceof cou) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cG();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ul a() {
      return dm.b(this.c);
   }

   @Override
   public xj b() {
      return xj.a("commands.data.entity.modified", this.c.o_());
   }

   @Override
   public xj a(vi $$0) {
      return xj.a("commands.data.entity.query", this.c.o_(), va.c($$0));
   }

   @Override
   public xj a(fo.g $$0, double $$1, int $$2) {
      return xj.a("commands.data.entity.get", $$0.a(), this.c.o_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
