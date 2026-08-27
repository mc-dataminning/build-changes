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

public class ckw implements cfs, crr {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cut, ckw> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ib.c<ckw> b = jy.i.f(this);
   private final cls c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final ckw g;
   @Nullable
   private String h;
   @Nullable
   private final cgb i;
   private final cfv j;

   public static int a(ckw $$0) {
      return $$0 == null ? 0 : jy.i.a($$0);
   }

   public static ckw b(int $$0) {
      return jy.i.a($$0);
   }

   @Deprecated
   public static ckw a(cut $$0) {
      return l.getOrDefault($$0, cle.a);
   }

   public ckw(ckw.a $$0) {
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
   public ib.c<ckw> j() {
      return this.b;
   }

   public void a(crs $$0, bky $$1, clb $$2, int $$3) {
   }

   public void a(caf $$0) {
   }

   public void b(rz $$0) {
   }

   public boolean a(dgw $$0, crs $$1, ht $$2, cdm $$3) {
      return true;
   }

   @Override
   public ckw k() {
      return this;
   }

   public biq a(cnl $$0) {
      return biq.d;
   }

   public float a(clb $$0, dgw $$1) {
      return 1.0F;
   }

   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      if (this.u()) {
         clb $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bir.b($$3);
         } else {
            return bir.d($$3);
         }
      } else {
         return bir.c($$1.b($$2));
      }
   }

   public clb a(clb $$0, crs $$1, bky $$2) {
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

   public boolean e(clb $$0) {
      return $$0.j();
   }

   public int f(clb $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(clb $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return ati.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(clb $$0, chz $$1, cgm $$2, cdm $$3) {
      return false;
   }

   public boolean a(clb $$0, clb $$1, chz $$2, cgm $$3, cdm $$4, blq $$5) {
      return false;
   }

   public boolean a(clb $$0, bky $$1, bky $$2) {
      return false;
   }

   public boolean a(clb $$0, crs $$1, dgw $$2, ht $$3, bky $$4) {
      return false;
   }

   public boolean a_(dgw $$0) {
      return false;
   }

   public biq a(clb $$0, cdm $$1, bky $$2, bip $$3) {
      return biq.d;
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

   public String j(clb $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final ckw s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(clb $$0, crs $$1, bki $$2, int $$3, boolean $$4) {
   }

   public void b(clb $$0, crs $$1, cdm $$2) {
      this.a($$0, $$1);
   }

   public void a(clb $$0, crs $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cmu c(clb $$0) {
      return $$0.d().u() ? cmu.b : cmu.a;
   }

   public int b(clb $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(clb $$0, crs $$1, bky $$2, int $$3) {
   }

   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
   }

   public Optional<cih> h(clb $$0) {
      return Optional.empty();
   }

   public ur m(clb $$0) {
      return ur.c(this.j($$0));
   }

   public boolean i(clb $$0) {
      return $$0.E();
   }

   public cls n(clb $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cls.c;
            case c:
               return cls.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(clb $$0) {
      return this.l() == 1 && this.o();
   }

   protected static eje a(crs $$0, cdm $$1, crb.b $$2) {
      float $$3 = $$1.dD();
      float $$4 = $$1.dB();
      eji $$5 = $$1.bp();
      float $$6 = ati.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ati.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ati.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = ati.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      eji $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new crb($$5, $$14, crb.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(clb $$0, clb $$1) {
      return false;
   }

   public Multimap<blz, bmc> a(bkn $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(clb $$0) {
      return false;
   }

   public clb al_() {
      return new clb(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cgb v() {
      return this.i;
   }

   public aqm am_() {
      return aqn.iZ;
   }

   public aqm an_() {
      return aqn.ja;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bjg $$0) {
      return !this.f || !$$0.a(are.i);
   }

   public boolean ao_() {
      return true;
   }

   @Override
   public cfv m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      ckw c;
      cls d = cls.a;
      @Nullable
      cgb e;
      boolean f;
      cfv g;

      public a() {
         this.g = cfx.g;
      }

      public ckw.a a(cgb $$0) {
         this.e = $$0;
         return this;
      }

      public ckw.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public ckw.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public ckw.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public ckw.a a(ckw $$0) {
         this.c = $$0;
         return this;
      }

      public ckw.a a(cls $$0) {
         this.d = $$0;
         return this;
      }

      public ckw.a a() {
         this.f = true;
         return this;
      }

      public ckw.a a(cft... $$0) {
         this.g = cfx.e.a($$0);
         return this;
      }
   }
}
