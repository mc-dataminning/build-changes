import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class ajd implements ajb {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.data.entity.invalid"));
   public static final Function<String, ajc.c> a = $$0 -> new ajc.c() {
         @Override
         public ajb a(CommandContext<dr> $$0x) throws CommandSyntaxException {
            return new ajd(ec.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dr, ?> a(ArgumentBuilder<dr, ?> $$0x, Function<ArgumentBuilder<dr, ?>, ArgumentBuilder<dr, ?>> $$1) {
            return $$0.then(ds.a("entity").then($$1.apply(ds.a($$0, ec.a()))));
         }
      };
   private final bii c;

   public ajd(bii $$0) {
      this.c = $$0;
   }

   @Override
   public void a(qr $$0) throws CommandSyntaxException {
      if (this.c instanceof cbn) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cv();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public qr a() {
      return cl.b(this.c);
   }

   @Override
   public tf b() {
      return tf.a("commands.data.entity.modified", this.c.H_());
   }

   @Override
   public tf a(rk $$0) {
      return tf.a("commands.data.entity.query", this.c.H_(), rd.c($$0));
   }

   @Override
   public tf a(eh.g $$0, double $$1, int $$2) {
      return tf.a("commands.data.entity.get", $$0, this.c.H_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
