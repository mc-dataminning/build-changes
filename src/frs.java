import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class frs extends fne {
   private static final xp a = xp.c("selectWorld.experimental.title");
   private static final xp b = xp.c("selectWorld.experimental.message");
   private static final xp c = xp.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atx> u;
   private final fkr v = new fkr().a(10).b(20);

   public frs(Collection<atx> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public xp i() {
      return xo.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      fkr.b $$0 = this.v.d(2);
      fkv $$1 = $$0.b().b();
      $$0.a(new fim(this.l, this.p), 2, $$1);
      fhz $$2 = $$0.a(new fhz(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fhf.a(c, $$0x -> this.m.a(new frs.a())).a(100).a(), 2, $$1);
      $$0.a(fhf.a(xo.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fhf.a(xo.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fkq.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fne {
      private static final xp b = xp.c("selectWorld.experimental.details.title");
      final fks c = new fks(this);
      @Nullable
      private frs.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new frs.a.a(this.m, frs.this.u));
         this.c.b(fhf.a(xo.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fhd var10000 = this.c($$1);
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
         this.m.a(frs.this);
      }

      class a extends fib<frs.a.b> {
         public a(final ffg $$0, final Collection<atx> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atx $$2 : $$1) {
               String $$3 = cpo.a(cpo.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xp $$4 = xs.a($$2.b().f(), ym.a.a(true));
                  xp $$5 = xp.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fhy.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fib.a<frs.a.b> {
         private final xp b;
         private final xp c;
         private final fhy d;

         b(final xp $$0, final xp $$1, final fhy $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", xo.a(this.b, this.c));
         }
      }
   }
}
