import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cwt extends czu {
   public static final MapCodec<cwt> a = b(cwt::new);
   public static final djj b = czu.aE;
   @Nullable
   private diu c;
   @Nullable
   private diu d;
   @Nullable
   private diu e;
   @Nullable
   private diu f;
   private static final Predicate<dip> g = $$0 -> $$0 != null && ($$0.a(cwb.ee) || $$0.a(cwb.ef));

   @Override
   public MapCodec<? extends cwt> a() {
      return a;
   }

   protected cwt(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c));
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(ctb $$0, hv $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(csy $$0, hv $$1) {
      diu.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         byg $$3 = blj.aP.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         diu.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            bxu $$5 = blj.ad.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(csy $$0, diu.b $$1, blf $$2, hv $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (amq $$4 : $$0.a(amq.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(csy $$0, diu.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dit $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cwb.a.o(), 2);
            $$0.c(2001, $$4.d(), cvz.i($$4.a()));
         }
      }
   }

   public static void b(csy $$0, diu.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dit $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cwb.a);
         }
      }
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   private diu b() {
      if (this.c == null) {
         this.c = div.a().a(" ", "#", "#").a('#', dit.a(diy.a(cwb.dP))).b();
      }

      return this.c;
   }

   private diu g() {
      if (this.d == null) {
         this.d = div.a().a("^", "#", "#").a('^', dit.a(g)).a('#', dit.a(diy.a(cwb.dP))).b();
      }

      return this.d;
   }

   private diu s() {
      if (this.e == null) {
         this.e = div.a().a("~ ~", "###", "~#~").a('#', dit.a(diy.a(cwb.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private diu y() {
      if (this.f == null) {
         this.f = div.a().a("~^~", "###", "~#~").a('^', dit.a(g)).a('#', dit.a(diy.a(cwb.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
