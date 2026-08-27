import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class coy implements cjt, cvq {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cys, coy> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ij.c<coy> b = kf.h.g(this);
   private final cpu c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final coy g;
   @Nullable
   private String h;
   @Nullable
   private final ckc i;
   private final cjw j;

   public static int a(coy $$0) {
      return $$0 == null ? 0 : kf.h.a($$0);
   }

   public static coy b(int $$0) {
      return kf.h.a($$0);
   }

   @Deprecated
   public static coy a(cys $$0) {
      return l.getOrDefault($$0, cpg.a);
   }

   public coy(coy.a $$0) {
      this.c = $$0.d;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.e;
      this.f = $$0.f;
      this.j = $$0.g;
      if (aa.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public ij.c<coy> i() {
      return this.b;
   }

   public void a(cvr $$0, boi $$1, cpd $$2, int $$3) {
   }

   public void a(cdw $$0) {
   }

   public void b(sw $$0) {
   }

   public boolean a(dlj $$0, cvr $$1, hz $$2, chl $$3) {
      return true;
   }

   @Override
   public coy j() {
      return this;
   }

   public blw a(crm $$0) {
      return blw.d;
   }

   public float a(cpd $$0, dlj $$1) {
      return 1.0F;
   }

   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      if (this.t()) {
         cpd $$3 = $$1.b($$2);
         if ($$1.s(this.u().d())) {
            $$1.c($$2);
            return blx.b($$3);
         } else {
            return blx.d($$3);
         }
      } else {
         return blx.c($$1.b($$2));
      }
   }

   public cpd a(cpd $$0, cvr $$1, boi $$2) {
      return this.t() ? $$2.a($$1, $$0) : $$0;
   }

   public final int k() {
      return this.d;
   }

   public final int l() {
      return this.e;
   }

   public boolean n() {
      return this.e > 0;
   }

   public boolean e(cpd $$0) {
      return $$0.k();
   }

   public int f(cpd $$0) {
      return awi.a(Math.round(13.0F - (float)$$0.l() * 13.0F / (float)this.e), 0, 13);
   }

   public int g(cpd $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.l()) / (float)this.e);
      return awi.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cpd $$0, cma $$1, ckn $$2, chl $$3) {
      return false;
   }

   public boolean a(cpd $$0, cpd $$1, cma $$2, ckn $$3, chl $$4, boz $$5) {
      return false;
   }

   public boolean a(cpd $$0, boi $$1, boi $$2) {
      return false;
   }

   public boolean a(cpd $$0, cvr $$1, dlj $$2, hz $$3, boi $$4) {
      return false;
   }

   public boolean a_(dlj $$0) {
      return false;
   }

   public blw a(cpd $$0, chl $$1, boi $$2, blv $$3) {
      return blw.d;
   }

   public vq o() {
      return vq.c(this.a());
   }

   @Override
   public String toString() {
      return kf.h.b(this).a();
   }

   protected String p() {
      if (this.h == null) {
         this.h = ac.a("item", kf.h.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.p();
   }

   public String j(cpd $$0) {
      return this.a();
   }

   public boolean q() {
      return true;
   }

   @Nullable
   public final coy r() {
      return this.g;
   }

   public boolean s() {
      return this.g != null;
   }

   public void a(cpd $$0, cvr $$1, bnq $$2, int $$3, boolean $$4) {
   }

   public void b(cpd $$0, cvr $$1, chl $$2) {
      this.a($$0, $$1);
   }

   public void a(cpd $$0, cvr $$1) {
   }

   public boolean am_() {
      return false;
   }

   public cqw c(cpd $$0) {
      return $$0.d().t() ? cqw.b : cqw.a;
   }

   public int b(cpd $$0) {
      if ($$0.d().t()) {
         return this.u().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cpd $$0, cvr $$1, boi $$2, int $$3) {
   }

   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
   }

   public Optional<cmi> h(cpd $$0) {
      return Optional.empty();
   }

   public vq m(cpd $$0) {
      return vq.c(this.j($$0));
   }

   public boolean i(cpd $$0) {
      return $$0.F();
   }

   public cpu n(cpd $$0) {
      if (!$$0.F()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cpu.c;
            case c:
               return cpu.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cpd $$0) {
      return this.k() == 1 && this.n();
   }

   protected static env a(cvr $$0, chl $$1, cva.b $$2) {
      enz $$3 = $$1.br();
      enz $$4 = $$3.e($$1.f(1.0F).a($$1.gt()));
      return $$0.a(new cva($$3, $$4, cva.a.b, $$2, $$1));
   }

   public int an_() {
      return 0;
   }

   public boolean a(cpd $$0, cpd $$1) {
      return false;
   }

   public Multimap<ij<bpk>, bpn> a(bnx $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cpd $$0) {
      return false;
   }

   public cpd ao_() {
      return new cpd(this);
   }

   public boolean t() {
      return this.i != null;
   }

   @Nullable
   public ckc u() {
      return this.i;
   }

   public atk ap_() {
      return atl.jO;
   }

   public atk aq_() {
      return atl.jP;
   }

   public boolean v() {
      return this.f;
   }

   public boolean a(bmp $$0) {
      return !this.f || !$$0.a(auc.j);
   }

   public boolean ar_() {
      return true;
   }

   @Override
   public cjw m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      coy c;
      cpu d = cpu.a;
      @Nullable
      ckc e;
      boolean f;
      cjw g;

      public a() {
         this.g = cjy.g;
      }

      public coy.a a(ckc $$0) {
         this.e = $$0;
         return this;
      }

      public coy.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public coy.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public coy.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public coy.a a(coy $$0) {
         this.c = $$0;
         return this;
      }

      public coy.a a(cpu $$0) {
         this.d = $$0;
         return this;
      }

      public coy.a a() {
         this.f = true;
         return this;
      }

      public coy.a a(cju... $$0) {
         this.g = cjy.e.a($$0);
         return this;
      }
   }
}
