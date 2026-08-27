import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ffx extends ezn<ffx.b> {
   final ffy a;
   int m;

   public ffx(ffy $$0, exh $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      exf[] $$2 = (exf[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (exf $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new ffx.a(vq.c($$5)));
         }

         vq $$6 = vq.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new ffx.c($$4, $$6));
      }
   }

   public void d() {
      exf.d();
      this.e();
   }

   public void e() {
      this.l().forEach(ffx.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends ffx.b {
      final vq b;
      private final int c;

      public a(vq $$1) {
         this.b = $$1;
         this.c = ffx.this.c.h.a(this.b);
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ffx.this.c.h, this.b, ffx.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public eyr a(fdi $$0) {
         return null;
      }

      @Override
      public List<? extends fbd> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fda> a() {
         return ImmutableList.of(new fda() {
            @Override
            public fda.a s() {
               return fda.a.b;
            }

            @Override
            public void b(fdc $$0) {
               $$0.a(fdb.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends ezn.a<ffx.b> {
      abstract void b();
   }

   public class c extends ffx.b {
      private final exf b;
      private final vq c;
      private final ezh d;
      private final ezh e;
      private boolean f = false;

      c(exf $$1, vq $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = ezh.a($$2, $$1x -> {
            ffx.this.a.c = $$1;
            ffx.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vq.a("narrator.controls.unbound", $$2) : vq.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = ezh.a(vq.c("controls.reset"), $$1x -> {
            ffx.this.c.m.a($$1, $$1.i());
            ffx.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vq.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - ffx.this.m;
         $$0.a(ffx.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.m($$3 + 190);
         this.e.n($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.m($$3 + 105);
         this.d.n($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.B() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fbd> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends fda> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         we $$0 = vq.i();
         if (!this.b.j()) {
            for (exf $$1 : ffx.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vq.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vq.b("[ ").b(this.d.x().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(fas.a(vq.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (ffx.this.a.c == this.b) {
            this.d.b(vq.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
