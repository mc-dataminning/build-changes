import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class apd implements apb {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.data.entity.invalid"));
   public static final Function<String, apc.c> a = $$0 -> new apc.c() {
         @Override
         public apb a(CommandContext<ee> $$0x) throws CommandSyntaxException {
            return new apd(er.a($$0, $$0));
         }

         @Override
         public ArgumentBuilder<ee, ?> a(ArgumentBuilder<ee, ?> $$0x, Function<ArgumentBuilder<ee, ?>, ArgumentBuilder<ee, ?>> $$1) {
            return $$0.then(ef.a("entity").then($$1.apply(ef.a($$0, er.a()))));
         }
      };
   private final bru c;

   public apd(bru $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ud $$0) throws CommandSyntaxException {
      if (this.c instanceof clw) {
         throw b.create();
      } else {
         UUID $$1 = this.c.cz();
         this.c.g($$0);
         this.c.a_($$1);
      }
   }

   @Override
   public ud a() {
      return cv.b(this.c);
   }

   @Override
   public wx b() {
      return wx.a("commands.data.entity.modified", this.c.O_());
   }

   @Override
   public wx a(va $$0) {
      return wx.a("commands.data.entity.query", this.c.O_(), us.c($$0));
   }

   @Override
   public wx a(ew.g $$0, double $$1, int $$2) {
      return wx.a("commands.data.entity.get", $$0.a(), this.c.O_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
