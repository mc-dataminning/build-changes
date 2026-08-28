import java.util.List;
import javax.annotation.Nullable;

public class ftr extends fra {
   private static final int a = 310;
   private static final int b = 25;
   private static final xi c = xi.c("menu.server_links.title");
   private final fra d;
   @Nullable
   private ftr.a s;
   final fow u = new fow(this);
   final ama v;

   public ftr(fra $$0, ama $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aR_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new ftr.a(this.m, this.n, this));
      this.u.b(flh.a(xh.k, $$0 -> this.d()).a(200).a());
      this.u.a($$1 -> {
         flf var10000 = this.c($$1);
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
   public void d() {
      this.m.a(this.d);
   }

   static class a extends fln<ftr.b> {
      public a(fji $$0, int $$1, ftr $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new ftr.b($$2, $$1x)));
      }

      @Override
      public int b() {
         return 310;
      }

      @Override
      public void a(int $$0, fow $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aI_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends fln.a<ftr.b> {
      final flf a;

      b(fra $$0, ama.a $$1) {
         this.a = flh.a($$1.a(), fpx.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fne> aI_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fpd> b() {
         return List.of(this.a);
      }
   }
}
