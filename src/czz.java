import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class czz extends dbs implements dcf {
   public static final MapCodec<czz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhc.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, czz::new)
   );
   public static final din b = did.at;
   public static final int c = 4;
   private static final eks[] j = new eks[]{
      cvf.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cvf.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cvf.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cvf.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cvf.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final die k = did.C;
   public static final die d = did.j;

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   public czz(dhc $$0, dhm.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cvh.dR);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ecy.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ejz $$4 = $$0.n($$1, $$2);
      eks $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cvh.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1 == ib.b && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(k) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!h($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dhn $$0) {
      return $$0.c(d);
   }

   private static boolean n(dhn $$0) {
      return $$0.c(b) == 4;
   }

   public static dhn c() {
      return b(0);
   }

   public static dhn b(int $$0) {
      return cvh.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
