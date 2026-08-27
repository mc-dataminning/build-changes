import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class anl implements anm {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.data.block.invalid"));
   public static final Function<String, ann.c> a = $$0 -> new ann.c() {
         @Override
         public anm a(CommandContext<du> $$0x) throws CommandSyntaxException {
            hz $$1 = fo.a($$0, $$0 + "Pos");
            dix $$2 = ((du)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw anl.b.create();
            } else {
               return new anl($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0x, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> $$1) {
            return $$0.then(dv.a("block").then($$1.apply(dv.a($$0 + "Pos", fo.a()))));
         }
      };
   private final dix c;
   private final hz d;

   public anl(dix $$0, hz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sw $$0) {
      dlj $$1 = this.c.i().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public sw a() {
      return this.c.o();
   }

   @Override
   public vq b() {
      return vq.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public vq a(tt $$0) {
      return vq.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), tl.c($$0));
   }

   @Override
   public vq a(em.g $$0, double $$1, int $$2) {
      return vq.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
