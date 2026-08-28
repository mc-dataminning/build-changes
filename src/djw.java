import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djw extends dlp implements dmc {
   public static final MapCodec<djw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drt.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, djw::new)
   );
   public static final dte b = dsu.at;
   public static final int c = 4;
   private static final ewm[] j = new ewm[]{
      dfb.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dfb.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dfb.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dfb.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dfb.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dsv k = dsu.C;
   public static final dsv d = dsu.j;

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(drt $$0, dsd.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfd.dR);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eny.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      evt $$4 = $$0.n($$1, $$2);
      ewm $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfd.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$1 == je.b && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(k) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
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
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dse $$0) {
      return $$0.c(d);
   }

   private static boolean n(dse $$0) {
      return $$0.c(b) == 4;
   }

   public static dse c() {
      return b(0);
   }

   public static dse b(int $$0) {
      return dfd.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
