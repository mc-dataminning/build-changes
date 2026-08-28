import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dzs extends doe {
   public static final MapCodec<dzs> b = b(dzs::new);
   public static final eax<ebb> c = eap.bj;
   public static final eaq d = eap.B;
   public static final int e = 4;
   private static final ffc f = dma.c(16.0, 0.0, 4.0);
   private static final Map<ja, ffc> g = fez.d(fez.a(f, dma.c(4.0, 4.0, 16.0)));
   private static final Map<ja, ffc> h = fez.d(fez.a(f, dma.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<dzs> a() {
      return b;
   }

   public dzs(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.c).b(c, ebb.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(dzz $$0, dzz $$1) {
      dma $$2 = $$0.c(c) == ebb.a ? dmc.bG : dmc.by;
      return $$1.a($$2) && $$1.c(dzr.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if (!$$0.C && $$3.gk()) {
         iu $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      iu $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dmc.bY) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if ($$0.a((diy)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, exk.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy($$2.c(c) == ebb.b ? dmc.by : dmc.bG);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
