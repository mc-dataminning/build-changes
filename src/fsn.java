import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsn extends fod {
   static final akr a = akr.b("icon/checkmark");
   private static final wz b = wz.c("gui.chatSelection.title");
   private static final wz c = wz.c("gui.chatSelection.context");
   @Nullable
   private final fod r;
   private final gao s;
   private fim u;
   private fjf v;
   @Nullable
   private fsn.a w;
   final gah.a x;
   private final Consumer<gah.a> y;
   private fsm z;

   public fsn(@Nullable fod $$0, gao $$1, gah.a $$2, Consumer<gah.a> $$3) {
      super(b);
      this.r = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aT_() {
      this.z = new fsm(this.s, this::a);
      this.v = fjf.a(this.o, c, this.m - 16);
      this.w = this.c(new fsn.a(this.l, (this.v.a() + 1) * 9));
      this.c(fim.a(wy.k, $$0 -> this.d()).a(this.m / 2 - 155, this.n - 32, 150, 20).a());
      this.u = this.c(fim.a(wy.d, $$0 -> {
         this.y.accept(this.x);
         this.d();
      }).a(this.m / 2 - 155 + 160, this.n - 32, 150, 20).a());
      this.D();
      this.m();
      this.w.b((double)this.w.p());
   }

   private boolean a(gad $$0) {
      return $$0.a(this.x.f());
   }

   private void m() {
      int $$0 = this.w.c();
      this.z.a($$0, this.w);
   }

   void C() {
      this.m();
   }

   void D() {
      this.u.j = !this.x.a().isEmpty();
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wz $$7 = wz.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.o, $$7, this.m / 2, 16 + 9 * 3 / 2, -1);
      this.v.a($$0, this.m / 2, this.w.J());
   }

   @Override
   public void d() {
      this.l.a(this.r);
   }

   @Override
   public wz i() {
      return wy.a(super.i(), c);
   }

   public class a extends fji<fsn.a.b> implements fsm.a {
      @Nullable
      private fsn.a.c m;

      public a(final fgo $$1, final int $$2) {
         super($$1, fsn.this.m, fsn.this.n - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !ayo.b($$0, $$1)) {
            fsn.this.C();
         }
      }

      @Override
      public void a(int $$0, gad.a $$1) {
         boolean $$2 = $$1.a(fsn.this.x.f());
         gab $$3 = $$1.h();
         fgj $$4 = $$3.a($$1.g());
         fsn.a.b $$5 = new fsn.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gad.a $$0, boolean $$1) {
         fsn.a.b $$2 = new fsn.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fsn.a.c $$3 = new fsn.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wz $$0) {
         this.c(new fsn.a.f());
         this.c(new fsn.a.a($$0));
         this.c(new fsn.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return ayo.e(this.h, this.d);
      }

      @Override
      protected void a(fhz $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fsn.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aO_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(fsn.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.h() == $$0;
            boolean $$2 = this.h() == null;
            boolean $$3 = this.v() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected fsn.a.b b(fmq $$0) {
         return this.a($$0, fsn.a.b::c);
      }

      public void a(@Nullable fsn.a.b $$0) {
         super.a($$0);
         fsn.a.b $$1 = this.b(fmq.a);
         if ($$1 == null) {
            fsn.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fsn.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends fsn.a.b {
         private static final int b = -6250336;
         private final wz c;

         public a(final wz $$1) {
            this.c = $$1;
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fsn.this.o.a(this.c);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fsn.this.o, this.c, $$13, $$14, -6250336);
         }

         @Override
         public wz a() {
            return this.c;
         }
      }

      public abstract class b extends fji.a<fsn.a.b> {
         @Override
         public wz a() {
            return wy.a;
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

      static record c(UUID a, fsn.a.b b) {
         public boolean a(fsn.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fsn.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xe g;
         private final wz h;
         @Nullable
         private final List<aya> i;
         @Nullable
         private final fgj.a j;
         @Nullable
         private final List<aya> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wz $$2, final wz $$3, @Nullable final fgj $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fgj::f);
            this.k = $$4 != null && $$4.g() != null ? fsn.this.o.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xe $$7 = fsn.this.o.a($$2, this.e() - fsn.this.o.a(wy.u));
            if ($$2 != $$7) {
               this.g = xe.a($$7, wy.u);
               this.i = fsn.this.o.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fsn.this.o, tw.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fsn.this.b(this.i);
            }

            int $$12 = fsn.this.o.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fsn.this.b(this.k);
               }
            }
         }

         private void a(fhz $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fsn.a, $$2, $$5, 9, 8);
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
         public wz a() {
            return (wz)(this.b() ? wz.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fmn.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fsn.this.x.b(this.f);
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
               fsn.this.x.a(this.f);
               fsn.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fsn.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wz d;
         private final Supplier<grl> e;
         private final boolean f;

         public e(final GameProfile $$1, final wz $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.am().a($$1);
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fjl.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fsn.this.o, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fsn.a.b {
         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
