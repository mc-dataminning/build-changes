import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frt extends fnl {
   static final akk a = new akk("icon/checkmark");
   private static final wu b = wu.c("gui.chatSelection.title");
   private static final wu c = wu.c("gui.chatSelection.context");
   @Nullable
   private final fnl q;
   private final fzu r;
   private fhu s;
   private fin u;
   @Nullable
   private frt.a v;
   final fzn.a w;
   private final Consumer<fzn.a> x;
   private frs y;

   public frt(@Nullable fnl $$0, fzu $$1, fzn.a $$2, Consumer<fzn.a> $$3) {
      super(b);
      this.q = $$0;
      this.r = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aP_() {
      this.y = new frs(this.r, this::a);
      this.u = fin.a(this.o, c, this.m - 16);
      this.v = this.c(new frt.a(this.l, (this.u.a() + 1) * 9));
      this.c(fhu.a(wt.k, $$0 -> this.d()).a(this.m / 2 - 155, this.n - 32, 150, 20).a());
      this.s = this.c(fhu.a(wt.d, $$0 -> {
         this.x.accept(this.w);
         this.d();
      }).a(this.m / 2 - 155 + 160, this.n - 32, 150, 20).a());
      this.E();
      this.m();
      this.v.b((double)this.v.p());
   }

   private boolean a(fzj $$0) {
      return $$0.a(this.w.f());
   }

   private void m() {
      int $$0 = this.v.c();
      this.y.a($$0, this.v);
   }

   void D() {
      this.m();
   }

   void E() {
      this.s.j = !this.w.a().isEmpty();
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.r.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wu $$7 = wu.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.o, $$7, this.m / 2, 16 + 9 * 3 / 2, -1);
      this.u.a($$0, this.m / 2, this.v.J());
   }

   @Override
   public void d() {
      this.l.a(this.q);
   }

   @Override
   public wu i() {
      return wt.a(super.i(), c);
   }

   public class a extends fiq<frt.a.b> implements frs.a {
      @Nullable
      private frt.a.c m;

      public a(final ffw $$1, final int $$2) {
         super($$1, frt.this.m, frt.this.n - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !ayg.b($$0, $$1)) {
            frt.this.D();
         }
      }

      @Override
      public void a(int $$0, fzj.a $$1) {
         boolean $$2 = $$1.a(frt.this.w.f());
         fzh $$3 = $$1.h();
         ffr $$4 = $$3.a($$1.g());
         frt.a.b $$5 = new frt.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fzj.a $$0, boolean $$1) {
         frt.a.b $$2 = new frt.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         frt.a.c $$3 = new frt.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wu $$0) {
         this.c(new frt.a.f());
         this.c(new frt.a.a($$0));
         this.c(new frt.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return ayg.e(this.h, this.d);
      }

      @Override
      protected void a(fhh $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         frt.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aK_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(frt.a.b $$0) {
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
      protected frt.a.b b(fly $$0) {
         return this.a($$0, frt.a.b::c);
      }

      public void a(@Nullable frt.a.b $$0) {
         super.a($$0);
         frt.a.b $$1 = this.b(fly.a);
         if ($$1 == null) {
            frt.this.D();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         frt.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends frt.a.b {
         private static final int b = -6250336;
         private final wu c;

         public a(final wu $$1) {
            this.c = $$1;
         }

         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = frt.this.o.a(this.c);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(frt.this.o, this.c, $$13, $$14, -6250336);
         }

         @Override
         public wu a() {
            return this.c;
         }
      }

      public abstract class b extends fiq.a<frt.a.b> {
         @Override
         public wu a() {
            return wt.a;
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

      static record c(UUID a, frt.a.b b) {
         public boolean a(frt.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends frt.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final wz g;
         private final wu h;
         @Nullable
         private final List<axs> i;
         @Nullable
         private final ffr.a j;
         @Nullable
         private final List<axs> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wu $$2, final wu $$3, @Nullable final ffr $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, ffr::f);
            this.k = $$4 != null && $$4.g() != null ? frt.this.o.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            wz $$7 = frt.this.o.a($$2, this.e() - frt.this.o.a(wt.u));
            if ($$2 != $$7) {
               this.g = wz.a($$7, wt.u);
               this.i = frt.this.o.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(frt.this.o, ts.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               frt.this.b(this.i);
            }

            int $$12 = frt.this.o.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  frt.this.b(this.k);
               }
            }
         }

         private void a(fhh $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(frt.a, $$2, $$5, 9, 8);
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
         public wu a() {
            return (wu)(this.b() ? wu.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return flv.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return frt.this.w.b(this.f);
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
               frt.this.w.a(this.f);
               frt.this.E();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends frt.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wu d;
         private final Supplier<gqq> e;
         private final boolean f;

         public e(final GameProfile $$1, final wu $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.am().a($$1);
         }

         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fit.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(frt.this.o, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends frt.a.b {
         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
