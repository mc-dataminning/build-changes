import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class ajg implements aje {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ti.c("commands.data.entity.invalid"));
   public static final Function<String, ajf.c> a = $$0 -> new ajf.c() {
         @Override
         public aje a(CommandContext<dt> $$0x) throws CommandSyntaxException {
            return new ajg(ee.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("entity").then($$1.apply(du.a($$0, ee.a()))));
         }
      };
   private final bil c;

   public ajg(bil $$0) {
      this.c = $$0;
   }

   @Override
   public void a(qu $$0) throws CommandSyntaxException {
      if (this.c instanceof cbp) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cv();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public qu a() {
      return cn.b(this.c);
   }

   @Override
   public ti b() {
      return ti.a("commands.data.entity.modified", this.c.H_());
   }

   @Override
   public ti a(rn $$0) {
      return ti.a("commands.data.entity.query", this.c.H_(), rg.c($$0));
   }

   @Override
   public ti a(ej.g $$0, double $$1, int $$2) {
      return ti.a("commands.data.entity.get", $$0, this.c.H_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
