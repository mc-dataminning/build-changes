import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class frt extends fnf {
   private static final xp a = xp.c("selectWorld.experimental.title");
   private static final xp b = xp.c("selectWorld.experimental.message");
   private static final xp c = xp.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atx> u;
   private final fks v = new fks().a(10).b(20);

   public frt(Collection<atx> $$0, BooleanConsumer $$1) {
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
      fks.b $$0 = this.v.d(2);
      fkw $$1 = $$0.b().b();
      $$0.a(new fin(this.l, this.p), 2, $$1);
      fia $$2 = $$0.a(new fia(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fhg.a(c, $$0x -> this.m.a(new frt.a())).a(100).a(), 2, $$1);
      $$0.a(fhg.a(xo.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fhg.a(xo.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fkr.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fnf {
      private static final xp b = xp.c("selectWorld.experimental.details.title");
      final fkt c = new fkt(this);
      @Nullable
      private frt.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new frt.a.a(this.m, frt.this.u));
         this.c.b(fhg.a(xo.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fhe var10000 = this.c($$1);
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
         this.m.a(frt.this);
      }

      class a extends fic<frt.a.b> {
         public a(final ffh $$0, final Collection<atx> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atx $$2 : $$1) {
               String $$3 = cpp.a(cpp.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xp $$4 = xs.a($$2.b().f(), ym.a.a(true));
                  xp $$5 = xp.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fhz.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fic.a<frt.a.b> {
         private final xp b;
         private final xp c;
         private final fhz d;

         b(final xp $$0, final xp $$1, final fhz $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
