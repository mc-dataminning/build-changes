import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fge extends ezu<fge.b> {
   final fgf a;
   int m;

   public fge(fgf $$0, exo $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      exm[] $$2 = (exm[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (exm $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fge.a(vq.c($$5)));
         }

         vq $$6 = vq.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fge.c($$4, $$6));
      }
   }

   public void d() {
      exm.d();
      this.e();
   }

   public void e() {
      this.l().forEach(fge.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fge.b {
      final vq b;
      private final int c;

      public a(vq $$1) {
         this.b = $$1;
         this.c = fge.this.c.h.a(this.b);
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fge.this.c.h, this.b, fge.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public eyy a(fdp $$0) {
         return null;
      }

      @Override
      public List<? extends fbk> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fdh> a() {
         return ImmutableList.of(new fdh() {
            @Override
            public fdh.a s() {
               return fdh.a.b;
            }

            @Override
            public void b(fdj $$0) {
               $$0.a(fdi.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends ezu.a<fge.b> {
      abstract void b();
   }

   public class c extends fge.b {
      private final exm b;
      private final vq c;
      private final ezo d;
      private final ezo e;
      private boolean f = false;

      c(exm $$1, vq $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = ezo.a($$2, $$1x -> {
            fge.this.a.c = $$1;
            fge.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vq.a("narrator.controls.unbound", $$2) : vq.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = ezo.a(vq.c("controls.reset"), $$1x -> {
            fge.this.c.m.a($$1, $$1.i());
            fge.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vq.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fge.this.m;
         $$0.a(fge.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.m($$3 + 190);
         this.e.n($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.m($$3 + 105);
         this.d.n($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.B() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fbk> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends fdh> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         we $$0 = vq.i();
         if (!this.b.j()) {
            for (exm $$1 : fge.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vq.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vq.b("[ ").b(this.d.x().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(faz.a(vq.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fge.this.a.c == this.b) {
            this.d.b(vq.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
