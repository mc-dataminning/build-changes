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

public class crn implements cmk, czf {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dch, crn> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 32;
   public static final int i = 13;
   private final in.c<crn> b = kt.h.f(this);
   private final jn c;
   private final csj j;
   private final int k;
   private final int l;
   private final boolean m;
   @Nullable
   private final crn n;
   @Nullable
   private String o;
   @Nullable
   private final cmt p;
   private final cmn q;

   public static int a(crn $$0) {
      return $$0 == null ? 0 : kt.h.a($$0);
   }

   public static crn b(int $$0) {
      return kt.h.a($$0);
   }

   @Deprecated
   public static crn a(dch $$0) {
      return d.getOrDefault($$0, crv.a);
   }

   public crn(crn.a $$0) {
      this.c = $$0.b();
      this.j = $$0.f;
      this.n = $$0.e;
      this.l = $$0.d;
      this.k = $$0.c;
      this.p = $$0.g;
      this.m = $$0.h;
      this.q = $$0.i;
      if (aa.aW) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public in.c<crn> n() {
      return this.b;
   }

   public jn o() {
      return this.c;
   }

   public void a(czg $$0, bqt $$1, crs $$2, int $$3) {
   }

   public void a(cgk $$0) {
   }

   public void n(crs $$0) {
   }

   public boolean a(dpi $$0, czg $$1, id $$2, cka $$3) {
      return true;
   }

   @Override
   public crn p() {
      return this;
   }

   public bof a(cuz $$0) {
      return bof.d;
   }

   public float a(crs $$0, dpi $$1) {
      return 1.0F;
   }

   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      if (this.y()) {
         crs $$3 = $$1.b($$2);
         if ($$1.s(this.z().d())) {
            $$1.c($$2);
            return bog.b($$3);
         } else {
            return bog.d($$3);
         }
      } else {
         return bog.c($$1.b($$2));
      }
   }

   public crs a(crs $$0, czg $$1, bqt $$2) {
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

   public boolean e(crs $$0) {
      return $$0.l();
   }

   public int f(crs $$0) {
      return axm.a(Math.round(13.0F - (float)$$0.m() * 13.0F / (float)this.l), 0, 13);
   }

   public int g(crs $$0) {
      float $$1 = Math.max(0.0F, ((float)this.l - (float)$$0.m()) / (float)this.l);
      return axm.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(crs $$0, cos $$1, cne $$2, cka $$3) {
      return false;
   }

   public boolean a(crs $$0, crs $$1, cos $$2, cne $$3, cka $$4, brk $$5) {
      return false;
   }

   public boolean a(crs $$0, bqt $$1, bqt $$2) {
      return false;
   }

   public boolean a(crs $$0, czg $$1, dpi $$2, id $$3, bqt $$4) {
      return false;
   }

   public boolean a_(dpi $$0) {
      return false;
   }

   public bof a(crs $$0, cka $$1, bqt $$2, boe $$3) {
      return bof.d;
   }

   public wi t() {
      return wi.c(this.a());
   }

   @Override
   public String toString() {
      return kt.h.b(this).a();
   }

   protected String u() {
      if (this.o == null) {
         this.o = ac.a("item", kt.h.b(this));
      }

      return this.o;
   }

   public String a() {
      return this.u();
   }

   public String i(crs $$0) {
      return this.a();
   }

   @Nullable
   public final crn v() {
      return this.n;
   }

   public boolean w() {
      return this.n != null;
   }

   public void a(crs $$0, czg $$1, bqa $$2, int $$3, boolean $$4) {
   }

   public void b(crs $$0, czg $$1, cka $$2) {
      this.a($$0, $$1);
   }

   public void a(crs $$0, czg $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public ctk c(crs $$0) {
      return $$0.f().y() ? ctk.b : ctk.a;
   }

   public int b(crs $$0) {
      if ($$0.f().y()) {
         return this.z().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(crs $$0, czg $$1, bqt $$2, int $$3) {
   }

   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
   }

   public Optional<cpc> h(crs $$0) {
      return Optional.empty();
   }

   public wi o(crs $$0) {
      return wi.c(this.i($$0));
   }

   public boolean d_(crs $$0) {
      return $$0.A();
   }

   public csj p(crs $$0) {
      if (!$$0.A()) {
         return this.j;
      } else {
         switch (this.j) {
            case a:
            case b:
               return csj.c;
            case c:
               return csj.d;
            case d:
            default:
               return this.j;
         }
      }
   }

   public boolean a(crs $$0) {
      return this.q() == 1 && this.s();
   }

   protected static esf a(czg $$0, cka $$1, cyp.b $$2) {
      esj $$3 = $$1.bu();
      esj $$4 = $$3.e($$1.f(1.0F).a($$1.gz()));
      return $$0.a(new cyp($$3, $$4, cyp.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(crs $$0, crs $$1) {
      return false;
   }

   @Deprecated
   public Multimap<in<brv>, bry> a(bqh $$0) {
      return ImmutableMultimap.of();
   }

   public boolean m(crs $$0) {
      return false;
   }

   public crs x() {
      return new crs(this);
   }

   public boolean y() {
      return this.p != null;
   }

   @Nullable
   public cmt z() {
      return this.p;
   }

   public aun ak_() {
      return auo.jX;
   }

   public aun al_() {
      return auo.jY;
   }

   public aun e() {
      return auo.nm;
   }

   public boolean A() {
      return this.m;
   }

   public boolean a(boy $$0) {
      return !this.m || !$$0.a(avg.j);
   }

   public boolean am_() {
      return true;
   }

   @Override
   public cmn m() {
      return this.q;
   }

   public static class a {
      private static final Interner<jn> a = Interners.newStrongInterner();
      @Nullable
      private jn.a b;
      int c = 64;
      int d;
      @Nullable
      crn e;
      csj f = csj.a;
      @Nullable
      cmt g;
      boolean h;
      cmn i = cmp.g;

      public crn.a a(cmt $$0) {
         this.g = $$0;
         return this;
      }

      public crn.a a(int $$0) {
         if (this.d > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.c = $$0;
            return this;
         }
      }

      public crn.a b(int $$0) {
         return this.d == 0 ? this.c($$0) : this;
      }

      public crn.a c(int $$0) {
         this.d = $$0;
         this.c = 1;
         this.a(jr.b, 0);
         return this;
      }

      public crn.a a(crn $$0) {
         this.e = $$0;
         return this;
      }

      public crn.a a(csj $$0) {
         this.f = $$0;
         return this;
      }

      public crn.a a() {
         this.h = true;
         return this;
      }

      public crn.a a(cml... $$0) {
         this.i = cmp.e.a($$0);
         return this;
      }

      public <T> crn.a a(jq<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = jn.a().a(jr.V);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public crn.a a(cui $$0) {
         return this.a(jr.i, $$0);
      }

      jn b() {
         return this.b == null ? jr.V : (jn)a.intern(this.b.a());
      }
   }
}
