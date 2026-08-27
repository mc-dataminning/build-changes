import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fqn extends fly {
   private static final wx a = wx.c("selectWorld.experimental.title");
   private static final wx b = wx.c("selectWorld.experimental.message");
   private static final wx c = wx.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<ate> u;
   private final fjl v = new fjl().a(10).b(20);

   public fqn(Collection<ate> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public wx i() {
      return ww.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      fjl.b $$0 = this.v.d(2);
      fjp $$1 = $$0.b().b();
      $$0.a(new fhg(this.l, this.p), 2, $$1);
      fgt $$2 = $$0.a(new fgt(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(ffz.a(c, $$0x -> this.m.a(new fqn.a())).a(100).a(), 2, $$1);
      $$0.a(ffz.a(ww.i, $$0x -> this.s.accept(true)).a());
      $$0.a(ffz.a(ww.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         ffx var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fjk.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fly {
      private static final wx b = wx.c("selectWorld.experimental.details.title");
      final fjm c = new fjm(this);
      @Nullable
      private fqn.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aM_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fqn.a.a(this.m, fqn.this.u));
         this.c.b(ffz.a(ww.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            ffx var10000 = this.c($$1);
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
         this.m.a(fqn.this);
      }

      class a extends fgv<fqn.a.b> {
         public a(fdz $$0, Collection<ate> $$1) {
            super($$0, a.this.n, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (ate $$2 : $$1) {
               String $$3 = col.a(col.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wx $$4 = xa.a($$2.b().f(), xu.a.a(true));
                  wx $$5 = wx.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fgs.a(a.this.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fgv.a<fqn.a.b> {
         private final wx b;
         private final wx c;
         private final fgs d;

         b(wx $$0, wx $$1, fgs $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.m.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", ww.a(this.b, this.c));
         }
      }
   }
}
