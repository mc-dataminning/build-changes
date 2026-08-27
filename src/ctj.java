import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ctj implements cog, daw {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<ddy, ctj> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ix.c<ctj> b = le.h.f(this);
   private final jx c;
   @Nullable
   private final ctj j;
   @Nullable
   private String k;
   private final coj l;

   public static int a(ctj $$0) {
      return $$0 == null ? 0 : le.h.a($$0);
   }

   public static ctj b(int $$0) {
      return le.h.a($$0);
   }

   @Deprecated
   public static ctj a(ddy $$0) {
      return d.getOrDefault($$0, ctr.a);
   }

   public ctj(ctj.a $$0) {
      this.c = $$0.b();
      this.j = $$0.c;
      this.l = $$0.d;
      if (aa.aX) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public ix.c<ctj> n() {
      return this.b;
   }

   public jx o() {
      return this.c;
   }

   public int p() {
      return this.c.a(kb.b, 1);
   }

   public void a(dax $$0, bso $$1, cto $$2, int $$3) {
   }

   public void a(cig $$0) {
   }

   public void n(cto $$0) {
   }

   public boolean a(drb $$0, dax $$1, io $$2, clw $$3) {
      return true;
   }

   @Override
   public ctj q() {
      return this;
   }

   public bpu a(cxb $$0) {
      return bpu.d;
   }

   public float a(cto $$0, drb $$1) {
      cwt $$2 = $$0.a(kb.w);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      coq $$4 = $$3.a(kb.u);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bpv.b($$3);
         } else {
            return bpv.d($$3);
         }
      } else {
         return bpv.c($$1.b($$2));
      }
   }

   public cto a(cto $$0, dax $$1, bso $$2) {
      return $$0.b(kb.u) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cto $$0) {
      return $$0.m();
   }

   public int f(cto $$0) {
      return ayd.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(cto $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayd.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cto $$0, cqo $$1, cpb $$2, clw $$3) {
      return false;
   }

   public boolean a(cto $$0, cto $$1, cqo $$2, cpb $$3, clw $$4, btg $$5) {
      return false;
   }

   public float a(clw $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cto $$0, bso $$1, bso $$2) {
      return false;
   }

   public boolean a(cto $$0, dax $$1, drb $$2, io $$3, bso $$4) {
      cwt $$5 = $$0.a(kb.w);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsb.a);
         }

         return true;
      }
   }

   public boolean b(cto $$0, drb $$1) {
      cwt $$2 = $$0.a(kb.w);
      return $$2 != null && $$2.b($$1);
   }

   public bpu a(cto $$0, clw $$1, bso $$2, bpt $$3) {
      return bpu.d;
   }

   public wx r() {
      return wx.c(this.a());
   }

   @Override
   public String toString() {
      return le.h.b(this).a();
   }

   protected String s() {
      if (this.k == null) {
         this.k = ac.a("item", le.h.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.s();
   }

   public String i(cto $$0) {
      return this.a();
   }

   @Nullable
   public final ctj t() {
      return this.j;
   }

   public boolean u() {
      return this.j != null;
   }

   public void a(cto $$0, dax $$1, bru $$2, int $$3, boolean $$4) {
   }

   public void b(cto $$0, dax $$1, clw $$2) {
      this.a($$0, $$1);
   }

   public void a(cto $$0, dax $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public cvj c(cto $$0) {
      return $$0.b(kb.u) ? cvj.b : cvj.a;
   }

   public int b(cto $$0) {
      coq $$1 = $$0.a(kb.u);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cto $$0, dax $$1, bso $$2, int $$3) {
   }

   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
   }

   public Optional<cqy> h(cto $$0) {
      return Optional.empty();
   }

   public wx o(cto $$0) {
      return wx.c(this.i($$0));
   }

   public boolean d_(cto $$0) {
      return $$0.B();
   }

   public boolean a(cto $$0) {
      return $$0.j() == 1 && $$0.b(kb.c);
   }

   protected static eug a(dax $$0, clw $$1, dag.b $$2) {
      euk $$3 = $$1.bx();
      euk $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dag($$3, $$4, dag.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cto $$0, cto $$1) {
      return false;
   }

   @Deprecated
   public Multimap<ix<btr>, btu> a(bsb $$0) {
      return ImmutableMultimap.of();
   }

   public boolean m(cto $$0) {
      return false;
   }

   public cto v() {
      return new cto(this);
   }

   public avg ak_() {
      return avh.kc;
   }

   public avg al_() {
      return avh.kd;
   }

   public avg e() {
      return avh.nB;
   }

   public boolean am_() {
      return true;
   }

   @Override
   public coj i() {
      return this.l;
   }

   public static class a {
      private static final Interner<jx> a = Interners.newStrongInterner();
      @Nullable
      private jx.a b;
      @Nullable
      ctj c;
      coj d = col.g;

      public ctj.a a(coq $$0) {
         return this.a(kb.u, $$0);
      }

      public ctj.a a(int $$0) {
         return this.a(kb.b, $$0);
      }

      public ctj.a b(int $$0) {
         this.a(kb.c, $$0);
         this.a(kb.b, 1);
         this.a(kb.d, 0);
         return this;
      }

      public ctj.a a(ctj $$0) {
         this.c = $$0;
         return this;
      }

      public ctj.a a(cui $$0) {
         return this.a(kb.i, $$0);
      }

      public ctj.a a() {
         return this.a(kb.v, azf.a);
      }

      public ctj.a a(coh... $$0) {
         this.d = col.e.a($$0);
         return this;
      }

      public <T> ctj.a a(ka<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = jx.a().a(kb.ae);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public ctj.a a(cwj $$0) {
         return this.a(kb.m, $$0);
      }

      jx b() {
         jx $$0 = this.c();
         if ($$0.b(kb.d) && $$0.a(kb.b, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private jx c() {
         return this.b == null ? kb.ae : (jx)a.intern(this.b.a());
      }
   }
}
