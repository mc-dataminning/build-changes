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

public class cis implements cdr, cpk {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<csl, cis> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final he.c<cis> b = jb.i.f(this);
   private final cjo c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cis g;
   @Nullable
   private String h;
   @Nullable
   private final cea i;
   private final cdu j;

   public static int a(cis $$0) {
      return $$0 == null ? 0 : jb.i.a($$0);
   }

   public static cis b(int $$0) {
      return jb.i.a($$0);
   }

   @Deprecated
   public static cis a(csl $$0) {
      return l.getOrDefault($$0, cja.a);
   }

   public cis(cis.a $$0) {
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
   public he.c<cis> j() {
      return this.b;
   }

   public void a(cpl $$0, biy $$1, cix $$2, int $$3) {
   }

   public void a(byf $$0) {
   }

   public void b(qr $$0) {
   }

   public boolean a(dez $$0, cpl $$1, gu $$2, cbm $$3) {
      return true;
   }

   @Override
   public cis k() {
      return this;
   }

   public bgq a(clh $$0) {
      return bgq.d;
   }

   public float a(cix $$0, dez $$1) {
      return 1.0F;
   }

   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      if (this.u()) {
         cix $$3 = $$1.b($$2);
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

   public cix a(cix $$0, cpl $$1, biy $$2) {
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

   public boolean e(cix $$0) {
      return $$0.j();
   }

   public int f(cix $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cix $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return arp.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cix $$0, cfv $$1, cel $$2, cbm $$3) {
      return false;
   }

   public boolean a(cix $$0, cix $$1, cfv $$2, cel $$3, cbm $$4, bjq $$5) {
      return false;
   }

   public boolean a(cix $$0, biy $$1, biy $$2) {
      return false;
   }

   public boolean a(cix $$0, cpl $$1, dez $$2, gu $$3, biy $$4) {
      return false;
   }

   public boolean a_(dez $$0) {
      return false;
   }

   public bgq a(cix $$0, cbm $$1, biy $$2, bgp $$3) {
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

   public String j(cix $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cis s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cix $$0, cpl $$1, bii $$2, int $$3, boolean $$4) {
   }

   public void b(cix $$0, cpl $$1, cbm $$2) {
   }

   public boolean ac_() {
      return false;
   }

   public ckq c(cix $$0) {
      return $$0.d().u() ? ckq.b : ckq.a;
   }

   public int b(cix $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cix $$0, cpl $$1, biy $$2, int $$3) {
   }

   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
   }

   public Optional<cgd> h(cix $$0) {
      return Optional.empty();
   }

   public tf m(cix $$0) {
      return tf.c(this.j($$0));
   }

   public boolean i(cix $$0) {
      return $$0.E();
   }

   public cjo n(cix $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cjo.c;
            case c:
               return cjo.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cix $$0) {
      return this.l() == 1 && this.o();
   }

   protected static egz a(cpl $$0, cbm $$1, cou.b $$2) {
      float $$3 = $$1.dC();
      float $$4 = $$1.dA();
      ehd $$5 = $$1.bp();
      float $$6 = arp.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = arp.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -arp.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = arp.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ehd $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cou($$5, $$14, cou.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cix $$0, cix $$1) {
      return false;
   }

   public Multimap<bjz, bkc> a(bin $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cix $$0) {
      return false;
   }

   public cix ad_() {
      return new cix(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cea v() {
      return this.i;
   }

   public aov ae_() {
      return aow.iV;
   }

   public aov af_() {
      return aow.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bhg $$0) {
      return !this.f || !$$0.a(apn.i);
   }

   public boolean ag_() {
      return true;
   }

   @Override
   public cdu m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cis c;
      cjo d = cjo.a;
      @Nullable
      cea e;
      boolean f;
      cdu g = cdw.f;

      public cis.a a(cea $$0) {
         this.e = $$0;
         return this;
      }

      public cis.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cis.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cis.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cis.a a(cis $$0) {
         this.c = $$0;
         return this;
      }

      public cis.a a(cjo $$0) {
         this.d = $$0;
         return this;
      }

      public cis.a a() {
         this.f = true;
         return this;
      }

      public cis.a a(cds... $$0) {
         this.g = cdw.d.a($$0);
         return this;
      }
   }
}
