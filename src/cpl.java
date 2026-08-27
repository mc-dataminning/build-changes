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

public class cpl implements cki, cwd {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<czf, cpl> l = Maps.newHashMap();
   protected static final UUID m = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID n = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int o = 64;
   public static final int p = 32;
   public static final int q = 13;
   private final il.c<cpl> b = kh.h.g(this);
   private final cqh c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cpl g;
   @Nullable
   private String h;
   @Nullable
   private final ckr i;
   private final ckl j;

   public static int a(cpl $$0) {
      return $$0 == null ? 0 : kh.h.a($$0);
   }

   public static cpl b(int $$0) {
      return kh.h.a($$0);
   }

   @Deprecated
   public static cpl a(czf $$0) {
      return l.getOrDefault($$0, cpt.a);
   }

   public cpl(cpl.a $$0) {
      this.c = $$0.d;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.e;
      this.f = $$0.f;
      this.j = $$0.g;
      if (aa.aV) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public il.c<cpl> k() {
      return this.b;
   }

   public void a(cwe $$0, box $$1, cpq $$2, int $$3) {
   }

   public void a(cel $$0) {
   }

   public void b(sy $$0) {
   }

   public boolean a(dme $$0, cwe $$1, ib $$2, cia $$3) {
      return true;
   }

   @Override
   public cpl l() {
      return this;
   }

   public bml a(crz $$0) {
      return bml.d;
   }

   public float a(cpq $$0, dme $$1) {
      return 1.0F;
   }

   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      if (this.v()) {
         cpq $$3 = $$1.b($$2);
         if ($$1.s(this.w().d())) {
            $$1.c($$2);
            return bmm.b($$3);
         } else {
            return bmm.d($$3);
         }
      } else {
         return bmm.c($$1.b($$2));
      }
   }

   public cpq a(cpq $$0, cwe $$1, box $$2) {
      return this.v() ? $$2.a($$1, $$0) : $$0;
   }

   public final int n() {
      return this.d;
   }

   public final int o() {
      return this.e;
   }

   public boolean p() {
      return this.e > 0;
   }

   public boolean e(cpq $$0) {
      return $$0.k();
   }

   public int f(cpq $$0) {
      return awm.a(Math.round(13.0F - (float)$$0.l() * 13.0F / (float)this.e), 0, 13);
   }

   public int g(cpq $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.l()) / (float)this.e);
      return awm.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cpq $$0, cmp $$1, clc $$2, cia $$3) {
      return false;
   }

   public boolean a(cpq $$0, cpq $$1, cmp $$2, clc $$3, cia $$4, bpo $$5) {
      return false;
   }

   public boolean a(cpq $$0, box $$1, box $$2) {
      return false;
   }

   public boolean a(cpq $$0, cwe $$1, dme $$2, ib $$3, box $$4) {
      return false;
   }

   public boolean a_(dme $$0) {
      return false;
   }

   public bml a(cpq $$0, cia $$1, box $$2, bmk $$3) {
      return bml.d;
   }

   public vs q() {
      return vs.c(this.a());
   }

   @Override
   public String toString() {
      return kh.h.b(this).a();
   }

   protected String r() {
      if (this.h == null) {
         this.h = ac.a("item", kh.h.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.r();
   }

   public String j(cpq $$0) {
      return this.a();
   }

   public boolean s() {
      return true;
   }

   @Nullable
   public final cpl t() {
      return this.g;
   }

   public boolean u() {
      return this.g != null;
   }

   public void a(cpq $$0, cwe $$1, bof $$2, int $$3, boolean $$4) {
   }

   public void b(cpq $$0, cwe $$1, cia $$2) {
      this.a($$0, $$1);
   }

   public void a(cpq $$0, cwe $$1) {
   }

   public boolean am_() {
      return false;
   }

   public crj c(cpq $$0) {
      return $$0.d().v() ? crj.b : crj.a;
   }

   public int b(cpq $$0) {
      if ($$0.d().v()) {
         return this.w().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cpq $$0, cwe $$1, box $$2, int $$3) {
   }

   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
   }

   public Optional<cmx> h(cpq $$0) {
      return Optional.empty();
   }

   public vs m(cpq $$0) {
      return vs.c(this.j($$0));
   }

   public boolean i(cpq $$0) {
      return $$0.F();
   }

   public cqh n(cpq $$0) {
      if (!$$0.F()) {
         return this.c;
      } else {
         switch (this.c) {
            case a:
            case b:
               return cqh.c;
            case c:
               return cqh.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean d_(cpq $$0) {
      return this.n() == 1 && this.p();
   }

   protected static eor a(cwe $$0, cia $$1, cvn.b $$2) {
      eov $$3 = $$1.br();
      eov $$4 = $$3.e($$1.f(1.0F).a($$1.gv()));
      return $$0.a(new cvn($$3, $$4, cvn.a.b, $$2, $$1));
   }

   public int e() {
      return 0;
   }

   public boolean a(cpq $$0, cpq $$1) {
      return false;
   }

   public Multimap<il<bpz>, bqc> a(bom $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cpq $$0) {
      return false;
   }

   public cpq an_() {
      return new cpq(this);
   }

   public boolean v() {
      return this.i != null;
   }

   @Nullable
   public ckr w() {
      return this.i;
   }

   public ato ao_() {
      return atp.jO;
   }

   public ato ap_() {
      return atp.jP;
   }

   public boolean x() {
      return this.f;
   }

   public boolean a(bne $$0) {
      return !this.f || !$$0.a(aug.j);
   }

   public boolean aq_() {
      return true;
   }

   @Override
   public ckl m() {
      return this.j;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cpl c;
      cqh d = cqh.a;
      @Nullable
      ckr e;
      boolean f;
      ckl g;

      public a() {
         this.g = ckn.g;
      }

      public cpl.a a(ckr $$0) {
         this.e = $$0;
         return this;
      }

      public cpl.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cpl.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cpl.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cpl.a a(cpl $$0) {
         this.c = $$0;
         return this;
      }

      public cpl.a a(cqh $$0) {
         this.d = $$0;
         return this;
      }

      public cpl.a a() {
         this.f = true;
         return this;
      }

      public cpl.a a(ckj... $$0) {
         this.g = ckn.e.a($$0);
         return this;
      }
   }
}
