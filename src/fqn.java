import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fqn extends flz {
   private static final wx a = wx.c("selectWorld.experimental.title");
   private static final wx b = wx.c("selectWorld.experimental.message");
   private static final wx c = wx.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atf> u;
   private final fjm v = new fjm().a(10).b(20);

   public fqn(Collection<atf> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public wx i() {
      return ww.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fjm.b $$0 = this.v.d(2);
      fjq $$1 = $$0.b().b();
      $$0.a(new fhh(this.l, this.p), 2, $$1);
      fgu $$2 = $$0.a(new fgu(b, this.p).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fga.a(c, $$0x -> this.m.a(new fqn.a())).a(100).a(), 2, $$1);
      $$0.a(fga.a(ww.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fga.a(ww.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fjl.a(this.v, 0, 0, this.n, this.o, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends flz {
      private static final wx b = wx.c("selectWorld.experimental.details.title");
      final fjn c = new fjn(this);
      @Nullable
      private fqn.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         this.d = this.c.c(new fqn.a.a(this, this.m, fqn.this.u));
         this.c.b(fga.a(ww.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            ffy var10000 = this.c($$1);
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

      class a extends fgw<fqn.a.b> {
         public a(feb var1, Collection<atf> $$0, Collection $$1) {
            super($$0, var1.n, var1.c.d(), var1.c.c(), (9 + 2) * 3);

            for (atf $$2 : $$1) {
               String $$3 = coo.a(coo.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wx $$4 = xa.a($$2.b().f(), xu.a.a(true));
                  wx $$5 = wx.a("selectWorld.experimental.details.entry", $$3);
                  this.b(var1.new b($$4, $$5, fgt.a(var1.p, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fgw.a<fqn.a.b> {
         private final wx b;
         private final wx c;
         private final fgt d;

         b(wx $$0, wx $$1, fgt $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
