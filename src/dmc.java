import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dmc extends dlz {
   public static final MapCodec<dmc> c = b(dmc::new);
   public static final ebr<jb> d = dqs.e;
   private static final Map<jb, ffw> e = fft.c(dmr.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dmc> a() {
      return c;
   }

   protected dmc(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jb.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dmt.a.m() : $$0;
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      jb $$3 = $$0.c(d);
      iv $$4 = $$2.a($$3.g());
      eat $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = super.a($$0);
      djp $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
