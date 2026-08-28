import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fsz extends fob {
   private static final wz a = wz.c("selectWorld.experimental.title");
   private static final wz b = wz.c("selectWorld.experimental.message");
   private static final wz c = wz.c("selectWorld.experimental.details");
   private static final int r = 10;
   private static final int s = 100;
   private final BooleanConsumer u;
   final Collection<atm> v;
   private final flw w = new flw().a(10).b(20);

   public fsz(Collection<atm> $$0, BooleanConsumer $$1) {
      super(a);
      this.v = $$0;
      this.u = $$1;
   }

   @Override
   public wz i() {
      return wy.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      super.aT_();
      flw.b $$0 = this.w.d(2);
      fma $$1 = $$0.b().b();
      $$0.a(new fjr(this.k, this.o), 2, $$1);
      fje $$2 = $$0.a(new fje(b, this.o).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fik.a(c, $$0x -> this.l.a(new fsz.a())).a(100).a(), 2, $$1);
      $$0.a(fik.a(wy.i, $$0x -> this.u.accept(true)).a());
      $$0.a(fik.a(wy.k, $$0x -> this.u.accept(false)).a());
      this.w.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.w.a();
      this.c();
   }

   @Override
   protected void c() {
      flv.a(this.w, 0, 0, this.m, this.n, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.u.accept(false);
   }

   class a extends fob {
      private static final wz b = wz.c("selectWorld.experimental.details.title");
      final flx c = new flx(this);
      @Nullable
      private fsz.a.a r;

      a() {
         super(b);
      }

      @Override
      protected void aT_() {
         this.c.a(b, this.o);
         this.r = this.c.c(new fsz.a.a(this.l, fsz.this.v));
         this.c.b(fik.a(wy.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fii var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         if (this.r != null) {
            this.r.a(this.m, this.c);
         }

         this.c.a();
      }

      @Override
      public void d() {
         this.l.a(fsz.this);
      }

      class a extends fjg<fsz.a.b> {
         public a(final fgm $$0, final Collection<atm> $$1) {
            super($$0, a.this.m, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atm $$2 : $$1) {
               String $$3 = cpn.a(cpn.f, $$2.e());
               if (!$$3.isEmpty()) {
                  wz $$4 = xc.a($$2.b().f(), xw.a.a(true));
                  wz $$5 = wz.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fjd.a(a.this.o, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fjg.a<fsz.a.b> {
         private final wz b;
         private final wz c;
         private final fjd d;

         b(final wz $$0, final wz $$1, final fjd $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.l.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wz a() {
            return wz.a("narrator.select", wy.a(this.b, this.c));
         }
      }
   }
}
