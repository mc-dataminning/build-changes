import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class frl extends fiq<frl.b> {
   private static final int a = 20;
   final frm m;
   private int n;

   public frl(frm $$0, fgm $$1) {
      super($$1, $$0.m, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fgk[] $$2 = (fgk[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fgk $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new frl.a(wz.c($$5)));
         }

         wz $$6 = wz.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new frl.c($$4, $$6));
      }
   }

   public void c() {
      fgk.d();
      this.J();
   }

   public void J() {
      this.aK_().forEach(frl.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends frl.b {
      final wz b;
      private final int c;

      public a(final wz $$1) {
         this.b = $$1;
         this.c = frl.this.c.h.a(this.b);
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(frl.this.c.h, this.b, frl.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fhu a(fmm $$0) {
         return null;
      }

      @Override
      public List<? extends fkg> aK_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fme> b() {
         return ImmutableList.of(new fme() {
            @Override
            public fme.a u() {
               return fme.a.b;
            }

            @Override
            public void b(fmg $$0) {
               $$0.a(fmf.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fiq.a<frl.b> {
      abstract void c();
   }

   public class c extends frl.b {
      private static final wz b = wz.c("controls.reset");
      private static final int c = 10;
      private final fgk d;
      private final wz e;
      private final fik f;
      private final fik g;
      private boolean h = false;

      c(final fgk $$1, final wz $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fik.a($$2, $$1x -> {
            frl.this.m.a = $$1;
            frl.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wz.a("narrator.controls.unbound", $$2) : wz.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fik.a(b, $$1x -> {
            frl.this.c.m.a($$1, $$1.i());
            frl.this.c();
         }).a(0, 0, 50, 20).a($$1x -> wz.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = frl.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(frl.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fkg> aK_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fme> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xn $$0 = wz.i();
         if (!this.d.j()) {
            for (fgk $$1 : frl.this.c.m.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wz.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wz.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fjv.a(wz.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (frl.this.m.a == this.d) {
            this.f.b(wz.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
