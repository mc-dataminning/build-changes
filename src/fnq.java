import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fnq extends fhf<fnq.b> {
   private static final int a = 20;
   final fnr m;
   private int n;

   public fnq(fnr $$0, ffa $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fey[] $$2 = (fey[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fey $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fnq.a(xl.c($$5)));
         }

         xl $$6 = xl.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fnq.c($$4, $$6));
      }
   }

   public void d() {
      fey.d();
      this.I();
   }

   public void I() {
      this.aF_().forEach(fnq.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fnq.b {
      final xl b;
      private final int c;

      public a(final xl $$1) {
         this.b = $$1;
         this.c = fnq.this.c.h.a(this.b);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fnq.this.c.h, this.b, fnq.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fgj a(flb $$0) {
         return null;
      }

      @Override
      public List<? extends fiv> aF_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fkt> b() {
         return ImmutableList.of(new fkt() {
            @Override
            public fkt.a t() {
               return fkt.a.b;
            }

            @Override
            public void b(fkv $$0) {
               $$0.a(fku.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fhf.a<fnq.b> {
      abstract void c();
   }

   public class c extends fnq.b {
      private static final xl b = xl.c("controls.reset");
      private static final int c = 10;
      private final fey d;
      private final xl e;
      private final fgz f;
      private final fgz g;
      private boolean h = false;

      c(final fey $$1, final xl $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fgz.a($$2, $$1x -> {
            fnq.this.m.a = $$1;
            fnq.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xl.a("narrator.controls.unbound", $$2) : xl.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fgz.a(b, $$1x -> {
            fnq.this.c.m.a($$1, $$1.i());
            fnq.this.d();
         }).a(0, 0, 50, 20).a($$1x -> xl.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fnq.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fnq.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fiv> aF_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fkt> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xz $$0 = xl.i();
         if (!this.d.j()) {
            for (fey $$1 : fnq.this.c.m.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xl.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xl.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fik.a(xl.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fnq.this.m.a == this.d) {
            this.f.b(xl.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
