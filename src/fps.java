import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fps extends fld {
   private static final wu a = wu.c("selectWorld.experimental.title");
   private static final wu b = wu.c("selectWorld.experimental.message");
   private static final wu c = wu.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<asz> u;
   private final fiq v = new fiq().a(10).b(20);

   public fps(Collection<asz> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      fiq.b $$0 = this.v.d(2);
      fiu $$1 = $$0.b().b();
      $$0.a(new fgl(this.l, this.p), 2, $$1);
      ffy $$2 = $$0.a(new ffy(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(ffe.a(c, $$0x -> this.m.a(new fps.a())).a(100).a(), 2, $$1);
      $$0.a(ffe.a(wt.i, $$0x -> this.s.accept(true)).a());
      $$0.a(ffe.a(wt.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fip.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fld {
      private static final wu b = wu.c("selectWorld.experimental.details.title");
      final fir c = new fir(this);

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.c.c(new fps.a.a(this.m, fps.this.u));
         this.c.b(ffe.a(wt.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            ffc var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.m.a(fps.this);
      }

      class a extends fga<fps.a.b> {
         public a(fde $$0, Collection<asz> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (asz $$2 : $$1) {
               String $$3 = cnw.a(cnw.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wu $$4 = wx.a($$2.b().f(), xr.a.a(true));
                  wu $$5 = wu.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, ffx.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fga.a<fps.a.b> {
         private final wu b;
         private final wu c;
         private final ffx d;

         b(wu $$0, wu $$1, ffx $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wt.a(this.b, this.c));
         }
      }
   }
}
