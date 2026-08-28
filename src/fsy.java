import java.util.List;
import javax.annotation.Nullable;

public class fsy extends fqh {
   private static final int a = 310;
   private static final int b = 25;
   private static final xe c = xe.c("menu.server_links.title");
   private final fqh d;
   @Nullable
   private fsy.a s;
   final foc u = new foc(this);
   final alw v;

   public fsy(fqh $$0, alw $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aS_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new fsy.a(this.m, this.n, this));
      this.u.b(fko.a(xd.k, $$0 -> this.d()).a(200).a());
      this.u.a($$1 -> {
         fkm var10000 = this.c($$1);
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

   static class a extends fku<fsy.b> {
      public a(fip $$0, int $$1, fsy $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fsy.b($$2, $$1x)));
      }

      @Override
      public int b() {
         return 310;
      }

      @Override
      public void a(int $$0, foc $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aJ_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends fku.a<fsy.b> {
      final fkm a;

      b(fqh $$0, alw.a $$1) {
         this.a = fko.a($$1.a(), fpe.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fml> aJ_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends foj> b() {
         return List.of(this.a);
      }
   }
}
