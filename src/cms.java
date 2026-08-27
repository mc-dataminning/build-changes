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

public class cms implements cho, ctn {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cwp, cms> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ih.c<cms> b = kd.h.f(this);
   private final cno c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cms g;
   @Nullable
   private String h;
   @Nullable
   private final chx i;
   private final chr j;

   public static int a(cms $$0) {
      return $$0 == null ? 0 : kd.h.a($$0);
   }

   public static cms b(int $$0) {
      return kd.h.a($$0);
   }

   @Deprecated
   public static cms a(cwp $$0) {
      return l.getOrDefault($$0, cna.a);
   }

   public cms(cms.a $$0) {
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
   public ih.c<cms> j() {
      return this.b;
   }

   public void a(cto $$0, bmk $$1, cmx $$2, int $$3) {
   }

   public void a(cbt $$0) {
   }

   public void b(sn $$0) {
   }

   public boolean a(djg $$0, cto $$1, hx $$2, cfh $$3) {
      return true;
   }

   @Override
   public cms k() {
      return this;
   }

   public bka a(cpi $$0) {
      return bka.d;
   }

   public float a(cmx $$0, djg $$1) {
      return 1.0F;
   }

   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      if (this.u()) {
         cmx $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bkb.b($$3);
         } else {
            return bkb.d($$3);
         }
      } else {
         return bkb.c($$1.b($$2));
      }
   }

   public cmx a(cmx $$0, cto $$1, bmk $$2) {
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

   public boolean e(cmx $$0) {
      return $$0.j();
   }

   public int f(cmx $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cmx $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return aun.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cmx $$0, cjv $$1, cii $$2, cfh $$3) {
      return false;
   }

   public boolean a(cmx $$0, cmx $$1, cjv $$2, cii $$3, cfh $$4, bnc $$5) {
      return false;
   }

   public boolean a(cmx $$0, bmk $$1, bmk $$2) {
      return false;
   }

   public boolean a(cmx $$0, cto $$1, djg $$2, hx $$3, bmk $$4) {
      return false;
   }

   public boolean a_(djg $$0) {
      return false;
   }

   public bka a(cmx $$0, cfh $$1, bmk $$2, bjz $$3) {
      return bka.d;
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

   public String j(cmx $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cms s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cmx $$0, cto $$1, blu $$2, int $$3, boolean $$4) {
   }

   public void b(cmx $$0, cto $$1, cfh $$2) {
      this.a($$0, $$1);
   }

   public void a(cmx $$0, cto $$1) {
   }

   public boolean al_() {
      return false;
   }

   public cor c(cmx $$0) {
      return $$0.d().u() ? cor.b : cor.a;
   }

   public int b(cmx $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cmx $$0, cto $$1, bmk $$2, int $$3) {
   }

   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
   }

   public Optional<ckd> h(cmx $$0) {
      return Optional.empty();
   }

   public vf m(cmx $$0) {
      return vf.c(this.j($$0));
   }

   public boolean i(cmx $$0) {
      return $$0.E();
   }

   public cno n(cmx $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cno.c;
            case c:
               return cno.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cmx $$0) {
      return this.l() == 1 && this.o();
   }

   protected static elo a(cto $$0, cfh $$1, csx.b $$2) {
      float $$3 = $$1.dE();
      float $$4 = $$1.dC();
      els $$5 = $$1.br();
      float $$6 = aun.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aun.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aun.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = aun.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      els $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new csx($$5, $$14, csx.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cmx $$0, cmx $$1) {
      return false;
   }

   public Multimap<bnl, bno> a(blz $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cmx $$0) {
      return false;
   }

   public cmx am_() {
      return new cmx(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public chx v() {
      return this.i;
   }

   public arq an_() {
      return arr.jy;
   }

   public arq ao_() {
      return arr.jz;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bks $$0) {
      return !this.f || !$$0.a(asi.j);
   }

   public boolean ap_() {
      return true;
   }

   @Override
   public chr m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cms c;
      cno d = cno.a;
      @Nullable
      chx e;
      boolean f;
      chr g;

      public a() {
         this.g = cht.g;
      }

      public cms.a a(chx $$0) {
         this.e = $$0;
         return this;
      }

      public cms.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cms.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cms.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cms.a a(cms $$0) {
         this.c = $$0;
         return this;
      }

      public cms.a a(cno $$0) {
         this.d = $$0;
         return this;
      }

      public cms.a a() {
         this.f = true;
         return this;
      }

      public cms.a a(chp... $$0) {
         this.g = cht.e.a($$0);
         return this;
      }
   }
}
