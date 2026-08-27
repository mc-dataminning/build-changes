import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class deu extends dgn implements dha {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmo.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, deu::new)
   );
   public static final dnz b = dnp.at;
   public static final int c = 4;
   private static final eqk[] j = new eqk[]{
      daa.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      daa.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      daa.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      daa.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      daa.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dnq k = dnp.C;
   public static final dnq d = dnp.j;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(dmo $$0, dmy.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dac.dR);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eio.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      epr $$4 = $$0.n($$1, $$2);
      eqk $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dac.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1 == ih.b && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(k) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
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
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dmz $$0) {
      return $$0.c(d);
   }

   private static boolean n(dmz $$0) {
      return $$0.c(b) == 4;
   }

   public static dmz c() {
      return b(0);
   }

   public static dmz b(int $$0) {
      return dac.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
