import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class eyn extends eso<eyn.b> {
   final eyo a;
   int l;

   public eyn(eyo $$0, eqn $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      eql[] $$2 = (eql[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eql $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new eyn.a(te.c($$5)));
         }

         te $$6 = te.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.l) {
            this.l = $$7;
         }

         this.b(new eyn.c($$4, $$6));
      }
   }

   public void d() {
      eql.d();
      this.e();
   }

   public void e() {
      this.i().forEach(eyn.b::d);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends eyn.b {
      final te b;
      private final int c;

      public a(te $$1) {
         this.b = $$1;
         this.c = eyn.this.b.h.a(this.b);
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eyn.this.b.h, this.b, eyn.this.b.z.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public eru a(evz $$0) {
         return null;
      }

      @Override
      public List<? extends etw> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends evr> b() {
         return ImmutableList.of(new evr() {
            @Override
            public evr.a q() {
               return evr.a.b;
            }

            @Override
            public void b(evt $$0) {
               $$0.a(evs.a, a.this.b);
            }
         });
      }

      @Override
      protected void d() {
      }
   }

   public abstract static class b extends eso.a<eyn.b> {
      abstract void d();
   }

   public class c extends eyn.b {
      private final eql b;
      private final te c;
      private final esi d;
      private final esi e;
      private boolean f = false;

      c(eql $$1, te $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = esi.a($$2, $$1x -> {
            eyn.this.a.c = $$1;
            eyn.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? te.a("narrator.controls.unbound", $$2) : te.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = esi.a(te.c("controls.reset"), $$1x -> {
            eyn.this.b.m.a($$1, $$1.i());
            eyn.this.d();
         }).a(0, 0, 50, 20).a($$1x -> te.a("narrator.controls.reset", $$2)).a();
         this.d();
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - eyn.this.l;
         $$0.a(eyn.this.b.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.e($$3 + 190);
         this.e.f($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.e($$3 + 105);
         this.d.f($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.p() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends etw> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends evr> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void d() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         tr $$0 = te.h();
         if (!this.b.j()) {
            for (eql $$1 : eyn.this.b.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(te.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(te.b("[ ").b(this.d.l().e().a(n.p)).f(" ]").a(n.m));
            this.d.a(etr.a(te.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (eyn.this.a.c == this.b) {
            this.d.b(te.b("> ").b(this.d.l().e().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
