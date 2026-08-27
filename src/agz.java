import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class agz implements agx {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.data.entity.invalid"));
   public static final Function<String, agy.c> a = $$0 -> new agy.c() {
         @Override
         public agx a(CommandContext<ds> $$0x) throws CommandSyntaxException {
            return new agz(ec.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0x, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("entity").then($$1.apply(dt.a($$0, ec.a()))));
         }
      };
   private final bfj c;

   public agz(bfj $$0) {
      this.c = $$0;
   }

   @Override
   public void a(qr $$0) throws CommandSyntaxException {
      if (this.c instanceof byo) {
         throw b.create();
      } else {
         UUID $$1 = this.c.ct();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public qr a() {
      return cl.b(this.c);
   }

   @Override
   public sw b() {
      return sw.a("commands.data.entity.modified", this.c.H_());
   }

   @Override
   public sw a(rk $$0) {
      return sw.a("commands.data.entity.query", this.c.H_(), rd.c($$0));
   }

   @Override
   public sw a(eh.g $$0, double $$1, int $$2) {
      return sw.a("commands.data.entity.get", $$0, this.c.H_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
