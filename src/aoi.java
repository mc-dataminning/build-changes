import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aoi implements aoj {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.data.block.invalid"));
   public static final Function<String, aok.c> a = $$0 -> new aok.c() {
         @Override
         public aoj a(CommandContext<dv> $$0x) throws CommandSyntaxException {
            id $$1 = fq.a($$0, $$0 + "Pos");
            dmo $$2 = ((dv)$$0.getSource()).e().c_($$1);
            if ($$2 == null) {
               throw aoi.b.create();
            } else {
               return new aoi($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<dv, ?> a(ArgumentBuilder<dv, ?> $$0x, Function<ArgumentBuilder<dv, ?>, ArgumentBuilder<dv, ?>> $$1) {
            return $$0.then(dw.a("block").then($$1.apply(dw.a($$0 + "Pos", fq.a()))));
         }
      };
   private final dmo c;
   private final id d;

   public aoi(dmo $$0, id $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(to $$0) {
      dpi $$1 = this.c.i().a_(this.d);
      this.c.a($$0, this.c.i().H_());
      this.c.e();
      this.c.i().a(this.d, $$1, $$1, 3);
   }

   @Override
   public to a() {
      return this.c.b(this.c.i().H_());
   }

   @Override
   public wi b() {
      return wi.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public wi a(ul $$0) {
      return wi.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), ud.c($$0));
   }

   @Override
   public wi a(en.g $$0, double $$1, int $$2) {
      return wi.a("commands.data.block.get", $$0.a(), this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
