import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkc extends dlv implements dmi {
   public static final MapCodec<dkc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drz.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dkc::new)
   );
   public static final dtk b = dta.at;
   public static final int c = 4;
   private static final ewy[] j = new ewy[]{
      dfh.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dfh.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dfh.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dfh.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dfh.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dtb k = dta.C;
   public static final dtb d = dta.j;

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(drz $$0, dsj.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfj.dR);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoi.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      ewf $$4 = $$0.n($$1, $$2);
      ewy $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfj.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$1 == jf.b && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(k) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
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
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dsk $$0) {
      return $$0.c(d);
   }

   private static boolean n(dsk $$0) {
      return $$0.c(b) == 4;
   }

   public static dsk c() {
      return b(0);
   }

   public static dsk b(int $$0) {
      return dfj.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
