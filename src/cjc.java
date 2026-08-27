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

public class cjc implements ceb, cpw {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<csx, cjc> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final hg.c<cjc> b = jd.i.f(this);
   private final cjy c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cjc g;
   @Nullable
   private String h;
   @Nullable
   private final cek i;
   private final cee j;

   public static int a(cjc $$0) {
      return $$0 == null ? 0 : jd.i.a($$0);
   }

   public static cjc b(int $$0) {
      return jd.i.a($$0);
   }

   @Deprecated
   public static cjc a(csx $$0) {
      return l.getOrDefault($$0, cjk.a);
   }

   public cjc(cjc.a $$0) {
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
   public hg.c<cjc> j() {
      return this.b;
   }

   public void a(cpx $$0, bji $$1, cjh $$2, int $$3) {
   }

   public void a(byp $$0) {
   }

   public void b(qy $$0) {
   }

   public boolean a(dfl $$0, cpx $$1, gw $$2, cbw $$3) {
      return true;
   }

   @Override
   public cjc k() {
      return this;
   }

   public bha a(clr $$0) {
      return bha.d;
   }

   public float a(cjh $$0, dfl $$1) {
      return 1.0F;
   }

   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      if (this.u()) {
         cjh $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bhb.b($$3);
         } else {
            return bhb.d($$3);
         }
      } else {
         return bhb.c($$1.b($$2));
      }
   }

   public cjh a(cjh $$0, cpx $$1, bji $$2) {
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

   public boolean e(cjh $$0) {
      return $$0.j();
   }

   public int f(cjh $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cjh $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return ary.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cjh $$0, cgf $$1, cev $$2, cbw $$3) {
      return false;
   }

   public boolean a(cjh $$0, cjh $$1, cgf $$2, cev $$3, cbw $$4, bka $$5) {
      return false;
   }

   public boolean a(cjh $$0, bji $$1, bji $$2) {
      return false;
   }

   public boolean a(cjh $$0, cpx $$1, dfl $$2, gw $$3, bji $$4) {
      return false;
   }

   public boolean a_(dfl $$0) {
      return false;
   }

   public bha a(cjh $$0, cbw $$1, bji $$2, bgz $$3) {
      return bha.d;
   }

   public tn p() {
      return tn.c(this.a());
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

   public String j(cjh $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cjc s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cjh $$0, cpx $$1, bis $$2, int $$3, boolean $$4) {
   }

   public void b(cjh $$0, cpx $$1, cbw $$2) {
   }

   public boolean ah_() {
      return false;
   }

   public cla c(cjh $$0) {
      return $$0.d().u() ? cla.b : cla.a;
   }

   public int b(cjh $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cjh $$0, cpx $$1, bji $$2, int $$3) {
   }

   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
   }

   public Optional<cgn> h(cjh $$0) {
      return Optional.empty();
   }

   public tn m(cjh $$0) {
      return tn.c(this.j($$0));
   }

   public boolean i(cjh $$0) {
      return $$0.E();
   }

   public cjy n(cjh $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cjy.c;
            case c:
               return cjy.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cjh $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ehl a(cpx $$0, cbw $$1, cpg.b $$2) {
      float $$3 = $$1.dD();
      float $$4 = $$1.dB();
      ehp $$5 = $$1.bp();
      float $$6 = ary.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ary.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ary.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = ary.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ehp $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cpg($$5, $$14, cpg.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cjh $$0, cjh $$1) {
      return false;
   }

   public Multimap<bkj, bkm> a(bix $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cjh $$0) {
      return false;
   }

   public cjh ai_() {
      return new cjh(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cek v() {
      return this.i;
   }

   public ape aj_() {
      return apf.iV;
   }

   public ape ak_() {
      return apf.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bhq $$0) {
      return !this.f || !$$0.a(apw.i);
   }

   public boolean al_() {
      return true;
   }

   @Override
   public cee m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cjc c;
      cjy d = cjy.a;
      @Nullable
      cek e;
      boolean f;
      cee g = ceg.f;

      public cjc.a a(cek $$0) {
         this.e = $$0;
         return this;
      }

      public cjc.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cjc.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cjc.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cjc.a a(cjc $$0) {
         this.c = $$0;
         return this;
      }

      public cjc.a a(cjy $$0) {
         this.d = $$0;
         return this;
      }

      public cjc.a a() {
         this.f = true;
         return this;
      }

      public cjc.a a(cec... $$0) {
         this.g = ceg.d.a($$0);
         return this;
      }
   }
}
