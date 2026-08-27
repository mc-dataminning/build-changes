import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bsf extends bqp<cck> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cck, blw> e;
   private final bzn f;
   private final float g;
   private final ToDoubleFunction<cck> h;
   private eov i;
   private final Function<cck, ato> j;
   private final Function<cck, ato> k;

   public bsf(Function<cck, blw> $$0, bzn $$1, float $$2, ToDoubleFunction<cck> $$3, Function<cck, ato> $$4, Function<cck, ato> $$5) {
      super(ImmutableMap.of(bya.V, byb.b, bya.W, byb.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eov.b;
   }

   protected boolean a(apa $$0, cck $$1) {
      return $$1.dM().a(bya.W);
   }

   protected boolean a(apa $$0, cck $$1, long $$2) {
      return $$1.dM().a(bya.W);
   }

   protected void b(apa $$0, cck $$1, long $$2) {
      ib $$3 = $$1.dj();
      bpy<?> $$4 = $$1.dM();
      eov $$5 = $$4.c(bya.W).get();
      this.i = new eov((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bya.m, new byd($$5, this.g, 0));
   }

   protected void c(apa $$0, cck $$1, long $$2) {
      List<box> $$3 = $$0.a(box.class, this.f, $$1, $$1.cE());
      bpy<?> $$4 = $$1.dM();
      if (!$$3.isEmpty()) {
         box $$5 = $$3.get(0);
         $$5.a($$0.ah().c((box)$$1), (float)$$1.g(bqe.c));
         int $$6 = $$1.a(bnu.a) ? $$1.c(bnu.a).d() + 1 : 0;
         int $$7 = $$1.a(bnu.b) ? $$1.c(bnu.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = awm.a($$1.fh() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ah().b((box)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), atq.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), atq.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gs();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), atq.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<byd> $$12 = $$4.c(bya.m);
         Optional<eov> $$13 = $$4.c(bya.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(apa $$0, cck $$1) {
      eov $$2 = $$1.dm().d(1.0, 0.0, 1.0).d();
      ib $$3 = ib.a($$1.dh().e($$2));
      return $$0.a_($$3).a(aue.cf) || $$0.a_($$3.c()).a(aue.cf);
   }

   protected void b(apa $$0, cck $$1) {
      $$0.a($$1, (byte)59);
      $$1.dM().a(bya.V, this.e.apply($$1).a($$0.z));
      $$1.dM().b(bya.W);
   }
}
