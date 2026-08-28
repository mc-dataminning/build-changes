import java.util.List;
import javax.annotation.Nullable;

public class fug extends frp {
   private static final int a = 310;
   private static final int b = 25;
   private static final xl c = xl.c("menu.server_links.title");
   private final frp d;
   @Nullable
   private fug.a s;
   final fpl u = new fpl(this);
   final amd v;

   public fug(frp $$0, amd $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aS_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new fug.a(this.m, this.n, this));
      this.u.b(flw.a(xk.k, $$0 -> this.aP_()).a(200).a());
      this.u.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      if (this.s != null) {
         this.s.a(this.n, this.u);
      }
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   static class a extends fmc<fug.b> {
      public a(fjx $$0, int $$1, fug $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fug.b($$2, $$1x)));
      }

      @Override
      public int b() {
         return 310;
      }

      @Override
      public void a(int $$0, fpl $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aI_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends fmc.a<fug.b> {
      final flu a;

      b(frp $$0, amd.a $$1) {
         this.a = flw.a($$1.a(), fqm.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fnt> aI_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fps> b() {
         return List.of(this.a);
      }
   }
}
