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

public class cja implements cdz, cpu {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<csv, cja> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final he.c<cja> b = jb.i.f(this);
   private final cjw c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cja g;
   @Nullable
   private String h;
   @Nullable
   private final cei i;
   private final cec j;

   public static int a(cja $$0) {
      return $$0 == null ? 0 : jb.i.a($$0);
   }

   public static cja b(int $$0) {
      return jb.i.a($$0);
   }

   @Deprecated
   public static cja a(csv $$0) {
      return l.getOrDefault($$0, cji.a);
   }

   public cja(cja.a $$0) {
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
   public he.c<cja> j() {
      return this.b;
   }

   public void a(cpv $$0, bjg $$1, cjf $$2, int $$3) {
   }

   public void a(byn $$0) {
   }

   public void b(qw $$0) {
   }

   public boolean a(dfj $$0, cpv $$1, gw $$2, cbu $$3) {
      return true;
   }

   @Override
   public cja k() {
      return this;
   }

   public bgy a(clp $$0) {
      return bgy.d;
   }

   public float a(cjf $$0, dfj $$1) {
      return 1.0F;
   }

   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      if (this.u()) {
         cjf $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bgz.b($$3);
         } else {
            return bgz.d($$3);
         }
      } else {
         return bgz.c($$1.b($$2));
      }
   }

   public cjf a(cjf $$0, cpv $$1, bjg $$2) {
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

   public boolean e(cjf $$0) {
      return $$0.j();
   }

   public int f(cjf $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cjf $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return arw.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cjf $$0, cgd $$1, cet $$2, cbu $$3) {
      return false;
   }

   public boolean a(cjf $$0, cjf $$1, cgd $$2, cet $$3, cbu $$4, bjy $$5) {
      return false;
   }

   public boolean a(cjf $$0, bjg $$1, bjg $$2) {
      return false;
   }

   public boolean a(cjf $$0, cpv $$1, dfj $$2, gw $$3, bjg $$4) {
      return false;
   }

   public boolean a_(dfj $$0) {
      return false;
   }

   public bgy a(cjf $$0, cbu $$1, bjg $$2, bgx $$3) {
      return bgy.d;
   }

   public tl p() {
      return tl.c(this.a());
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

   public String j(cjf $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cja s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cjf $$0, cpv $$1, biq $$2, int $$3, boolean $$4) {
   }

   public void b(cjf $$0, cpv $$1, cbu $$2) {
   }

   public boolean ah_() {
      return false;
   }

   public cky c(cjf $$0) {
      return $$0.d().u() ? cky.b : cky.a;
   }

   public int b(cjf $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cjf $$0, cpv $$1, bjg $$2, int $$3) {
   }

   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
   }

   public Optional<cgl> h(cjf $$0) {
      return Optional.empty();
   }

   public tl m(cjf $$0) {
      return tl.c(this.j($$0));
   }

   public boolean i(cjf $$0) {
      return $$0.E();
   }

   public cjw n(cjf $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cjw.c;
            case c:
               return cjw.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cjf $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ehj a(cpv $$0, cbu $$1, cpe.b $$2) {
      float $$3 = $$1.dD();
      float $$4 = $$1.dB();
      ehn $$5 = $$1.bp();
      float $$6 = arw.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = arw.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -arw.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = arw.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ehn $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cpe($$5, $$14, cpe.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cjf $$0, cjf $$1) {
      return false;
   }

   public Multimap<bkh, bkk> a(biv $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cjf $$0) {
      return false;
   }

   public cjf ai_() {
      return new cjf(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cei v() {
      return this.i;
   }

   public apc aj_() {
      return apd.iV;
   }

   public apc ak_() {
      return apd.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bho $$0) {
      return !this.f || !$$0.a(apu.i);
   }

   public boolean al_() {
      return true;
   }

   @Override
   public cec m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cja c;
      cjw d = cjw.a;
      @Nullable
      cei e;
      boolean f;
      cec g = cee.f;

      public cja.a a(cei $$0) {
         this.e = $$0;
         return this;
      }

      public cja.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cja.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cja.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cja.a a(cja $$0) {
         this.c = $$0;
         return this;
      }

      public cja.a a(cjw $$0) {
         this.d = $$0;
         return this;
      }

      public cja.a a() {
         this.f = true;
         return this;
      }

      public cja.a a(cea... $$0) {
         this.g = cee.d.a($$0);
         return this;
      }
   }
}
