import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class blj implements Comparable<blj> {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = -1;
   private static final String c = "id";
   private static final String d = "ambient";
   private static final String e = "hidden_effect";
   private static final String f = "amplifier";
   private static final String g = "duration";
   private static final String h = "show_particles";
   private static final String i = "show_icon";
   private final ih<blh> j;
   private int k;
   private int l;
   private boolean m;
   private boolean n;
   private boolean o;
   @Nullable
   private blj p;
   private final blj.a q = new blj.a();

   public blj(ih<blh> $$0) {
      this($$0, 0, 0);
   }

   public blj(ih<blh> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public blj(ih<blh> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public blj(ih<blh> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public blj(ih<blh> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public blj(ih<blh> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable blj $$6) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
   }

   public blj(blj $$0) {
      this.j = $$0.j;
      this.a($$0);
   }

   public float a(bmo $$0, float $$1) {
      return this.q.a($$0, $$1);
   }

   void a(blj $$0) {
      this.k = $$0.k;
      this.l = $$0.l;
      this.m = $$0.m;
      this.n = $$0.n;
      this.o = $$0.o;
   }

   public boolean b(blj $$0) {
      if (!this.j.equals($$0.j)) {
         b.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.l > this.l) {
         if ($$0.e(this)) {
            blj $$2 = this.p;
            this.p = new blj(this);
            this.p.p = $$2;
         }

         this.l = $$0.l;
         this.k = $$0.k;
         $$1 = true;
      } else if (this.e($$0)) {
         if ($$0.l == this.l) {
            this.k = $$0.k;
            $$1 = true;
         } else if (this.p == null) {
            this.p = new blj($$0);
         } else {
            this.p.b($$0);
         }
      }

      if (!$$0.m && this.m || $$1) {
         this.m = $$0.m;
         $$1 = true;
      }

      if ($$0.n != this.n) {
         this.n = $$0.n;
         $$1 = true;
      }

      if ($$0.o != this.o) {
         this.o = $$0.o;
         $$1 = true;
      }

      return $$1;
   }

   private boolean e(blj $$0) {
      return !this.a() && (this.k < $$0.k || $$0.a());
   }

   public boolean a() {
      return this.k == -1;
   }

   public boolean a(int $$0) {
      return !this.a() && this.k <= $$0;
   }

   public int a(Int2IntFunction $$0) {
      return !this.a() && this.k != 0 ? $$0.applyAsInt(this.k) : this.k;
   }

   public ih<blh> b() {
      return this.j;
   }

   public int c() {
      return this.k;
   }

   public int d() {
      return this.l;
   }

   public boolean e() {
      return this.m;
   }

   public boolean f() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }

   public boolean a(bmo $$0, Runnable $$1) {
      if (this.j()) {
         int $$2 = this.a() ? $$0.ah : this.k;
         if (this.j.a().a($$2, this.l) && !this.j.a().a($$0, this.l)) {
            $$0.e(this.j);
         }

         this.k();
         if (this.k == 0 && this.p != null) {
            this.a(this.p);
            this.p = this.p.p;
            $$1.run();
         }
      }

      this.q.b(this);
      return this.j();
   }

   private boolean j() {
      return this.a() || this.k > 0;
   }

   private int k() {
      if (this.p != null) {
         this.p.k();
      }

      return this.k = this.a($$0 -> $$0 - 1);
   }

   public void a(bmo $$0) {
      this.j.a().b($$0, this.l);
   }

   public String h() {
      return this.j.a().d();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.l > 0) {
         $$0 = this.h() + " x " + (this.l + 1) + ", Duration: " + this.l();
      } else {
         $$0 = this.h() + ", Duration: " + this.l();
      }

      if (!this.n) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.o) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String l() {
      return this.a() ? "infinite" : Integer.toString(this.k);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof blj $$1) ? false : this.k == $$1.k && this.l == $$1.l && this.m == $$1.m && this.j.equals($$1.j);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.j.hashCode();
      $$0 = 31 * $$0 + this.k;
      $$0 = 31 * $$0 + this.l;
      return 31 * $$0 + (this.m ? 1 : 0);
   }

   public so a(so $$0) {
      ahh $$1 = this.j.e().orElseThrow().a();
      $$0.a("id", $$1.toString());
      this.c($$0);
      return $$0;
   }

   private void c(so $$0) {
      $$0.a("amplifier", (byte)this.d());
      $$0.a("duration", this.c());
      $$0.a("ambient", this.e());
      $$0.a("show_particles", this.f());
      $$0.a("show_icon", this.g());
      if (this.p != null) {
         so $$1 = new so();
         this.p.a($$1);
         $$0.a("hidden_effect", $$1);
      }
   }

   @Nullable
   public static blj b(so $$0) {
      ahh $$1 = ahh.a($$0.l("id"));
      return $$1 == null ? null : kd.d.c($$1).map($$1x -> a($$1x, $$0)).orElse(null);
   }

   private static blj a(ih<blh> $$0, so $$1) {
      int $$2 = $$1.f("amplifier");
      int $$3 = $$1.h("duration");
      boolean $$4 = $$1.q("ambient");
      boolean $$5 = true;
      if ($$1.b("show_particles", 1)) {
         $$5 = $$1.q("show_particles");
      }

      boolean $$6 = $$5;
      if ($$1.b("show_icon", 1)) {
         $$6 = $$1.q("show_icon");
      }

      blj $$7 = null;
      if ($$1.b("hidden_effect", 10)) {
         $$7 = a($$0, $$1.p("hidden_effect"));
      }

      return new blj($$0, $$3, Math.max($$2, 0), $$4, $$5, $$6, $$7);
   }

   public int c(blj $$0) {
      int $$1 = 32147;
      return (this.c() <= 32147 || $$0.c() <= 32147) && (!this.e() || !$$0.e())
         ? ComparisonChain.start()
            .compareFalseFirst(this.e(), $$0.e())
            .compareFalseFirst(this.a(), $$0.a())
            .compare(this.c(), $$0.c())
            .compare(this.b().a().g(), $$0.b().a().g())
            .result()
         : ComparisonChain.start().compare(this.e(), $$0.e()).compare(this.b().a().g(), $$0.b().a().g()).result();
   }

   public boolean a(ih<blh> $$0) {
      return this.j.equals($$0);
   }

   public void d(blj $$0) {
      this.q.a($$0.q);
   }

   public void i() {
      this.q.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(blj $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(blj.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(blj $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + aup.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(blj $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(blj $$0) {
         return $$0.b().a().b();
      }

      public float a(bmo $$0, float $$1) {
         if ($$0.dG()) {
            this.b = this.a;
         }

         return aup.i($$1, this.b, this.a);
      }
   }
}
