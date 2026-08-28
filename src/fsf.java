import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class fsf extends fnj {
   private static final wu a = wu.c("selectWorld.experimental.title");
   private static final wu b = wu.c("selectWorld.experimental.message");
   private static final wu c = wu.c("selectWorld.experimental.details");
   private static final int q = 10;
   private static final int r = 100;
   private final BooleanConsumer s;
   final Collection<ate> u;
   private final fle v = new fle().a(10).b(20);

   public fsf(Collection<ate> $$0, BooleanConsumer $$1) {
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
      fle.b $$0 = this.v.d(2);
      fli $$1 = $$0.b().b();
      $$0.a(new fiz(this.k, this.o), 2, $$1);
      fim $$2 = $$0.a(new fim(b, this.o).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fhs.a(c, $$0x -> this.l.a(new fsf.a())).a(100).a(), 2, $$1);
      $$0.a(fhs.a(wt.i, $$0x -> this.s.accept(true)).a());
      $$0.a(fhs.a(wt.k, $$0x -> this.s.accept(false)).a());
      this.v.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      fld.a(this.v, 0, 0, this.m, this.n, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.s.accept(false);
   }

   class a extends fnj {
      private static final wu b = wu.c("selectWorld.experimental.details.title");
      final flf c = new flf(this);
      @Nullable
      private fsf.a.a q;

      a() {
         super(b);
      }

      @Override
      protected void aP_() {
         this.c.a(b, this.o);
         this.q = this.c.c(new fsf.a.a(this.l, fsf.this.u));
         this.c.b(fhs.a(wt.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fhq var10000 = this.c($$1);
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
         this.l.a(fsf.this);
      }

      class a extends fio<fsf.a.b> {
         public a(final fft $$0, final Collection<ate> $$1) {
            super($$0, a.this.m, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (ate $$2 : $$1) {
               String $$3 = cpa.a(cpa.f, $$2.e());
               if (!$$3.isEmpty()) {
                  wu $$4 = wx.a($$2.b().f(), xr.a.a(true));
                  wu $$5 = wu.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fil.a(a.this.o, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fio.a<fsf.a.b> {
         private final wu b;
         private final wu c;
         private final fil d;

         b(final wu $$0, final wu $$1, final fil $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
