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

public class cit implements cds, cpl {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<csm, cit> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final he.c<cit> b = jb.i.f(this);
   private final cjp c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cit g;
   @Nullable
   private String h;
   @Nullable
   private final ceb i;
   private final cdv j;

   public static int a(cit $$0) {
      return $$0 == null ? 0 : jb.i.a($$0);
   }

   public static cit b(int $$0) {
      return jb.i.a($$0);
   }

   @Deprecated
   public static cit a(csm $$0) {
      return l.getOrDefault($$0, cjb.a);
   }

   public cit(cit.a $$0) {
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
   public he.c<cit> j() {
      return this.b;
   }

   public void a(cpm $$0, biy $$1, ciy $$2, int $$3) {
   }

   public void a(byg $$0) {
   }

   public void b(qr $$0) {
   }

   public boolean a(dfa $$0, cpm $$1, gu $$2, cbn $$3) {
      return true;
   }

   @Override
   public cit k() {
      return this;
   }

   public bgq a(cli $$0) {
      return bgq.d;
   }

   public float a(ciy $$0, dfa $$1) {
      return 1.0F;
   }

   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      if (this.u()) {
         ciy $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bgr.b($$3);
         } else {
            return bgr.d($$3);
         }
      } else {
         return bgr.c($$1.b($$2));
      }
   }

   public ciy a(ciy $$0, cpm $$1, biy $$2) {
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

   public boolean e(ciy $$0) {
      return $$0.j();
   }

   public int f(ciy $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(ciy $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return arp.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(ciy $$0, cfw $$1, cem $$2, cbn $$3) {
      return false;
   }

   public boolean a(ciy $$0, ciy $$1, cfw $$2, cem $$3, cbn $$4, bjr $$5) {
      return false;
   }

   public boolean a(ciy $$0, biy $$1, biy $$2) {
      return false;
   }

   public boolean a(ciy $$0, cpm $$1, dfa $$2, gu $$3, biy $$4) {
      return false;
   }

   public boolean a_(dfa $$0) {
      return false;
   }

   public bgq a(ciy $$0, cbn $$1, biy $$2, bgp $$3) {
      return bgq.d;
   }

   public tf p() {
      return tf.c(this.a());
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

   public String j(ciy $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cit s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(ciy $$0, cpm $$1, bii $$2, int $$3, boolean $$4) {
   }

   public void b(ciy $$0, cpm $$1, cbn $$2) {
   }

   public boolean ad_() {
      return false;
   }

   public ckr c(ciy $$0) {
      return $$0.d().u() ? ckr.b : ckr.a;
   }

   public int b(ciy $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(ciy $$0, cpm $$1, biy $$2, int $$3) {
   }

   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
   }

   public Optional<cge> h(ciy $$0) {
      return Optional.empty();
   }

   public tf m(ciy $$0) {
      return tf.c(this.j($$0));
   }

   public boolean i(ciy $$0) {
      return $$0.E();
   }

   public cjp n(ciy $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cjp.c;
            case c:
               return cjp.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(ciy $$0) {
      return this.l() == 1 && this.o();
   }

   protected static eha a(cpm $$0, cbn $$1, cov.b $$2) {
      float $$3 = $$1.dC();
      float $$4 = $$1.dA();
      ehe $$5 = $$1.bp();
      float $$6 = arp.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = arp.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -arp.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = arp.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ehe $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cov($$5, $$14, cov.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(ciy $$0, ciy $$1) {
      return false;
   }

   public Multimap<bka, bkd> a(bin $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(ciy $$0) {
      return false;
   }

   public ciy ae_() {
      return new ciy(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public ceb v() {
      return this.i;
   }

   public aov af_() {
      return aow.iV;
   }

   public aov ag_() {
      return aow.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bhg $$0) {
      return !this.f || !$$0.a(apn.i);
   }

   public boolean ah_() {
      return true;
   }

   @Override
   public cdv m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cit c;
      cjp d = cjp.a;
      @Nullable
      ceb e;
      boolean f;
      cdv g = cdx.f;

      public cit.a a(ceb $$0) {
         this.e = $$0;
         return this;
      }

      public cit.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cit.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cit.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cit.a a(cit $$0) {
         this.c = $$0;
         return this;
      }

      public cit.a a(cjp $$0) {
         this.d = $$0;
         return this;
      }

      public cit.a a() {
         this.f = true;
         return this;
      }

      public cit.a a(cdt... $$0) {
         this.g = cdx.d.a($$0);
         return this;
      }
   }
}
