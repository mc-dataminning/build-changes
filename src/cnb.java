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

public class cnb implements chx, ctw {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cwy, cnb> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ih.c<cnb> b = kd.h.f(this);
   private final cnx c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cnb g;
   @Nullable
   private String h;
   @Nullable
   private final cig i;
   private final cia j;

   public static int a(cnb $$0) {
      return $$0 == null ? 0 : kd.h.a($$0);
   }

   public static cnb b(int $$0) {
      return kd.h.a($$0);
   }

   @Deprecated
   public static cnb a(cwy $$0) {
      return l.getOrDefault($$0, cnj.a);
   }

   public cnb(cnb.a $$0) {
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
   public ih.c<cnb> i() {
      return this.b;
   }

   public void a(ctx $$0, bmo $$1, cng $$2, int $$3) {
   }

   public void a(ccb $$0) {
   }

   public void b(so $$0) {
   }

   public boolean a(djp $$0, ctx $$1, hx $$2, cfq $$3) {
      return true;
   }

   @Override
   public cnb j() {
      return this;
   }

   public bkc a(cpr $$0) {
      return bkc.d;
   }

   public float a(cng $$0, djp $$1) {
      return 1.0F;
   }

   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      if (this.t()) {
         cng $$3 = $$1.b($$2);
         if ($$1.t(this.u().d())) {
            $$1.c($$2);
            return bkd.b($$3);
         } else {
            return bkd.d($$3);
         }
      } else {
         return bkd.c($$1.b($$2));
      }
   }

   public cng a(cng $$0, ctx $$1, bmo $$2) {
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

   public boolean e(cng $$0) {
      return $$0.j();
   }

   public int f(cng $$0) {
      return aup.a(Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e), 0, 13);
   }

   public int g(cng $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return aup.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cng $$0, cke $$1, cir $$2, cfq $$3) {
      return false;
   }

   public boolean a(cng $$0, cng $$1, cke $$2, cir $$3, cfq $$4, bng $$5) {
      return false;
   }

   public boolean a(cng $$0, bmo $$1, bmo $$2) {
      return false;
   }

   public boolean a(cng $$0, ctx $$1, djp $$2, hx $$3, bmo $$4) {
      return false;
   }

   public boolean a_(djp $$0) {
      return false;
   }

   public bkc a(cng $$0, cfq $$1, bmo $$2, bkb $$3) {
      return bkc.d;
   }

   public vg o() {
      return vg.c(this.a());
   }

   @Override
   public String toString() {
      return kd.h.b(this).a();
   }

   protected String p() {
      if (this.h == null) {
         this.h = ac.a("item", kd.h.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.p();
   }

   public String j(cng $$0) {
      return this.a();
   }

   public boolean q() {
      return true;
   }

   @Nullable
   public final cnb r() {
      return this.g;
   }

   public boolean s() {
      return this.g != null;
   }

   public void a(cng $$0, ctx $$1, blw $$2, int $$3, boolean $$4) {
   }

   public void b(cng $$0, ctx $$1, cfq $$2) {
      this.a($$0, $$1);
   }

   public void a(cng $$0, ctx $$1) {
   }

   public boolean am_() {
      return false;
   }

   public cpa c(cng $$0) {
      return $$0.d().t() ? cpa.b : cpa.a;
   }

   public int b(cng $$0) {
      if ($$0.d().t()) {
         return this.u().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cng $$0, ctx $$1, bmo $$2, int $$3) {
   }

   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
   }

   public Optional<ckm> h(cng $$0) {
      return Optional.empty();
   }

   public vg m(cng $$0) {
      return vg.c(this.j($$0));
   }

   public boolean i(cng $$0) {
      return $$0.E();
   }

   public cnx n(cng $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cnx.c;
            case c:
               return cnx.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cng $$0) {
      return this.k() == 1 && this.n();
   }

   protected static ely a(ctx $$0, cfq $$1, ctg.b $$2) {
      float $$3 = $$1.dD();
      float $$4 = $$1.dB();
      emc $$5 = $$1.br();
      float $$6 = aup.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aup.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aup.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = aup.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      emc $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new ctg($$5, $$14, ctg.a.b, $$2, $$1));
   }

   public int an_() {
      return 0;
   }

   public boolean a(cng $$0, cng $$1) {
      return false;
   }

   public Multimap<ih<bnp>, bns> a(bmd $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cng $$0) {
      return false;
   }

   public cng ao_() {
      return new cng(this);
   }

   public boolean t() {
      return this.i != null;
   }

   @Nullable
   public cig u() {
      return this.i;
   }

   public ars ap_() {
      return art.jN;
   }

   public ars aq_() {
      return art.jO;
   }

   public boolean v() {
      return this.f;
   }

   public boolean a(bkv $$0) {
      return !this.f || !$$0.a(ask.j);
   }

   public boolean ar_() {
      return true;
   }

   @Override
   public cia m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cnb c;
      cnx d = cnx.a;
      @Nullable
      cig e;
      boolean f;
      cia g;

      public a() {
         this.g = cic.g;
      }

      public cnb.a a(cig $$0) {
         this.e = $$0;
         return this;
      }

      public cnb.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cnb.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cnb.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cnb.a a(cnb $$0) {
         this.c = $$0;
         return this;
      }

      public cnb.a a(cnx $$0) {
         this.d = $$0;
         return this;
      }

      public cnb.a a() {
         this.f = true;
         return this;
      }

      public cnb.a a(chy... $$0) {
         this.g = cic.e.a($$0);
         return this;
      }
   }
}
