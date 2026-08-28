import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlh extends dok {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final dys<jm> b = dok.aF;
   @Nullable
   private dya c;
   @Nullable
   private dya d;
   @Nullable
   private dya e;
   @Nullable
   private dya f;
   private static final Predicate<dxv> g = $$0 -> $$0 != null && ($$0.a(dko.er) || $$0.a(dko.es));

   @Override
   public MapCodec<? extends dlh> a() {
      return a;
   }

   protected dlh(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dhl $$0, jh $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dhi $$0, jh $$1) {
      dya.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         civ $$3 = bvr.bl.a($$0, bvq.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dya.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cij $$5 = bvr.aq.a($$0, bvq.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dhi $$0, dya.b $$1, bvk $$2, jh $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (asi $$4 : $$0.a(asi.class, $$2.cR().g(5.0))) {
         ao.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dhi $$0, dya.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxz $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dko.a.m(), 2);
            $$0.c(2001, $$4.d(), dkm.j($$4.a()));
         }
      }
   }

   public static void b(dhi $$0, dya.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxz $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dko.a);
         }
      }
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   private dya b() {
      if (this.c == null) {
         this.c = dyb.a().a(" ", "#", "#").a('#', dxz.a(dye.a(dko.ec))).b();
      }

      return this.c;
   }

   private dya q() {
      if (this.d == null) {
         this.d = dyb.a().a("^", "#", "#").a('^', dxz.a(g)).a('#', dxz.a(dye.a(dko.ec))).b();
      }

      return this.d;
   }

   private dya r() {
      if (this.e == null) {
         this.e = dyb.a().a("~ ~", "###", "~#~").a('#', dxz.a(dye.a(dko.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dya y() {
      if (this.f == null) {
         this.f = dyb.a().a("~^~", "###", "~#~").a('^', dxz.a(g)).a('#', dxz.a(dye.a(dko.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
