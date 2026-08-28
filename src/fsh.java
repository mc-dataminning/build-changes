import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fsh extends fnl {
   private static final wu a = wu.c("selectWorld.experimental.title");
   private static final wu b = wu.c("selectWorld.experimental.message");
   private static final wu c = wu.c("selectWorld.experimental.details");
   private static final int q = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<ate> u;
   private final flg v = new flg().a(10).b(20);

   public fsh(Collection<ate> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.s = $$1;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      flg.b $$0 = this.v.d(2);
      flk $$1 = $$0.b().b();
      $$0.a(new fjb(this.k, this.o), 2, $$1);
      fio $$2 = $$0.a(new fio(b, this.o).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fhu.a(c, $$0x -> this.l.a(new fsh.a())).a(100).a(), 2, $$1);
      $$0.a(fhu.a(wt.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fhu.a(wt.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fhs var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      flf.a(this.v, 0, 0, this.m, this.n, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fnl {
      private static final wu b = wu.c("selectWorld.experimental.details.title");
      final flh c = new flh(this);
      @Nullable
      private fsh.a.a q;

      a() {
         super(b);
      }

      @Override
      protected void aP_() {
         this.c.a(b, this.o);
         this.q = this.c.c(new fsh.a.a(this.l, fsh.this.u));
         this.c.b(fhu.a(wt.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fhs var10000 = this.c($$1);
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
         this.l.a(fsh.this);
      }

      class a extends fiq<fsh.a.b> {
         public a(final ffw $$0, final Collection<ate> $$1) {
            super($$0, a.this.m, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (ate $$2 : $$1) {
               String $$3 = cpb.a(cpb.f, $$2.e());
               if (!$$3.isEmpty()) {
                  wu $$4 = wx.a($$2.b().f(), xr.a.a(true));
                  wu $$5 = wu.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fin.a(a.this.o, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fiq.a<fsh.a.b> {
         private final wu b;
         private final wu c;
         private final fin d;

         b(final wu $$0, final wu $$1, final fin $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.l.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wt.a(this.b, this.c));
         }
      }
   }
}
