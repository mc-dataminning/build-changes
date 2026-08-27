import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ezc extends esw<ezc.b> {
   final ezd a;
   int m;

   public ezc(ezd $$0, eqv $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      eqt[] $$2 = (eqt[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eqt $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new ezc.a(tm.c($$5)));
         }

         tm $$6 = tm.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new ezc.c($$4, $$6));
      }
   }

   public void d() {
      eqt.d();
      this.e();
   }

   public void e() {
      this.i().forEach(ezc.b::d);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends ezc.b {
      final tm b;
      private final int c;

      public a(tm $$1) {
         this.b = $$1;
         this.c = ezc.this.c.h.a(this.b);
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ezc.this.c.h, this.b, ezc.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public esc a(ewo $$0) {
         return null;
      }

      @Override
      public List<? extends euk> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends ewg> b() {
         return ImmutableList.of(new ewg() {
            @Override
            public ewg.a q() {
               return ewg.a.b;
            }

            @Override
            public void b(ewi $$0) {
               $$0.a(ewh.a, a.this.b);
            }
         });
      }

      @Override
      protected void d() {
      }
   }

   public abstract static class b extends esw.a<ezc.b> {
      abstract void d();
   }

   public class c extends ezc.b {
      private final eqt b;
      private final tm c;
      private final esq d;
      private final esq e;
      private boolean f = false;

      c(eqt $$1, tm $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = esq.a($$2, $$1x -> {
            ezc.this.a.c = $$1;
            ezc.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? tm.a("narrator.controls.unbound", $$2) : tm.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = esq.a(tm.c("controls.reset"), $$1x -> {
            ezc.this.c.m.a($$1, $$1.i());
            ezc.this.d();
         }).a(0, 0, 50, 20).a($$1x -> tm.a("narrator.controls.reset", $$2)).a();
         this.d();
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - ezc.this.m;
         $$0.a(ezc.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.f($$3 + 190);
         this.e.g($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.f($$3 + 105);
         this.d.g($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.r() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends euk> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends ewg> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void d() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         tz $$0 = tm.h();
         if (!this.b.j()) {
            for (eqt $$1 : ezc.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(tm.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(tm.b("[ ").b(this.d.m().e().a(n.p)).f(" ]").a(n.m));
            this.d.a(eua.a(tm.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (ezc.this.a.c == this.b) {
            this.d.b(tm.b("> ").b(this.d.m().e().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
