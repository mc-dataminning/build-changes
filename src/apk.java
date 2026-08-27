import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apk implements api {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.data.entity.invalid"));
   public static final Function<String, apj.c> a = $$0 -> new apj.c() {
         @Override
         public api a(CommandContext<eh> $$0x) throws CommandSyntaxException {
            return new apk(eu.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<eh, ?> a(ArgumentBuilder<eh, ?> $$0x, Function<ArgumentBuilder<eh, ?>, ArgumentBuilder<eh, ?>> $$1) {
            return $$0.then(ei.a("entity").then($$1.apply(ei.a($$0, eu.a()))));
         }
      };
   private final brv c;

   public apk(brv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(uk $$0) throws CommandSyntaxException {
      if (this.c instanceof cly) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cE();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public uk a() {
      return cw.b(this.c);
   }

   @Override
   public xe b() {
      return xe.a("commands.data.entity.modified", this.c.P_());
   }

   @Override
   public xe a(vh $$0) {
      return xe.a("commands.data.entity.query", this.c.P_(), uz.c($$0));
   }

   @Override
   public xe a(ez.g $$0, double $$1, int $$2) {
      return xe.a("commands.data.entity.get", $$0.a(), this.c.P_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
