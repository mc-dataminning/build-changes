import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dok extends dqg implements dqt {
   public static final MapCodec<dok> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwn.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dok::new)
   );
   public static final dxx b = dxo.aw;
   public static final int c = 4;
   private static final fbv[] j = new fbv[]{
      djn.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      djn.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      djn.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      djn.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dxp k = dxo.J;
   public static final dxp d = dxo.n;

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(dwn $$0, dwx.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(djp.ee);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etb.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      fbb $$4 = $$0.a($$2);
      fbv $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(djp.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return $$4 == jn.b && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(k) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
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
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dwy $$0) {
      return $$0.c(d);
   }

   private static boolean q(dwy $$0) {
      return $$0.c(b) == 4;
   }

   public static dwy c() {
      return b(0);
   }

   public static dwy b(int $$0) {
      return djp.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
