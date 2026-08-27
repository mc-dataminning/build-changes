import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cvv extends ctx {
   public static final MapCodec<cvv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.f.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cvv::new)
   );
   public static final die d = ctx.b;
   protected static final float e = 1.0F;
   protected static final eks f = cvf.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eks g = cvf.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eks h = ekp.a(f, g);
   private static final Map<cvf, cvv> i = Maps.newHashMap();
   private static final Iterable<ejz> j = ImmutableList.of(new ejz(0.5, 1.0, 0.5));
   private final cvf k;

   @Override
   public MapCodec<cvv> a() {
      return c;
   }

   protected cvv(cvf $$0, dhm.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<ejz> b(dhn $$0) {
      return j;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return h;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      if ($$6.a(clr.op) || $$6.a(clr.tR)) {
         return bjb.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bjb.a($$1.B);
      } else {
         bjb $$7 = cvr.a($$1, $$2, cvh.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ejv $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d);
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(cvh.eg);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.a && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cvr.d;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   public static dhn a(cvf $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dhn $$0) {
      return $$0.a(ark.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
