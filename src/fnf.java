import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fnf extends fmu {
   private static final xo a = xo.c("options.skinCustomisation.title");
   @Nullable
   private fia r;

   public fnf(fnc $$0, ffi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fia(this.m, this.n, this.o, this));
      List<fhb> $$0 = new ArrayList<>();

      for (cmx $$1 : cmx.values()) {
         $$0.add(fhk.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
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
