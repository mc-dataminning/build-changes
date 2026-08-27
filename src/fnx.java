import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fnx extends fjx {
   static final ajv a = new ajv("icon/checkmark");
   private static final wi b = wi.c("gui.chatSelection.title");
   private static final wi c = wi.c("gui.chatSelection.context");
   @Nullable
   private final fjx d;
   private final fvy o;
   private fdy p;
   private fer q;
   @Nullable
   private fnx.a r;
   final fvr.a s;
   private final Consumer<fvr.a> u;
   private fnw v;

   public fnx(@Nullable fjx $$0, fvy $$1, fvr.a $$2, Consumer<fvr.a> $$3) {
      super(b);
      this.d = $$0;
      this.o = $$1;
      this.s = $$2.d();
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      this.v = new fnw(this.o, this::a);
      this.q = fer.a(this.m, c, this.k - 16);
      this.r = this.c(new fnx.a(this.j, (this.q.a() + 1) * 9));
      this.c(fdy.a(wh.k, $$0 -> this.d()).a(this.k / 2 - 155, this.l - 32, 150, 20).a());
      this.p = this.c(fdy.a(wh.d, $$0 -> {
         this.u.accept(this.s);
         this.d();
      }).a(this.k / 2 - 155 + 160, this.l - 32, 150, 20).a());
      this.D();
      this.m();
      this.r.a((double)this.r.o());
   }

   private boolean a(fvn $$0) {
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
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.o.a().b();
      int $$5 = this.s.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wi $$7 = wi.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.m, $$7, this.k / 2, 16 + 9 * 3 / 2, -1);
      this.q.a($$0, this.k / 2, this.r.I());
   }

   @Override
   public void d() {
      this.j.a(this.d);
   }

   @Override
   public wi i() {
      return wh.a(super.i(), c);
   }

   public class a extends feu<fnx.a.b> implements fnw.a {
      @Nullable
      private fnx.a.c m;

      public a(fby $$1, int $$2) {
         super($$1, fnx.this.k, fnx.this.l - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.n();
         super.a($$0);
         if ((float)this.o() > 1.0E-5F && $$0 <= 1.0E-5F && !axm.b($$0, $$1)) {
            fnx.this.C();
         }
      }

      @Override
      public void a(int $$0, fvn.a $$1) {
         boolean $$2 = $$1.a(fnx.this.s.f());
         fvl $$3 = $$1.h();
         fbt $$4 = $$3.a($$1.g());
         fnx.a.b $$5 = new fnx.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fvn.a $$0, boolean $$1) {
         fnx.a.b $$2 = new fnx.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fnx.a.c $$3 = new fnx.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wi $$0) {
         this.c(new fnx.a.f());
         this.c(new fnx.a.a($$0));
         this.c(new fnx.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int d() {
         return axm.e(this.h, this.d);
      }

      @Override
      protected void a(fdl $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fnx.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aI_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.u() == $$9, $$3);
      }

      private boolean b(fnx.a.b $$0) {
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
      protected fnx.a.b b(fic $$0) {
         return this.a($$0, fnx.a.b::c);
      }

      public void a(@Nullable fnx.a.b $$0) {
         super.a($$0);
         fnx.a.b $$1 = this.b(fic.a);
         if ($$1 == null) {
            fnx.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fnx.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int I() {
         return this.F() + 9;
      }

      public class a extends fnx.a.b {
         private static final int c = -6250336;
         private final wi d;

         public a(wi $$1) {
            this.d = $$1;
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fnx.this.m.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fnx.this.m, this.d, $$13, $$14, -6250336);
         }

         @Override
         public wi a() {
            return this.d;
         }
      }

      public abstract class b extends feu.a<fnx.a.b> {
         @Override
         public wi a() {
            return wh.a;
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

      static record c(UUID a, fnx.a.b b) {
         public boolean a(fnx.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fnx.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final wn h;
         private final wi i;
         @Nullable
         private final List<awy> j;
         @Nullable
         private final fbt.a k;
         @Nullable
         private final List<awy> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, wi $$2, wi $$3, @Nullable fbt $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = x.a($$4, fbt::f);
            this.l = $$4 != null && $$4.g() != null ? fnx.this.m.c($$4.g(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            wn $$7 = fnx.this.m.a($$2, this.e() - fnx.this.m.a(wh.u));
            if ($$2 != $$7) {
               this.h = wn.a($$7, wh.u);
               this.j = fnx.this.m.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fnx.this.m, tj.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fnx.this.b(this.j);
            }

            int $$12 = fnx.this.m.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fnx.this.b(this.l);
               }
            }
         }

         private void a(fdl $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fnx.a, $$2, $$5, 9, 8);
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
         public wi a() {
            return (wi)(this.b() ? wi.a("narrator.select", this.i) : this.i);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fhz.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fnx.this.s.b(this.g);
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
               fnx.this.s.a(this.g);
               fnx.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fnx.a.b {
         private static final int c = 12;
         private static final int d = 4;
         private final wi e;
         private final Supplier<gmr> f;
         private final boolean g;

         public e(GameProfile $$1, wi $$2, boolean $$3) {
            this.e = $$2;
            this.g = $$3;
            this.f = a.this.c.an().a($$1);
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fex.a($$0, this.f.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fnx.this.m, this.e, $$10 + 12 + 4, $$12, this.g ? -1 : -1593835521);
         }
      }

      public class f extends fnx.a.b {
         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
