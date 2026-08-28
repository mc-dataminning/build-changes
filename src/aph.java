import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aph implements apf {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.data.entity.invalid"));
   public static final Function<String, apg.c> a = $$0 -> new apg.c() {
         @Override
         public apf a(CommandContext<et> $$0x) throws CommandSyntaxException {
            return new aph(fg.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("entity").then($$1.apply(eu.a($$0, fg.a()))));
         }
      };
   private final bsq c;

   public aph(bsq $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ua $$0) throws CommandSyntaxException {
      if (this.c instanceof cmv) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cA();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ua a() {
      return dk.b(this.c);
   }

   @Override
   public wy b() {
      return wy.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public wy a(ux $$0) {
      return wy.a("commands.data.entity.query", this.c.O_(), up.c($$0));
   }

   @Override
   public wy a(fl.g $$0, double $$1, int $$2) {
      return wy.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
