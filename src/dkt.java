import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkt extends dmn implements dna {
   public static final MapCodec<dkt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsr.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dkt::new)
   );
   public static final duc b = dts.at;
   public static final int c = 4;
   private static final ext[] j = new ext[]{
      dfy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dfy.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dfy.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dfy.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dfy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dtt k = dts.C;
   public static final dtt d = dts.j;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dsr $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dga.dR);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epc $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epd.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      exa $$4 = $$0.n($$1, $$2);
      ext $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return m($$0) ? $$1.a_($$2.d()).a(dga.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      return $$1 == ji.b && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(k) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
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
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
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
      return dga.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
