import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apt implements apr {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.data.entity.invalid"));
   public static final Function<String, aps.c> a = $$0 -> new aps.c() {
         @Override
         public apr a(CommandContext<et> $$0x) throws CommandSyntaxException {
            return new apt(fg.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> $$0x, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> $$1) {
            return $$0.then(eu.a("entity").then($$1.apply(eu.a($$0, fg.a()))));
         }
      };
   private final btj c;

   public apt(btj $$0) {
      this.c = $$0;
   }

   @Override
   public void a(uf $$0) throws CommandSyntaxException {
      if (this.c instanceof cnp) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cD();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public uf a() {
      return dk.b(this.c);
   }

   @Override
   public xd b() {
      return xd.a("commands.data.entity.modified", this.c.Q_());
   }

   @Override
   public xd a(vc $$0) {
      return xd.a("commands.data.entity.query", this.c.Q_(), uu.c($$0));
   }

   @Override
   public xd a(fl.g $$0, double $$1, int $$2) {
      return xd.a("commands.data.entity.get", $$0.a(), this.c.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
