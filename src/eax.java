import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class eax extends dpg {
   public static final MapCodec<eax> b = b(eax::new);
   public static final ecc<ecg> c = ebu.bj;
   public static final ebv d = ebu.B;
   public static final int e = 4;
   private static final fgk f = dnc.c(16.0, 0.0, 4.0);
   private static final Map<jb, fgk> g = fgh.d(fgh.a(f, dnc.c(4.0, 4.0, 16.0)));
   private static final Map<jb, fgk> h = fgh.d(fgh.a(f, dnc.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<eax> a() {
      return b;
   }

   public eax(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.c).b(c, ecg.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(ebe $$0, ebe $$1) {
      dnc $$2 = $$0.c(c) == ecg.a ? dne.bI : dne.by;
      return $$1.a($$2) && $$1.c(eaw.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$0.C && $$3.gl()) {
         iv $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      iv $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dne.ca) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if ($$0.a((dka)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eys.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy($$2.c(c) == ecg.b ? dne.by : dne.bI);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
