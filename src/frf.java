import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frf extends fnf {
   static final alf a = new alf("icon/checkmark");
   private static final xp b = xp.c("gui.chatSelection.title");
   private static final xp c = xp.c("gui.chatSelection.context");
   @Nullable
   private final fnf d;
   private final fzf r;
   private fhg s;
   private fhz u;
   @Nullable
   private frf.a v;
   final fyy.a w;
   private final Consumer<fyy.a> x;
   private fre y;

   public frf(@Nullable fnf $$0, fzf $$1, fyy.a $$2, Consumer<fyy.a> $$3) {
      super(b);
      this.d = $$0;
      this.r = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aM_() {
      this.y = new fre(this.r, this::a);
      this.u = fhz.a(this.p, c, this.n - 16);
      this.v = this.c(new frf.a(this.m, (this.u.a() + 1) * 9));
      this.c(fhg.a(xo.k, $$0 -> this.d()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.s = this.c(fhg.a(xo.d, $$0 -> {
         this.x.accept(this.w);
         this.d();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.F();
      this.m();
      this.v.a((double)this.v.o());
   }

   private boolean a(fyu $$0) {
      return $$0.a(this.w.f());
   }

   private void m() {
      int $$0 = this.v.c();
      this.y.a($$0, this.v);
   }

   void E() {
      this.m();
   }

   void F() {
      this.s.j = !this.w.a().isEmpty();
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.r.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xp $$7 = xp.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.u.a($$0, this.n / 2, this.v.I());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   public xp i() {
      return xo.a(super.i(), c);
   }

   public class a extends fic<frf.a.b> implements fre.a {
      @Nullable
      private frf.a.c m;

      public a(final ffh $$1, final int $$2) {
         super($$1, frf.this.n, frf.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.n();
         super.a($$0);
         if ((float)this.o() > 1.0E-5F && $$0 <= 1.0E-5F && !ayz.b($$0, $$1)) {
            frf.this.E();
         }
      }

      @Override
      public void a(int $$0, fyu.a $$1) {
         boolean $$2 = $$1.a(frf.this.w.f());
         fys $$3 = $$1.h();
         ffc $$4 = $$3.a($$1.g());
         frf.a.b $$5 = new frf.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fyu.a $$0, boolean $$1) {
         frf.a.b $$2 = new frf.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         frf.a.c $$3 = new frf.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xp $$0) {
         this.c(new frf.a.f());
         this.c(new frf.a.a($$0));
         this.c(new frf.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return ayz.e(this.h, this.d);
      }

      @Override
      protected void a(fgt $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         frf.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aH_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.u() == $$9, $$3);
      }

      private boolean b(frf.a.b $$0) {
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
      protected frf.a.b b(flk $$0) {
         return this.a($$0, frf.a.b::c);
      }

      public void a(@Nullable frf.a.b $$0) {
         super.a($$0);
         frf.a.b $$1 = this.b(flk.a);
         if ($$1 == null) {
            frf.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         frf.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int I() {
         return this.F() + 9;
      }

      public class a extends frf.a.b {
         private static final int b = -6250336;
         private final xp c;

         public a(final xp $$1) {
            this.c = $$1;
         }

         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = frf.this.p.a(this.c);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(frf.this.p, this.c, $$13, $$14, -6250336);
         }

         @Override
         public xp a() {
            return this.c;
         }
      }

      public abstract class b extends fic.a<frf.a.b> {
         @Override
         public xp a() {
            return xo.a;
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

      static record c(UUID a, frf.a.b b) {
         public boolean a(frf.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends frf.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xu g;
         private final xp h;
         @Nullable
         private final List<ayl> i;
         @Nullable
         private final ffc.a j;
         @Nullable
         private final List<ayl> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xp $$2, final xp $$3, @Nullable final ffc $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, ffc::f);
            this.k = $$4 != null && $$4.g() != null ? frf.this.p.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xu $$7 = frf.this.p.a($$2, this.e() - frf.this.p.a(xo.u));
            if ($$2 != $$7) {
               this.g = xu.a($$7, xo.u);
               this.i = frf.this.p.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(frf.this.p, un.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               frf.this.b(this.i);
            }

            int $$12 = frf.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  frf.this.b(this.k);
               }
            }
         }

         private void a(fgt $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(frf.a, $$2, $$5, 9, 8);
            RenderSystem.disableBlend();
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.m ? 11 : 0;
         }

         @Override
         public xp a() {
            return (xp)(this.b() ? xp.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return flh.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return frf.this.w.b(this.f);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean d() {
            return this.l;
         }

         private boolean h() {
            if (this.l) {
               frf.this.w.a(this.f);
               frf.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends frf.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xp d;
         private final Supplier<gqb> e;
         private final boolean f;

         public e(final GameProfile $$1, final xp $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.am().a($$1);
         }

         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fif.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(frf.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends frf.a.b {
         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
