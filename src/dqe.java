import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dqe extends dna implements dtn {
   public static final MapCodec<dqe> a = b(dqe::new);
   private static final fgw b = dno.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   protected dqe(ebp.d $$0) {
      super($$0);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eal($$0, $$1);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, bxe $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == dkj.k && $$3 instanceof asc $$5 && !$$5.i) {
            $$5.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eza a(asb $$0, bxe $$1, iw $$2) {
      alq<dkj> $$3 = $$0.aj() == dkj.k ? dkj.i : dkj.k;
      asb $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dkj.k;
         iw $$6 = $$5 ? asb.a : $$4.aa();
         fgc $$7 = $$6.c();
         float $$8;
         Set<byt> $$9;
         if ($$5) {
            ekt.a($$4, iw.a((jq)$$7).e(), true);
            $$8 = jc.e.p();
            $$9 = byt.a(byt.l, Set.of(byt.e));
            if ($$1 instanceof asc) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = byt.a(byt.l, byt.k);
            if ($$1 instanceof asc $$12) {
               return $$12.a(false, eza.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eza($$4, $$7, fgc.c, $$8, 0.0F, $$9, eza.b.then(eza.c));
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lz.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return dak.l;
   }

   @Override
   protected boolean a(ebq $$0, exz $$1) {
      return false;
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }
}
