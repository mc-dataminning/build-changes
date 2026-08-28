import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djd extends dme {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dwl<jm> b = dme.aF;
   @Nullable
   private dvt c;
   @Nullable
   private dvt d;
   @Nullable
   private dvt e;
   @Nullable
   private dvt f;
   private static final Predicate<dvo> g = $$0 -> $$0 != null && ($$0.a(dil.ee) || $$0.a(dil.ef));

   @Override
   public MapCodec<? extends djd> a() {
      return a;
   }

   protected djd(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dfi $$0, jh $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dff $$0, jh $$1) {
      dvt.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cht $$3 = bup.aS.a($$0, buo.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dvt.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            chh $$5 = bup.af.a($$0, buo.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dff $$0, dvt.b $$1, bui $$2, jh $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arr $$4 : $$0.a(arr.class, $$2.cT().g(5.0))) {
         ao.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dff $$0, dvt.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvs $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dil.a.m(), 2);
            $$0.c(2001, $$4.d(), dij.j($$4.a()));
         }
      }
   }

   public static void b(dff $$0, dvt.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvs $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dil.a);
         }
      }
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   private dvt b() {
      if (this.c == null) {
         this.c = dvu.a().a(" ", "#", "#").a('#', dvs.a(dvx.a(dil.dP))).b();
      }

      return this.c;
   }

   private dvt q() {
      if (this.d == null) {
         this.d = dvu.a().a("^", "#", "#").a('^', dvs.a(g)).a('#', dvs.a(dvx.a(dil.dP))).b();
      }

      return this.d;
   }

   private dvt r() {
      if (this.e == null) {
         this.e = dvu.a().a("~ ~", "###", "~#~").a('#', dvs.a(dvx.a(dil.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dvt y() {
      if (this.f == null) {
         this.f = dvu.a().a("~^~", "###", "~#~").a('^', dvs.a(g)).a('#', dvs.a(dvx.a(dil.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
