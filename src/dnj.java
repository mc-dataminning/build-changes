import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnj extends dmq {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final ebx[] b = new ebx[]{ebw.n, ebw.o, ebw.p};
   private static final fgm c = fgj.a(dne.b(2.0, 2.0, 14.0), dne.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? null : a($$2, dyg.m, dyi::a);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyi $$5) {
         $$3.a($$5);
         $$3.a(axb.aa);
      }

      return but.a;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lz.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.a($$1.c_($$2));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
