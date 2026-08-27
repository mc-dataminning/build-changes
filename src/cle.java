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

public class cle implements cga, crz {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cva, cle> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ib.c<cle> b = jy.i.f(this);
   private final cma c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cle g;
   @Nullable
   private String h;
   @Nullable
   private final cgj i;
   private final cgd j;

   public static int a(cle $$0) {
      return $$0 == null ? 0 : jy.i.a($$0);
   }

   public static cle b(int $$0) {
      return jy.i.a($$0);
   }

   @Deprecated
   public static cle a(cva $$0) {
      return l.getOrDefault($$0, clm.a);
   }

   public cle(cle.a $$0) {
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
   public ib.c<cle> j() {
      return this.b;
   }

   public void a(csa $$0, blg $$1, clj $$2, int $$3) {
   }

   public void a(can $$0) {
   }

   public void b(rz $$0) {
   }

   public boolean a(dhi $$0, csa $$1, ht $$2, cdu $$3) {
      return true;
   }

   @Override
   public cle k() {
      return this;
   }

   public bix a(cnt $$0) {
      return bix.d;
   }

   public float a(clj $$0, dhi $$1) {
      return 1.0F;
   }

   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      if (this.u()) {
         clj $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return biy.b($$3);
         } else {
            return biy.d($$3);
         }
      } else {
         return biy.c($$1.b($$2));
      }
   }

   public clj a(clj $$0, csa $$1, blg $$2) {
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

   public boolean e(clj $$0) {
      return $$0.j();
   }

   public int f(clj $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(clj $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return atm.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(clj $$0, cih $$1, cgu $$2, cdu $$3) {
      return false;
   }

   public boolean a(clj $$0, clj $$1, cih $$2, cgu $$3, cdu $$4, bly $$5) {
      return false;
   }

   public boolean a(clj $$0, blg $$1, blg $$2) {
      return false;
   }

   public boolean a(clj $$0, csa $$1, dhi $$2, ht $$3, blg $$4) {
      return false;
   }

   public boolean a_(dhi $$0) {
      return false;
   }

   public bix a(clj $$0, cdu $$1, blg $$2, biw $$3) {
      return bix.d;
   }

   public ur p() {
      return ur.c(this.a());
   }

   @Override
   public String toString() {
      return jy.i.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ac.a("item", jy.i.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(clj $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cle s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(clj $$0, csa $$1, bkq $$2, int $$3, boolean $$4) {
   }

   public void b(clj $$0, csa $$1, cdu $$2) {
      this.a($$0, $$1);
   }

   public void a(clj $$0, csa $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cnc c(clj $$0) {
      return $$0.d().u() ? cnc.b : cnc.a;
   }

   public int b(clj $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(clj $$0, csa $$1, blg $$2, int $$3) {
   }

   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
   }

   public Optional<cip> h(clj $$0) {
      return Optional.empty();
   }

   public ur m(clj $$0) {
      return ur.c(this.j($$0));
   }

   public boolean i(clj $$0) {
      return $$0.E();
   }

   public cma n(clj $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cma.c;
            case c:
               return cma.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(clj $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ejq a(csa $$0, cdu $$1, crj.b $$2) {
      float $$3 = $$1.dF();
      float $$4 = $$1.dD();
      eju $$5 = $$1.br();
      float $$6 = atm.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = atm.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -atm.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = atm.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      eju $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new crj($$5, $$14, crj.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(clj $$0, clj $$1) {
      return false;
   }

   public Multimap<bmh, bmk> a(bkv $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(clj $$0) {
      return false;
   }

   public clj al_() {
      return new clj(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cgj v() {
      return this.i;
   }

   public aqq am_() {
      return aqr.jp;
   }

   public aqq an_() {
      return aqr.jq;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bjo $$0) {
      return !this.f || !$$0.a(ari.i);
   }

   public boolean ao_() {
      return true;
   }

   @Override
   public cgd m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cle c;
      cma d = cma.a;
      @Nullable
      cgj e;
      boolean f;
      cgd g;

      public a() {
         this.g = cgf.g;
      }

      public cle.a a(cgj $$0) {
         this.e = $$0;
         return this;
      }

      public cle.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cle.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cle.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cle.a a(cle $$0) {
         this.c = $$0;
         return this;
      }

      public cle.a a(cma $$0) {
         this.d = $$0;
         return this;
      }

      public cle.a a() {
         this.f = true;
         return this;
      }

      public cle.a a(cgb... $$0) {
         this.g = cgf.e.a($$0);
         return this;
      }
   }
}
