import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dka extends dlt implements dmg {
   public static final MapCodec<dka> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drw.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dka::new)
   );
   public static final dth b = dsx.at;
   public static final int c = 4;
   private static final ews[] j = new ews[]{
      dff.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dff.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dff.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dff.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dff.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dsy k = dsx.C;
   public static final dsy d = dsx.j;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(drw $$0, dsg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfh.dR);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoc.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      evz $$4 = $$0.n($$1, $$2);
      ews $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfh.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$1 == jf.b && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(k) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
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
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dsh $$0) {
      return $$0.c(d);
   }

   private static boolean n(dsh $$0) {
      return $$0.c(b) == 4;
   }

   public static dsh c() {
      return b(0);
   }

   public static dsh b(int $$0) {
      return dfh.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
