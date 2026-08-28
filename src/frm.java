import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class frm extends fmy {
   private static final xl a = xl.c("selectWorld.experimental.title");
   private static final xl b = xl.c("selectWorld.experimental.message");
   private static final xl c = xl.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<att> u;
   private final fkl v = new fkl().a(10).b(20);

   public frm(Collection<att> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fkl.b $$0 = this.v.d(2);
      fkp $$1 = $$0.b().b();
      $$0.a(new fig(this.l, this.p), 2, $$1);
      fht $$2 = $$0.a(new fht(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fgz.a(c, $$0x -> this.m.a(new frm.a())).a(100).a(), 2, $$1);
      $$0.a(fgz.a(xk.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fgz.a(xk.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fkk.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fmy {
      private static final xl b = xl.c("selectWorld.experimental.details.title");
      final fkm c = new fkm(this);
      @Nullable
      private frm.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new frm.a.a(this.m, frm.this.u));
         this.c.b(fgz.a(xk.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fgx var10000 = this.c($$1);
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
         this.m.a(frm.this);
      }

      class a extends fhv<frm.a.b> {
         public a(final ffa $$0, final Collection<att> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (att $$2 : $$1) {
               String $$3 = cpi.a(cpi.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xl $$4 = xo.a($$2.b().f(), yi.a.a(true));
                  xl $$5 = xl.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fhs.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fhv.a<frm.a.b> {
         private final xl b;
         private final xl c;
         private final fhs d;

         b(final xl $$0, final xl $$1, final fhs $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", xk.a(this.b, this.c));
         }
      }
   }
}
