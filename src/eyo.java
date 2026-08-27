import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eyo extends euq {
   private static final sw a = sw.c("gui.chatSelection.title");
   private static final sw b = sw.c("gui.chatSelection.context").a(n.h);
   @Nullable
   private final euq c;
   private final ffs k;
   private epi l;
   private epz m;
   @Nullable
   private eyo.a n;
   final ffo o;
   private final Consumer<ffo> p;
   private eyn q;

   public eyo(@Nullable euq $$0, ffs $$1, ffo $$2, Consumer<ffo> $$3) {
      super(a);
      this.c = $$0;
      this.k = $$1;
      this.o = $$2.h();
      this.p = $$3;
   }

   @Override
   protected void b() {
      this.q = new eyn(this.k, this::a);
      this.m = epz.a(this.i, b, this.g - 16);
      this.n = new eyo.a(this.f, (this.m.a() + 1) * 9);
      this.n.b(false);
      this.e(this.n);
      this.d(epi.a(sv.k, $$0 -> this.aw_()).a(this.g / 2 - 155, this.h - 32, 150, 20).a());
      this.l = this.d(epi.a(sv.d, $$0 -> {
         this.p.accept(this.o);
         this.aw_();
      }).a(this.g / 2 - 155 + 160, this.h - 32, 150, 20).a());
      this.C();
      this.l();
      this.n.a((double)this.n.m());
   }

   private boolean a(ffk $$0) {
      return $$0.a(this.o.b());
   }

   private void l() {
      int $$0 = this.n.d();
      this.q.a($$0, this.n);
   }

   @Override
   void B() {
      this.l();
   }

   void C() {
      this.l.r = !this.o.c().isEmpty();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.n.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      AbuseReportLimits $$4 = this.k.a().b();
      int $$5 = this.o.c().size();
      int $$6 = $$4.maxReportedMessageCount();
      sw $$7 = sw.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.i, $$7, this.g / 2, 16 + 9 * 3 / 2, 10526880);
      this.m.a($$0, this.g / 2, this.n.e());
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void aw_() {
      this.f.a(this.c);
   }

   @Override
   public sw au_() {
      return sv.a(super.au_(), b);
   }

   public class a extends eqc<eyo.a.b> implements eyn.a {
      @Nullable
      private eyo.a.c l;

      public a(enn $$1, int $$2) {
         super($$1, eyo.this.g, eyo.this.h, 40, eyo.this.h - 40 - $$2, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.l();
         super.a($$0);
         if ((float)this.m() > 1.0E-5F && $$0 <= 1.0E-5F && !apa.b($$0, $$1)) {
            eyo.this.B();
         }
      }

      @Override
      public void a(int $$0, ffk.a $$1) {
         boolean $$2 = $$1.a(eyo.this.o.b());
         ffi $$3 = $$1.h();
         eni $$4 = $$3.a($$1.g());
         eyo.a.b $$5 = new eyo.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(ffk.a $$0, boolean $$1) {
         eyo.a.b $$2 = new eyo.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         eyo.a.c $$3 = new eyo.a.c($$0.e(), $$2);
         if (this.l != null && this.l.a($$3)) {
            this.d(this.l.b());
         }

         this.l = $$3;
      }

      @Override
      public void a(sw $$0) {
         this.c(new eyo.a.f());
         this.c(new eyo.a.a($$0));
         this.c(new eyo.a.f());
         this.l = null;
      }

      @Override
      protected int c() {
         return (this.d + this.b()) / 2;
      }

      @Override
      public int b() {
         return Math.min(350, this.d - 50);
      }

      public int d() {
         return apa.e(this.g - this.f, this.c);
      }

      @Override
      protected void a(eox $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         eyo.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.f() == $$9;
            int $$11 = this.aB_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.r() == $$9, $$3);
      }

      private boolean b(eyo.a.b $$0) {
         if ($$0.d()) {
            boolean $$1 = this.f() == $$0;
            boolean $$2 = this.f() == null;
            boolean $$3 = this.r() == $$0;
            return $$1 || $$2 && $$3 && $$0.e();
         } else {
            return false;
         }
      }

      @Nullable
      protected eyo.a.b b(esx $$0) {
         return this.a($$0, eyo.a.b::d);
      }

      public void a(@Nullable eyo.a.b $$0) {
         super.a($$0);
         eyo.a.b $$1 = this.b(esx.a);
         if ($$1 == null) {
            eyo.this.B();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         eyo.a.b $$3 = this.f();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int e() {
         return this.g + 9;
      }

      public class a extends eyo.a.b {
         private static final int c = -6250336;
         private final sw d;

         public a(sw $$1) {
            this.d = $$1;
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = eyo.this.i.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(eyo.this.i, this.d, $$13, $$14, -6250336);
         }

         @Override
         public sw a() {
            return this.d;
         }
      }

      public abstract class b extends eqc.a<eyo.a.b> {
         @Override
         public sw a() {
            return sv.a;
         }

         public boolean b() {
            return false;
         }

         public boolean d() {
            return false;
         }

         public boolean e() {
            return this.d();
         }
      }

      static record c(UUID a, eyo.a.b b) {
         public boolean a(eyo.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends eyo.a.b {
         private static final acq c = new acq("minecraft", "textures/gui/checkmark.png");
         private static final int d = 9;
         private static final int e = 8;
         private static final int f = 11;
         private static final int g = 4;
         private final int h;
         private final ta i;
         private final sw j;
         @Nullable
         private final List<aom> k;
         @Nullable
         private final eni.a l;
         @Nullable
         private final List<aom> m;
         private final boolean n;
         private final boolean o;

         public d(int $$1, sw $$2, sw $$3, @Nullable eni $$4, boolean $$5, boolean $$6) {
            this.h = $$1;
            this.l = x.a($$4, eni::e);
            this.m = $$4 != null && $$4.f() != null ? eyo.this.i.c($$4.f(), a.this.b()) : null;
            this.n = $$5;
            this.o = $$6;
            ta $$7 = eyo.this.i.a($$2, this.f() - eyo.this.i.a(sv.s));
            if ($$2 != $$7) {
               this.i = ta.a($$7, sv.s);
               this.k = eyo.this.i.c($$2, a.this.b());
            } else {
               this.i = $$2;
               this.k = null;
            }

            this.j = $$3;
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.n) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(eyo.this.i, qm.a().a(this.i), $$10, $$11, this.n ? -1 : -1593835521);
            if (this.k != null && $$8) {
               eyo.this.b(this.k);
            }

            int $$12 = eyo.this.i.a(this.i);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.l != null) {
               int $$6 = $$2 + ($$3 - this.l.e) / 2;
               this.l.a($$0, $$1, $$6);
               if (this.m != null && $$4 >= $$1 && $$4 <= $$1 + this.l.d && $$5 >= $$6 && $$5 <= $$6 + this.l.e) {
                  eyo.this.b(this.m);
               }
            }
         }

         private void a(eox $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(c, $$2, $$5, 0.0F, 0.0F, 9, 8, 9, 8);
            RenderSystem.disableBlend();
         }

         private int f() {
            int $$0 = this.l != null ? this.l.d + 4 : 0;
            return a.this.b() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.o ? 11 : 0;
         }

         @Override
         public sw a() {
            return (sw)(this.b() ? sw.a("narrator.select", this.j) : this.j);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               a.this.a(null);
               return this.h();
            } else {
               return false;
            }
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return esu.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return eyo.this.o.b(this.h);
         }

         @Override
         public boolean d() {
            return true;
         }

         @Override
         public boolean e() {
            return this.n;
         }

         private boolean h() {
            if (this.n) {
               eyo.this.o.a(this.h);
               eyo.this.C();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends eyo.a.b {
         private static final int c = 12;
         private final sw d;
         private final acq e;
         private final boolean f;

         public e(GameProfile $$1, sw $$2, boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.b.ak().b($$1);
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 - 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            eqf.a($$0, this.e, $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(eyo.this.i, this.d, $$3, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends eyo.a.b {
         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
