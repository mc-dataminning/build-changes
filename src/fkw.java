import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fkw extends fgh {
   private static final vs a = vs.c("selectWorld.experimental.title");
   private static final vs b = vs.c("selectWorld.experimental.message");
   private static final vs c = vs.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<arn> n;
   private final fdv o = new fdv().a(10).b(20);

   public fkw(Collection<arn> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vs i() {
      return vr.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      fdv.b $$0 = this.o.d(2);
      fdz $$1 = $$0.b().b();
      $$0.a(new fbr(this.e, this.i), 2, $$1);
      fbe $$2 = $$0.a(new fbe(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(fak.a(c, $$0x -> this.f.a(new fkw.a())).a(100).a(), 2, $$1);
      $$0.a(fak.a(vr.i, $$0x -> this.m.accept(true)).a());
      $$0.a(fak.a(vr.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fdu.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.m.accept(false);
   }

   class a extends fgh {
      private fkw.a.a b;

      a() {
         super(vs.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void d() {
         this.f.a(fkw.this);
      }

      @Override
      protected void aP_() {
         super.aP_();
         this.c(fak.a(vr.k, $$0 -> this.d()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.c(new fkw.a.a(this.f, fkw.this.n));
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends fbg<fkw.a.b> {
         public a(eyk $$0, Collection<arn> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (arn $$2 : $$1) {
               String $$3 = ckn.a(ckn.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vs $$4 = vv.a($$2.a().f(), wp.a.a(true));
                  vs $$5 = vs.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fbd.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fbg.a<fkw.a.b> {
         private final vs b;
         private final vs c;
         private final fbd d;

         b(vs $$0, vs $$1, fbd $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vs a() {
            return vs.a("narrator.select", vr.a(this.b, this.c));
         }
      }
   }
}
