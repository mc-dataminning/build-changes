import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class ala implements aky {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("commands.data.entity.invalid"));
   public static final Function<String, akz.c> a = $$0 -> new akz.c() {
         @Override
         public aky a(CommandContext<du> $$0x) throws CommandSyntaxException {
            return new ala(eg.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("entity").then($$1.apply(dv.a($$0, eg.a()))));
         }
      };
   private final bkv c;

   public ala(bkv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sd $$0) throws CommandSyntaxException {
      if (this.c instanceof cdz) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cw();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public sd a() {
      return cn.b(this.c);
   }

   @Override
   public uv b() {
      return uv.a("commands.data.entity.modified", this.c.Q_());
   }

   @Override
   public uv a(ta $$0) {
      return uv.a("commands.data.entity.query", this.c.Q_(), ss.c($$0));
   }

   @Override
   public uv a(el.g $$0, double $$1, int $$2) {
      return uv.a("commands.data.entity.get", $$0.a(), this.c.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
