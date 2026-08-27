import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class deu extends dhw {
   public static final MapCodec<deu> a = b(deu::new);
   public static final drx b = dhw.aE;
   @Nullable
   private dri c;
   @Nullable
   private dri d;
   @Nullable
   private dri e;
   @Nullable
   private dri f;
   private static final Predicate<drd> g = $$0 -> $$0 != null && ($$0.a(dec.ee) || $$0.a(dec.ef));

   @Override
   public MapCodec<? extends deu> a() {
      return a;
   }

   protected deu(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dbc $$0, io $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(daz $$0, io $$1) {
      dri.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cfe $$3 = bsc.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dri.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ces $$5 = bsc.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(daz $$0, dri.b $$1, brw $$2, io $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqo $$4 : $$0.a(aqo.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(daz $$0, dri.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            drh $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dec.a.n(), 2);
            $$0.c(2001, $$4.d(), dea.i($$4.a()));
         }
      }
   }

   public static void b(daz $$0, dri.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            drh $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dec.a);
         }
      }
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   private dri b() {
      if (this.c == null) {
         this.c = drj.a().a(" ", "#", "#").a('#', drh.a(drm.a(dec.dP))).b();
      }

      return this.c;
   }

   private dri m() {
      if (this.d == null) {
         this.d = drj.a().a("^", "#", "#").a('^', drh.a(g)).a('#', drh.a(drm.a(dec.dP))).b();
      }

      return this.d;
   }

   private dri s() {
      if (this.e == null) {
         this.e = drj.a().a("~ ~", "###", "~#~").a('#', drh.a(drm.a(dec.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dri y() {
      if (this.f == null) {
         this.f = drj.a().a("~^~", "###", "~#~").a('^', drh.a(g)).a('#', drh.a(drm.a(dec.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
