import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dpa extends dqw implements drj {
   public static final MapCodec<dpa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxd.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dpa::new)
   );
   public static final dyn b = dye.aw;
   public static final int c = 4;
   private static final fcl[] j = new fcl[]{
      dkd.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dkd.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dkd.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dkd.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dkd.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dyf k = dye.J;
   public static final dyf d = dye.n;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   public dpa(dxd $$0, dxn.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkf.ee);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etr.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      fbr $$4 = $$0.a($$2);
      fcl $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dkf.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return $$4 == jm.b && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(k) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!o($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!q($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dxo $$0) {
      return $$0.c(d);
   }

   private static boolean q(dxo $$0) {
      return $$0.c(b) == 4;
   }

   public static dxo c() {
      return b(0);
   }

   public static dxo b(int $$0) {
      return dkf.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
