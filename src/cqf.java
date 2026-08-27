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

public class cqf implements clc, cwy {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<daa, cqf> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final il.c<cqf> b = ki.h.f(this);
   private final crb c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cqf g;
   @Nullable
   private String h;
   @Nullable
   private final cll i;
   private final clf j;

   public static int a(cqf $$0) {
      return $$0 == null ? 0 : ki.h.a($$0);
   }

   public static cqf b(int $$0) {
      return ki.h.a($$0);
   }

   @Deprecated
   public static cqf a(daa $$0) {
      return l.getOrDefault($$0, cqn.a);
   }

   public cqf(cqf.a $$0) {
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
   public il.c<cqf> k() {
      return this.b;
   }

   public void a(cwz $$0, bpo $$1, cqk $$2, int $$3) {
   }

   public void a(cfd $$0) {
   }

   public void b(ta $$0) {
   }

   public boolean a(dmz $$0, cwz $$1, ib $$2, cis $$3) {
      return true;
   }

   @Override
   public cqf l() {
      return this;
   }

   public bnc a(csu $$0) {
      return bnc.d;
   }

   public float a(cqk $$0, dmz $$1) {
      return 1.0F;
   }

   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      if (this.v()) {
         cqk $$3 = $$1.b($$2);
         if ($$1.s(this.w().d())) {
            $$1.c($$2);
            return bnd.b($$3);
         } else {
            return bnd.d($$3);
         }
      } else {
         return bnd.c($$1.b($$2));
      }
   }

   public cqk a(cqk $$0, cwz $$1, bpo $$2) {
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

   public boolean e(cqk $$0) {
      return $$0.k();
   }

   public int f(cqk $$0) {
      return aww.a(Math.round(13.0F - (float)$$0.l() * 13.0F / (float)this.e), 0, 13);
   }

   public int g(cqk $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.l()) / (float)this.e);
      return aww.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cqk $$0, cnj $$1, clw $$2, cis $$3) {
      return false;
   }

   public boolean a(cqk $$0, cqk $$1, cnj $$2, clw $$3, cis $$4, bqf $$5) {
      return false;
   }

   public boolean a(cqk $$0, bpo $$1, bpo $$2) {
      return false;
   }

   public boolean a(cqk $$0, cwz $$1, dmz $$2, ib $$3, bpo $$4) {
      return false;
   }

   public boolean a_(dmz $$0) {
      return false;
   }

   public bnc a(cqk $$0, cis $$1, bpo $$2, bnb $$3) {
      return bnc.d;
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

   public String j(cqk $$0) {
      return this.a();
   }

   public boolean s() {
      return true;
   }

   @Nullable
   public final cqf t() {
      return this.g;
   }

   public boolean u() {
      return this.g != null;
   }

   public void a(cqk $$0, cwz $$1, bow $$2, int $$3, boolean $$4) {
   }

   public void b(cqk $$0, cwz $$1, cis $$2) {
      this.a($$0, $$1);
   }

   public void a(cqk $$0, cwz $$1) {
   }

   public boolean al_() {
      return false;
   }

   public csd c(cqk $$0) {
      return $$0.d().v() ? csd.b : csd.a;
   }

   public int b(cqk $$0) {
      if ($$0.d().v()) {
         return this.w().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cqk $$0, cwz $$1, bpo $$2, int $$3) {
   }

   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
   }

   public Optional<cnr> h(cqk $$0) {
      return Optional.empty();
   }

   public vu m(cqk $$0) {
      return vu.c(this.j($$0));
   }

   public boolean i(cqk $$0) {
      return $$0.F();
   }

   public crb n(cqk $$0) {
      if (!$$0.F()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return crb.c;
            case c:
               return crb.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cqk $$0) {
      return this.n() == 1 && this.p();
   }

   protected static epn a(cwz $$0, cis $$1, cwi.b $$2) {
      epr $$3 = $$1.bu();
      epr $$4 = $$3.e($$1.f(1.0F).a($$1.gz()));
      return $$0.a(new cwi($$3, $$4, cwi.a.b, $$2, $$1));
   }

   public int e() {
      return 0;
   }

   public boolean a(cqk $$0, cqk $$1) {
      return false;
   }

   public Multimap<il<bqq>, bqt> a(bpd $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cqk $$0) {
      return false;
   }

   public cqk am_() {
      return new cqk(this);
   }

   public boolean v() {
      return this.i != null;
   }

   @Nullable
   public cll w() {
      return this.i;
   }

   public atx an_() {
      return aty.jR;
   }

   public atx ao_() {
      return aty.jS;
   }

   public boolean x() {
      return this.f;
   }

   public boolean a(bnv $$0) {
      return !this.f || !$$0.a(aup.j);
   }

   public boolean ap_() {
      return true;
   }

   @Override
   public clf m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cqf c;
      crb d = crb.a;
      @Nullable
      cll e;
      boolean f;
      clf g;

      public a() {
         this.g = clh.g;
      }

      public cqf.a a(cll $$0) {
         this.e = $$0;
         return this;
      }

      public cqf.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cqf.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cqf.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cqf.a a(cqf $$0) {
         this.c = $$0;
         return this;
      }

      public cqf.a a(crb $$0) {
         this.d = $$0;
         return this;
      }

      public cqf.a a() {
         this.f = true;
         return this;
      }

      public cqf.a a(cld... $$0) {
         this.g = clh.e.a($$0);
         return this;
      }
   }
}
