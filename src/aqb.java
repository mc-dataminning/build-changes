import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aqb implements apz {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.data.entity.invalid"));
   public static final Function<String, aqa.c> a = $$0 -> new aqa.c() {
         @Override
         public apz a(CommandContext<ej> $$0x) throws CommandSyntaxException {
            return new aqb(ew.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ej, ?> a(ArgumentBuilder<ej, ?> $$0x, Function<ArgumentBuilder<ej, ?>, ArgumentBuilder<ej, ?>> $$1) {
            return $$0.then(ek.a("entity").then($$1.apply(ek.a($$0, ew.a()))));
         }
      };
   private final bwi c;

   public aqb(bwi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tz $$0) throws CommandSyntaxException {
      if (this.c instanceof crj) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cF();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public tz a() {
      return cz.b(this.c);
   }

   @Override
   public wy b() {
      return wy.a("commands.data.entity.modified", this.c.m_());
   }

   @Override
   public wy a(uw $$0) {
      return wy.a("commands.data.entity.query", this.c.m_(), uo.b($$0));
   }

   @Override
   public wy a(fb.g $$0, double $$1, int $$2) {
      return wy.a("commands.data.entity.get", $$0.a(), this.c.m_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
