import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fpi extends fkt {
   private static final ws a = ws.c("selectWorld.experimental.title");
   private static final ws b = ws.c("selectWorld.experimental.message");
   private static final ws c = ws.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<asw> u;
   private final fig v = new fig().a(10).b(20);

   public fpi(Collection<asw> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public ws i() {
      return wr.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      fig.b $$0 = this.v.d(2);
      fik $$1 = $$0.b().b();
      $$0.a(new fgb(this.l, this.p), 2, $$1);
      ffo $$2 = $$0.a(new ffo(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(feu.a(c, $$0x -> this.m.a(new fpi.a())).a(100).a(), 2, $$1);
      $$0.a(feu.a(wr.i, $$0x -> this.s.accept(true)).a());
      $$0.a(feu.a(wr.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fif.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fkt {
      private static final ws b = ws.c("selectWorld.experimental.details.title");
      final fih c = new fih(this);

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.c.c(new fpi.a.a(this.m, fpi.this.u));
         this.c.b(feu.a(wr.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fes var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.m.a(fpi.this);
      }

      class a extends ffq<fpi.a.b> {
         public a(fcu $$0, Collection<asw> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (asw $$2 : $$1) {
               String $$3 = cna.a(cna.g, $$2.e());
               if (!$$3.isEmpty()) {
                  ws $$4 = wv.a($$2.b().f(), xp.a.a(true));
                  ws $$5 = ws.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, ffn.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends ffq.a<fpi.a.b> {
         private final ws b;
         private final ws c;
         private final ffn d;

         b(ws $$0, ws $$1, ffn $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public ws a() {
            return ws.a("narrator.select", wr.a(this.b, this.c));
         }
      }
   }
}
