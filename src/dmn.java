import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dmn extends dmk {
   public static final MapCodec<dmn> c = b(dmn::new);
   public static final ecc<jb> d = drd.e;
   private static final Map<jb, fgk> e = fgh.c(dnc.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dmn> a() {
      return c;
   }

   protected dmn(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jb.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dne.a.m() : $$0;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      jb $$3 = $$0.c(d);
      iv $$4 = $$2.a($$3.g());
      ebe $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = super.a($$0);
      dka $$2 = $$0.q();
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
