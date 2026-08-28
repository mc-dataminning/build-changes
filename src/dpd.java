import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dpd extends dqx implements drl {
   public static final MapCodec<dpd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxf.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dpd::new)
   );
   public static final dyq b = dyg.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final fcr[] i = dke.a(4, $$0 -> dke.b(2.0, (double)h[$$0], 16.0));
   private static final dyh C = dyg.I;
   public static final dyh d = dyg.m;

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(dxf $$0, dxp.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(C, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(f).a(b).a(C).a(d);
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkg.ee);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      return super.a($$0).b(C, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dkg.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(C)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4 == jn.b && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(C) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
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
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dxq $$0) {
      return $$0.c(d);
   }

   private static boolean q(dxq $$0) {
      return $$0.c(b) == 4;
   }

   public static dxq c() {
      return b(0);
   }

   public static dxq b(int $$0) {
      return dkg.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
