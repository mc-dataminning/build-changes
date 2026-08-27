import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjf extends ffe {
   static final aiy a = new aiy("icon/checkmark");
   private static final vq b = vq.c("gui.chatSelection.title");
   private static final vq c = vq.c("gui.chatSelection.context").a(n.h);
   @Nullable
   private final ffe k;
   private final frb l;
   private ezh m;
   private faa n;
   @Nullable
   private fjf.a o;
   final fqu.a p;
   private final Consumer<fqu.a> q;
   private fje r;

   public fjf(@Nullable ffe $$0, frb $$1, fqu.a $$2, Consumer<fqu.a> $$3) {
      super(b);
      this.k = $$0;
      this.l = $$1;
      this.p = $$2.d();
      this.q = $$3;
   }

   @Override
   protected void aQ_() {
      this.r = new fje(this.l, this::a);
      this.n = faa.a(this.i, c, this.g - 16);
      this.o = this.d(new fjf.a(this.f, (this.n.a() + 1) * 9));
      this.d(ezh.a(vp.k, $$0 -> this.d()).a(this.g / 2 - 155, this.h - 32, 150, 20).a());
      this.m = this.d(ezh.a(vp.d, $$0 -> {
         this.q.accept(this.p);
         this.d();
      }).a(this.g / 2 - 155 + 160, this.h - 32, 150, 20).a());
      this.H();
      this.o();
      this.o.a((double)this.o.p());
   }

   private boolean a(fqq $$0) {
      return $$0.a(this.p.f());
   }

   private void o() {
      int $$0 = this.o.d();
      this.r.a($$0, this.o);
   }

   void E() {
      this.o();
   }

   void H() {
      this.m.j = !this.p.a().isEmpty();
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      AbuseReportLimits $$4 = this.l.a().b();
      int $$5 = this.p.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      vq $$7 = vq.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.i, $$7, this.g / 2, 16 + 9 * 3 / 2, 10526880);
      this.n.a($$0, this.g / 2, this.o.e());
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      this.f.a(this.k);
   }

   @Override
   public vq i() {
      return vp.a(super.i(), c);
   }

   public class a extends fad<fjf.a.b> implements fje.a {
      @Nullable
      private fjf.a.c m;

      public a(exh $$1, int $$2) {
         super($$1, fjf.this.g, fjf.this.h - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.o();
         super.a($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !awh.b($$0, $$1)) {
            fjf.this.E();
         }
      }

      @Override
      public void a(int $$0, fqq.a $$1) {
         boolean $$2 = $$1.a(fjf.this.p.f());
         fqo $$3 = $$1.h();
         exc $$4 = $$3.a($$1.g());
         fjf.a.b $$5 = new fjf.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fqq.a $$0, boolean $$1) {
         fjf.a.b $$2 = new fjf.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fjf.a.c $$3 = new fjf.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(vq $$0) {
         this.c(new fjf.a.f());
         this.c(new fjf.a.a($$0));
         this.c(new fjf.a.f());
         this.m = null;
      }

      @Override
      protected int c() {
         return (this.g + this.b()) / 2;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      public int d() {
         return awh.e(this.h, this.d);
      }

      @Override
      protected void a(eyu $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fjf.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.i() == $$9;
            int $$11 = this.aL_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.t() == $$9, $$3);
      }

      private boolean b(fjf.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.i() == $$0;
            boolean $$2 = this.i() == null;
            boolean $$3 = this.t() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected fjf.a.b b(fdk $$0) {
         return this.a($$0, fjf.a.b::c);
      }

      public void a(@Nullable fjf.a.b $$0) {
         super.a($$0);
         fjf.a.b $$1 = this.b(fdk.a);
         if ($$1 == null) {
            fjf.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fjf.a.b $$3 = this.i();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int e() {
         return this.E() + 9;
      }

      public class a extends fjf.a.b {
         private static final int c = -6250336;
         private final vq d;

         public a(vq $$1) {
            this.d = $$1;
         }

         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fjf.this.i.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fjf.this.i, this.d, $$13, $$14, -6250336);
         }

         @Override
         public vq a() {
            return this.d;
         }
      }

      public abstract class b extends fad.a<fjf.a.b> {
         @Override
         public vq a() {
            return vp.a;
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

      static record c(UUID a, fjf.a.b b) {
         public boolean a(fjf.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fjf.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final vv h;
         private final vq i;
         @Nullable
         private final List<avt> j;
         @Nullable
         private final exc.a k;
         @Nullable
         private final List<avt> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, vq $$2, vq $$3, @Nullable exc $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = x.a($$4, exc::f);
            this.l = $$4 != null && $$4.g() != null ? fjf.this.i.c($$4.g(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            vv $$7 = fjf.this.i.a($$2, this.e() - fjf.this.i.a(vp.u));
            if ($$2 != $$7) {
               this.h = vv.a($$7, vp.u);
               this.j = fjf.this.i.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fjf.this.i, sr.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fjf.this.b(this.j);
            }

            int $$12 = fjf.this.i.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fjf.this.b(this.l);
               }
            }
         }

         private void a(eyu $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fjf.a, $$2, $$5, 9, 8);
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
         public vq a() {
            return (vq)(this.b() ? vq.a("narrator.select", this.i) : this.i);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.g();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fdh.a($$0) ? this.g() : false;
         }

         @Override
         public boolean b() {
            return fjf.this.p.b(this.g);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean d() {
            return this.m;
         }

         private boolean g() {
            if (this.m) {
               fjf.this.p.a(this.g);
               fjf.this.H();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fjf.a.b {
         private static final int c = 12;
         private final vq d;
         private final Supplier<ght> e;
         private final boolean f;

         public e(GameProfile $$1, vq $$2, boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.al().a($$1);
         }

         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 - 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fag.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fjf.this.i, this.d, $$3, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fjf.a.b {
         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
