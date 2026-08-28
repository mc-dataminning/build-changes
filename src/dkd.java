import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkd extends dlw implements dmj {
   public static final MapCodec<dkd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsa.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dkd::new)
   );
   public static final dtl b = dtb.at;
   public static final int c = 4;
   private static final exa[] j = new exa[]{
      dfi.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dfi.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dfi.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dfi.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dfi.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dtc k = dtb.C;
   public static final dtc d = dtb.j;

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dsa $$0, dsk.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfk.dR);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eok.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      ewh $$4 = $$0.n($$1, $$2);
      exa $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfk.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$1 == jf.b && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(k) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!m($$0)) {
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
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dsl $$0) {
      return $$0.c(d);
   }

   private static boolean n(dsl $$0) {
      return $$0.c(b) == 4;
   }

   public static dsl c() {
      return b(0);
   }

   public static dsl b(int $$0) {
      return dfk.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
