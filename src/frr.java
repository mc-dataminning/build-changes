import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class frr extends fnd {
   private static final xp a = xp.c("selectWorld.experimental.title");
   private static final xp b = xp.c("selectWorld.experimental.message");
   private static final xp c = xp.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atx> u;
   private final fkq v = new fkq().a(10).b(20);

   public frr(Collection<atx> $$0, BooleanConsumer $$1) {
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
      fkq.b $$0 = this.v.d(2);
      fku $$1 = $$0.b().b();
      $$0.a(new fil(this.l, this.p), 2, $$1);
      fhy $$2 = $$0.a(new fhy(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fhe.a(c, $$0x -> this.m.a(new frr.a())).a(100).a(), 2, $$1);
      $$0.a(fhe.a(xo.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fhe.a(xo.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fhc var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fkp.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fnd {
      private static final xp b = xp.c("selectWorld.experimental.details.title");
      final fkr c = new fkr(this);
      @Nullable
      private frr.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new frr.a.a(this.m, frr.this.u));
         this.c.b(fhe.a(xo.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fhc var10000 = this.c($$1);
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
         this.m.a(frr.this);
      }

      class a extends fia<frr.a.b> {
         public a(final fff $$0, final Collection<atx> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atx $$2 : $$1) {
               String $$3 = cpn.a(cpn.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xp $$4 = xs.a($$2.b().f(), ym.a.a(true));
                  xp $$5 = xp.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fhx.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fia.a<frr.a.b> {
         private final xp b;
         private final xp c;
         private final fhx d;

         b(final xp $$0, final xp $$1, final fhx $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
