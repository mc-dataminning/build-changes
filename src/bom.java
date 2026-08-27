import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bom extends bmx<bym> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bym, bii> e;
   private final bvs f;
   private final float g;
   private final ToDoubleFunction<bym> h;
   private eju i;
   private final Function<bym, aqq> j;
   private final Function<bym, aqq> k;

   public bom(Function<bym, bii> $$0, bvs $$1, float $$2, ToDoubleFunction<bym> $$3, Function<bym, aqq> $$4, Function<bym, aqq> $$5) {
      super(ImmutableMap.of(buh.U, bui.b, buh.V, bui.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eju.b;
   }

   protected boolean a(ame $$0, bym $$1) {
      return $$1.dP().a(buh.V);
   }

   protected boolean a(ame $$0, bym $$1, long $$2) {
      return $$1.dP().a(buh.V);
   }

   protected void b(ame $$0, bym $$1, long $$2) {
      ht $$3 = $$1.dn();
      bmg<?> $$4 = $$1.dP();
      eju $$5 = $$4.c(buh.V).get();
      this.i = new eju((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(buh.m, new buk($$5, this.g, 0));
   }

   protected void c(ame $$0, bym $$1, long $$2) {
      List<blg> $$3 = $$0.a(blg.class, this.f, $$1, $$1.cH());
      bmg<?> $$4 = $$1.dP();
      if (!$$3.isEmpty()) {
         blg $$5 = $$3.get(0);
         $$5.a($$0.ah().c((blg)$$1), (float)$$1.b(bmm.c));
         int $$6 = $$1.a(bkf.a) ? $$1.b(bkf.a).e() + 1 : 0;
         int $$7 = $$1.a(bkf.b) ? $$1.b(bkf.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = atm.a($$1.fg() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ah().b((blg)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aqs.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aqs.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gm();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aqs.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<buk> $$12 = $$4.c(buh.m);
         Optional<eju> $$13 = $$4.c(buh.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ame $$0, bym $$1) {
      eju $$2 = $$1.dq().d(1.0, 0.0, 1.0).d();
      ht $$3 = ht.a($$1.dl().e($$2));
      return $$0.a_($$3).a(arg.ce) || $$0.a_($$3.c()).a(arg.ce);
   }

   protected void b(ame $$0, bym $$1) {
      $$0.a($$1, (byte)59);
      $$1.dP().a(buh.U, this.e.apply($$1).a($$0.z));
      $$1.dP().b(buh.V);
   }
}
