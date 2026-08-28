import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dpi extends drc implements drp {
   public static final MapCodec<dpi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxj.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dpi::new)
   );
   public static final dyt b = dyk.au;
   public static final int c = 4;
   private static final fcr[] j = new fcr[]{
      dkl.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dkl.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dkl.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dkl.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dkl.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dyl k = dyk.D;
   public static final dyl d = dyk.j;

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(dxj $$0, dxt.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkn.ee);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      fbx $$4 = $$0.a($$2);
      fcr $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dkn.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4 == jm.b && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(k) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
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
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dxu $$0) {
      return $$0.c(d);
   }

   private static boolean q(dxu $$0) {
      return $$0.c(b) == 4;
   }

   public static dxu c() {
      return b(0);
   }

   public static dxu b(int $$0) {
      return dkn.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
