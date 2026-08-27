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

public class cmt implements chp, cto {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cwq, cmt> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ih.c<cmt> b = kd.h.f(this);
   private final cnp c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cmt g;
   @Nullable
   private String h;
   @Nullable
   private final chy i;
   private final chs j;

   public static int a(cmt $$0) {
      return $$0 == null ? 0 : kd.h.a($$0);
   }

   public static cmt b(int $$0) {
      return kd.h.a($$0);
   }

   @Deprecated
   public static cmt a(cwq $$0) {
      return l.getOrDefault($$0, cnb.a);
   }

   public cmt(cmt.a $$0) {
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
   public ih.c<cmt> j() {
      return this.b;
   }

   public void a(ctp $$0, bml $$1, cmy $$2, int $$3) {
   }

   public void a(cbu $$0) {
   }

   public void b(sn $$0) {
   }

   public boolean a(djh $$0, ctp $$1, hx $$2, cfi $$3) {
      return true;
   }

   @Override
   public cmt k() {
      return this;
   }

   public bkb a(cpj $$0) {
      return bkb.d;
   }

   public float a(cmy $$0, djh $$1) {
      return 1.0F;
   }

   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      if (this.u()) {
         cmy $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bkc.b($$3);
         } else {
            return bkc.d($$3);
         }
      } else {
         return bkc.c($$1.b($$2));
      }
   }

   public cmy a(cmy $$0, ctp $$1, bml $$2) {
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

   public boolean e(cmy $$0) {
      return $$0.j();
   }

   public int f(cmy $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cmy $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return auo.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cmy $$0, cjw $$1, cij $$2, cfi $$3) {
      return false;
   }

   public boolean a(cmy $$0, cmy $$1, cjw $$2, cij $$3, cfi $$4, bnd $$5) {
      return false;
   }

   public boolean a(cmy $$0, bml $$1, bml $$2) {
      return false;
   }

   public boolean a(cmy $$0, ctp $$1, djh $$2, hx $$3, bml $$4) {
      return false;
   }

   public boolean a_(djh $$0) {
      return false;
   }

   public bkb a(cmy $$0, cfi $$1, bml $$2, bka $$3) {
      return bkb.d;
   }

   public vf p() {
      return vf.c(this.a());
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

   public String j(cmy $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cmt s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cmy $$0, ctp $$1, blv $$2, int $$3, boolean $$4) {
   }

   public void b(cmy $$0, ctp $$1, cfi $$2) {
      this.a($$0, $$1);
   }

   public void a(cmy $$0, ctp $$1) {
   }

   public boolean al_() {
      return false;
   }

   public cos c(cmy $$0) {
      return $$0.d().u() ? cos.b : cos.a;
   }

   public int b(cmy $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cmy $$0, ctp $$1, bml $$2, int $$3) {
   }

   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
   }

   public Optional<cke> h(cmy $$0) {
      return Optional.empty();
   }

   public vf m(cmy $$0) {
      return vf.c(this.j($$0));
   }

   public boolean i(cmy $$0) {
      return $$0.E();
   }

   public cnp n(cmy $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cnp.c;
            case c:
               return cnp.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cmy $$0) {
      return this.l() == 1 && this.o();
   }

   protected static elp a(ctp $$0, cfi $$1, csy.b $$2) {
      float $$3 = $$1.dE();
      float $$4 = $$1.dC();
      elt $$5 = $$1.br();
      float $$6 = auo.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = auo.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -auo.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = auo.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      elt $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new csy($$5, $$14, csy.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cmy $$0, cmy $$1) {
      return false;
   }

   public Multimap<bnm, bnp> a(bma $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cmy $$0) {
      return false;
   }

   public cmy am_() {
      return new cmy(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public chy v() {
      return this.i;
   }

   public arr an_() {
      return ars.jy;
   }

   public arr ao_() {
      return ars.jz;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bkt $$0) {
      return !this.f || !$$0.a(asj.j);
   }

   public boolean ap_() {
      return true;
   }

   @Override
   public chs m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cmt c;
      cnp d = cnp.a;
      @Nullable
      chy e;
      boolean f;
      chs g;

      public a() {
         this.g = chu.g;
      }

      public cmt.a a(chy $$0) {
         this.e = $$0;
         return this;
      }

      public cmt.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cmt.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cmt.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cmt.a a(cmt $$0) {
         this.c = $$0;
         return this;
      }

      public cmt.a a(cnp $$0) {
         this.d = $$0;
         return this;
      }

      public cmt.a a() {
         this.f = true;
         return this;
      }

      public cmt.a a(chq... $$0) {
         this.g = chu.e.a($$0);
         return this;
      }
   }
}
