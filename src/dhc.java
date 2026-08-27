import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhc extends dch implements djh {
   public static final MapCodec<dhc> a = b(dhc::new);
   public static final dpz b = dpy.C;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   protected dhc(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dpi $$0, dpi $$1, ij $$2) {
      return $$1.a(dcj.ac) && $$2.o() == ij.a.b;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == elc.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(b) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }
}
