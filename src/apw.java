import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apw implements apu {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.data.entity.invalid"));
   public static final Function<String, apv.c> a = $$0 -> new apv.c() {
         @Override
         public apu a(CommandContext<eu> $$0x) throws CommandSyntaxException {
            return new apw(fh.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<eu, ?> a(ArgumentBuilder<eu, ?> $$0x, Function<ArgumentBuilder<eu, ?>, ArgumentBuilder<eu, ?>> $$1) {
            return $$0.then(ev.a("entity").then($$1.apply(ev.a($$0, fh.a()))));
         }
      };
   private final btr c;

   public apw(btr $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ug $$0) throws CommandSyntaxException {
      if (this.c instanceof cnx) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cD();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ug a() {
      return dk.b(this.c);
   }

   @Override
   public xe b() {
      return xe.a("commands.data.entity.modified", this.c.R_());
   }

   @Override
   public xe a(vd $$0) {
      return xe.a("commands.data.entity.query", this.c.R_(), uv.c($$0));
   }

   @Override
   public xe a(fm.g $$0, double $$1, int $$2) {
      return xe.a("commands.data.entity.get", $$0.a(), this.c.R_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
