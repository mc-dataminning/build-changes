import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apz implements apx {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.data.entity.invalid"));
   public static final Function<String, apy.c> a = $$0 -> new apy.c() {
         @Override
         public apx a(CommandContext<ev> $$0x) throws CommandSyntaxException {
            return new apz(fi.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ev, ?> a(ArgumentBuilder<ev, ?> $$0x, Function<ArgumentBuilder<ev, ?>, ArgumentBuilder<ev, ?>> $$1) {
            return $$0.then(ew.a("entity").then($$1.apply(ew.a($$0, fi.a()))));
         }
      };
   private final btz c;

   public apz(btz $$0) {
      this.c = $$0;
   }

   @Override
   public void a(uj $$0) throws CommandSyntaxException {
      if (this.c instanceof coh) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cH();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public uj a() {
      return dl.b(this.c);
   }

   @Override
   public xh b() {
      return xh.a("commands.data.entity.modified", this.c.S_());
   }

   @Override
   public xh a(vg $$0) {
      return xh.a("commands.data.entity.query", this.c.S_(), uy.c($$0));
   }

   @Override
   public xh a(fn.g $$0, double $$1, int $$2) {
      return xh.a("commands.data.entity.get", $$0.a(), this.c.S_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
