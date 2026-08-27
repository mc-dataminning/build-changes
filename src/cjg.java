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

public class cjg implements cef, cqa {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<ctc, cjg> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final he.c<cjg> b = jb.i.f(this);
   private final ckc c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cjg g;
   @Nullable
   private String h;
   @Nullable
   private final ceo i;
   private final cei j;

   public static int a(cjg $$0) {
      return $$0 == null ? 0 : jb.i.a($$0);
   }

   public static cjg b(int $$0) {
      return jb.i.a($$0);
   }

   @Deprecated
   public static cjg a(ctc $$0) {
      return l.getOrDefault($$0, cjo.a);
   }

   public cjg(cjg.a $$0) {
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
   public he.c<cjg> j() {
      return this.b;
   }

   public void a(cqb $$0, bjm $$1, cjl $$2, int $$3) {
   }

   public void a(byt $$0) {
   }

   public void b(qw $$0) {
   }

   public boolean a(dfd $$0, cqb $$1, gw $$2, cca $$3) {
      return true;
   }

   @Override
   public cjg k() {
      return this;
   }

   public bhe a(clv $$0) {
      return bhe.d;
   }

   public float a(cjl $$0, dfd $$1) {
      return 1.0F;
   }

   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      if (this.u()) {
         cjl $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bhf.b($$3);
         } else {
            return bhf.d($$3);
         }
      } else {
         return bhf.c($$1.b($$2));
      }
   }

   public cjl a(cjl $$0, cqb $$1, bjm $$2) {
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

   public boolean e(cjl $$0) {
      return $$0.j();
   }

   public int f(cjl $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cjl $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return asb.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cjl $$0, cgj $$1, cez $$2, cca $$3) {
      return false;
   }

   public boolean a(cjl $$0, cjl $$1, cgj $$2, cez $$3, cca $$4, bke $$5) {
      return false;
   }

   public boolean a(cjl $$0, bjm $$1, bjm $$2) {
      return false;
   }

   public boolean a(cjl $$0, cqb $$1, dfd $$2, gw $$3, bjm $$4) {
      return false;
   }

   public boolean a_(dfd $$0) {
      return false;
   }

   public bhe a(cjl $$0, cca $$1, bjm $$2, bhd $$3) {
      return bhe.d;
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

   public String j(cjl $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cjg s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cjl $$0, cqb $$1, biw $$2, int $$3, boolean $$4) {
   }

   public void b(cjl $$0, cqb $$1, cca $$2) {
   }

   public boolean ah_() {
      return false;
   }

   public cle c(cjl $$0) {
      return $$0.d().u() ? cle.b : cle.a;
   }

   public int b(cjl $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cjl $$0, cqb $$1, bjm $$2, int $$3) {
   }

   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
   }

   public Optional<cgr> h(cjl $$0) {
      return Optional.empty();
   }

   public tl m(cjl $$0) {
      return tl.c(this.j($$0));
   }

   public boolean i(cjl $$0) {
      return $$0.E();
   }

   public ckc n(cjl $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return ckc.c;
            case c:
               return ckc.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cjl $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ehd a(cqb $$0, cca $$1, cpk.b $$2) {
      float $$3 = $$1.dD();
      float $$4 = $$1.dB();
      ehh $$5 = $$1.bp();
      float $$6 = asb.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = asb.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -asb.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = asb.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      ehh $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cpk($$5, $$14, cpk.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cjl $$0, cjl $$1) {
      return false;
   }

   public Multimap<bkn, bkq> a(bjb $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cjl $$0) {
      return false;
   }

   public cjl ai_() {
      return new cjl(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public ceo v() {
      return this.i;
   }

   public apf aj_() {
      return apg.iV;
   }

   public apf ak_() {
      return apg.iW;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bhu $$0) {
      return !this.f || !$$0.a(apx.i);
   }

   public boolean al_() {
      return true;
   }

   @Override
   public cei m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cjg c;
      ckc d = ckc.a;
      @Nullable
      ceo e;
      boolean f;
      cei g = cek.f;

      public cjg.a a(ceo $$0) {
         this.e = $$0;
         return this;
      }

      public cjg.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cjg.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cjg.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cjg.a a(cjg $$0) {
         this.c = $$0;
         return this;
      }

      public cjg.a a(ckc $$0) {
         this.d = $$0;
         return this;
      }

      public cjg.a a() {
         this.f = true;
         return this;
      }

      public cjg.a a(ceg... $$0) {
         this.g = cek.d.a($$0);
         return this;
      }
   }
}
