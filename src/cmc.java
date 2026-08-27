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

public class cmc implements cgy, csx {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cvz, cmc> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final ie.c<cmc> b = kb.h.f(this);
   private final cmy c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cmc g;
   @Nullable
   private String h;
   @Nullable
   private final chh i;
   private final chb j;

   public static int a(cmc $$0) {
      return $$0 == null ? 0 : kb.h.a($$0);
   }

   public static cmc b(int $$0) {
      return kb.h.a($$0);
   }

   @Deprecated
   public static cmc a(cvz $$0) {
      return l.getOrDefault($$0, cmk.a);
   }

   public cmc(cmc.a $$0) {
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
   public ie.c<cmc> j() {
      return this.b;
   }

   public void a(csy $$0, blv $$1, cmh $$2, int $$3) {
   }

   public void a(cbe $$0) {
   }

   public void b(sj $$0) {
   }

   public boolean a(dip $$0, csy $$1, hv $$2, cer $$3) {
      return true;
   }

   @Override
   public cmc k() {
      return this;
   }

   public bjl a(cos $$0) {
      return bjl.d;
   }

   public float a(cmh $$0, dip $$1) {
      return 1.0F;
   }

   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      if (this.u()) {
         cmh $$3 = $$1.b($$2);
         if ($$1.t(this.v().d())) {
            $$1.c($$2);
            return bjm.b($$3);
         } else {
            return bjm.d($$3);
         }
      } else {
         return bjm.c($$1.b($$2));
      }
   }

   public cmh a(cmh $$0, csy $$1, blv $$2) {
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

   public boolean e(cmh $$0) {
      return $$0.j();
   }

   public int f(cmh $$0) {
      return Math.round(13.0F - (float)$$0.k() * 13.0F / (float)this.e);
   }

   public int g(cmh $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.k()) / (float)this.e);
      return aty.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cmh $$0, cjf $$1, chs $$2, cer $$3) {
      return false;
   }

   public boolean a(cmh $$0, cmh $$1, cjf $$2, chs $$3, cer $$4, bmn $$5) {
      return false;
   }

   public boolean a(cmh $$0, blv $$1, blv $$2) {
      return false;
   }

   public boolean a(cmh $$0, csy $$1, dip $$2, hv $$3, blv $$4) {
      return false;
   }

   public boolean a_(dip $$0) {
      return false;
   }

   public bjl a(cmh $$0, cer $$1, blv $$2, bjk $$3) {
      return bjl.d;
   }

   public vb p() {
      return vb.c(this.a());
   }

   @Override
   public String toString() {
      return kb.h.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ac.a("item", kb.h.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(cmh $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cmc s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cmh $$0, csy $$1, blf $$2, int $$3, boolean $$4) {
   }

   public void b(cmh $$0, csy $$1, cer $$2) {
      this.a($$0, $$1);
   }

   public void a(cmh $$0, csy $$1) {
   }

   public boolean al_() {
      return false;
   }

   public coa c(cmh $$0) {
      return $$0.d().u() ? coa.b : coa.a;
   }

   public int b(cmh $$0) {
      if ($$0.d().u()) {
         return this.v().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cmh $$0, csy $$1, blv $$2, int $$3) {
   }

   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
   }

   public Optional<cjn> h(cmh $$0) {
      return Optional.empty();
   }

   public vb m(cmh $$0) {
      return vb.c(this.j($$0));
   }

   public boolean i(cmh $$0) {
      return $$0.E();
   }

   public cmy n(cmh $$0) {
      if (!$$0.E()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cmy.c;
            case c:
               return cmy.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cmh $$0) {
      return this.l() == 1 && this.o();
   }

   protected static ekx a(csy $$0, cer $$1, csh.b $$2) {
      float $$3 = $$1.dE();
      float $$4 = $$1.dC();
      elb $$5 = $$1.br();
      float $$6 = aty.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aty.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aty.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = aty.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      elb $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new csh($$5, $$14, csh.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public boolean a(cmh $$0, cmh $$1) {
      return false;
   }

   public Multimap<bmw, bmz> a(blk $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cmh $$0) {
      return false;
   }

   public cmh am_() {
      return new cmh(this);
   }

   public boolean u() {
      return this.i != null;
   }

   @Nullable
   public chh v() {
      return this.i;
   }

   public arb an_() {
      return arc.jy;
   }

   public arb ao_() {
      return arc.jz;
   }

   public boolean w() {
      return this.f;
   }

   public boolean a(bkd $$0) {
      return !this.f || !$$0.a(art.j);
   }

   public boolean ap_() {
      return true;
   }

   @Override
   public chb m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cmc c;
      cmy d = cmy.a;
      @Nullable
      chh e;
      boolean f;
      chb g;

      public a() {
         this.g = chd.g;
      }

      public cmc.a a(chh $$0) {
         this.e = $$0;
         return this;
      }

      public cmc.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cmc.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cmc.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cmc.a a(cmc $$0) {
         this.c = $$0;
         return this;
      }

      public cmc.a a(cmy $$0) {
         this.d = $$0;
         return this;
      }

      public cmc.a a() {
         this.f = true;
         return this;
      }

      public cmc.a a(cgz... $$0) {
         this.g = chd.e.a($$0);
         return this;
      }
   }
}
