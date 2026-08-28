import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fnw extends fhl<fnw.b> {
   private static final int a = 20;
   final fnx m;
   private int n;

   public fnw(fnx $$0, ffg $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      ffe[] $$2 = (ffe[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (ffe $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fnw.a(xp.c($$5)));
         }

         xp $$6 = xp.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fnw.c($$4, $$6));
      }
   }

   public void c() {
      ffe.d();
      this.I();
   }

   public void I() {
      this.aD_().forEach(fnw.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fnw.b {
      final xp b;
      private final int c;

      public a(final xp $$1) {
         this.b = $$1;
         this.c = fnw.this.c.h.a(this.b);
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fnw.this.c.h, this.b, fnw.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fgp a(flh $$0) {
         return null;
      }

      @Override
      public List<? extends fjb> aD_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fkz> b() {
         return ImmutableList.of(new fkz() {
            @Override
            public fkz.a t() {
               return fkz.a.b;
            }

            @Override
            public void b(flb $$0) {
               $$0.a(fla.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fhl.a<fnw.b> {
      abstract void c();
   }

   public class c extends fnw.b {
      private static final xp b = xp.c("controls.reset");
      private static final int c = 10;
      private final ffe d;
      private final xp e;
      private final fhf f;
      private final fhf g;
      private boolean h = false;

      c(final ffe $$1, final xp $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fhf.a($$2, $$1x -> {
            fnw.this.m.a = $$1;
            fnw.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xp.a("narrator.controls.unbound", $$2) : xp.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fhf.a(b, $$1x -> {
            fnw.this.c.m.a($$1, $$1.i());
            fnw.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xp.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fnw.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fnw.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fjb> aD_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fkz> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         yd $$0 = xp.i();
         if (!this.d.j()) {
            for (ffe $$1 : fnw.this.c.m.W) {
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
            this.f.a(fiq.a(xp.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fnw.this.m.a == this.d) {
            this.f.b(xp.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
