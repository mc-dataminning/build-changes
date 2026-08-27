import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aov implements aot {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.data.entity.invalid"));
   public static final Function<String, aou.c> a = $$0 -> new aou.c() {
         @Override
         public aot a(CommandContext<ec> $$0x) throws CommandSyntaxException {
            return new aov(ep.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ec, ?> a(ArgumentBuilder<ec, ?> $$0x, Function<ArgumentBuilder<ec, ?>, ArgumentBuilder<ec, ?>> $$1) {
            return $$0.then(ed.a("entity").then($$1.apply(ed.a($$0, ep.a()))));
         }
      };
   private final bql c;

   public aov(bql $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ty $$0) throws CommandSyntaxException {
      if (this.c instanceof ckl) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cx();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ty a() {
      return cu.b(this.c);
   }

   @Override
   public ws b() {
      return ws.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public ws a(uv $$0) {
      return ws.a("commands.data.entity.query", this.c.O_(), un.c($$0));
   }

   @Override
   public ws a(eu.g $$0, double $$1, int $$2) {
      return ws.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
