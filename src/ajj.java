import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class ajj implements ajh {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tm.c("commands.data.entity.invalid"));
   public static final Function<String, aji.c> a = $$0 -> new aji.c() {
         @Override
         public ajh a(CommandContext<dt> $$0x) throws CommandSyntaxException {
            return new ajj(ee.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> $$0x, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> $$1) {
            return $$0.then(du.a("entity").then($$1.apply(du.a($$0, ee.a()))));
         }
      };
   private final biq c;

   public ajj(biq $$0) {
      this.c = $$0;
   }

   @Override
   public void a(qy $$0) throws CommandSyntaxException {
      if (this.c instanceof cbu) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cv();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public qy a() {
      return cn.b(this.c);
   }

   @Override
   public tm b() {
      return tm.a("commands.data.entity.modified", this.c.N_());
   }

   @Override
   public tm a(rr $$0) {
      return tm.a("commands.data.entity.query", this.c.N_(), rk.c($$0));
   }

   @Override
   public tm a(ej.g $$0, double $$1, int $$2) {
      return tm.a("commands.data.entity.get", $$0, this.c.N_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
