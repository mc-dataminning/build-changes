import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddi extends dfb implements dfo {
   public static final MapCodec<ddi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dku.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, ddi::new)
   );
   public static final dmf b = dlv.at;
   public static final int c = 4;
   private static final eol[] j = new eol[]{
      cyo.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cyo.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cyo.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cyo.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dlw k = dlv.C;
   public static final dlw d = dlv.j;

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ddi(dku $$0, dle.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cyq.dR);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egq.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ens $$4 = $$0.n($$1, $$2);
      eol $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(cyq.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$1 == ie.b && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(k) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
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
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dlf $$0) {
      return $$0.c(d);
   }

   private static boolean n(dlf $$0) {
      return $$0.c(b) == 4;
   }

   public static dlf c() {
      return b(0);
   }

   public static dlf b(int $$0) {
      return cyq.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
