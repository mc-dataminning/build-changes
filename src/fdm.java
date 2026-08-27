import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fdm extends exe<fdm.b> {
   final fdn a;
   int m;

   public fdm(fdn $$0, eva $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      euy[] $$2 = (euy[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (euy $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fdm.a(vd.c($$5)));
         }

         vd $$6 = vd.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fdm.c($$4, $$6));
      }
   }

   public void d() {
      euy.d();
      this.e();
   }

   public void e() {
      this.l().forEach(fdm.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fdm.b {
      final vd b;
      private final int c;

      public a(vd $$1) {
         this.b = $$1;
         this.c = fdm.this.c.h.a(this.b);
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdm.this.c.h, this.b, fdm.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public ewj a(fax $$0) {
         return null;
      }

      @Override
      public List<? extends eyt> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fap> a() {
         return ImmutableList.of(new fap() {
            @Override
            public fap.a s() {
               return fap.a.b;
            }

            @Override
            public void b(far $$0) {
               $$0.a(faq.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends exe.a<fdm.b> {
      abstract void b();
   }

   public class c extends fdm.b {
      private final euy b;
      private final vd c;
      private final ewy d;
      private final ewy e;
      private boolean f = false;

      c(euy $$1, vd $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = ewy.a($$2, $$1x -> {
            fdm.this.a.c = $$1;
            fdm.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vd.a("narrator.controls.unbound", $$2) : vd.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = ewy.a(vd.c("controls.reset"), $$1x -> {
            fdm.this.c.m.a($$1, $$1.i());
            fdm.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vd.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fdm.this.m;
         $$0.a(fdm.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.n($$3 + 190);
         this.e.o($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.n($$3 + 105);
         this.d.o($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.B() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends eyt> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends fap> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         vr $$0 = vd.i();
         if (!this.b.j()) {
            for (euy $$1 : fdm.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vd.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vd.b("[ ").b(this.d.x().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(eyj.a(vd.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fdm.this.a.c == this.b) {
            this.d.b(vd.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
