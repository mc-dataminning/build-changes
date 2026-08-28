import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class frq extends fnc {
   private static final xo a = xo.c("selectWorld.experimental.title");
   private static final xo b = xo.c("selectWorld.experimental.message");
   private static final xo c = xo.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atw> u;
   private final fkp v = new fkp().a(10).b(20);

   public frq(Collection<atw> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      fkp.b $$0 = this.v.d(2);
      fkt $$1 = $$0.b().b();
      $$0.a(new fik(this.l, this.p), 2, $$1);
      fhx $$2 = $$0.a(new fhx(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fhd.a(c, $$0x -> this.m.a(new frq.a())).a(100).a(), 2, $$1);
      $$0.a(fhd.a(xn.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fhd.a(xn.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fko.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fnc {
      private static final xo b = xo.c("selectWorld.experimental.details.title");
      final fkq c = new fkq(this);
      @Nullable
      private frq.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new frq.a.a(this.m, frq.this.u));
         this.c.b(fhd.a(xn.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fhb var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         if (this.d != null) {
            this.d.a(this.n, this.c);
         }

         this.c.a();
      }

      @Override
      public void d() {
         this.m.a(frq.this);
      }

      class a extends fhz<frq.a.b> {
         public a(final ffe $$0, final Collection<atw> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atw $$2 : $$1) {
               String $$3 = cpm.a(cpm.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xo $$4 = xr.a($$2.b().f(), yl.a.a(true));
                  xo $$5 = xo.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fhw.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fhz.a<frq.a.b> {
         private final xo b;
         private final xo c;
         private final fhw d;

         b(final xo $$0, final xo $$1, final fhw $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xn.a(this.b, this.c));
         }
      }
   }
}
