import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fno extends fjo {
   static final ajt a = new ajt("icon/checkmark");
   private static final wg b = wg.c("gui.chatSelection.title");
   private static final wg c = wg.c("gui.chatSelection.context");
   @Nullable
   private final fjo d;
   private final fvp o;
   private fdp p;
   private fei q;
   @Nullable
   private fno.a r;
   final fvi.a s;
   private final Consumer<fvi.a> u;
   private fnn v;

   public fno(@Nullable fjo $$0, fvp $$1, fvi.a $$2, Consumer<fvi.a> $$3) {
      super(b);
      this.d = $$0;
      this.o = $$1;
      this.s = $$2.d();
      this.u = $$3;
   }

   @Override
   protected void aN_() {
      this.v = new fnn(this.o, this::a);
      this.q = fei.a(this.m, c, this.k - 16);
      this.r = this.c(new fno.a(this.j, (this.q.a() + 1) * 9));
      this.c(fdp.a(wf.k, $$0 -> this.d()).a(this.k / 2 - 155, this.l - 32, 150, 20).a());
      this.p = this.c(fdp.a(wf.d, $$0 -> {
         this.u.accept(this.s);
         this.d();
      }).a(this.k / 2 - 155 + 160, this.l - 32, 150, 20).a());
      this.D();
      this.m();
      this.r.a((double)this.r.o());
   }

   private boolean a(fve $$0) {
      return $$0.a(this.s.f());
   }

   private void m() {
      int $$0 = this.r.d();
      this.v.a($$0, this.r);
   }

   void C() {
      this.m();
   }

   void D() {
      this.p.j = !this.s.a().isEmpty();
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.o.a().b();
      int $$5 = this.s.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wg $$7 = wg.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.m, $$7, this.k / 2, 16 + 9 * 3 / 2, -1);
      this.q.a($$0, this.k / 2, this.r.I());
   }

   @Override
   public void d() {
      this.j.a(this.d);
   }

   @Override
   public wg i() {
      return wf.a(super.i(), c);
   }

   public class a extends fel<fno.a.b> implements fnn.a {
      @Nullable
      private fno.a.c m;

      public a(fbp $$1, int $$2) {
         super($$1, fno.this.k, fno.this.l - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.n();
         super.a($$0);
         if ((float)this.o() > 1.0E-5F && $$0 <= 1.0E-5F && !axk.b($$0, $$1)) {
            fno.this.C();
         }
      }

      @Override
      public void a(int $$0, fve.a $$1) {
         boolean $$2 = $$1.a(fno.this.s.f());
         fvc $$3 = $$1.h();
         fbk $$4 = $$3.a($$1.g());
         fno.a.b $$5 = new fno.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fve.a $$0, boolean $$1) {
         fno.a.b $$2 = new fno.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fno.a.c $$3 = new fno.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wg $$0) {
         this.c(new fno.a.f());
         this.c(new fno.a.a($$0));
         this.c(new fno.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int d() {
         return axk.e(this.h, this.d);
      }

      @Override
      protected void a(fdc $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fno.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aJ_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.u() == $$9, $$3);
      }

      private boolean b(fno.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.h() == $$0;
            boolean $$2 = this.h() == null;
            boolean $$3 = this.u() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected fno.a.b b(fht $$0) {
         return this.a($$0, fno.a.b::c);
      }

      public void a(@Nullable fno.a.b $$0) {
         super.a($$0);
         fno.a.b $$1 = this.b(fht.a);
         if ($$1 == null) {
            fno.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fno.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int I() {
         return this.F() + 9;
      }

      public class a extends fno.a.b {
         private static final int c = -6250336;
         private final wg d;

         public a(wg $$1) {
            this.d = $$1;
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fno.this.m.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fno.this.m, this.d, $$13, $$14, -6250336);
         }

         @Override
         public wg a() {
            return this.d;
         }
      }

      public abstract class b extends fel.a<fno.a.b> {
         @Override
         public wg a() {
            return wf.a;
         }

         public boolean b() {
            return false;
         }

         public boolean c() {
            return false;
         }

         public boolean d() {
            return this.c();
         }
      }

      static record c(UUID a, fno.a.b b) {
         public boolean a(fno.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fno.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final wl h;
         private final wg i;
         @Nullable
         private final List<aww> j;
         @Nullable
         private final fbk.a k;
         @Nullable
         private final List<aww> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, wg $$2, wg $$3, @Nullable fbk $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = x.a($$4, fbk::f);
            this.l = $$4 != null && $$4.g() != null ? fno.this.m.c($$4.g(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            wl $$7 = fno.this.m.a($$2, this.e() - fno.this.m.a(wf.u));
            if ($$2 != $$7) {
               this.h = wl.a($$7, wf.u);
               this.j = fno.this.m.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fno.this.m, th.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fno.this.b(this.j);
            }

            int $$12 = fno.this.m.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fno.this.b(this.l);
               }
            }
         }

         private void a(fdc $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fno.a, $$2, $$5, 9, 8);
            RenderSystem.disableBlend();
         }

         private int e() {
            int $$0 = this.k != null ? this.k.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.n ? 11 : 0;
         }

         @Override
         public wg a() {
            return (wg)(this.b() ? wg.a("narrator.select", this.i) : this.i);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fhq.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fno.this.s.b(this.g);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean d() {
            return this.m;
         }

         private boolean h() {
            if (this.m) {
               fno.this.s.a(this.g);
               fno.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fno.a.b {
         private static final int c = 12;
         private static final int d = 4;
         private final wg e;
         private final Supplier<gmi> f;
         private final boolean g;

         public e(GameProfile $$1, wg $$2, boolean $$3) {
            this.e = $$2;
            this.g = $$3;
            this.f = a.this.c.an().a($$1);
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            feo.a($$0, this.f.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fno.this.m, this.e, $$10 + 12 + 4, $$12, this.g ? -1 : -1593835521);
         }
      }

      public class f extends fno.a.b {
         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
