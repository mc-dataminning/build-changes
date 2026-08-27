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

public class cqh implements cle, cxa {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dac, cqh> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final il.c<cqh> b = ki.h.f(this);
   private final crd c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cqh g;
   @Nullable
   private String h;
   @Nullable
   private final cln i;
   private final clh j;

   public static int a(cqh $$0) {
      return $$0 == null ? 0 : ki.h.a($$0);
   }

   public static cqh b(int $$0) {
      return ki.h.a($$0);
   }

   @Deprecated
   public static cqh a(dac $$0) {
      return l.getOrDefault($$0, cqp.a);
   }

   public cqh(cqh.a $$0) {
      this.c = $$0.d;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.e;
      this.f = $$0.f;
      this.j = $$0.g;
      if (aa.aW) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public il.c<cqh> k() {
      return this.b;
   }

   public void a(cxb $$0, bpp $$1, cqm $$2, int $$3) {
   }

   public void a(cfe $$0) {
   }

   public void b(ta $$0) {
   }

   public boolean a(dnb $$0, cxb $$1, ib $$2, ciu $$3) {
      return true;
   }

   @Override
   public cqh l() {
      return this;
   }

   public bnd a(csw $$0) {
      return bnd.d;
   }

   public float a(cqm $$0, dnb $$1) {
      return 1.0F;
   }

   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      if (this.v()) {
         cqm $$3 = $$1.b($$2);
         if ($$1.s(this.w().d())) {
            $$1.c($$2);
            return bne.b($$3);
         } else {
            return bne.d($$3);
         }
      } else {
         return bne.c($$1.b($$2));
      }
   }

   public cqm a(cqm $$0, cxb $$1, bpp $$2) {
      return this.v() ? $$2.a($$1, $$0) : $$0;
   }

   public final int n() {
      return this.d;
   }

   public final int o() {
      return this.e;
   }

   public boolean p() {
      return this.e > 0;
   }

   public boolean e(cqm $$0) {
      return $$0.k();
   }

   public int f(cqm $$0) {
      return aww.a(Math.round(13.0F - (float)$$0.l() * 13.0F / (float)this.e), 0, 13);
   }

   public int g(cqm $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.l()) / (float)this.e);
      return aww.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cqm $$0, cnl $$1, cly $$2, ciu $$3) {
      return false;
   }

   public boolean a(cqm $$0, cqm $$1, cnl $$2, cly $$3, ciu $$4, bqg $$5) {
      return false;
   }

   public boolean a(cqm $$0, bpp $$1, bpp $$2) {
      return false;
   }

   public boolean a(cqm $$0, cxb $$1, dnb $$2, ib $$3, bpp $$4) {
      return false;
   }

   public boolean a_(dnb $$0) {
      return false;
   }

   public bnd a(cqm $$0, ciu $$1, bpp $$2, bnc $$3) {
      return bnd.d;
   }

   public vu q() {
      return vu.c(this.a());
   }

   @Override
   public String toString() {
      return ki.h.b(this).a();
   }

   protected String r() {
      if (this.h == null) {
         this.h = ac.a("item", ki.h.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.r();
   }

   public String j(cqm $$0) {
      return this.a();
   }

   public boolean s() {
      return true;
   }

   @Nullable
   public final cqh t() {
      return this.g;
   }

   public boolean u() {
      return this.g != null;
   }

   public void a(cqm $$0, cxb $$1, box $$2, int $$3, boolean $$4) {
   }

   public void b(cqm $$0, cxb $$1, ciu $$2) {
      this.a($$0, $$1);
   }

   public void a(cqm $$0, cxb $$1) {
   }

   public boolean al_() {
      return false;
   }

   public csf c(cqm $$0) {
      return $$0.d().v() ? csf.b : csf.a;
   }

   public int b(cqm $$0) {
      if ($$0.d().v()) {
         return this.w().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cqm $$0, cxb $$1, bpp $$2, int $$3) {
   }

   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
   }

   public Optional<cnt> h(cqm $$0) {
      return Optional.empty();
   }

   public vu m(cqm $$0) {
      return vu.c(this.j($$0));
   }

   public boolean i(cqm $$0) {
      return $$0.F();
   }

   public crd n(cqm $$0) {
      if (!$$0.F()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return crd.c;
            case c:
               return crd.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cqm $$0) {
      return this.n() == 1 && this.p();
   }

   protected static epp a(cxb $$0, ciu $$1, cwk.b $$2) {
      ept $$3 = $$1.bu();
      ept $$4 = $$3.e($$1.f(1.0F).a($$1.gz()));
      return $$0.a(new cwk($$3, $$4, cwk.a.b, $$2, $$1));
   }

   public int e() {
      return 0;
   }

   public boolean a(cqm $$0, cqm $$1) {
      return false;
   }

   public Multimap<il<bqr>, bqu> a(bpe $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cqm $$0) {
      return false;
   }

   public cqm am_() {
      return new cqm(this);
   }

   public boolean v() {
      return this.i != null;
   }

   @Nullable
   public cln w() {
      return this.i;
   }

   public atx an_() {
      return aty.jV;
   }

   public atx ao_() {
      return aty.jW;
   }

   public boolean x() {
      return this.f;
   }

   public boolean a(bnw $$0) {
      return !this.f || !$$0.a(aup.j);
   }

   public boolean ap_() {
      return true;
   }

   @Override
   public clh m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cqh c;
      crd d = crd.a;
      @Nullable
      cln e;
      boolean f;
      clh g;

      public a() {
         this.g = clj.g;
      }

      public cqh.a a(cln $$0) {
         this.e = $$0;
         return this;
      }

      public cqh.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cqh.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cqh.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cqh.a a(cqh $$0) {
         this.c = $$0;
         return this;
      }

      public cqh.a a(crd $$0) {
         this.d = $$0;
         return this;
      }

      public cqh.a a() {
         this.f = true;
         return this;
      }

      public cqh.a a(clf... $$0) {
         this.g = clj.e.a($$0);
         return this;
      }
   }
}
