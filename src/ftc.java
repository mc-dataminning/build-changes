import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ftc extends fkg<ftc.b> {
   private static final int a = 20;
   final ftd m;
   private int n;

   public ftc(ftd $$0, fib $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fhz[] $$2 = (fhz[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fhz $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new ftc.a(xd.c($$5)));
         }

         xd $$6 = xd.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new ftc.c($$4, $$6));
      }
   }

   public void c() {
      fhz.d();
      this.J();
   }

   public void J() {
      this.aK_().forEach(ftc.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends ftc.b {
      final xd b;
      private final int c;

      public a(final xd $$1) {
         this.b = $$1;
         this.c = ftc.this.c.h.a(this.b);
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ftc.this.c.h, this.b, ftc.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fjk a(fod $$0) {
         return null;
      }

      @Override
      public List<? extends flx> aK_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fnv> b() {
         return ImmutableList.of(new fnv() {
            @Override
            public fnv.a u() {
               return fnv.a.b;
            }

            @Override
            public void b(fnx $$0) {
               $$0.a(fnw.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fkg.a<ftc.b> {
      abstract void c();
   }

   public class c extends ftc.b {
      private static final xd b = xd.c("controls.reset");
      private static final int c = 10;
      private final fhz d;
      private final xd e;
      private final fka f;
      private final fka g;
      private boolean h = false;

      c(final fhz $$1, final xd $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fka.a($$2, $$1x -> {
            ftc.this.m.a = $$1;
            ftc.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xd.a("narrator.controls.unbound", $$2) : xd.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fka.a(b, $$1x -> {
            $$1.b($$1.i());
            ftc.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xd.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = ftc.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(ftc.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends flx> aK_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fnv> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xr $$0 = xd.i();
         if (!this.d.j()) {
            for (fhz $$1 : ftc.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xd.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xd.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fll.a(xd.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (ftc.this.m.a == this.d) {
            this.f.b(xd.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
