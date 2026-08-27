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

public class csu implements cnr, dac {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dde, csu> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final iw.c<csu> b = ld.h.f(this);
   private final jw c;
   @Nullable
   private final csu j;
   @Nullable
   private String k;
   private final cnu l;

   public static int a(csu $$0) {
      return $$0 == null ? 0 : ld.h.a($$0);
   }

   public static csu b(int $$0) {
      return ld.h.a($$0);
   }

   @Deprecated
   public static csu a(dde $$0) {
      return d.getOrDefault($$0, ctc.a);
   }

   public csu(csu.a $$0) {
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
   public iw.c<csu> n() {
      return this.b;
   }

   public jw o() {
      return this.c;
   }

   public int p() {
      return this.c.a(ka.b, 1);
   }

   public void a(dad $$0, bsa $$1, csz $$2, int $$3) {
   }

   public void a(chr $$0) {
   }

   public void n(csz $$0) {
   }

   public boolean a(dqh $$0, dad $$1, in $$2, clh $$3) {
      return true;
   }

   @Override
   public csu q() {
      return this;
   }

   public bpm a(cwk $$0) {
      return bpm.d;
   }

   public float a(csz $$0, dqh $$1) {
      cwc $$2 = $$0.a(ka.v);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      coa $$4 = $$3.a(ka.t);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bpn.b($$3);
         } else {
            return bpn.d($$3);
         }
      } else {
         return bpn.c($$1.b($$2));
      }
   }

   public csz a(csz $$0, dad $$1, bsa $$2) {
      return $$0.b(ka.t) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(csz $$0) {
      return $$0.l();
   }

   public int f(csz $$0) {
      return axz.a(Math.round(13.0F - (float)$$0.m() * 13.0F / (float)$$0.n()), 0, 13);
   }

   public int g(csz $$0) {
      int $$1 = $$0.n();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.m()) / (float)$$1);
      return axz.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(csz $$0, cpz $$1, col $$2, clh $$3) {
      return false;
   }

   public boolean a(csz $$0, csz $$1, cpz $$2, col $$3, clh $$4, bsr $$5) {
      return false;
   }

   public float a(clh $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(csz $$0, bsa $$1, bsa $$2) {
      return false;
   }

   public boolean a(csz $$0, dad $$1, dqh $$2, in $$3, bsa $$4) {
      cwc $$5 = $$0.a(ka.v);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bro.a);
         }

         return true;
      }
   }

   public boolean b(csz $$0, dqh $$1) {
      cwc $$2 = $$0.a(ka.v);
      return $$2 != null && $$2.b($$1);
   }

   public bpm a(csz $$0, clh $$1, bsa $$2, bpl $$3) {
      return bpm.d;
   }

   public wu r() {
      return wu.c(this.a());
   }

   @Override
   public String toString() {
      return ld.h.b(this).a();
   }

   protected String s() {
      if (this.k == null) {
         this.k = ac.a("item", ld.h.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.s();
   }

   public String i(csz $$0) {
      return this.a();
   }

   @Nullable
   public final csu t() {
      return this.j;
   }

   public boolean u() {
      return this.j != null;
   }

   public void a(csz $$0, dad $$1, brh $$2, int $$3, boolean $$4) {
   }

   public void b(csz $$0, dad $$1, clh $$2) {
      this.a($$0, $$1);
   }

   public void a(csz $$0, dad $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public cus c(csz $$0) {
      return $$0.b(ka.t) ? cus.b : cus.a;
   }

   public int b(csz $$0) {
      coa $$1 = $$0.a(ka.t);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(csz $$0, dad $$1, bsa $$2, int $$3) {
   }

   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
   }

   public Optional<cqj> h(csz $$0) {
      return Optional.empty();
   }

   public wu o(csz $$0) {
      return wu.c(this.i($$0));
   }

   public boolean d_(csz $$0) {
      return $$0.A();
   }

   public boolean a(csz $$0) {
      return $$0.i() == 1 && $$0.b(ka.c);
   }

   protected static etl a(dad $$0, clh $$1, czm.b $$2) {
      etp $$3 = $$1.bv();
      etp $$4 = $$3.e($$1.b($$1.dF(), $$1.dD()).a($$1.gA()));
      return $$0.a(new czm($$3, $$4, czm.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(csz $$0, csz $$1) {
      return false;
   }

   @Deprecated
   public Multimap<iw<btc>, btf> a(bro $$0) {
      return ImmutableMultimap.of();
   }

   public boolean m(csz $$0) {
      return false;
   }

   public csz v() {
      return new csz(this);
   }

   public avb ak_() {
      return avc.jX;
   }

   public avb al_() {
      return avc.jY;
   }

   public avb e() {
      return avc.nr;
   }

   public boolean am_() {
      return true;
   }

   @Override
   public cnu m() {
      return this.l;
   }

   public static class a {
      private static final Interner<jw> a = Interners.newStrongInterner();
      @Nullable
      private jw.a b;
      @Nullable
      csu c;
      cnu d = cnw.g;

      public csu.a a(coa $$0) {
         return this.a(ka.t, $$0);
      }

      public csu.a a(int $$0) {
         return this.a(ka.b, $$0);
      }

      public csu.a b(int $$0) {
         this.a(ka.c, $$0);
         this.a(ka.b, 1);
         this.a(ka.d, 0);
         return this;
      }

      public csu.a a(csu $$0) {
         this.c = $$0;
         return this;
      }

      public csu.a a(ctr $$0) {
         return this.a(ka.h, $$0);
      }

      public csu.a a() {
         return this.a(ka.u, azb.a);
      }

      public csu.a a(cns... $$0) {
         this.d = cnw.e.a($$0);
         return this;
      }

      public <T> csu.a a(jz<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = jw.a().a(ka.ac);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public csu.a a(cvs $$0) {
         return this.a(ka.l, $$0);
      }

      jw b() {
         jw $$0 = this.c();
         if ($$0.b(ka.d) && $$0.a(ka.b, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private jw c() {
         return this.b == null ? ka.ac : (jw)a.intern(this.b.a());
      }
   }
}
