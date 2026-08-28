import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class frn extends fis<frn.b> {
   private static final int a = 20;
   final fro m;
   private int n;

   public frn(fro $$0, fgo $$1) {
      super($$1, $$0.m, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fgm[] $$2 = (fgm[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fgm $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new frn.a(wz.c($$5)));
         }

         wz $$6 = wz.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new frn.c($$4, $$6));
      }
   }

   public void c() {
      fgm.d();
      this.J();
   }

   public void J() {
      this.aK_().forEach(frn.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends frn.b {
      final wz b;
      private final int c;

      public a(final wz $$1) {
         this.b = $$1;
         this.c = frn.this.c.h.a(this.b);
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(frn.this.c.h, this.b, frn.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fhw a(fmo $$0) {
         return null;
      }

      @Override
      public List<? extends fki> aK_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fmg> b() {
         return ImmutableList.of(new fmg() {
            @Override
            public fmg.a u() {
               return fmg.a.b;
            }

            @Override
            public void b(fmi $$0) {
               $$0.a(fmh.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fis.a<frn.b> {
      abstract void c();
   }

   public class c extends frn.b {
      private static final wz b = wz.c("controls.reset");
      private static final int c = 10;
      private final fgm d;
      private final wz e;
      private final fim f;
      private final fim g;
      private boolean h = false;

      c(final fgm $$1, final wz $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fim.a($$2, $$1x -> {
            frn.this.m.a = $$1;
            frn.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wz.a("narrator.controls.unbound", $$2) : wz.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fim.a(b, $$1x -> {
            frn.this.c.m.a($$1, $$1.i());
            frn.this.c();
         }).a(0, 0, 50, 20).a($$1x -> wz.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = frn.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(frn.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fki> aK_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fmg> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xn $$0 = wz.i();
         if (!this.d.j()) {
            for (fgm $$1 : frn.this.c.m.W) {
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
            this.f.a(fjx.a(wz.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (frn.this.m.a == this.d) {
            this.f.b(wz.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
