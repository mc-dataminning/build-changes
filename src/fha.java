import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fha extends faq<fha.b> {
   final fhb a;
   int m;

   public fha(fhb $$0, eyk $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      eyi[] $$2 = (eyi[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eyi $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fha.a(vs.c($$5)));
         }

         vs $$6 = vs.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fha.c($$4, $$6));
      }
   }

   public void d() {
      eyi.d();
      this.e();
   }

   public void e() {
      this.l().forEach(fha.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fha.b {
      final vs b;
      private final int c;

      public a(vs $$1) {
         this.b = $$1;
         this.c = fha.this.c.h.a(this.b);
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fha.this.c.h, this.b, fha.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public ezu a(fel $$0) {
         return null;
      }

      @Override
      public List<? extends fcg> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fed> a() {
         return ImmutableList.of(new fed() {
            @Override
            public fed.a s() {
               return fed.a.b;
            }

            @Override
            public void b(fef $$0) {
               $$0.a(fee.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends faq.a<fha.b> {
      abstract void b();
   }

   public class c extends fha.b {
      private final eyi b;
      private final vs c;
      private final fak d;
      private final fak e;
      private boolean f = false;

      c(eyi $$1, vs $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = fak.a($$2, $$1x -> {
            fha.this.a.c = $$1;
            fha.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vs.a("narrator.controls.unbound", $$2) : vs.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = fak.a(vs.c("controls.reset"), $$1x -> {
            fha.this.c.m.a($$1, $$1.i());
            fha.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vs.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fha.this.m;
         $$0.a(fha.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
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
      public List<? extends fcg> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends fed> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         wg $$0 = vs.i();
         if (!this.b.j()) {
            for (eyi $$1 : fha.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vs.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vs.b("[ ").b(this.d.x().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(fbv.a(vs.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fha.this.a.c == this.b) {
            this.d.b(vs.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
