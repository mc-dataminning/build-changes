import java.util.List;
import javax.annotation.Nullable;

public class fqp extends fnx {
   private static final int a = 310;
   private static final int b = 25;
   private static final wy c = wy.c("menu.server_links.title");
   private final fnx q;
   @Nullable
   private fqp.a r;
   final flt s = new flt(this);
   final ali u;

   public fqp(fnx $$0, ali $$1) {
      super(c);
      this.q = $$0;
      this.u = $$1;
   }

   @Override
   protected void aP_() {
      this.s.a(this.k, this.o);
      this.r = this.s.c(new fqp.a(this.l, this.m, this));
      this.s.b(fig.a(wx.k, $$0 -> this.d()).a(200).a());
      this.s.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.r != null) {
         this.r.a(this.m, this.s);
      }
   }

   @Override
   public void d() {
      this.l.a(this.q);
   }

   static class a extends fim<fqp.b> {
      public a(fgi $$0, int $$1, fqp $$2) {
         super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
         $$2.u.b().forEach($$1x -> this.b(new fqp.b($$2, $$1x)));
      }

      @Override
      public int b() {
         return 310;
      }

      @Override
      public void a(int $$0, flt $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aG_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends fim.a<fqp.b> {
      final fie a;

      b(fnx $$0, ali.a $$1) {
         this.a = fig.a($$1.a(), fmu.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fkc> aG_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fma> b() {
         return List.of(this.a);
      }
   }
}
