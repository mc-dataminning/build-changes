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

public class cke implements cfd, cqy {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cua, cke> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ib.c<cke> b = jy.i.f(this);
   private final cla c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cke g;
   @Nullable
   private String h;
   @Nullable
   private final cfm i;
   private final cfg j;

   public static int a(cke $$0) {
      return $$0 == null ? 0 : jy.i.a($$0);
   }

   public static cke b(int $$0) {
      return jy.i.a($$0);
   }

   @Deprecated
   public static cke a(cua $$0) {
      return l.getOrDefault($$0, ckm.a);
   }

   public cke(cke.a $$0) {
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
   public ib.c<cke> j() {
      return this.b;
   }

   public void a(cqz $$0, bkj $$1, ckj $$2, int $$3) {
   }

   public void a(bzq $$0) {
   }

   public void b(rt $$0) {
   }

   public boolean a(dgb $$0, cqz $$1, ht $$2, ccx $$3) {
      return true;
   }

   @Override
   public cke k() {
      return this;
   }

   public bib a(cmt $$0) {
      return bib.d;
   }

   public float a(ckj $$0, dgb $$1) {
      return 1.0F;
   }

   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      if (this.u()) {
         ckj $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bic.b($$3);
         } else {
            return bic.d($$3);
         }
      } else {
         return bic.c($$1.b($$2));
      }
   }

   public ckj a(ckj $$0, cqz $$1, bkj $$2) {
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

   public boolean e(ckj $$0) {
      return $$0.j();
   }

   public int f(ckj $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(ckj $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return asy.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(ckj $$0, chh $$1, cfx $$2, ccx $$3) {
      return false;
   }

   public boolean a(ckj $$0, ckj $$1, chh $$2, cfx $$3, ccx $$4, blb $$5) {
      return false;
   }

   public boolean a(ckj $$0, bkj $$1, bkj $$2) {
      return false;
   }

   public boolean a(ckj $$0, cqz $$1, dgb $$2, ht $$3, bkj $$4) {
      return false;
   }

   public boolean a_(dgb $$0) {
      return false;
   }

   public bib a(ckj $$0, ccx $$1, bkj $$2, bia $$3) {
      return bib.d;
   }

   public ui p() {
      return ui.c(this.a());
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

   public String j(ckj $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cke s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(ckj $$0, cqz $$1, bjt $$2, int $$3, boolean $$4) {
   }

   public void b(ckj $$0, cqz $$1, ccx $$2) {
   }

   public boolean ak_() {
      return false;
   }

   public cmc c(ckj $$0) {
      return $$0.d().u() ? cmc.b : cmc.a;
   }

   public int b(ckj $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(ckj $$0, cqz $$1, bkj $$2, int $$3) {
   }

   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
   }

   public Optional<chp> h(ckj $$0) {
      return Optional.empty();
   }

   public ui m(ckj $$0) {
      return ui.c(this.j($$0));
   }

   public boolean i(ckj $$0) {
      return $$0.E();
   }

   public cla n(ckj $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cla.c;
            case c:
               return cla.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(ckj $$0) {
      return this.l() == 1 && this.o();
   }

   protected static eib a(cqz $$0, ccx $$1, cqi.b $$2) {
      float $$3 = $$1.dD();
      float $$4 = $$1.dB();
      eif $$5 = $$1.bp();
      float $$6 = asy.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = asy.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -asy.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = asy.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      eif $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cqi($$5, $$14, cqi.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(ckj $$0, ckj $$1) {
      return false;
   }

   public Multimap<blk, bln> a(bjy $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(ckj $$0) {
      return false;
   }

   public ckj al_() {
      return new ckj(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public cfm v() {
      return this.i;
   }

   public aqc am_() {
      return aqd.iX;
   }

   public aqc an_() {
      return aqd.iY;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bir $$0) {
      return !this.f || !$$0.a(aqu.i);
   }

   public boolean ao_() {
      return true;
   }

   @Override
   public cfg m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cke c;
      cla d = cla.a;
      @Nullable
      cfm e;
      boolean f;
      cfg g = cfi.f;

      public cke.a a(cfm $$0) {
         this.e = $$0;
         return this;
      }

      public cke.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cke.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cke.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cke.a a(cke $$0) {
         this.c = $$0;
         return this;
      }

      public cke.a a(cla $$0) {
         this.d = $$0;
         return this;
      }

      public cke.a a() {
         this.f = true;
         return this;
      }

      public cke.a a(cfe... $$0) {
         this.g = cfi.d.a($$0);
         return this;
      }
   }
}
