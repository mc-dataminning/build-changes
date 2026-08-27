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

public class cre implements cmd, cyw {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dby, cre> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 32;
   public static final int i = 13;
   private final il.c<cre> b = kr.h.f(this);
   private final jl c;
   private final csa j;
   private final int k;
   private final int l;
   private final boolean m;
   @Nullable
   private final cre n;
   @Nullable
   private String o;
   @Nullable
   private final cmm p;
   private final cmg q;

   public static int a(cre $$0) {
      return $$0 == null ? 0 : kr.h.a($$0);
   }

   public static cre b(int $$0) {
      return kr.h.a($$0);
   }

   @Deprecated
   public static cre a(dby $$0) {
      return d.getOrDefault($$0, crm.a);
   }

   public cre(cre.a $$0) {
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
   public il.c<cre> n() {
      return this.b;
   }

   public jl o() {
      return this.c;
   }

   public void a(cyx $$0, bqo $$1, crj $$2, int $$3) {
   }

   public void a(cgd $$0) {
   }

   public void n(crj $$0) {
   }

   public boolean a(doz $$0, cyx $$1, ib $$2, cjt $$3) {
      return true;
   }

   @Override
   public cre p() {
      return this;
   }

   public boa a(cuq $$0) {
      return boa.d;
   }

   public float a(crj $$0, doz $$1) {
      return 1.0F;
   }

   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      if (this.y()) {
         crj $$3 = $$1.b($$2);
         if ($$1.s(this.z().d())) {
            $$1.c($$2);
            return bob.b($$3);
         } else {
            return bob.d($$3);
         }
      } else {
         return bob.c($$1.b($$2));
      }
   }

   public crj a(crj $$0, cyx $$1, bqo $$2) {
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

   public boolean e(crj $$0) {
      return $$0.l();
   }

   public int f(crj $$0) {
      return axk.a(Math.round(13.0F - (float)$$0.m() * 13.0F / (float)this.l), 0, 13);
   }

   public int g(crj $$0) {
      float $$1 = Math.max(0.0F, ((float)this.l - (float)$$0.m()) / (float)this.l);
      return axk.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(crj $$0, cok $$1, cmx $$2, cjt $$3) {
      return false;
   }

   public boolean a(crj $$0, crj $$1, cok $$2, cmx $$3, cjt $$4, brf $$5) {
      return false;
   }

   public boolean a(crj $$0, bqo $$1, bqo $$2) {
      return false;
   }

   public boolean a(crj $$0, cyx $$1, doz $$2, ib $$3, bqo $$4) {
      return false;
   }

   public boolean a_(doz $$0) {
      return false;
   }

   public boa a(crj $$0, cjt $$1, bqo $$2, bnz $$3) {
      return boa.d;
   }

   public wg t() {
      return wg.c(this.a());
   }

   @Override
   public String toString() {
      return kr.h.b(this).a();
   }

   protected String u() {
      if (this.o == null) {
         this.o = ac.a("item", kr.h.b(this));
      }

      return this.o;
   }

   public String a() {
      return this.u();
   }

   public String i(crj $$0) {
      return this.a();
   }

   @Nullable
   public final cre v() {
      return this.n;
   }

   public boolean w() {
      return this.n != null;
   }

   public void a(crj $$0, cyx $$1, bpv $$2, int $$3, boolean $$4) {
   }

   public void b(crj $$0, cyx $$1, cjt $$2) {
      this.a($$0, $$1);
   }

   public void a(crj $$0, cyx $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public ctb c(crj $$0) {
      return $$0.f().y() ? ctb.b : ctb.a;
   }

   public int b(crj $$0) {
      if ($$0.f().y()) {
         return this.z().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(crj $$0, cyx $$1, bqo $$2, int $$3) {
   }

   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
   }

   public Optional<cot> h(crj $$0) {
      return Optional.empty();
   }

   public wg o(crj $$0) {
      return wg.c(this.i($$0));
   }

   public boolean d_(crj $$0) {
      return $$0.A();
   }

   public csa p(crj $$0) {
      if (!$$0.A()) {
         return this.j;
      } else {
         switch (this.j) {
            case a:
            case b:
               return csa.c;
            case c:
               return csa.d;
            case d:
            default:
               return this.j;
         }
      }
   }

   public boolean a(crj $$0) {
      return this.q() == 1 && this.s();
   }

   protected static erw a(cyx $$0, cjt $$1, cyg.b $$2) {
      esa $$3 = $$1.bu();
      esa $$4 = $$3.e($$1.f(1.0F).a($$1.gz()));
      return $$0.a(new cyg($$3, $$4, cyg.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(crj $$0, crj $$1) {
      return false;
   }

   @Deprecated
   public Multimap<il<brq>, brt> a(bqc $$0) {
      return ImmutableMultimap.of();
   }

   public boolean m(crj $$0) {
      return false;
   }

   public crj x() {
      return new crj(this);
   }

   public boolean y() {
      return this.p != null;
   }

   @Nullable
   public cmm z() {
      return this.p;
   }

   public aul al_() {
      return aum.jX;
   }

   public aul am_() {
      return aum.jY;
   }

   public aul e() {
      return aum.nm;
   }

   public boolean A() {
      return this.m;
   }

   public boolean a(bot $$0) {
      return !this.m || !$$0.a(ave.j);
   }

   public boolean an_() {
      return true;
   }

   @Override
   public cmg m() {
      return this.q;
   }

   public static class a {
      private static final Interner<jl> a = Interners.newStrongInterner();
      @Nullable
      private jl.a b;
      int c = 64;
      int d;
      @Nullable
      cre e;
      csa f = csa.a;
      @Nullable
      cmm g;
      boolean h;
      cmg i = cmi.g;

      public cre.a a(cmm $$0) {
         this.g = $$0;
         return this;
      }

      public cre.a a(int $$0) {
         if (this.d > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.c = $$0;
            return this;
         }
      }

      public cre.a b(int $$0) {
         return this.d == 0 ? this.c($$0) : this;
      }

      public cre.a c(int $$0) {
         this.d = $$0;
         this.c = 1;
         this.a(jp.b, 0);
         return this;
      }

      public cre.a a(cre $$0) {
         this.e = $$0;
         return this;
      }

      public cre.a a(csa $$0) {
         this.f = $$0;
         return this;
      }

      public cre.a a() {
         this.h = true;
         return this;
      }

      public cre.a a(cme... $$0) {
         this.i = cmi.e.a($$0);
         return this;
      }

      public <T> cre.a a(jo<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = jl.a().a(jp.V);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cre.a a(ctz $$0) {
         return this.a(jp.i, $$0);
      }

      jl b() {
         return this.b == null ? jp.V : (jl)a.intern(this.b.a());
      }
   }
}
