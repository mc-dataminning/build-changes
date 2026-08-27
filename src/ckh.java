import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckh extends ckk implements ckq {
   private final float a;
   private final Multimap<bjy, bkb> b;

   public ckh(ckj $$0, int $$1, float $$2, cir.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bjy, bkb> $$4 = ImmutableMultimap.builder();
      $$4.put(bkd.f, new bkb(m, "Weapon modifier", (double)this.a, bkb.a.a));
      $$4.put(bkd.h, new bkb(n, "Weapon modifier", (double)$$2, bkb.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
      return !$$3.f();
   }

   @Override
   public float a(ciw $$0, dey $$1) {
      if ($$1.a(csl.bs)) {
         return 15.0F;
      } else {
         return $$1.a(apj.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(ciw $$0, biw $$1, biw $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bil.a));
      return true;
   }

   @Override
   public boolean a(ciw $$0, cpk $$1, dey $$2, gv $$3, biw $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bil.a));
      }

      return true;
   }

   @Override
   public boolean a_(dey $$0) {
      return $$0.a(csl.bs);
   }

   @Override
   public Multimap<bjy, bkb> a(bil $$0) {
      return $$0 == bil.a ? this.b : super.a($$0);
   }
}
