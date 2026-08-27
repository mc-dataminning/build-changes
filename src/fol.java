import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fol extends fjx {
   private static final wi a = wi.c("selectWorld.experimental.title");
   private static final wi b = wi.c("selectWorld.experimental.message");
   private static final wi c = wi.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int o = 100;
   private final BooleanConsumer p;
   final Collection<asm> q;
   private final fhk r = new fhk().a(10).b(20);

   public fol(Collection<asm> $$0, BooleanConsumer $$1) {
      super(a);
      this.q = $$0;
      this.p = $$1;
   }

   @Override
   public wi i() {
      return wh.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      fhk.b $$0 = this.r.d(2);
      fho $$1 = $$0.b().b();
      $$0.a(new fff(this.i, this.m), 2, $$1);
      fes $$2 = $$0.a(new fes(b, this.m).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fdy.a(c, $$0x -> this.j.a(new fol.a())).a(100).a(), 2, $$1);
      $$0.a(fdy.a(wh.i, $$0x -> this.p.accept(true)).a());
      $$0.a(fdy.a(wh.k, $$0x -> this.p.accept(false)).a());
      this.r.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.r.a();
      this.c();
   }

   @Override
   protected void c() {
      fhj.a(this.r, 0, 0, this.k, this.l, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.p.accept(false);
   }

   class a extends fjx {
      private static final wi b = wi.c("selectWorld.experimental.details.title");
      final fhl c = new fhl(this);

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.m);
         this.c.c(new fol.a.a(this.j, fol.this.q));
         this.c.b(fdy.a(wh.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fdw var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.j.a(fol.this);
      }

      class a extends feu<fol.a.b> {
         public a(fby $$0, Collection<asm> $$1) {
            super($$0, a.this.k, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (asm $$2 : $$1) {
               String $$3 = cmp.a(cmp.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wi $$4 = wl.a($$2.b().f(), xf.a.a(true));
                  wi $$5 = wi.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fer.a(a.this.m, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends feu.a<fol.a.b> {
         private final wi b;
         private final wi c;
         private final fer d;

         b(wi $$0, wi $$1, fer $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.j.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wi a() {
            return wi.a("narrator.select", wh.a(this.b, this.c));
         }
      }
   }
}
