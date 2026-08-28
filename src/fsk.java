import java.util.List;
import javax.annotation.Nullable;

public class fsk extends fpt {
   private static final int a = 310;
   private static final int b = 25;
   private static final xd c = xd.c("menu.server_links.title");
   private final fpt d;
   @Nullable
   private fsk.a s;
   final fno u = new fno(this);
   final alt v;

   public fsk(fpt $$0, alt $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aT_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new fsk.a(this.m, this.n, this));
      this.u.b(fka.a(xc.k, $$0 -> this.d()).a(200).a());
      this.u.a($$1 -> {
         fjy var10000 = this.c($$1);
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

   static class a extends fkg<fsk.b> {
      public a(fib $$0, int $$1, fsk $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fsk.b($$2, $$1x)));
      }

      @Override
      public int b() {
         return 310;
      }

      @Override
      public void a(int $$0, fno $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aK_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends fkg.a<fsk.b> {
      final fjy a;

      b(fpt $$0, alt.a $$1) {
         this.a = fka.a($$1.a(), fop.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends flx> aK_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fnv> b() {
         return List.of(this.a);
      }
   }
}
