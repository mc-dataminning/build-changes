import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class ann implements anl {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.data.entity.invalid"));
   public static final Function<String, anm.c> a = $$0 -> new anm.c() {
         @Override
         public anl a(CommandContext<du> $$0x) throws CommandSyntaxException {
            return new ann(eh.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("entity").then($$1.apply(dv.a($$0, eh.a()))));
         }
      };
   private final bno c;

   public ann(bno $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sw $$0) throws CommandSyntaxException {
      if (this.c instanceof chh) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cw();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public sw a() {
      return co.b(this.c);
   }

   @Override
   public vq b() {
      return vq.a("commands.data.entity.modified", this.c.Q_());
   }

   @Override
   public vq a(tt $$0) {
      return vq.a("commands.data.entity.query", this.c.Q_(), tl.c($$0));
   }

   @Override
   public vq a(em.g $$0, double $$1, int $$2) {
      return vq.a("commands.data.entity.get", $$0.a(), this.c.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
