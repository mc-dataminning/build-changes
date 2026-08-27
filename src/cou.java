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

public class cou implements cjp, cvm {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cyo, cou> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ij.c<cou> b = kf.h.g(this);
   private final cpq c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cou g;
   @Nullable
   private String h;
   @Nullable
   private final cjy i;
   private final cjs j;

   public static int a(cou $$0) {
      return $$0 == null ? 0 : kf.h.a($$0);
   }

   public static cou b(int $$0) {
      return kf.h.a($$0);
   }

   @Deprecated
   public static cou a(cyo $$0) {
      return l.getOrDefault($$0, cpc.a);
   }

   public cou(cou.a $$0) {
      this.c = $$0.d;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.e;
      this.f = $$0.f;
      this.j = $$0.g;
      if (aa.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public ij.c<cou> i() {
      return this.b;
   }

   public void a(cvn $$0, bog $$1, coz $$2, int $$3) {
   }

   public void a(cds $$0) {
   }

   public void b(sw $$0) {
   }

   public boolean a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
      return true;
   }

   @Override
   public cou j() {
      return this;
   }

   public blu a(cri $$0) {
      return blu.d;
   }

   public float a(coz $$0, dlf $$1) {
      return 1.0F;
   }

   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      if (this.t()) {
         coz $$3 = $$1.b($$2);
         if ($$1.s(this.u().d())) {
            $$1.c($$2);
            return blv.b($$3);
         } else {
            return blv.d($$3);
         }
      } else {
         return blv.c($$1.b($$2));
      }
   }

   public coz a(coz $$0, cvn $$1, bog $$2) {
      return this.t() ? $$2.a($$1, $$0) : $$0;
   }

   public final int k() {
      return this.d;
   }

   public final int l() {
      return this.e;
   }

   public boolean n() {
      return this.e > 0;
   }

   public boolean e(coz $$0) {
      return $$0.k();
   }

   public int f(coz $$0) {
      return awh.a(Math.round(13.0F - (float)$$0.l() * 13.0F / (float)this.e), 0, 13);
   }

   public int g(coz $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.l()) / (float)this.e);
      return awh.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(coz $$0, clw $$1, ckj $$2, chh $$3) {
      return false;
   }

   public boolean a(coz $$0, coz $$1, clw $$2, ckj $$3, chh $$4, box $$5) {
      return false;
   }

   public boolean a(coz $$0, bog $$1, bog $$2) {
      return false;
   }

   public boolean a(coz $$0, cvn $$1, dlf $$2, hz $$3, bog $$4) {
      return false;
   }

   public boolean a_(dlf $$0) {
      return false;
   }

   public blu a(coz $$0, chh $$1, bog $$2, blt $$3) {
      return blu.d;
   }

   public vq o() {
      return vq.c(this.a());
   }

   @Override
   public String toString() {
      return kf.h.b(this).a();
   }

   protected String p() {
      if (this.h == null) {
         this.h = ac.a("item", kf.h.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.p();
   }

   public String j(coz $$0) {
      return this.a();
   }

   public boolean q() {
      return true;
   }

   @Nullable
   public final cou r() {
      return this.g;
   }

   public boolean s() {
      return this.g != null;
   }

   public void a(coz $$0, cvn $$1, bno $$2, int $$3, boolean $$4) {
   }

   public void b(coz $$0, cvn $$1, chh $$2) {
      this.a($$0, $$1);
   }

   public void a(coz $$0, cvn $$1) {
   }

   public boolean am_() {
      return false;
   }

   public cqs c(coz $$0) {
      return $$0.d().t() ? cqs.b : cqs.a;
   }

   public int b(coz $$0) {
      if ($$0.d().t()) {
         return this.u().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(coz $$0, cvn $$1, bog $$2, int $$3) {
   }

   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
   }

   public Optional<cme> h(coz $$0) {
      return Optional.empty();
   }

   public vq m(coz $$0) {
      return vq.c(this.j($$0));
   }

   public boolean i(coz $$0) {
      return $$0.F();
   }

   public cpq n(coz $$0) {
      if (!$$0.F()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cpq.c;
            case c:
               return cpq.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(coz $$0) {
      return this.k() == 1 && this.n();
   }

   protected static eno a(cvn $$0, chh $$1, cuw.b $$2) {
      ens $$3 = $$1.br();
      ens $$4 = $$3.e($$1.f(1.0F).a($$1.gt()));
      return $$0.a(new cuw($$3, $$4, cuw.a.b, $$2, $$1));
   }

   public int an_() {
      return 0;
   }

   public boolean a(coz $$0, coz $$1) {
      return false;
   }

   public Multimap<ij<bpg>, bpj> a(bnv $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(coz $$0) {
      return false;
   }

   public coz ao_() {
      return new coz(this);
   }

   public boolean t() {
      return this.i != null;
   }

   @Nullable
   public cjy u() {
      return this.i;
   }

   public atj ap_() {
      return atk.jN;
   }

   public atj aq_() {
      return atk.jO;
   }

   public boolean v() {
      return this.f;
   }

   public boolean a(bmn $$0) {
      return !this.f || !$$0.a(aub.j);
   }

   public boolean ar_() {
      return true;
   }

   @Override
   public cjs m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cou c;
      cpq d = cpq.a;
      @Nullable
      cjy e;
      boolean f;
      cjs g;

      public a() {
         this.g = cju.g;
      }

      public cou.a a(cjy $$0) {
         this.e = $$0;
         return this;
      }

      public cou.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cou.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cou.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cou.a a(cou $$0) {
         this.c = $$0;
         return this;
      }

      public cou.a a(cpq $$0) {
         this.d = $$0;
         return this;
      }

      public cou.a a() {
         this.f = true;
         return this;
      }

      public cou.a a(cjq... $$0) {
         this.g = cju.e.a($$0);
         return this;
      }
   }
}
