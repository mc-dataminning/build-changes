import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddz extends dfs implements dgf {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlt.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, ddz::new)
   );
   public static final dne b = dmu.at;
   public static final int c = 4;
   private static final epo[] j = new epo[]{
      czf.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      czf.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      czf.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      czf.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dmv k = dmu.C;
   public static final dmv d = dmu.j;

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public ddz(dlt $$0, dmd.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(czh.dR);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ehs.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      eov $$4 = $$0.n($$1, $$2);
      epo $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(czh.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return $$1 == ih.b && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(k) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
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
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dme $$0) {
      return $$0.c(d);
   }

   private static boolean n(dme $$0) {
      return $$0.c(b) == 4;
   }

   public static dme c() {
      return b(0);
   }

   public static dme b(int $$0) {
      return czh.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
