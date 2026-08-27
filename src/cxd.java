import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxd extends dae {
   public static final MapCodec<cxd> a = b(cxd::new);
   public static final dju b = dae.aE;
   @Nullable
   private djf c;
   @Nullable
   private djf d;
   @Nullable
   private djf e;
   @Nullable
   private djf f;
   private static final Predicate<dja> g = $$0 -> $$0 != null && ($$0.a(cwl.ee) || $$0.a(cwl.ef));

   @Override
   public MapCodec<? extends cxd> a() {
      return a;
   }

   protected cxd(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(ctl $$0, hx $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cti $$0, hx $$1) {
      djf.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         byq $$3 = blt.aP.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         djf.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            bye $$5 = blt.ad.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cti $$0, djf.b $$1, blp $$2, hx $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ana $$4 : $$0.a(ana.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cti $$0, djf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dje $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cwl.a.o(), 2);
            $$0.c(2001, $$4.d(), cwj.i($$4.a()));
         }
      }
   }

   public static void b(cti $$0, djf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dje $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cwl.a);
         }
      }
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   private djf b() {
      if (this.c == null) {
         this.c = djg.a().a(" ", "#", "#").a('#', dje.a(djj.a(cwl.dP))).b();
      }

      return this.c;
   }

   private djf g() {
      if (this.d == null) {
         this.d = djg.a().a("^", "#", "#").a('^', dje.a(g)).a('#', dje.a(djj.a(cwl.dP))).b();
      }

      return this.d;
   }

   private djf s() {
      if (this.e == null) {
         this.e = djg.a().a("~ ~", "###", "~#~").a('#', dje.a(djj.a(cwl.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private djf y() {
      if (this.f == null) {
         this.f = djg.a().a("~^~", "###", "~#~").a('^', dje.a(g)).a('#', dje.a(djj.a(cwl.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
