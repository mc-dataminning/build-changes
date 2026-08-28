import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fql extends fhs<fql.b> {
   private static final int a = 20;
   final fqm m;
   private int n;

   public fql(fqm $$0, ffn $$1) {
      super($$1, $$0.m, $$0.r.d(), $$0.r.c(), 20);
      this.m = $$0;
      ffl[] $$2 = (ffl[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (ffl $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fql.a(wu.c($$5)));
         }

         wu $$6 = wu.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fql.c($$4, $$6));
      }
   }

   public void c() {
      ffl.d();
      this.J();
   }

   public void J() {
      this.aF_().forEach(fql.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fql.b {
      final wu b;
      private final int c;

      public a(final wu $$1) {
         this.b = $$1;
         this.c = fql.this.c.h.a(this.b);
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fql.this.c.h, this.b, fql.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fgw a(flo $$0) {
         return null;
      }

      @Override
      public List<? extends fji> aF_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends flg> b() {
         return ImmutableList.of(new flg() {
            @Override
            public flg.a u() {
               return flg.a.b;
            }

            @Override
            public void b(fli $$0) {
               $$0.a(flh.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fhs.a<fql.b> {
      abstract void c();
   }

   public class c extends fql.b {
      private static final wu b = wu.c("controls.reset");
      private static final int c = 10;
      private final ffl d;
      private final wu e;
      private final fhm f;
      private final fhm g;
      private boolean h = false;

      c(final ffl $$1, final wu $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fhm.a($$2, $$1x -> {
            fql.this.m.a = $$1;
            fql.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wu.a("narrator.controls.unbound", $$2) : wu.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fhm.a(b, $$1x -> {
            fql.this.c.m.a($$1, $$1.i());
            fql.this.c();
         }).a(0, 0, 50, 20).a($$1x -> wu.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fql.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fql.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fji> aF_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends flg> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xi $$0 = wu.i();
         if (!this.d.j()) {
            for (ffl $$1 : fql.this.c.m.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wu.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wu.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fix.a(wu.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fql.this.m.a == this.d) {
            this.f.b(wu.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
