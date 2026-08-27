import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfm extends ddn {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final drf<drd> b = dqx.ae;

   @Override
   public MapCodec<? extends dfm> a() {
      return a;
   }

   public dfm(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drd.b));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      drd $$6 = $$0.c(b);
      if ($$1.o() != is.a.b || $$6 == drd.b != ($$1 == is.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == drd.b && $$1 == is.a && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return ddg.a.n();
      }
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      in $$1 = $$0.a();
      dad $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
      in $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, drd.a)), 3);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      if ($$0.c(b) != drd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dqh $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == drd.b;
      }
   }

   public static void a(dae $$0, dqh $$1, in $$2, int $$3) {
      in $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, drd.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, drd.a)), $$3);
   }

   public static dqh c(dag $$0, in $$1, dqh $$2) {
      return $$2.b(dqx.C) ? $$2.a(dqx.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eV());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dad $$0, clh $$1, in $$2, dqh $$3, @Nullable dnm $$4, csz $$5) {
      super.a($$0, $$1, $$2, ddg.a.n(), $$4, $$5);
   }

   protected static void b(dad $$0, in $$1, dqh $$2, clh $$3) {
      drd $$4 = $$2.c(b);
      if ($$4 == drd.a) {
         in $$5 = $$1.d();
         dqh $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == drd.b) {
            dqh $$7 = $$6.u().b(emb.c) ? ddg.G.n() : ddg.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dde.i($$6));
         }
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dqh $$0, in $$1) {
      return axz.b($$1.u(), $$1.c($$0.c(b) == drd.b ? 0 : 1).v(), $$1.w());
   }
}
