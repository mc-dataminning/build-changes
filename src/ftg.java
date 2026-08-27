import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class ftg extends fon {
   private static final xe a = xe.c("selectWorld.experimental.title");
   private static final xe b = xe.c("selectWorld.experimental.message");
   private static final xe c = xe.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atl> u;
   private final flz v = new flz().a(10).b(20);

   public ftg(Collection<atl> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      flz.b $$0 = this.v.d(2);
      fmd $$1 = $$0.b().b();
      $$0.a(new fju(this.l, this.p), 2, $$1);
      fjh $$2 = $$0.a(new fjh(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fin.a(c, $$0x -> this.m.a(new ftg.a())).a(100).a(), 2, $$1);
      $$0.a(fin.a(xd.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fin.a(xd.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fly.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fon {
      private static final xe b = xe.c("selectWorld.experimental.details.title");
      final fma c = new fma(this);

      a() {
         super(b);
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         this.c.c(new ftg.a.a(this.m, ftg.this.u));
         this.c.b(fin.a(xd.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fil var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.m.a(ftg.this);
      }

      class a extends fjj<ftg.a.b> {
         public a(fgj $$0, Collection<atl> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atl $$2 : $$1) {
               String $$3 = cor.a(cor.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xe $$4 = xh.a($$2.b().f(), yb.a.a(true));
                  xe $$5 = xe.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fjg.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fjj.a<ftg.a.b> {
         private final xe b;
         private final xe c;
         private final fjg d;

         b(xe $$0, xe $$1, fjg $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", xd.a(this.b, this.c));
         }
      }
   }
}
