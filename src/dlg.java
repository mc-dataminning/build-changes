import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlg extends doj {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final dyr<jm> b = doj.aF;
   @Nullable
   private dxz c;
   @Nullable
   private dxz d;
   @Nullable
   private dxz e;
   @Nullable
   private dxz f;
   private static final Predicate<dxu> g = $$0 -> $$0 != null && ($$0.a(dkn.er) || $$0.a(dkn.es));

   @Override
   public MapCodec<? extends dlg> a() {
      return a;
   }

   protected dlg(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dhk $$0, jh $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dhh $$0, jh $$1) {
      dxz.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         ciu $$3 = bvq.bl.a($$0, bvp.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxz.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cii $$5 = bvq.aq.a($$0, bvp.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dhh $$0, dxz.b $$1, bvj $$2, jh $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (asi $$4 : $$0.a(asi.class, $$2.cR().g(5.0))) {
         ao.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dhh $$0, dxz.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxy $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dkn.a.m(), 2);
            $$0.c(2001, $$4.d(), dkl.j($$4.a()));
         }
      }
   }

   public static void b(dhh $$0, dxz.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxy $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dkn.a);
         }
      }
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   private dxz b() {
      if (this.c == null) {
         this.c = dya.a().a(" ", "#", "#").a('#', dxy.a(dyd.a(dkn.ec))).b();
      }

      return this.c;
   }

   private dxz q() {
      if (this.d == null) {
         this.d = dya.a().a("^", "#", "#").a('^', dxy.a(g)).a('#', dxy.a(dyd.a(dkn.ec))).b();
      }

      return this.d;
   }

   private dxz r() {
      if (this.e == null) {
         this.e = dya.a().a("~ ~", "###", "~#~").a('#', dxy.a(dyd.a(dkn.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dxz y() {
      if (this.f == null) {
         this.f = dya.a().a("~^~", "###", "~#~").a('^', dxy.a(g)).a('#', dxy.a(dyd.a(dkn.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
