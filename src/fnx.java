import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fnx extends fhm<fnx.b> {
   private static final int a = 20;
   final fny m;
   private int n;

   public fnx(fny $$0, ffh $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fff[] $$2 = (fff[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fff $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fnx.a(xp.c($$5)));
         }

         xp $$6 = xp.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fnx.c($$4, $$6));
      }
   }

   public void c() {
      fff.d();
      this.I();
   }

   public void I() {
      this.aD_().forEach(fnx.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fnx.b {
      final xp b;
      private final int c;

      public a(final xp $$1) {
         this.b = $$1;
         this.c = fnx.this.c.h.a(this.b);
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fnx.this.c.h, this.b, fnx.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fgq a(fli $$0) {
         return null;
      }

      @Override
      public List<? extends fjc> aD_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fla> b() {
         return ImmutableList.of(new fla() {
            @Override
            public fla.a t() {
               return fla.a.b;
            }

            @Override
            public void b(flc $$0) {
               $$0.a(flb.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fhm.a<fnx.b> {
      abstract void c();
   }

   public class c extends fnx.b {
      private static final xp b = xp.c("controls.reset");
      private static final int c = 10;
      private final fff d;
      private final xp e;
      private final fhg f;
      private final fhg g;
      private boolean h = false;

      c(final fff $$1, final xp $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fhg.a($$2, $$1x -> {
            fnx.this.m.a = $$1;
            fnx.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xp.a("narrator.controls.unbound", $$2) : xp.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fhg.a(b, $$1x -> {
            fnx.this.c.m.a($$1, $$1.i());
            fnx.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xp.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fnx.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fnx.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fjc> aD_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fla> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         yd $$0 = xp.i();
         if (!this.d.j()) {
            for (fff $$1 : fnx.this.c.m.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xp.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xp.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fir.a(xp.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fnx.this.m.a == this.d) {
            this.f.b(xp.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
