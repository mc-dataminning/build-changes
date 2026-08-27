import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bor extends bnc<byr> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<byr, bim> e;
   private final bvx f;
   private final float g;
   private final ToDoubleFunction<byr> h;
   private ejz i;
   private final Function<byr, aqu> j;
   private final Function<byr, aqu> k;

   public bor(Function<byr, bim> $$0, bvx $$1, float $$2, ToDoubleFunction<byr> $$3, Function<byr, aqu> $$4, Function<byr, aqu> $$5) {
      super(ImmutableMap.of(bum.U, bun.b, bum.V, bun.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ejz.b;
   }

   protected boolean a(ami $$0, byr $$1) {
      return $$1.dP().a(bum.V);
   }

   protected boolean a(ami $$0, byr $$1, long $$2) {
      return $$1.dP().a(bum.V);
   }

   protected void b(ami $$0, byr $$1, long $$2) {
      hx $$3 = $$1.dn();
      bml<?> $$4 = $$1.dP();
      ejz $$5 = $$4.c(bum.V).get();
      this.i = new ejz((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bum.m, new bup($$5, this.g, 0));
   }

   protected void c(ami $$0, byr $$1, long $$2) {
      List<bll> $$3 = $$0.a(bll.class, this.f, $$1, $$1.cH());
      bml<?> $$4 = $$1.dP();
      if (!$$3.isEmpty()) {
         bll $$5 = $$3.get(0);
         $$5.a($$0.ah().c((bll)$$1), (float)$$1.b(bmr.c));
         int $$6 = $$1.a(bkk.a) ? $$1.b(bkk.a).e() + 1 : 0;
         int $$7 = $$1.a(bkk.b) ? $$1.b(bkk.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = atq.a($$1.fg() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ah().b((bll)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aqw.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aqw.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gm();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aqw.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bup> $$12 = $$4.c(bum.m);
         Optional<ejz> $$13 = $$4.c(bum.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ami $$0, byr $$1) {
      ejz $$2 = $$1.dq().d(1.0, 0.0, 1.0).d();
      hx $$3 = hx.a($$1.dl().e($$2));
      return $$0.a_($$3).a(ark.ce) || $$0.a_($$3.c()).a(ark.ce);
   }

   protected void b(ami $$0, byr $$1) {
      $$0.a($$1, (byte)59);
      $$1.dP().a(bum.U, this.e.apply($$1).a($$0.z));
      $$1.dP().b(bum.V);
   }
}
