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

public class cmm implements chi, cth {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cwj, cmm> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ih.c<cmm> b = kd.h.f(this);
   private final cni c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cmm g;
   @Nullable
   private String h;
   @Nullable
   private final chr i;
   private final chl j;

   public static int a(cmm $$0) {
      return $$0 == null ? 0 : kd.h.a($$0);
   }

   public static cmm b(int $$0) {
      return kd.h.a($$0);
   }

   @Deprecated
   public static cmm a(cwj $$0) {
      return l.getOrDefault($$0, cmu.a);
   }

   public cmm(cmm.a $$0) {
      this.c = $$0.d;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.e;
      this.f = $$0.f;
      this.j = $$0.g;
      if (aa.aW) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public ih.c<cmm> j() {
      return this.b;
   }

   public void a(cti $$0, bmf $$1, cmr $$2, int $$3) {
   }

   public void a(cbo $$0) {
   }

   public void b(sl $$0) {
   }

   public boolean a(dja $$0, cti $$1, hx $$2, cfb $$3) {
      return true;
   }

   @Override
   public cmm k() {
      return this;
   }

   public bjv a(cpc $$0) {
      return bjv.d;
   }

   public float a(cmr $$0, dja $$1) {
      return 1.0F;
   }

   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      if (this.u()) {
         cmr $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bjw.b($$3);
         } else {
            return bjw.d($$3);
         }
      } else {
         return bjw.c($$1.b($$2));
      }
   }

   public cmr a(cmr $$0, cti $$1, bmf $$2) {
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

   public boolean e(cmr $$0) {
      return $$0.j();
   }

   public int f(cmr $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cmr $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return aui.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cmr $$0, cjp $$1, cic $$2, cfb $$3) {
      return false;
   }

   public boolean a(cmr $$0, cmr $$1, cjp $$2, cic $$3, cfb $$4, bmx $$5) {
      return false;
   }

   public boolean a(cmr $$0, bmf $$1, bmf $$2) {
      return false;
   }

   public boolean a(cmr $$0, cti $$1, dja $$2, hx $$3, bmf $$4) {
      return false;
   }

   public boolean a_(dja $$0) {
      return false;
   }

   public bjv a(cmr $$0, cfb $$1, bmf $$2, bju $$3) {
      return bjv.d;
   }

   public vd p() {
      return vd.c(this.a());
   }

   @Override
   public String toString() {
      return kd.h.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ac.a("item", kd.h.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(cmr $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cmm s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cmr $$0, cti $$1, blp $$2, int $$3, boolean $$4) {
   }

   public void b(cmr $$0, cti $$1, cfb $$2) {
      this.a($$0, $$1);
   }

   public void a(cmr $$0, cti $$1) {
   }

   public boolean al_() {
      return false;
   }

   public cok c(cmr $$0) {
      return $$0.d().u() ? cok.b : cok.a;
   }

   public int b(cmr $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cmr $$0, cti $$1, bmf $$2, int $$3) {
   }

   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
   }

   public Optional<cjx> h(cmr $$0) {
      return Optional.empty();
   }

   public vd m(cmr $$0) {
      return vd.c(this.j($$0));
   }

   public boolean i(cmr $$0) {
      return $$0.E();
   }

   public cni n(cmr $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cni.c;
            case c:
               return cni.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cmr $$0) {
      return this.l() == 1 && this.o();
   }

   protected static eli a(cti $$0, cfb $$1, csr.b $$2) {
      float $$3 = $$1.dE();
      float $$4 = $$1.dC();
      elm $$5 = $$1.br();
      float $$6 = aui.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aui.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aui.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = aui.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      elm $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new csr($$5, $$14, csr.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cmr $$0, cmr $$1) {
      return false;
   }

   public Multimap<bng, bnj> a(blu $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cmr $$0) {
      return false;
   }

   public cmr am_() {
      return new cmr(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public chr v() {
      return this.i;
   }

   public arl an_() {
      return arm.jy;
   }

   public arl ao_() {
      return arm.jz;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bkn $$0) {
      return !this.f || !$$0.a(asd.j);
   }

   public boolean ap_() {
      return true;
   }

   @Override
   public chl m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cmm c;
      cni d = cni.a;
      @Nullable
      chr e;
      boolean f;
      chl g;

      public a() {
         this.g = chn.g;
      }

      public cmm.a a(chr $$0) {
         this.e = $$0;
         return this;
      }

      public cmm.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cmm.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cmm.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cmm.a a(cmm $$0) {
         this.c = $$0;
         return this;
      }

      public cmm.a a(cni $$0) {
         this.d = $$0;
         return this;
      }

      public cmm.a a() {
         this.f = true;
         return this;
      }

      public cmm.a a(chj... $$0) {
         this.g = chn.e.a($$0);
         return this;
      }
   }
}
