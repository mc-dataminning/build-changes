import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apz implements apx {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.data.entity.invalid"));
   public static final Function<String, apy.c> a = $$0 -> new apy.c() {
         @Override
         public apx a(CommandContext<ei> $$0x) throws CommandSyntaxException {
            return new apz(ev.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ei, ?> a(ArgumentBuilder<ei, ?> $$0x, Function<ArgumentBuilder<ei, ?>, ArgumentBuilder<ei, ?>> $$1) {
            return $$0.then(ej.a("entity").then($$1.apply(ej.a($$0, ev.a()))));
         }
      };
   private final bwa c;

   public apz(bwa $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tx $$0) throws CommandSyntaxException {
      if (this.c instanceof cqs) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cG();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public tx a() {
      return cy.b(this.c);
   }

   @Override
   public ww b() {
      return ww.a("commands.data.entity.modified", this.c.m_());
   }

   @Override
   public ww a(uu $$0) {
      return ww.a("commands.data.entity.query", this.c.m_(), um.c($$0));
   }

   @Override
   public ww a(fa.g $$0, double $$1, int $$2) {
      return ww.a("commands.data.entity.get", $$0.a(), this.c.m_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
