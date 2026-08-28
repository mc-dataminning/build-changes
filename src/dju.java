import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dju extends dln implements dma {
   public static final MapCodec<dju> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drr.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dju::new)
   );
   public static final dtc b = dss.at;
   public static final int c = 4;
   private static final ewk[] j = new ewk[]{
      dez.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dez.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dez.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dez.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dez.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dst k = dss.C;
   public static final dst d = dss.j;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(drr $$0, dsb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfb.dR);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enw.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      evr $$4 = $$0.n($$1, $$2);
      ewk $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfb.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1 == je.b && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(k) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
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
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dsc $$0) {
      return $$0.c(d);
   }

   private static boolean n(dsc $$0) {
      return $$0.c(b) == 4;
   }

   public static dsc c() {
      return b(0);
   }

   public static dsc b(int $$0) {
      return dfb.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
