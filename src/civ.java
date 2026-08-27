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

public class civ implements cdu, cpp {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<csq, civ> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final hg.c<civ> b = jd.i.f(this);
   private final cjr c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final civ g;
   @Nullable
   private String h;
   @Nullable
   private final ced i;
   private final cdx j;

   public static int a(civ $$0) {
      return $$0 == null ? 0 : jd.i.a($$0);
   }

   public static civ b(int $$0) {
      return jd.i.a($$0);
   }

   @Deprecated
   public static civ a(csq $$0) {
      return l.getOrDefault($$0, cjd.a);
   }

   public civ(civ.a $$0) {
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
   public hg.c<civ> j() {
      return this.b;
   }

   public void a(cpq $$0, bjb $$1, cja $$2, int $$3) {
   }

   public void a(byi $$0) {
   }

   public void b(qu $$0) {
   }

   public boolean a(dfe $$0, cpq $$1, gw $$2, cbp $$3) {
      return true;
   }

   @Override
   public civ k() {
      return this;
   }

   public bgt a(clk $$0) {
      return bgt.d;
   }

   public float a(cja $$0, dfe $$1) {
      return 1.0F;
   }

   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      if (this.u()) {
         cja $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bgu.b($$3);
         } else {
            return bgu.d($$3);
         }
      } else {
         return bgu.c($$1.b($$2));
      }
   }

   public cja a(cja $$0, cpq $$1, bjb $$2) {
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

   public boolean e(cja $$0) {
      return $$0.j();
   }

   public int f(cja $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cja $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return ars.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cja $$0, cfy $$1, ceo $$2, cbp $$3) {
      return false;
   }

   public boolean a(cja $$0, cja $$1, cfy $$2, ceo $$3, cbp $$4, bjt $$5) {
      return false;
   }

   public boolean a(cja $$0, bjb $$1, bjb $$2) {
      return false;
   }

   public boolean a(cja $$0, cpq $$1, dfe $$2, gw $$3, bjb $$4) {
      return false;
   }

   public boolean a_(dfe $$0) {
      return false;
   }

   public bgt a(cja $$0, cbp $$1, bjb $$2, bgs $$3) {
      return bgt.d;
   }

   public ti p() {
      return ti.c(this.a());
   }

   @Override
   public String toString() {
      return jd.i.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ac.a("item", jd.i.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(cja $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final civ s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cja $$0, cpq $$1, bil $$2, int $$3, boolean $$4) {
   }

   public void b(cja $$0, cpq $$1, cbp $$2) {
   }

   public boolean ac_() {
      return false;
   }

   public ckt c(cja $$0) {
      return $$0.d().u() ? ckt.b : ckt.a;
   }

   public int b(cja $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cja $$0, cpq $$1, bjb $$2, int $$3) {
   }

   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
   }

   public Optional<cgg> h(cja $$0) {
      return Optional.empty();
   }

   public ti m(cja $$0) {
      return ti.c(this.j($$0));
   }

   public boolean i(cja $$0) {
      return $$0.E();
   }

   public cjr n(cja $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cjr.c;
            case c:
               return cjr.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cja $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ehe a(cpq $$0, cbp $$1, coz.b $$2) {
      float $$3 = $$1.dC();
      float $$4 = $$1.dA();
      ehi $$5 = $$1.bp();
      float $$6 = ars.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ars.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ars.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = ars.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ehi $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new coz($$5, $$14, coz.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cja $$0, cja $$1) {
      return false;
   }

   public Multimap<bkc, bkf> a(biq $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cja $$0) {
      return false;
   }

   public cja ad_() {
      return new cja(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public ced v() {
      return this.i;
   }

   public aoy ae_() {
      return aoz.iV;
   }

   public aoy af_() {
      return aoz.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bhj $$0) {
      return !this.f || !$$0.a(apq.i);
   }

   public boolean ag_() {
      return true;
   }

   @Override
   public cdx m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      civ c;
      cjr d = cjr.a;
      @Nullable
      ced e;
      boolean f;
      cdx g = cdz.f;

      public civ.a a(ced $$0) {
         this.e = $$0;
         return this;
      }

      public civ.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public civ.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public civ.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public civ.a a(civ $$0) {
         this.c = $$0;
         return this;
      }

      public civ.a a(cjr $$0) {
         this.d = $$0;
         return this;
      }

      public civ.a a() {
         this.f = true;
         return this;
      }

      public civ.a a(cdv... $$0) {
         this.g = cdz.d.a($$0);
         return this;
      }
   }
}
