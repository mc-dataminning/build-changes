import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dpb extends dqv implements dri {
   public static final MapCodec<dpb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxc.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dpb::new)
   );
   public static final dym b = dyd.au;
   public static final int c = 4;
   private static final fcm[] j = new fcm[]{
      dke.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dke.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dke.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dke.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dke.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dye k = dyd.D;
   public static final dye d = dyd.j;

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   public dpb(dxc $$0, dxm.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkg.ee);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etq.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      fbs $$4 = $$0.a($$2);
      fcm $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dkg.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return $$4 == jm.b && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(k) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
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
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dxn $$0) {
      return $$0.c(d);
   }

   private static boolean q(dxn $$0) {
      return $$0.c(b) == 4;
   }

   public static dxn c() {
      return b(0);
   }

   public static dxn b(int $$0) {
      return dkg.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
