import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fgr extends fcc {
   private static final vb a = vb.c("selectWorld.experimental.title");
   private static final vb b = vb.c("selectWorld.experimental.message");
   private static final vb c = vb.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<apa> n;
   private final ezq o = new ezq().a(10).b(20);

   public fgr(Collection<apa> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vb h() {
      return va.a(super.h(), b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      ezq.b $$0 = this.o.d(2);
      ezu $$1 = $$0.b().b();
      $$0.a(new exo(this.e, this.i), 2, $$1);
      exb $$2 = $$0.a(new exb(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(ewh.a(c, $$0x -> this.f.a(new fgr.a())).a(100).a(), 2, $$1);
      $$0.a(ewh.a(va.i, $$0x -> this.m.accept(true)).a());
      $$0.a(ewh.a(va.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      ezp.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void aF_() {
      this.m.accept(false);
   }

   class a extends fcc {
      private fgr.a.a b;

      a() {
         super(vb.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aF_() {
         this.f.a(fgr.this);
      }

      @Override
      protected void aP_() {
         super.aP_();
         this.d(ewh.a(va.k, $$0 -> this.aF_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fgr.a.a(this.f, fgr.this.n);
         this.e(this.b);
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends exd<fgr.a.b> {
         public a(euk $$0, Collection<apa> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (apa $$2 : $$1) {
               String $$3 = chd.a(chd.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vb $$4 = ve.a($$2.a().f(), vy.a.a(true));
                  vb $$5 = vb.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, exa.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends exd.a<fgr.a.b> {
         private final vb b;
         private final vb c;
         private final exa d;

         b(vb $$0, vb $$1, exa $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vb a() {
            return vb.a("narrator.select", va.a(this.b, this.c));
         }
      }
   }
}
