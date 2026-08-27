import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fcv extends ewn<fcv.b> {
   final fcw a;
   int m;

   public fcv(fcw $$0, euk $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      eui[] $$2 = (eui[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eui $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fcv.a(vb.c($$5)));
         }

         vb $$6 = vb.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fcv.c($$4, $$6));
      }
   }

   public void e() {
      eui.d();
      this.v();
   }

   public void v() {
      this.i().forEach(fcv.b::c);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fcv.b {
      final vb b;
      private final int c;

      public a(vb $$1) {
         this.b = $$1;
         this.c = fcv.this.c.h.a(this.b);
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fcv.this.c.h, this.b, fcv.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public evt a(fag $$0) {
         return null;
      }

      @Override
      public List<? extends eyc> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends ezy> b() {
         return ImmutableList.of(new ezy() {
            @Override
            public ezy.a q() {
               return ezy.a.b;
            }

            @Override
            public void b(faa $$0) {
               $$0.a(ezz.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends ewn.a<fcv.b> {
      abstract void c();
   }

   public class c extends fcv.b {
      private final eui b;
      private final vb c;
      private final ewh d;
      private final ewh e;
      private boolean f = false;

      c(eui $$1, vb $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = ewh.a($$2, $$1x -> {
            fcv.this.a.c = $$1;
            fcv.this.e();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vb.a("narrator.controls.unbound", $$2) : vb.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = ewh.a(vb.c("controls.reset"), $$1x -> {
            fcv.this.c.m.a($$1, $$1.i());
            fcv.this.e();
         }).a(0, 0, 50, 20).a($$1x -> vb.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fcv.this.m;
         $$0.a(fcv.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
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
      public List<? extends eyc> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends ezy> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void c() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         vp $$0 = vb.i();
         if (!this.b.j()) {
            for (eui $$1 : fcv.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vb.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vb.b("[ ").b(this.d.l().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(exs.a(vb.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fcv.this.a.c == this.b) {
            this.d.b(vb.b("> ").b(this.d.l().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
