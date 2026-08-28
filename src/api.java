import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class api implements apg {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.data.entity.invalid"));
   public static final Function<String, aph.c> a = $$0 -> new aph.c() {
         @Override
         public apg a(CommandContext<et> $$0x) throws CommandSyntaxException {
            return new api(fg.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("entity").then($$1.apply(eu.a($$0, fg.a()))));
         }
      };
   private final bsr c;

   public api(bsr $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ub $$0) throws CommandSyntaxException {
      if (this.c instanceof cmx) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cA();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ub a() {
      return dk.b(this.c);
   }

   @Override
   public wz b() {
      return wz.a("commands.data.entity.modified", this.c.S_());
   }

   @Override
   public wz a(uy $$0) {
      return wz.a("commands.data.entity.query", this.c.S_(), uq.c($$0));
   }

   @Override
   public wz a(fl.g $$0, double $$1, int $$2) {
      return wz.a("commands.data.entity.get", $$0.a(), this.c.S_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
