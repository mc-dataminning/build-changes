import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apb implements aoz {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.data.entity.invalid"));
   public static final Function<String, apa.c> a = $$0 -> new apa.c() {
         @Override
         public aoz a(CommandContext<eq> $$0x) throws CommandSyntaxException {
            return new apb(fd.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<eq, ?> a(ArgumentBuilder<eq, ?> $$0x, Function<ArgumentBuilder<eq, ?>, ArgumentBuilder<eq, ?>> $$1) {
            return $$0.then(er.a("entity").then($$1.apply(er.a($$0, fd.a()))));
         }
      };
   private final bsd c;

   public apb(bsd $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tx $$0) throws CommandSyntaxException {
      if (this.c instanceof cmh) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cz();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public tx a() {
      return dh.b(this.c);
   }

   @Override
   public wu b() {
      return wu.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public wu a(uu $$0) {
      return wu.a("commands.data.entity.query", this.c.O_(), um.c($$0));
   }

   @Override
   public wu a(fi.g $$0, double $$1, int $$2) {
      return wu.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
