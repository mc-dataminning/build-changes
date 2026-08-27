import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fev extends fau {
   static final agi a = new agi("icon/checkmark");
   private static final ur b = ur.c("gui.chatSelection.title");
   private static final ur c = ur.c("gui.chatSelection.context").a(n.h);
   @Nullable
   private final fau k;
   private final fmm l;
   private euz m;
   private evs n;
   @Nullable
   private fev.a o;
   final fmf.a p;
   private final Consumer<fmf.a> q;
   private feu r;

   public fev(@Nullable fau $$0, fmm $$1, fmf.a $$2, Consumer<fmf.a> $$3) {
      super(b);
      this.k = $$0;
      this.l = $$1;
      this.p = $$2.d();
      this.q = $$3;
   }

   @Override
   protected void aP_() {
      this.r = new feu(this.l, this::a);
      this.n = evs.a(this.i, c, this.g - 16);
      this.o = new fev.a(this.f, (this.n.a() + 1) * 9);
      this.e(this.o);
      this.d(euz.a(uq.k, $$0 -> this.aF_()).a(this.g / 2 - 155, this.h - 32, 150, 20).a());
      this.m = this.d(euz.a(uq.d, $$0 -> {
         this.q.accept(this.p);
         this.aF_();
      }).a(this.g / 2 - 155 + 160, this.h - 32, 150, 20).a());
      this.D();
      this.l();
      this.o.a((double)this.o.m());
   }

   private boolean a(fmb $$0) {
      return $$0.a(this.p.f());
   }

   private void l() {
      int $$0 = this.o.e();
      this.r.a($$0, this.o);
   }

   @Override
   void C() {
      this.l();
   }

   void D() {
      this.m.i = !this.p.a().isEmpty();
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.o.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      AbuseReportLimits $$4 = this.l.a().b();
      int $$5 = this.p.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      ur $$7 = ur.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.i, $$7, this.g / 2, 16 + 9 * 3 / 2, 10526880);
      this.n.a($$0, this.g / 2, this.o.v());
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void aF_() {
      this.f.a(this.k);
   }

   @Override
   public ur h() {
      return uq.a(super.h(), c);
   }

   public class a extends evv<fev.a.b> implements feu.a {
      @Nullable
      private fev.a.c m;

      public a(etd $$1, int $$2) {
         super($$1, fev.this.g, fev.this.h, 40, fev.this.h - 40 - $$2, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.l();
         super.a($$0);
         if ((float)this.m() > 1.0E-5F && $$0 <= 1.0E-5F && !atm.b($$0, $$1)) {
            fev.this.C();
         }
      }

      @Override
      public void a(int $$0, fmb.a $$1) {
         boolean $$2 = $$1.a(fev.this.p.f());
         flz $$3 = $$1.h();
         esy $$4 = $$3.a($$1.g());
         fev.a.b $$5 = new fev.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fmb.a $$0, boolean $$1) {
         fev.a.b $$2 = new fev.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fev.a.c $$3 = new fev.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(ur $$0) {
         this.c(new fev.a.f());
         this.c(new fev.a.a($$0));
         this.c(new fev.a.f());
         this.m = null;
      }

      @Override
      protected int c() {
         return (this.e + this.b()) / 2;
      }

      @Override
      public int b() {
         return Math.min(350, this.e - 50);
      }

      public int e() {
         return atm.e(this.h - this.g, this.d);
      }

      @Override
      protected void a(euo $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fev.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.f() == $$9;
            int $$11 = this.aJ_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.r() == $$9, $$3);
      }

      private boolean b(fev.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.f() == $$0;
            boolean $$2 = this.f() == null;
            boolean $$3 = this.r() == $$0;
            return $$1 || $$2 && $$3 && $$0.e();
         } else {
            return false;
         }
      }

      @Nullable
      protected fev.a.b b(eza $$0) {
         return this.a($$0, fev.a.b::c);
      }

      public void a(@Nullable fev.a.b $$0) {
         super.a($$0);
         fev.a.b $$1 = this.b(eza.a);
         if ($$1 == null) {
            fev.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fev.a.b $$3 = this.f();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int v() {
         return this.h + 9;
      }

      public class a extends fev.a.b {
         private static final int c = -6250336;
         private final ur d;

         public a(ur $$1) {
            this.d = $$1;
         }

         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fev.this.i.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fev.this.i, this.d, $$13, $$14, -6250336);
         }

         @Override
         public ur a() {
            return this.d;
         }
      }

      public abstract class b extends evv.a<fev.a.b> {
         @Override
         public ur a() {
            return uq.a;
         }

         public boolean b() {
            return false;
         }

         public boolean c() {
            return false;
         }

         public boolean e() {
            return this.c();
         }
      }

      static record c(UUID a, fev.a.b b) {
         public boolean a(fev.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fev.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final uw h;
         private final ur i;
         @Nullable
         private final List<asy> j;
         @Nullable
         private final esy.a k;
         @Nullable
         private final List<asy> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, ur $$2, ur $$3, @Nullable esy $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = x.a($$4, esy::f);
            this.l = $$4 != null && $$4.g() != null ? fev.this.i.c($$4.g(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            uw $$7 = fev.this.i.a($$2, this.f() - fev.this.i.a(uq.t));
            if ($$2 != $$7) {
               this.h = uw.a($$7, uq.t);
               this.j = fev.this.i.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fev.this.i, ru.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fev.this.b(this.j);
            }

            int $$12 = fev.this.i.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fev.this.b(this.l);
               }
            }
         }

         private void a(euo $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fev.a, $$2, $$5, 9, 8);
            RenderSystem.disableBlend();
         }

         private int f() {
            int $$0 = this.k != null ? this.k.c + 4 : 0;
            return a.this.b() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.n ? 11 : 0;
         }

         @Override
         public ur a() {
            return (ur)(this.b() ? ur.a("narrator.select", this.i) : this.i);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return eyx.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fev.this.p.b(this.g);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean e() {
            return this.m;
         }

         private boolean h() {
            if (this.m) {
               fev.this.p.a(this.g);
               fev.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fev.a.b {
         private static final int c = 12;
         private final ur d;
         private final Supplier<gcu> e;
         private final boolean f;

         public e(GameProfile $$1, ur $$2, boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.ak().a($$1);
         }

         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 - 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            evy.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fev.this.i, this.d, $$3, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fev.a.b {
         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
