import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aos implements aot {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.data.block.invalid"));
   public static final Function<String, aou.c> a = $$0 -> new aou.c() {
         @Override
         public aot a(CommandContext<ec> $$0x) throws CommandSyntaxException {
            im $$1 = fx.a($$0, $$0 + "Pos");
            dnd $$2 = ((ec)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aos.b.create();
            } else {
               return new aos($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ec, ?> a(ArgumentBuilder<ec, ?> $$0x, Function<ArgumentBuilder<ec, ?>, ArgumentBuilder<ec, ?>> $$1) {
            return $$0.then(ed.a("block").then($$1.apply(ed.a($$0 + "Pos", fx.a()))));
         }
      };
   private final dnd c;
   private final im d;

   public aos(dnd $$0, im $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ty $$0) {
      dpy $$1 = this.c.i().a_(this.d);
      this.c.a($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public ty a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public ws b() {
      return ws.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public ws a(uv $$0) {
      return ws.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), un.c($$0));
   }

   @Override
   public ws a(eu.g $$0, double $$1, int $$2) {
      return ws.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
