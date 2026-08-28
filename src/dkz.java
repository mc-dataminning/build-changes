import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkz extends dod {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final dyo<jn> b = dod.e;
   @Nullable
   private dxv c;
   @Nullable
   private dxv d;
   @Nullable
   private dxv f;
   @Nullable
   private dxv g;
   private static final Predicate<dxq> h = $$0 -> $$0 != null && ($$0.a(dkg.er) || $$0.a(dkg.es));

   @Override
   public MapCodec<? extends dkz> a() {
      return a;
   }

   protected dkz(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dhc $$0, ji $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dgz $$0, ji $$1) {
      dxv.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cip $$3 = bvi.bk.a($$0, bvh.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxv.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cib $$5 = bvi.ap.a($$0, bvh.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dgz $$0, dxv.b $$1, bva $$2, ji $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (are $$4 : $$0.a(are.class, $$2.cQ().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dgz $$0, dxv.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxu $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dkg.a.m(), 2);
            $$0.c(2001, $$4.d(), dke.j($$4.a()));
         }
      }
   }

   public static void b(dgz $$0, dxv.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxu $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dkg.a);
         }
      }
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   private dxv b() {
      if (this.c == null) {
         this.c = dxw.a().a(" ", "#", "#").a('#', dxu.a(dxz.a(dkg.ec))).b();
      }

      return this.c;
   }

   private dxv q() {
      if (this.d == null) {
         this.d = dxw.a().a("^", "#", "#").a('^', dxu.a(h)).a('#', dxu.a(dxz.a(dkg.ec))).b();
      }

      return this.d;
   }

   private dxv r() {
      if (this.f == null) {
         this.f = dxw.a().a("~ ~", "###", "~#~").a('#', dxu.a(dxz.a(dkg.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private dxv y() {
      if (this.g == null) {
         this.g = dxw.a().a("~^~", "###", "~#~").a('^', dxu.a(h)).a('#', dxu.a(dxz.a(dkg.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
