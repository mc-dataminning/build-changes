import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class flg extends fkv {
   private static final wu a = wu.c("options.skinCustomisation.title");
   @Nullable
   private fgb r;

   public flg(fld $$0, fdi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fgb(this.m, this.n, this.o, this));
      List<ffc> $$0 = new ArrayList<>();

      for (cli $$1 : cli.values()) {
         $$0.add(ffl.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.r.a($$0);
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      if (this.r != null) {
         this.r.a(this.n, this.d);
      }
   }
}
