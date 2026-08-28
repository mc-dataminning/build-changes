import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkz extends doc {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final dyk<jm> b = doc.aF;
   @Nullable
   private dxs c;
   @Nullable
   private dxs d;
   @Nullable
   private dxs e;
   @Nullable
   private dxs f;
   private static final Predicate<dxn> g = $$0 -> $$0 != null && ($$0.a(dkg.er) || $$0.a(dkg.es));

   @Override
   public MapCodec<? extends dkz> a() {
      return a;
   }

   protected dkz(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dhd $$0, jh $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dha $$0, jh $$1) {
      dxs.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         ciq $$3 = bvm.bl.a($$0, bvl.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxs.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cie $$5 = bvm.aq.a($$0, bvl.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dha $$0, dxs.b $$1, bvf $$2, jh $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (asi $$4 : $$0.a(asi.class, $$2.cR().g(5.0))) {
         ao.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dha $$0, dxs.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxr $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dkg.a.m(), 2);
            $$0.c(2001, $$4.d(), dke.j($$4.a()));
         }
      }
   }

   public static void b(dha $$0, dxs.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxr $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dkg.a);
         }
      }
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   private dxs b() {
      if (this.c == null) {
         this.c = dxt.a().a(" ", "#", "#").a('#', dxr.a(dxw.a(dkg.ec))).b();
      }

      return this.c;
   }

   private dxs q() {
      if (this.d == null) {
         this.d = dxt.a().a("^", "#", "#").a('^', dxr.a(g)).a('#', dxr.a(dxw.a(dkg.ec))).b();
      }

      return this.d;
   }

   private dxs r() {
      if (this.e == null) {
         this.e = dxt.a().a("~ ~", "###", "~#~").a('#', dxr.a(dxw.a(dkg.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dxs y() {
      if (this.f == null) {
         this.f = dxt.a().a("~^~", "###", "~#~").a('^', dxr.a(g)).a('#', dxr.a(dxw.a(dkg.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
