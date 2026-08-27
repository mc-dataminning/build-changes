import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ctl implements coi, day {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dea, ctl> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ix.c<ctl> b = le.h.f(this);
   private final jx c;
   @Nullable
   private final ctl j;
   @Nullable
   private String k;
   private final col l;

   public static int a(ctl $$0) {
      return $$0 == null ? 0 : le.h.a($$0);
   }

   public static ctl b(int $$0) {
      return le.h.a($$0);
   }

   @Deprecated
   public static ctl a(dea $$0) {
      return d.getOrDefault($$0, ctt.a);
   }

   public ctl(ctl.a $$0) {
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
   public ix.c<ctl> o() {
      return this.b;
   }

   public jx p() {
      return this.c;
   }

   public int q() {
      return this.c.a(kb.b, 1);
   }

   public void a(daz $$0, bsq $$1, ctq $$2, int $$3) {
   }

   public void a(cii $$0) {
   }

   public void n(ctq $$0) {
   }

   public boolean a(drd $$0, daz $$1, io $$2, cly $$3) {
      return true;
   }

   @Override
   public ctl r() {
      return this;
   }

   public bpw a(cxd $$0) {
      return bpw.d;
   }

   public float a(ctq $$0, drd $$1) {
      cwv $$2 = $$0.a(kb.w);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      cos $$4 = $$3.a(kb.u);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bpx.b($$3);
         } else {
            return bpx.d($$3);
         }
      } else {
         return bpx.c($$1.b($$2));
      }
   }

   public ctq a(ctq $$0, daz $$1, bsq $$2) {
      return $$0.b(kb.u) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(ctq $$0) {
      return $$0.m();
   }

   public int f(ctq $$0) {
      return ayf.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(ctq $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayf.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(ctq $$0, cqq $$1, cpd $$2, cly $$3) {
      return false;
   }

   public boolean a(ctq $$0, ctq $$1, cqq $$2, cpd $$3, cly $$4, bti $$5) {
      return false;
   }

   public float a(cly $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(ctq $$0, bsq $$1, bsq $$2) {
      return false;
   }

   public boolean a(ctq $$0, daz $$1, drd $$2, io $$3, bsq $$4) {
      cwv $$5 = $$0.a(kb.w);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsd.a);
         }

         return true;
      }
   }

   public boolean b(ctq $$0, drd $$1) {
      cwv $$2 = $$0.a(kb.w);
      return $$2 != null && $$2.b($$1);
   }

   public bpw a(ctq $$0, cly $$1, bsq $$2, bpv $$3) {
      return bpw.d;
   }

   public wx s() {
      return wx.c(this.a());
   }

   @Override
   public String toString() {
      return le.h.b(this).a();
   }

   protected String t() {
      if (this.k == null) {
         this.k = ac.a("item", le.h.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.t();
   }

   public String i(ctq $$0) {
      return this.a();
   }

   @Nullable
   public final ctl u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(ctq $$0, daz $$1, brw $$2, int $$3, boolean $$4) {
   }

   public void b(ctq $$0, daz $$1, cly $$2) {
      this.a($$0, $$1);
   }

   public void a(ctq $$0, daz $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cvl c(ctq $$0) {
      return $$0.b(kb.u) ? cvl.b : cvl.a;
   }

   public int b(ctq $$0) {
      cos $$1 = $$0.a(kb.u);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(ctq $$0, daz $$1, bsq $$2, int $$3) {
   }

   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
   }

   public Optional<cra> h(ctq $$0) {
      return Optional.empty();
   }

   public wx o(ctq $$0) {
      return wx.c(this.i($$0));
   }

   public boolean d_(ctq $$0) {
      return $$0.B();
   }

   public boolean a(ctq $$0) {
      return $$0.j() == 1 && $$0.b(kb.c);
   }

   protected static eui a(daz $$0, cly $$1, dai.b $$2) {
      eum $$3 = $$1.bx();
      eum $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dai($$3, $$4, dai.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(ctq $$0, ctq $$1) {
      return false;
   }

   @Deprecated
   public cwl j() {
      return cwl.a;
   }

   public boolean m(ctq $$0) {
      return false;
   }

   public ctq w() {
      return new ctq(this);
   }

   public avh al_() {
      return avi.kc;
   }

   public avh am_() {
      return avi.kd;
   }

   public avh e() {
      return avi.nB;
   }

   public boolean an_() {
      return true;
   }

   @Override
   public col i() {
      return this.l;
   }

   public static class a {
      private static final Interner<jx> a = Interners.newStrongInterner();
      @Nullable
      private jx.a b;
      @Nullable
      ctl c;
      col d = coo.g;

      public ctl.a a(cos $$0) {
         return this.a(kb.u, $$0);
      }

      public ctl.a a(int $$0) {
         return this.a(kb.b, $$0);
      }

      public ctl.a b(int $$0) {
         this.a(kb.c, $$0);
         this.a(kb.b, 1);
         this.a(kb.d, 0);
         return this;
      }

      public ctl.a a(ctl $$0) {
         this.c = $$0;
         return this;
      }

      public ctl.a a(cuk $$0) {
         return this.a(kb.i, $$0);
      }

      public ctl.a a() {
         return this.a(kb.v, azh.a);
      }

      public ctl.a a(coj... $$0) {
         this.d = coo.e.a($$0);
         return this;
      }

      public <T> ctl.a a(ka<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = jx.a().a(kb.ae);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public ctl.a a(cwl $$0) {
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

   public interface b {
      ctl.b a = new ctl.b() {
         @Nullable
         @Override
         public iz.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public eol a(eoj $$0) {
            return null;
         }
      };

      @Nullable
      iz.a a();

      float b();

      @Nullable
      eol a(eoj var1);

      static ctl.b a(@Nullable final daz $$0) {
         return $$0 == null ? a : new ctl.b() {
            @Override
            public iz.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public eol a(eoj $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static ctl.b a(final iz.a $$0) {
         return new ctl.b() {
            @Override
            public iz.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public eol a(eoj $$0x) {
               return null;
            }
         };
      }
   }
}
