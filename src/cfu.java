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

public class cfu implements cat, cml {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cpn, cfu> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final he.c<cfu> b = jb.i.f(this);
   private final cgq c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cfu g;
   @Nullable
   private String h;
   @Nullable
   private final cbc i;
   private final caw j;

   public static int a(cfu $$0) {
      return $$0 == null ? 0 : jb.i.a($$0);
   }

   public static cfu b(int $$0) {
      return jb.i.a($$0);
   }

   @Deprecated
   public static cfu a(cpn $$0) {
      return l.getOrDefault($$0, cgc.a);
   }

   public cfu(cfu.a $$0) {
      this.c = $$0.d;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.e;
      this.f = $$0.f;
      this.j = $$0.g;
      if (aa.aS) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public he.c<cfu> j() {
      return this.b;
   }

   public void a(cmm $$0, bfz $$1, cfz $$2, int $$3) {
   }

   public void a(bvh $$0) {
   }

   public void b(qr $$0) {
   }

   public boolean a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
      return true;
   }

   @Override
   public cfu k() {
      return this;
   }

   public bdx a(cij $$0) {
      return bdx.d;
   }

   public float a(cfz $$0, dcb $$1) {
      return 1.0F;
   }

   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      if (this.u()) {
         cfz $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bdy.b($$3);
         } else {
            return bdy.d($$3);
         }
      } else {
         return bdy.c($$1.b($$2));
      }
   }

   public cfz a(cfz $$0, cmm $$1, bfz $$2) {
      return this.u() ? $$2.a($$1, $$0) : $$0;
   }

   public final int l() {
      return this.d;
   }

   public final int n() {
      return this.e;
   }

   public boolean o() {
      return this.e > 0;
   }

   public boolean e(cfz $$0) {
      return $$0.j();
   }

   public int f(cfz $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cfz $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return apa.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cfz $$0, ccx $$1, cbn $$2, byo $$3) {
      return false;
   }

   public boolean a(cfz $$0, cfz $$1, ccx $$2, cbn $$3, byo $$4, bgs $$5) {
      return false;
   }

   public boolean a(cfz $$0, bfz $$1, bfz $$2) {
      return false;
   }

   public boolean a(cfz $$0, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
      return false;
   }

   public boolean a_(dcb $$0) {
      return false;
   }

   public bdx a(cfz $$0, byo $$1, bfz $$2, bdw $$3) {
      return bdx.d;
   }

   public sw p() {
      return sw.c(this.a());
   }

   @Override
   public String toString() {
      return jb.i.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ac.a("item", jb.i.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(cfz $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cfu s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cfz $$0, cmm $$1, bfj $$2, int $$3, boolean $$4) {
   }

   public void b(cfz $$0, cmm $$1, byo $$2) {
   }

   public boolean ad_() {
      return false;
   }

   public chs c(cfz $$0) {
      return $$0.d().u() ? chs.b : chs.a;
   }

   public int b(cfz $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cfz $$0, cmm $$1, bfz $$2, int $$3) {
   }

   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
   }

   public Optional<cdf> h(cfz $$0) {
      return Optional.empty();
   }

   public sw m(cfz $$0) {
      return sw.c(this.j($$0));
   }

   public boolean i(cfz $$0) {
      return $$0.E();
   }

   public cgq n(cfz $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cgq.c;
            case c:
               return cgq.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cfz $$0) {
      return this.l() == 1 && this.o();
   }

   protected static eee a(cmm $$0, byo $$1, clv.b $$2) {
      float $$3 = $$1.dA();
      float $$4 = $$1.dy();
      eei $$5 = $$1.bm();
      float $$6 = apa.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = apa.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -apa.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = apa.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      eei $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new clv($$5, $$14, clv.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cfz $$0, cfz $$1) {
      return false;
   }

   public Multimap<bhb, bhe> a(bfo $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cfz $$0) {
      return false;
   }

   public cfz ae_() {
      return new cfz(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cbc v() {
      return this.i;
   }

   public amg af_() {
      return amh.iV;
   }

   public amg ag_() {
      return amh.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(ben $$0) {
      return !this.f || !$$0.a(amy.i);
   }

   public boolean ah_() {
      return true;
   }

   @Override
   public caw m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cfu c;
      cgq d = cgq.a;
      @Nullable
      cbc e;
      boolean f;
      caw g = cay.e;

      public cfu.a a(cbc $$0) {
         this.e = $$0;
         return this;
      }

      public cfu.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cfu.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cfu.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cfu.a a(cfu $$0) {
         this.c = $$0;
         return this;
      }

      public cfu.a a(cgq $$0) {
         this.d = $$0;
         return this;
      }

      public cfu.a a() {
         this.f = true;
         return this;
      }

      public cfu.a a(cau... $$0) {
         this.g = cay.c.a($$0);
         return this;
      }
   }
}
