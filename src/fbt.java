import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fbt extends exv {
   static final aep a = new aep("icon/checkmark");
   private static final te b = te.c("gui.chatSelection.title");
   private static final te c = te.c("gui.chatSelection.context").a(n.h);
   @Nullable
   private final exv k;
   private final fjc l;
   private esi m;
   private etb n;
   @Nullable
   private fbt.a o;
   final fiy p;
   private final Consumer<fiy> q;
   private fbs s;

   public fbt(@Nullable exv $$0, fjc $$1, fiy $$2, Consumer<fiy> $$3) {
      super(b);
      this.k = $$0;
      this.l = $$1;
      this.p = $$2.h();
      this.q = $$3;
   }

   @Override
   protected void aE_() {
      this.s = new fbs(this.l, this::a);
      this.n = etb.a(this.i, c, this.g - 16);
      this.o = new fbt.a(this.f, (this.n.a() + 1) * 9);
      this.e(this.o);
      this.d(esi.a(td.k, $$0 -> this.au_()).a(this.g / 2 - 155, this.h - 32, 150, 20).a());
      this.m = this.d(esi.a(td.d, $$0 -> {
         this.q.accept(this.p);
         this.au_();
      }).a(this.g / 2 - 155 + 160, this.h - 32, 150, 20).a());
      this.C();
      this.l();
      this.o.a((double)this.o.m());
   }

   private boolean a(fiu $$0) {
      return $$0.a(this.p.b());
   }

   private void l() {
      int $$0 = this.o.d();
      this.s.a($$0, this.o);
   }

   @Override
   void B() {
      this.l();
   }

   void C() {
      this.m.i = !this.p.c().isEmpty();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.o.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      AbuseReportLimits $$4 = this.l.a().b();
      int $$5 = this.p.c().size();
      int $$6 = $$4.maxReportedMessageCount();
      te $$7 = te.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.i, $$7, this.g / 2, 16 + 9 * 3 / 2, 10526880);
      this.n.a($$0, this.g / 2, this.o.e());
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void au_() {
      this.f.a(this.k);
   }

   @Override
   public te e() {
      return td.a(super.e(), c);
   }

   public class a extends ete<fbt.a.b> implements fbs.a {
      @Nullable
      private fbt.a.c l;

      public a(eqn $$1, int $$2) {
         super($$1, fbt.this.g, fbt.this.h, 40, fbt.this.h - 40 - $$2, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.l();
         super.a($$0);
         if ((float)this.m() > 1.0E-5F && $$0 <= 1.0E-5F && !aro.b($$0, $$1)) {
            fbt.this.B();
         }
      }

      @Override
      public void a(int $$0, fiu.a $$1) {
         boolean $$2 = $$1.a(fbt.this.p.b());
         fis $$3 = $$1.h();
         eqi $$4 = $$3.a($$1.g());
         fbt.a.b $$5 = new fbt.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fiu.a $$0, boolean $$1) {
         fbt.a.b $$2 = new fbt.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fbt.a.c $$3 = new fbt.a.c($$0.e(), $$2);
         if (this.l != null && this.l.a($$3)) {
            this.d(this.l.b());
         }

         this.l = $$3;
      }

      @Override
      public void a(te $$0) {
         this.c(new fbt.a.f());
         this.c(new fbt.a.a($$0));
         this.c(new fbt.a.f());
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
         return aro.e(this.g - this.f, this.c);
      }

      @Override
      protected void a(erx $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fbt.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.f() == $$9;
            int $$11 = this.ax_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.r() == $$9, $$3);
      }

      private boolean b(fbt.a.b $$0) {
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
      protected fbt.a.b b(ewb $$0) {
         return this.a($$0, fbt.a.b::d);
      }

      public void a(@Nullable fbt.a.b $$0) {
         super.a($$0);
         fbt.a.b $$1 = this.b(ewb.a);
         if ($$1 == null) {
            fbt.this.B();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fbt.a.b $$3 = this.f();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int e() {
         return this.g + 9;
      }

      public class a extends fbt.a.b {
         private static final int c = -6250336;
         private final te d;

         public a(te $$1) {
            this.d = $$1;
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fbt.this.i.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fbt.this.i, this.d, $$13, $$14, -6250336);
         }

         @Override
         public te a() {
            return this.d;
         }
      }

      public abstract class b extends ete.a<fbt.a.b> {
         @Override
         public te a() {
            return td.a;
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

      static record c(UUID a, fbt.a.b b) {
         public boolean a(fbt.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fbt.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final ti h;
         private final te i;
         @Nullable
         private final List<ara> j;
         @Nullable
         private final eqi.a k;
         @Nullable
         private final List<ara> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, te $$2, te $$3, @Nullable eqi $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = x.a($$4, eqi::e);
            this.l = $$4 != null && $$4.f() != null ? fbt.this.i.c($$4.f(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            ti $$7 = fbt.this.i.a($$2, this.f() - fbt.this.i.a(td.t));
            if ($$2 != $$7) {
               this.h = ti.a($$7, td.t);
               this.j = fbt.this.i.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fbt.this.i, qn.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fbt.this.b(this.j);
            }

            int $$12 = fbt.this.i.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fbt.this.b(this.l);
               }
            }
         }

         private void a(erx $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fbt.a, $$2, $$5, 9, 8);
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
         public te a() {
            return (te)(this.b() ? te.a("narrator.select", this.i) : this.i);
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
            return evy.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fbt.this.p.b(this.g);
         }

         @Override
         public boolean d() {
            return true;
         }

         @Override
         public boolean e() {
            return this.m;
         }

         private boolean h() {
            if (this.m) {
               fbt.this.p.a(this.g);
               fbt.this.C();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fbt.a.b {
         private static final int c = 12;
         private final te d;
         private final Supplier<fzg> e;
         private final boolean f;

         public e(GameProfile $$1, te $$2, boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.b.ak().a($$1);
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 - 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            eth.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fbt.this.i, this.d, $$3, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fbt.a.b {
         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
