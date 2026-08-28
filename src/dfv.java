import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfv extends djr {
   public static final MapCodec<dfv> a = b(dfv::new);
   public static final duu b = dkr.aE;
   private static final eyx c = dgv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eyx d = dgv.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eyx e = dgv.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eyx f = dgv.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eyx g = dgv.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eyx h = dgv.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eyx i = dgv.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eyx j = eyu.a(c, d, e, f);
   private static final eyx k = eyu.a(c, g, h, i);
   private static final xd l = xd.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c));
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.g().h());
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awn.aC);
      }

      return brk.a;
   }

   @Nullable
   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return new brs(($$2x, $$3, $$4) -> new cqt($$2x, $$3, crd.a($$1, $$2)), l);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      jj $$4 = $$0.c(b);
      return $$4.o() == jj.a.a ? j : k;
   }

   @Override
   protected void a(cjy $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, dua $$3, cjy $$4) {
      if (!$$4.ba()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dds $$0, je $$1, cjy $$2) {
      if (!$$2.ba()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bsb a(btj $$0) {
      return $$0.dT().b($$0);
   }

   @Nullable
   public static dua e(dua $$0) {
      if ($$0.a(dgx.gS)) {
         return dgx.gT.o().b(b, $$0.c(b));
      } else {
         return $$0.a(dgx.gT) ? dgx.gU.o().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   public int b(dua $$0, dcx $$1, je $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
