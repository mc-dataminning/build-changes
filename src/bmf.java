import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bmf extends bkq<bwf> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bwf, bgb> e;
   private final btl f;
   private final float g;
   private final ToDoubleFunction<bwf> h;
   private ehe i;
   private final Function<bwf, aov> j;
   private final Function<bwf, aov> k;

   public bmf(Function<bwf, bgb> $$0, btl $$1, float $$2, ToDoubleFunction<bwf> $$3, Function<bwf, aov> $$4, Function<bwf, aov> $$5) {
      super(ImmutableMap.of(bsa.U, bsb.b, bsa.V, bsb.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ehe.b;
   }

   protected boolean a(akk $$0, bwf $$1) {
      return $$1.dM().a(bsa.V);
   }

   protected boolean a(akk $$0, bwf $$1, long $$2) {
      return $$1.dM().a(bsa.V);
   }

   protected void b(akk $$0, bwf $$1, long $$2) {
      gu $$3 = $$1.dk();
      bjz<?> $$4 = $$1.dM();
      ehe $$5 = $$4.c(bsa.V).get();
      this.i = new ehe((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bsa.m, new bsd($$5, this.g, 0));
   }

   protected void c(akk $$0, bwf $$1, long $$2) {
      List<biy> $$3 = $$0.a(biy.class, this.f, $$1, $$1.cG());
      bjz<?> $$4 = $$1.dM();
      if (!$$3.isEmpty()) {
         biy $$5 = $$3.get(0);
         $$5.a($$0.ag().c((biy)$$1), (float)$$1.b(bkf.f));
         int $$6 = $$1.a(bhx.a) ? $$1.b(bhx.a).e() + 1 : 0;
         int $$7 = $$1.a(bhx.b) ? $$1.b(bhx.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = arp.a($$1.fd() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((biy)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aox.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aox.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gg();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aox.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bsd> $$12 = $$4.c(bsa.m);
         Optional<ehe> $$13 = $$4.c(bsa.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(akk $$0, bwf $$1) {
      ehe $$2 = $$1.dn().d(1.0, 0.0, 1.0).d();
      gu $$3 = gu.a($$1.di().e($$2));
      return $$0.a_($$3).a(apl.ce) || $$0.a_($$3.c()).a(apl.ce);
   }

   protected void b(akk $$0, bwf $$1) {
      $$0.a($$1, (byte)59);
      $$1.dM().a(bsa.U, this.e.apply($$1).a($$0.z));
      $$1.dM().b(bsa.V);
   }
}
