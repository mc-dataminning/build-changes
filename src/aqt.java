import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqt implements aqr {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xv.c("commands.data.entity.invalid"));
   public static final Function<String, aqs.c> a = $$0 -> new aqs.c() {
         @Override
         public aqr a(CommandContext<ew> $$0x) throws CommandSyntaxException {
            return new aqt(fj.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> $$0x, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> $$1) {
            return $$0.then(ex.a("entity").then($$1.apply(ex.a($$0, fj.a()))));
         }
      };
   private final bvf c;

   public aqt(bvf $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ux $$0) throws CommandSyntaxException {
      if (this.c instanceof cps) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cG();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ux a() {
      return dm.b(this.c);
   }

   @Override
   public xv b() {
      return xv.a("commands.data.entity.modified", this.c.p_());
   }

   @Override
   public xv a(vu $$0) {
      return xv.a("commands.data.entity.query", this.c.p_(), vm.c($$0));
   }

   @Override
   public xv a(fo.g $$0, double $$1, int $$2) {
      return xv.a("commands.data.entity.get", $$0.a(), this.c.p_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
