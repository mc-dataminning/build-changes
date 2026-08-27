import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class aks implements akq {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.data.entity.invalid"));
   public static final Function<String, akr.c> a = $$0 -> new akr.c() {
         @Override
         public akq a(CommandContext<du> $$0x) throws CommandSyntaxException {
            return new aks(eg.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("entity").then($$1.apply(dv.a($$0, eg.a()))));
         }
      };
   private final bki c;

   public aks(bki $$0) {
      this.c = $$0;
   }

   @Override
   public void a(rz $$0) throws CommandSyntaxException {
      if (this.c instanceof cdm) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cv();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public rz a() {
      return cn.b(this.c);
   }

   @Override
   public ur b() {
      return ur.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public ur a(sw $$0) {
      return ur.a("commands.data.entity.query", this.c.O_(), so.c($$0));
   }

   @Override
   public ur a(el.g $$0, double $$1, int $$2) {
      return ur.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
