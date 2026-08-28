import java.util.List;
import javax.annotation.Nullable;

public class fqt extends fob {
   private static final int a = 310;
   private static final int b = 25;
   private static final wz c = wz.c("menu.server_links.title");
   private final fob r;
   @Nullable
   private fqt.a s;
   final flx u = new flx(this);
   final alj v;

   public fqt(fob $$0, alj $$1) {
      super(c);
      this.r = $$0;
      this.v = $$1;
   }

   @Override
   protected void aT_() {
      this.u.a(this.k, this.o);
      this.s = this.u.c(new fqt.a(this.l, this.m, this));
      this.u.b(fik.a(wy.k, $$0 -> this.d()).a(200).a());
      this.u.a($$1 -> {
         fii var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      if (this.s != null) {
         this.s.a(this.m, this.u);
      }
   }

   @Override
   public void d() {
      this.l.a(this.r);
   }

   static class a extends fiq<fqt.b> {
      public a(fgm $$0, int $$1, fqt $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fqt.b($$2, $$1x)));
      }

      @Override
      public int b() {
         return 310;
      }

      @Override
      public void a(int $$0, flx $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aK_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends fiq.a<fqt.b> {
      final fii a;

      b(fob $$0, alj.a $$1) {
         this.a = fik.a($$1.a(), fmy.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fkg> aK_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fme> b() {
         return List.of(this.a);
      }
   }
}
