import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dky extends dob {
   public static final MapCodec<dky> a = b(dky::new);
   public static final dyl<jm> b = dob.aF;
   @Nullable
   private dxt c;
   @Nullable
   private dxt d;
   @Nullable
   private dxt e;
   @Nullable
   private dxt f;
   private static final Predicate<dxo> g = $$0 -> $$0 != null && ($$0.a(dkf.er) || $$0.a(dkf.es));

   @Override
   public MapCodec<? extends dky> a() {
      return a;
   }

   protected dky(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dhc $$0, jh $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dgz $$0, jh $$1) {
      dxt.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cim $$3 = bvi.bl.a($$0, bvh.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxt.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cia $$5 = bvi.aq.a($$0, bvh.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dgz $$0, dxt.b $$1, bvb $$2, jh $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ary $$4 : $$0.a(ary.class, $$2.cR().g(5.0))) {
         ao.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dgz $$0, dxt.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxs $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dkf.a.m(), 2);
            $$0.c(2001, $$4.d(), dkd.j($$4.a()));
         }
      }
   }

   public static void b(dgz $$0, dxt.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxs $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dkf.a);
         }
      }
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   private dxt b() {
      if (this.c == null) {
         this.c = dxu.a().a(" ", "#", "#").a('#', dxs.a(dxx.a(dkf.ec))).b();
      }

      return this.c;
   }

   private dxt q() {
      if (this.d == null) {
         this.d = dxu.a().a("^", "#", "#").a('^', dxs.a(g)).a('#', dxs.a(dxx.a(dkf.ec))).b();
      }

      return this.d;
   }

   private dxt r() {
      if (this.e == null) {
         this.e = dxu.a().a("~ ~", "###", "~#~").a('#', dxs.a(dxx.a(dkf.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dxt y() {
      if (this.f == null) {
         this.f = dxu.a().a("~^~", "###", "~#~").a('^', dxs.a(g)).a('#', dxs.a(dxx.a(dkf.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
