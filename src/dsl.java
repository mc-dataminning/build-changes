import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsl extends dsk {
   public static final MapCodec<dsl> f = b(dsl::new);
   public static final eax<ja> g = dqa.e;
   public static final eaq h = dsk.b;

   @Override
   public MapCodec<dsl> a() {
      return f;
   }

   protected dsl(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(g, ja.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return dvq.o($$0);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return dvq.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dmc.a.m() : $$0;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = dmc.cy.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(h)) {
         ja $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ls.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(div $$0, iu $$1, dzz $$2) {
      ja $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected exo a(div $$0, dzz $$1) {
      return exk.a($$0, $$1.c(g).g(), ja.b);
   }
}
