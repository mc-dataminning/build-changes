import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ftq extends fku<ftq.b> {
   private static final int a = 20;
   final ftr m;
   private int n;

   public ftq(ftr $$0, fip $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fin[] $$2 = (fin[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fin $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new ftq.a(xe.c($$5)));
         }

         xe $$6 = xe.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new ftq.c($$4, $$6));
      }
   }

   public void c() {
      fin.d();
      this.J();
   }

   public void J() {
      this.aJ_().forEach(ftq.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends ftq.b {
      final xe b;
      private final int c;

      public a(final xe $$1) {
         this.b = $$1;
         this.c = ftq.this.c.h.a(this.b);
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ftq.this.c.h, this.b, ftq.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fjy a(fos $$0) {
         return null;
      }

      @Override
      public List<? extends fml> aJ_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends foj> b() {
         return ImmutableList.of(new foj() {
            @Override
            public foj.a u() {
               return foj.a.b;
            }

            @Override
            public void b(fol $$0) {
               $$0.a(fok.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fku.a<ftq.b> {
      abstract void c();
   }

   public class c extends ftq.b {
      private static final xe b = xe.c("controls.reset");
      private static final int c = 10;
      private final fin d;
      private final xe e;
      private final fko f;
      private final fko g;
      private boolean h = false;

      c(final fin $$1, final xe $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fko.a($$2, $$1x -> {
            ftq.this.m.a = $$1;
            ftq.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xe.a("narrator.controls.unbound", $$2) : xe.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fko.a(b, $$1x -> {
            $$1.b($$1.i());
            ftq.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xe.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = ftq.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(ftq.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fml> aJ_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends foj> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xs $$0 = xe.i();
         if (!this.d.j()) {
            for (fin $$1 : ftq.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xe.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xe.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(flz.a(xe.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (ftq.this.m.a == this.d) {
            this.f.b(xe.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
