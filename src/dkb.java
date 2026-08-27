import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkb extends dme implements dmr {
   public static final MapCodec<dkb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsr.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dkb::new)
   );
   public static final duc b = dts.at;
   public static final int c = 4;
   private static final exn[] j = new exn[]{
      dfc.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dfc.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dfc.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dfc.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dfc.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dtt k = dts.C;
   public static final dtt d = dts.j;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dsr $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfe.eF);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      ewu $$4 = $$0.n($$1, $$2);
      exn $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfe.bt) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1 == iw.b && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(k) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
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
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dtc $$0) {
      return $$0.c(d);
   }

   private static boolean n(dtc $$0) {
      return $$0.c(b) == 4;
   }

   public static dtc c() {
      return b(0);
   }

   public static dtc b(int $$0) {
      return dfe.aj.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
