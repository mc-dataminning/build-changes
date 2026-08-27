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

public class clj implements cgf, cse {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cvf, clj> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ig.c<clj> b = kc.i.f(this);
   private final cmf c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final clj g;
   @Nullable
   private String h;
   @Nullable
   private final cgo i;
   private final cgi j;

   public static int a(clj $$0) {
      return $$0 == null ? 0 : kc.i.a($$0);
   }

   public static clj b(int $$0) {
      return kc.i.a($$0);
   }

   @Deprecated
   public static clj a(cvf $$0) {
      return l.getOrDefault($$0, clr.a);
   }

   public clj(clj.a $$0) {
      this.c = $$0.d;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.e;
      this.f = $$0.f;
      this.j = $$0.g;
      if (aa.aT) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public ig.c<clj> j() {
      return this.b;
   }

   public void a(csf $$0, bll $$1, clo $$2, int $$3) {
   }

   public void a(cas $$0) {
   }

   public void b(sd $$0) {
   }

   public boolean a(dhn $$0, csf $$1, hx $$2, cdz $$3) {
      return true;
   }

   @Override
   public clj k() {
      return this;
   }

   public bjb a(cny $$0) {
      return bjb.d;
   }

   public float a(clo $$0, dhn $$1) {
      return 1.0F;
   }

   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      if (this.u()) {
         clo $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bjc.b($$3);
         } else {
            return bjc.d($$3);
         }
      } else {
         return bjc.c($$1.b($$2));
      }
   }

   public clo a(clo $$0, csf $$1, bll $$2) {
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

   public boolean e(clo $$0) {
      return $$0.j();
   }

   public int f(clo $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(clo $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return atq.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(clo $$0, cim $$1, cgz $$2, cdz $$3) {
      return false;
   }

   public boolean a(clo $$0, clo $$1, cim $$2, cgz $$3, cdz $$4, bmd $$5) {
      return false;
   }

   public boolean a(clo $$0, bll $$1, bll $$2) {
      return false;
   }

   public boolean a(clo $$0, csf $$1, dhn $$2, hx $$3, bll $$4) {
      return false;
   }

   public boolean a_(dhn $$0) {
      return false;
   }

   public bjb a(clo $$0, cdz $$1, bll $$2, bja $$3) {
      return bjb.d;
   }

   public uv p() {
      return uv.c(this.a());
   }

   @Override
   public String toString() {
      return kc.i.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ac.a("item", kc.i.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(clo $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final clj s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(clo $$0, csf $$1, bkv $$2, int $$3, boolean $$4) {
   }

   public void b(clo $$0, csf $$1, cdz $$2) {
      this.a($$0, $$1);
   }

   public void a(clo $$0, csf $$1) {
   }

   public boolean am_() {
      return false;
   }

   public cnh c(clo $$0) {
      return $$0.d().u() ? cnh.b : cnh.a;
   }

   public int b(clo $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(clo $$0, csf $$1, bll $$2, int $$3) {
   }

   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
   }

   public Optional<ciu> h(clo $$0) {
      return Optional.empty();
   }

   public uv m(clo $$0) {
      return uv.c(this.j($$0));
   }

   public boolean i(clo $$0) {
      return $$0.E();
   }

   public cmf n(clo $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cmf.c;
            case c:
               return cmf.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(clo $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ejv a(csf $$0, cdz $$1, cro.b $$2) {
      float $$3 = $$1.dF();
      float $$4 = $$1.dD();
      ejz $$5 = $$1.br();
      float $$6 = atq.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = atq.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -atq.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = atq.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ejz $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cro($$5, $$14, cro.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(clo $$0, clo $$1) {
      return false;
   }

   public Multimap<bmm, bmp> a(bla $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(clo $$0) {
      return false;
   }

   public clo an_() {
      return new clo(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cgo v() {
      return this.i;
   }

   public aqu ao_() {
      return aqv.jp;
   }

   public aqu ap_() {
      return aqv.jq;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bjt $$0) {
      return !this.f || !$$0.a(arm.i);
   }

   public boolean aq_() {
      return true;
   }

   @Override
   public cgi m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      clj c;
      cmf d = cmf.a;
      @Nullable
      cgo e;
      boolean f;
      cgi g;

      public a() {
         this.g = cgk.g;
      }

      public clj.a a(cgo $$0) {
         this.e = $$0;
         return this;
      }

      public clj.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public clj.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public clj.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public clj.a a(clj $$0) {
         this.c = $$0;
         return this;
      }

      public clj.a a(cmf $$0) {
         this.d = $$0;
         return this;
      }

      public clj.a a() {
         this.f = true;
         return this;
      }

      public clj.a a(cgg... $$0) {
         this.g = cgk.e.a($$0);
         return this;
      }
   }
}
