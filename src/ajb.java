import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class ajb implements aiz {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.data.entity.invalid"));
   public static final Function<String, aja.c> a = $$0 -> new aja.c() {
         @Override
         public aiz a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            return new ajb(ed.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("entity").then($$1.apply(dt.a($$0, ed.a()))));
         }
      };
   private final big c;

   public ajb(big $$0) {
      this.c = $$0;
   }

   @Override
   public void a(qs $$0) throws CommandSyntaxException {
      if (this.c instanceof cbl) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cv();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public qs a() {
      return cl.b(this.c);
   }

   @Override
   public te b() {
      return te.a("commands.data.entity.modified", this.c.H_());
   }

   @Override
   public te a(rl $$0) {
      return te.a("commands.data.entity.query", this.c.H_(), re.c($$0));
   }

   @Override
   public te a(ei.g $$0, double $$1, int $$2) {
      return te.a("commands.data.entity.get", $$0, this.c.H_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
