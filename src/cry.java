import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cry implements cmv, czt {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dcv, cry> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 32;
   public static final int i = 13;
   private final iv.c<cry> b = lc.h.f(this);
   private final jv c;
   private final csv j;
   private final int k;
   private final int l;
   private final boolean m;
   @Nullable
   private final cry n;
   @Nullable
   private String o;
   @Nullable
   private final cne p;
   private final cmy q;

   public static int a(cry $$0) {
      return $$0 == null ? 0 : lc.h.a($$0);
   }

   public static cry b(int $$0) {
      return lc.h.a($$0);
   }

   @Deprecated
   public static cry a(dcv $$0) {
      return d.getOrDefault($$0, csg.a);
   }

   public cry(cry.a $$0) {
      this.c = $$0.b();
      this.j = $$0.f;
      this.n = $$0.e;
      this.l = $$0.d;
      this.k = $$0.c;
      this.p = $$0.g;
      this.m = $$0.h;
      this.q = $$0.i;
      if (aa.aX) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public iv.c<cry> n() {
      return this.b;
   }

   public jv o() {
      return this.c;
   }

   public void a(czu $$0, bre $$1, csd $$2, int $$3) {
   }

   public void a(cgv $$0) {
   }

   public void n(csd $$0) {
   }

   public boolean a(dpy $$0, czu $$1, im $$2, ckl $$3) {
      return true;
   }

   @Override
   public cry p() {
      return this;
   }

   public boq a(cvn $$0) {
      return boq.d;
   }

   public float a(csd $$0, dpy $$1) {
      return 1.0F;
   }

   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      if (this.y()) {
         csd $$3 = $$1.b($$2);
         if ($$1.t(this.z().d())) {
            $$1.c($$2);
            return bor.b($$3);
         } else {
            return bor.d($$3);
         }
      } else {
         return bor.c($$1.b($$2));
      }
   }

   public csd a(csd $$0, czu $$1, bre $$2) {
      return this.y() ? $$2.a($$1, $$0) : $$0;
   }

   public final int q() {
      return this.k;
   }

   public final int r() {
      return this.l;
   }

   public boolean s() {
      return this.l > 0;
   }

   public boolean e(csd $$0) {
      return $$0.l();
   }

   public int f(csd $$0) {
      return axw.a(Math.round(13.0F - (float)$$0.m() * 13.0F / (float)this.l), 0, 13);
   }

   public int g(csd $$0) {
      float $$1 = Math.max(0.0F, ((float)this.l - (float)$$0.m()) / (float)this.l);
      return axw.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(csd $$0, cpd $$1, cnp $$2, ckl $$3) {
      return false;
   }

   public boolean a(csd $$0, csd $$1, cpd $$2, cnp $$3, ckl $$4, brv $$5) {
      return false;
   }

   public boolean a(csd $$0, bre $$1, bre $$2) {
      return false;
   }

   public boolean a(csd $$0, czu $$1, dpy $$2, im $$3, bre $$4) {
      return false;
   }

   public boolean a_(dpy $$0) {
      return false;
   }

   public boq a(csd $$0, ckl $$1, bre $$2, bop $$3) {
      return boq.d;
   }

   public ws t() {
      return ws.c(this.a());
   }

   @Override
   public String toString() {
      return lc.h.b(this).a();
   }

   protected String u() {
      if (this.o == null) {
         this.o = ac.a("item", lc.h.b(this));
      }

      return this.o;
   }

   public String a() {
      return this.u();
   }

   public String i(csd $$0) {
      return this.a();
   }

   @Nullable
   public final cry v() {
      return this.n;
   }

   public boolean w() {
      return this.n != null;
   }

   public void a(csd $$0, czu $$1, bql $$2, int $$3, boolean $$4) {
   }

   public void b(csd $$0, czu $$1, ckl $$2) {
      this.a($$0, $$1);
   }

   public void a(csd $$0, czu $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public ctw c(csd $$0) {
      return $$0.f().y() ? ctw.b : ctw.a;
   }

   public int b(csd $$0) {
      if ($$0.f().y()) {
         return this.z().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(csd $$0, czu $$1, bre $$2, int $$3) {
   }

   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
   }

   public Optional<cpn> h(csd $$0) {
      return Optional.empty();
   }

   public ws o(csd $$0) {
      return ws.c(this.i($$0));
   }

   public boolean d_(csd $$0) {
      return $$0.A();
   }

   public csv p(csd $$0) {
      if (!$$0.A()) {
         return this.j;
      } else {
         switch (this.j) {
            case a:
            case b:
               return csv.c;
            case c:
               return csv.d;
            case d:
            default:
               return this.j;
         }
      }
   }

   public boolean a(csd $$0) {
      return this.q() == 1 && this.s();
   }

   protected static etb a(czu $$0, ckl $$1, czd.b $$2) {
      etf $$3 = $$1.bv();
      etf $$4 = $$3.e($$1.b($$1.dF(), $$1.dD()).a($$1.gA()));
      return $$0.a(new czd($$3, $$4, czd.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(csd $$0, csd $$1) {
      return false;
   }

   @Deprecated
   public Multimap<iv<bsg>, bsj> a(bqs $$0) {
      return ImmutableMultimap.of();
   }

   public boolean m(csd $$0) {
      return false;
   }

   public csd x() {
      return new csd(this);
   }

   public boolean y() {
      return this.p != null;
   }

   @Nullable
   public cne z() {
      return this.p;
   }

   public auy ak_() {
      return auz.jX;
   }

   public auy al_() {
      return auz.jY;
   }

   public auy e() {
      return auz.nr;
   }

   public boolean A() {
      return this.m;
   }

   public boolean a(bpj $$0) {
      return !this.m || !$$0.a(avq.j);
   }

   public boolean am_() {
      return true;
   }

   @Override
   public cmy m() {
      return this.q;
   }

   public static class a {
      private static final Interner<jv> a = Interners.newStrongInterner();
      @Nullable
      private jv.a b;
      int c = 64;
      int d;
      @Nullable
      cry e;
      csv f = csv.a;
      @Nullable
      cne g;
      boolean h;
      cmy i = cna.g;

      public cry.a a(cne $$0) {
         this.g = $$0;
         return this;
      }

      public cry.a a(int $$0) {
         if (this.d > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.c = $$0;
            return this;
         }
      }

      public cry.a b(int $$0) {
         return this.d == 0 ? this.c($$0) : this;
      }

      public cry.a c(int $$0) {
         this.d = $$0;
         this.c = 1;
         this.a(jz.b, 0);
         return this;
      }

      public cry.a a(cry $$0) {
         this.e = $$0;
         return this;
      }

      public cry.a a(csv $$0) {
         this.f = $$0;
         return this;
      }

      public cry.a a() {
         this.h = true;
         return this;
      }

      public cry.a a(cmw... $$0) {
         this.i = cna.e.a($$0);
         return this;
      }

      public <T> cry.a a(jy<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = jv.a().a(jz.V);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cry.a a(cuw $$0) {
         return this.a(jz.i, $$0);
      }

      jv b() {
         return this.b == null ? jz.V : (jv)a.intern(this.b.a());
      }
   }
}
