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

public class cir implements cdq, cpj {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<csk, cir> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final hf.c<cir> b = jc.i.f(this);
   private final cjn c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cir g;
   @Nullable
   private String h;
   @Nullable
   private final cdz i;
   private final cdt j;

   public static int a(cir $$0) {
      return $$0 == null ? 0 : jc.i.a($$0);
   }

   public static cir b(int $$0) {
      return jc.i.a($$0);
   }

   @Deprecated
   public static cir a(csk $$0) {
      return l.getOrDefault($$0, ciz.a);
   }

   public cir(cir.a $$0) {
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
   public hf.c<cir> j() {
      return this.b;
   }

   public void a(cpk $$0, biw $$1, ciw $$2, int $$3) {
   }

   public void a(bye $$0) {
   }

   public void b(qs $$0) {
   }

   public boolean a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
      return true;
   }

   @Override
   public cir k() {
      return this;
   }

   public bgo a(clg $$0) {
      return bgo.d;
   }

   public float a(ciw $$0, dey $$1) {
      return 1.0F;
   }

   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      if (this.u()) {
         ciw $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bgp.b($$3);
         } else {
            return bgp.d($$3);
         }
      } else {
         return bgp.c($$1.b($$2));
      }
   }

   public ciw a(ciw $$0, cpk $$1, biw $$2) {
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

   public boolean e(ciw $$0) {
      return $$0.j();
   }

   public int f(ciw $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(ciw $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return aro.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(ciw $$0, cfu $$1, cek $$2, cbl $$3) {
      return false;
   }

   public boolean a(ciw $$0, ciw $$1, cfu $$2, cek $$3, cbl $$4, bjp $$5) {
      return false;
   }

   public boolean a(ciw $$0, biw $$1, biw $$2) {
      return false;
   }

   public boolean a(ciw $$0, cpk $$1, dey $$2, gv $$3, biw $$4) {
      return false;
   }

   public boolean a_(dey $$0) {
      return false;
   }

   public bgo a(ciw $$0, cbl $$1, biw $$2, bgn $$3) {
      return bgo.d;
   }

   public te p() {
      return te.c(this.a());
   }

   @Override
   public String toString() {
      return jc.i.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ac.a("item", jc.i.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(ciw $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cir s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(ciw $$0, cpk $$1, big $$2, int $$3, boolean $$4) {
   }

   public void b(ciw $$0, cpk $$1, cbl $$2) {
   }

   public boolean ad_() {
      return false;
   }

   public ckp c(ciw $$0) {
      return $$0.d().u() ? ckp.b : ckp.a;
   }

   public int b(ciw $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(ciw $$0, cpk $$1, biw $$2, int $$3) {
   }

   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
   }

   public Optional<cgc> h(ciw $$0) {
      return Optional.empty();
   }

   public te m(ciw $$0) {
      return te.c(this.j($$0));
   }

   public boolean i(ciw $$0) {
      return $$0.E();
   }

   public cjn n(ciw $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cjn.c;
            case c:
               return cjn.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(ciw $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ehb a(cpk $$0, cbl $$1, cot.b $$2) {
      float $$3 = $$1.dC();
      float $$4 = $$1.dA();
      ehf $$5 = $$1.bp();
      float $$6 = aro.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aro.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aro.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = aro.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ehf $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cot($$5, $$14, cot.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(ciw $$0, ciw $$1) {
      return false;
   }

   public Multimap<bjy, bkb> a(bil $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(ciw $$0) {
      return false;
   }

   public ciw ae_() {
      return new ciw(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cdz v() {
      return this.i;
   }

   public aot af_() {
      return aou.iV;
   }

   public aot ag_() {
      return aou.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bhe $$0) {
      return !this.f || !$$0.a(apl.i);
   }

   public boolean ah_() {
      return true;
   }

   @Override
   public cdt m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cir c;
      cjn d = cjn.a;
      @Nullable
      cdz e;
      boolean f;
      cdt g = cdv.f;

      public cir.a a(cdz $$0) {
         this.e = $$0;
         return this;
      }

      public cir.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cir.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cir.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cir.a a(cir $$0) {
         this.c = $$0;
         return this;
      }

      public cir.a a(cjn $$0) {
         this.d = $$0;
         return this;
      }

      public cir.a a() {
         this.f = true;
         return this;
      }

      public cir.a a(cdr... $$0) {
         this.g = cdv.d.a($$0);
         return this;
      }
   }
}
