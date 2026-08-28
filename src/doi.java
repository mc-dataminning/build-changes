import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class doi extends dqe implements dqr {
   public static final MapCodec<doi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwl.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, doi::new)
   );
   public static final dxv b = dxm.aw;
   public static final int c = 4;
   private static final fbt[] j = new fbt[]{
      djl.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      djl.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      djl.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      djl.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      djl.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dxn k = dxm.J;
   public static final dxn d = dxm.n;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dwl $$0, dwv.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(djn.ee);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esz.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      faz $$4 = $$0.a($$2);
      fbt $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(djn.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return $$4 == jn.b && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(k) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
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
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dww $$0) {
      return $$0.c(d);
   }

   private static boolean q(dww $$0) {
      return $$0.c(b) == 4;
   }

   public static dww c() {
      return b(0);
   }

   public static dww b(int $$0) {
      return djn.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
