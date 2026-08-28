import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkr extends dml implements dmy {
   public static final MapCodec<dkr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsp.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dkr::new)
   );
   public static final dua b = dtq.at;
   public static final int c = 4;
   private static final exp[] j = new exp[]{
      dfw.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dfw.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dfw.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dfw.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dfw.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dtr k = dtq.C;
   public static final dtr d = dtq.j;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dsp $$0, dsz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfy.dR);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoz.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      eww $$4 = $$0.n($$1, $$2);
      exp $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfy.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1 == ji.b && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(k) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
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
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dta $$0) {
      return $$0.c(d);
   }

   private static boolean n(dta $$0) {
      return $$0.c(b) == 4;
   }

   public static dta c() {
      return b(0);
   }

   public static dta b(int $$0) {
      return dfy.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
