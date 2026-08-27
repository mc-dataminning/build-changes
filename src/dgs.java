import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgs extends dil implements diy {
   public static final MapCodec<dgs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doo.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dgs::new)
   );
   public static final dpz b = dpp.at;
   public static final int c = 4;
   private static final est[] j = new est[]{
      dby.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dby.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dby.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dby.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dby.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dpq k = dpp.C;
   public static final dpq d = dpp.j;

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public dgs(doo $$0, doy.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dca.dR);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ekt.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      esa $$4 = $$0.n($$1, $$2);
      est $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dca.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1 == ih.b && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(k) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
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
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(doz $$0) {
      return $$0.c(d);
   }

   private static boolean n(doz $$0) {
      return $$0.c(b) == 4;
   }

   public static doz c() {
      return b(0);
   }

   public static doz b(int $$0) {
      return dca.E.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
