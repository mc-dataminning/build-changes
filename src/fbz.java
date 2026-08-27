import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fbz extends eya {
   static final aer a = new aer("icon/checkmark");
   private static final tf b = tf.c("gui.chatSelection.title");
   private static final tf c = tf.c("gui.chatSelection.context").a(n.h);
   @Nullable
   private final eya k;
   private final fjp l;
   private esg m;
   private esz n;
   @Nullable
   private fbz.a o;
   final fji.a p;
   private final Consumer<fji.a> q;
   private fby s;

   public fbz(@Nullable eya $$0, fjp $$1, fji.a $$2, Consumer<fji.a> $$3) {
      super(b);
      this.k = $$0;
      this.l = $$1;
      this.p = $$2.d();
      this.q = $$3;
   }

   @Override
   protected void aC_() {
      this.s = new fby(this.l, this::a);
      this.n = esz.a(this.i, c, this.g - 16);
      this.o = new fbz.a(this.f, (this.n.a() + 1) * 9);
      this.e(this.o);
      this.d(esg.a(te.k, $$0 -> this.at_()).a(this.g / 2 - 155, this.h - 32, 150, 20).a());
      this.m = this.d(esg.a(te.d, $$0 -> {
         this.q.accept(this.p);
         this.at_();
      }).a(this.g / 2 - 155 + 160, this.h - 32, 150, 20).a());
      this.D();
      this.l();
      this.o.a((double)this.o.m());
   }

   private boolean a(fje $$0) {
      return $$0.a(this.p.f());
   }

   private void l() {
      int $$0 = this.o.d();
      this.s.a($$0, this.o);
   }

   @Override
   void C() {
      this.l();
   }

   void D() {
      this.m.i = !this.p.a().isEmpty();
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.o.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      AbuseReportLimits $$4 = this.l.a().b();
      int $$5 = this.p.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      tf $$7 = tf.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.i, $$7, this.g / 2, 16 + 9 * 3 / 2, 10526880);
      this.n.a($$0, this.g / 2, this.o.e());
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void at_() {
      this.f.a(this.k);
   }

   @Override
   public tf e() {
      return te.a(super.e(), c);
   }

   public class a extends etc<fbz.a.b> implements fby.a {
      @Nullable
      private fbz.a.c m;

      public a(eql $$1, int $$2) {
         super($$1, fbz.this.g, fbz.this.h, 40, fbz.this.h - 40 - $$2, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.l();
         super.a($$0);
         if ((float)this.m() > 1.0E-5F && $$0 <= 1.0E-5F && !arp.b($$0, $$1)) {
            fbz.this.C();
         }
      }

      @Override
      public void a(int $$0, fje.a $$1) {
         boolean $$2 = $$1.a(fbz.this.p.f());
         fjc $$3 = $$1.h();
         eqg $$4 = $$3.a($$1.g());
         fbz.a.b $$5 = new fbz.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fje.a $$0, boolean $$1) {
         fbz.a.b $$2 = new fbz.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fbz.a.c $$3 = new fbz.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(tf $$0) {
         this.c(new fbz.a.f());
         this.c(new fbz.a.a($$0));
         this.c(new fbz.a.f());
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

      public int d() {
         return arp.e(this.h - this.g, this.d);
      }

      @Override
      protected void a(erv $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fbz.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.f() == $$9;
            int $$11 = this.aw_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.r() == $$9, $$3);
      }

      private boolean b(fbz.a.b $$0) {
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
      protected fbz.a.b b(ewg $$0) {
         return this.a($$0, fbz.a.b::d);
      }

      public void a(@Nullable fbz.a.b $$0) {
         super.a($$0);
         fbz.a.b $$1 = this.b(ewg.a);
         if ($$1 == null) {
            fbz.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fbz.a.b $$3 = this.f();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int e() {
         return this.h + 9;
      }

      public class a extends fbz.a.b {
         private static final int c = -6250336;
         private final tf d;

         public a(tf $$1) {
            this.d = $$1;
         }

         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fbz.this.i.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fbz.this.i, this.d, $$13, $$14, -6250336);
         }

         @Override
         public tf a() {
            return this.d;
         }
      }

      public abstract class b extends etc.a<fbz.a.b> {
         @Override
         public tf a() {
            return te.a;
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

      static record c(UUID a, fbz.a.b b) {
         public boolean a(fbz.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fbz.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final tj h;
         private final tf i;
         @Nullable
         private final List<arc> j;
         @Nullable
         private final eqg.a k;
         @Nullable
         private final List<arc> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, tf $$2, tf $$3, @Nullable eqg $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = x.a($$4, eqg::f);
            this.l = $$4 != null && $$4.g() != null ? fbz.this.i.c($$4.g(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            tj $$7 = fbz.this.i.a($$2, this.f() - fbz.this.i.a(te.t));
            if ($$2 != $$7) {
               this.h = tj.a($$7, te.t);
               this.j = fbz.this.i.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fbz.this.i, qm.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fbz.this.b(this.j);
            }

            int $$12 = fbz.this.i.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fbz.this.b(this.l);
               }
            }
         }

         private void a(erv $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fbz.a, $$2, $$5, 9, 8);
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
         public tf a() {
            return (tf)(this.b() ? tf.a("narrator.select", this.i) : this.i);
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
            return ewd.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fbz.this.p.b(this.g);
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
               fbz.this.p.a(this.g);
               fbz.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fbz.a.b {
         private static final int c = 12;
         private final tf d;
         private final Supplier<fzu> e;
         private final boolean f;

         public e(GameProfile $$1, tf $$2, boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.al().a($$1);
         }

         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 - 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            etf.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fbz.this.i, this.d, $$3, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fbz.a.b {
         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
