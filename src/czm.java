import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class czm extends dcn {
   public static final MapCodec<czm> a = b(czm::new);
   public static final dmd b = dcn.aE;
   @Nullable
   private dlo c;
   @Nullable
   private dlo d;
   @Nullable
   private dlo e;
   @Nullable
   private dlo f;
   private static final Predicate<dlj> g = $$0 -> $$0 != null && ($$0.a(cyu.ee) || $$0.a(cyu.ef));

   @Override
   public MapCodec<? extends czm> a() {
      return a;
   }

   protected czm(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cvu $$0, hz $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cvr $$0, hz $$1) {
      dlo.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         cav $$3 = bnw.aQ.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dlo.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            caj $$5 = bnw.ae.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cvr $$0, dlo.b $$1, bnq $$2, hz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aox $$4 : $$0.a(aox.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cvr $$0, dlo.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dln $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cyu.a.o(), 2);
            $$0.c(2001, $$4.d(), cys.i($$4.a()));
         }
      }
   }

   public static void b(cvr $$0, dlo.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dln $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cyu.a);
         }
      }
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   private dlo b() {
      if (this.c == null) {
         this.c = dlp.a().a(" ", "#", "#").a('#', dln.a(dls.a(cyu.dP))).b();
      }

      return this.c;
   }

   private dlo g() {
      if (this.d == null) {
         this.d = dlp.a().a("^", "#", "#").a('^', dln.a(g)).a('#', dln.a(dls.a(cyu.dP))).b();
      }

      return this.d;
   }

   private dlo s() {
      if (this.e == null) {
         this.e = dlp.a().a("~ ~", "###", "~#~").a('#', dln.a(dls.a(cyu.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dlo y() {
      if (this.f == null) {
         this.f = dlp.a().a("~^~", "###", "~#~").a('^', dln.a(g)).a('#', dln.a(dls.a(cyu.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
