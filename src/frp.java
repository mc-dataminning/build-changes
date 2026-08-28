import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class frp extends fnb {
   private static final xo a = xo.c("selectWorld.experimental.title");
   private static final xo b = xo.c("selectWorld.experimental.message");
   private static final xo c = xo.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atw> u;
   private final fko v = new fko().a(10).b(20);

   public frp(Collection<atw> $$0, BooleanConsumer $$1) {
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
      fko.b $$0 = this.v.d(2);
      fks $$1 = $$0.b().b();
      $$0.a(new fij(this.l, this.p), 2, $$1);
      fhw $$2 = $$0.a(new fhw(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fhc.a(c, $$0x -> this.m.a(new frp.a())).a(100).a(), 2, $$1);
      $$0.a(fhc.a(xn.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fhc.a(xn.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fha var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fkn.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fnb {
      private static final xo b = xo.c("selectWorld.experimental.details.title");
      final fkp c = new fkp(this);
      @Nullable
      private frp.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new frp.a.a(this.m, frp.this.u));
         this.c.b(fhc.a(xn.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fha var10000 = this.c($$1);
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
         this.m.a(frp.this);
      }

      class a extends fhy<frp.a.b> {
         public a(final ffd $$0, final Collection<atw> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atw $$2 : $$1) {
               String $$3 = cpl.a(cpl.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xo $$4 = xr.a($$2.b().f(), yl.a.a(true));
                  xo $$5 = xo.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fhv.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fhy.a<frp.a.b> {
         private final xo b;
         private final xo c;
         private final fhv d;

         b(final xo $$0, final xo $$1, final fhv $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
