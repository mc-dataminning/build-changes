import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fsv extends fnx {
   private static final wy a = wy.c("selectWorld.experimental.title");
   private static final wy b = wy.c("selectWorld.experimental.message");
   private static final wy c = wy.c("selectWorld.experimental.details");
   private static final int q = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<atl> u;
   private final fls v = new fls().a(10).b(20);

   public fsv(Collection<atl> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      fls.b $$0 = this.v.d(2);
      flw $$1 = $$0.b().b();
      $$0.a(new fjn(this.k, this.o), 2, $$1);
      fja $$2 = $$0.a(new fja(b, this.o).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fig.a(c, $$0x -> this.l.a(new fsv.a())).a(100).a(), 2, $$1);
      $$0.a(fig.a(wx.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fig.a(wx.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      flr.a(this.v, 0, 0, this.m, this.n, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fnx {
      private static final wy b = wy.c("selectWorld.experimental.details.title");
      final flt c = new flt(this);
      @Nullable
      private fsv.a.a q;

      a() {
         super(b);
      }

      @Override
      protected void aP_() {
         this.c.a(b, this.o);
         this.q = this.c.c(new fsv.a.a(this.l, fsv.this.u));
         this.c.b(fig.a(wx.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fie var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         if (this.q != null) {
            this.q.a(this.m, this.c);
         }

         this.c.a();
      }

      @Override
      public void d() {
         this.l.a(fsv.this);
      }

      class a extends fjc<fsv.a.b> {
         public a(final fgi $$0, final Collection<atl> $$1) {
            super($$0, a.this.m, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (atl $$2 : $$1) {
               String $$3 = cpl.a(cpl.f, $$2.e());
               if (!$$3.isEmpty()) {
                  wy $$4 = xb.a($$2.b().f(), xv.a.a(true));
                  wy $$5 = wy.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fiz.a(a.this.o, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fjc.a<fsv.a.b> {
         private final wy b;
         private final wy c;
         private final fiz d;

         b(final wy $$0, final wy $$1, final fiz $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.l.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wx.a(this.b, this.c));
         }
      }
   }
}
