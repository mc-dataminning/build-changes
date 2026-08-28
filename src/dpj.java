import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dpj extends drd implements drq {
   public static final MapCodec<dpj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dpj::new)
   );
   public static final dyu b = dyl.au;
   public static final int c = 4;
   private static final fcs[] j = new fcs[]{
      dkm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dkm.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dkm.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dkm.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dkm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dym k = dyl.D;
   public static final dym d = dyl.j;

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   public dpj(dxk $$0, dxu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dko.ee);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ety.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      fby $$4 = $$0.a($$2);
      fcs $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dko.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return $$4 == jm.b && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(k) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
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
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dxv $$0) {
      return $$0.c(d);
   }

   private static boolean q(dxv $$0) {
      return $$0.c(b) == 4;
   }

   public static dxv c() {
      return b(0);
   }

   public static dxv b(int $$0) {
      return dko.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
