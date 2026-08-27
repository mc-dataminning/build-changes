import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dce extends dga {
   public static final MapCodec<dce> a = b(dce::new);
   public static final drb b = dha.aE;
   private static final eui c = dde.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eui d = dde.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eui e = dde.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eui f = dde.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eui g = dde.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eui h = dde.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eui i = dde.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eui j = euf.a(c, d, e, f);
   private static final eui k = euf.a(c, g, h, i);
   private static final wu l = wu.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   public dce(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c));
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avm.aC);
         return bpm.b;
      }
   }

   @Nullable
   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return new bpw(($$2x, $$3, $$4) -> new cof($$2x, $$3, cop.a($$1, $$2)), l);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      is $$4 = $$0.c(b);
      return $$4.o() == is.a.a ? j : k;
   }

   @Override
   protected void a(chq $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, dqh $$3, chq $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dad $$0, in $$1, chq $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bqf a(brh $$0) {
      return $$0.dO().b($$0);
   }

   @Nullable
   public static dqh e(dqh $$0) {
      if ($$0.a(ddg.gS)) {
         return ddg.gT.n().a(b, $$0.c(b));
      } else {
         return $$0.a(ddg.gT) ? ddg.gU.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   public int b(dqh $$0, czj $$1, in $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
