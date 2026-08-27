import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fbn extends evf<fbn.b> {
   final fbo a;
   int m;

   public fbn(fbo $$0, etd $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      etb[] $$2 = (etb[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (etb $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fbn.a(ur.c($$5)));
         }

         ur $$6 = ur.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fbn.c($$4, $$6));
      }
   }

   public void e() {
      etb.d();
      this.v();
   }

   public void v() {
      this.i().forEach(fbn.b::c);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fbn.b {
      final ur b;
      private final int c;

      public a(ur $$1) {
         this.b = $$1;
         this.c = fbn.this.c.h.a(this.b);
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fbn.this.c.h, this.b, fbn.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public eul a(eyy $$0) {
         return null;
      }

      @Override
      public List<? extends ewu> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends eyq> b() {
         return ImmutableList.of(new eyq() {
            @Override
            public eyq.a q() {
               return eyq.a.b;
            }

            @Override
            public void b(eys $$0) {
               $$0.a(eyr.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends evf.a<fbn.b> {
      abstract void c();
   }

   public class c extends fbn.b {
      private final etb b;
      private final ur c;
      private final euz d;
      private final euz e;
      private boolean f = false;

      c(etb $$1, ur $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = euz.a($$2, $$1x -> {
            fbn.this.a.c = $$1;
            fbn.this.e();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? ur.a("narrator.controls.unbound", $$2) : ur.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = euz.a(ur.c("controls.reset"), $$1x -> {
            fbn.this.c.m.a($$1, $$1.i());
            fbn.this.e();
         }).a(0, 0, 50, 20).a($$1x -> ur.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fbn.this.m;
         $$0.a(fbn.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.f($$3 + 190);
         this.e.g($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.f($$3 + 105);
         this.d.g($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.p() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends ewu> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends eyq> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void c() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         vf $$0 = ur.i();
         if (!this.b.j()) {
            for (etb $$1 : fbn.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(ur.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(ur.b("[ ").b(this.d.l().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(ewk.a(ur.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fbn.this.a.c == this.b) {
            this.d.b(ur.b("> ").b(this.d.l().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
