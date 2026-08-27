import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ezw extends etp<ezw.b> {
   final ezx a;
   int m;

   public ezw(ezx $$0, ero $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      erm[] $$2 = (erm[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (erm $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new ezw.a(ui.c($$5)));
         }

         ui $$6 = ui.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new ezw.c($$4, $$6));
      }
   }

   public void e() {
      erm.d();
      this.v();
   }

   public void v() {
      this.i().forEach(ezw.b::c);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends ezw.b {
      final ui b;
      private final int c;

      public a(ui $$1) {
         this.b = $$1;
         this.c = ezw.this.c.h.a(this.b);
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ezw.this.c.h, this.b, ezw.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public esv a(exi $$0) {
         return null;
      }

      @Override
      public List<? extends eve> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends exa> b() {
         return ImmutableList.of(new exa() {
            @Override
            public exa.a q() {
               return exa.a.b;
            }

            @Override
            public void b(exc $$0) {
               $$0.a(exb.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends etp.a<ezw.b> {
      abstract void c();
   }

   public class c extends ezw.b {
      private final erm b;
      private final ui c;
      private final etj d;
      private final etj e;
      private boolean f = false;

      c(erm $$1, ui $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = etj.a($$2, $$1x -> {
            ezw.this.a.c = $$1;
            ezw.this.e();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? ui.a("narrator.controls.unbound", $$2) : ui.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = etj.a(ui.c("controls.reset"), $$1x -> {
            ezw.this.c.m.a($$1, $$1.i());
            ezw.this.e();
         }).a(0, 0, 50, 20).a($$1x -> ui.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - ezw.this.m;
         $$0.a(ezw.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
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
      public List<? extends eve> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends exa> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void c() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         uw $$0 = ui.i();
         if (!this.b.j()) {
            for (erm $$1 : ezw.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(ui.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(ui.b("[ ").b(this.d.l().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(euu.a(ui.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (ezw.this.a.c == this.b) {
            this.d.b(ui.b("> ").b(this.d.l().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
