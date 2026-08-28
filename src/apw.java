import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class apw implements apx {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.data.block.invalid"));
   public static final Function<String, apy.c> a = $$0 -> new apy.c() {
         @Override
         public apx a(CommandContext<ev> $$0x) throws CommandSyntaxException {
            jg $$1 = gr.a($$0, $$0 + "Pos");
            dsg $$2 = ((ev)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw apw.b.create();
            } else {
               return new apw($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<ev, ?> a(ArgumentBuilder<ev, ?> $$0x, Function<ArgumentBuilder<ev, ?>, ArgumentBuilder<ev, ?>> $$1) {
            return $$0.then(ew.a("block").then($$1.apply(ew.a($$0 + "Pos", gr.a()))));
         }
      };
   private final dsg c;
   private final jg d;

   public apw(dsg $$0, jg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(uj $$0) {
      dvd $$1 = this.c.i().a_(this.d);
      this.c.c($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public uj a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public xh b() {
      return xh.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public xh a(vg $$0) {
      return xh.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), uy.c($$0));
   }

   @Override
   public xh a(fn.g $$0, double $$1, int $$2) {
      return xh.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
