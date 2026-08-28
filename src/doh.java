import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class doh extends dqd implements dqq {
   public static final MapCodec<doh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwk.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, doh::new)
   );
   public static final dxu b = dxl.aw;
   public static final int c = 4;
   private static final fbs[] j = new fbs[]{
      djk.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      djk.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      djk.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      djk.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dxm k = dxl.J;
   public static final dxm d = dxl.n;

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dwk $$0, dwu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(djm.ee);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esy.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      fay $$4 = $$0.a($$2);
      fbs $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(djm.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$4 == jn.b && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(k) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
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
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dwv $$0) {
      return $$0.c(d);
   }

   private static boolean q(dwv $$0) {
      return $$0.c(b) == 4;
   }

   public static dwv c() {
      return b(0);
   }

   public static dwv b(int $$0) {
      return djm.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
