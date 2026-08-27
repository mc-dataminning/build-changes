import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dew extends dgp implements dhc {
   public static final MapCodec<dew> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dew::new)
   );
   public static final dob b = dnr.at;
   public static final int c = 4;
   private static final eqm[] j = new eqm[]{
      dac.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dac.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dac.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dac.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dac.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dns k = dnr.C;
   public static final dns d = dnr.j;

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dmq $$0, dna.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dae.dR);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eiq.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      ept $$4 = $$0.n($$1, $$2);
      eqm $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dae.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1 == ih.b && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(k) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
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
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dnb $$0) {
      return $$0.c(d);
   }

   private static boolean n(dnb $$0) {
      return $$0.c(b) == 4;
   }

   public static dnb c() {
      return b(0);
   }

   public static dnb b(int $$0) {
      return dae.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
