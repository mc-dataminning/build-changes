import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fll extends ffa<fll.b> {
   private static final int a = 20;
   final flm m;
   private int n;

   public fll(flm $$0, fcu $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fcs[] $$2 = (fcs[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fcs $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fll.a(ws.c($$5)));
         }

         ws $$6 = ws.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fll.c($$4, $$6));
      }
   }

   public void d() {
      fcs.d();
      this.I();
   }

   public void I() {
      this.aE_().forEach(fll.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fll.b {
      final ws b;
      private final int c;

      public a(ws $$1) {
         this.b = $$1;
         this.c = fll.this.c.h.a(this.b);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fll.this.c.h, this.b, fll.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fee a(fiw $$0) {
         return null;
      }

      @Override
      public List<? extends fgq> aE_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fio> b() {
         return ImmutableList.of(new fio() {
            @Override
            public fio.a t() {
               return fio.a.b;
            }

            @Override
            public void b(fiq $$0) {
               $$0.a(fip.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends ffa.a<fll.b> {
      abstract void c();
   }

   public class c extends fll.b {
      private static final ws b = ws.c("controls.reset");
      private static final int c = 10;
      private final fcs d;
      private final ws e;
      private final feu f;
      private final feu g;
      private boolean h = false;

      c(fcs $$1, ws $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = feu.a($$2, $$1x -> {
            fll.this.m.a = $$1;
            fll.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? ws.a("narrator.controls.unbound", $$2) : ws.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = feu.a(b, $$1x -> {
            fll.this.c.m.a($$1, $$1.i());
            fll.this.d();
         }).a(0, 0, 50, 20).a($$1x -> ws.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fll.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fll.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fgq> aE_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fio> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xg $$0 = ws.i();
         if (!this.d.j()) {
            for (fcs $$1 : fll.this.c.m.X) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(ws.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(ws.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fgf.a(ws.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fll.this.m.a == this.d) {
            this.f.b(ws.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
