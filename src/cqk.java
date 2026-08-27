import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cqk extends cqn {
   private final float a;
   private final Multimap<ij<bpg>, bpj> b;

   public cqk(cqm $$0, int $$1, float $$2, cou.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<ij<bpg>, bpj> $$4 = ImmutableMultimap.builder();
      $$4.put(bpl.c, new bpj(m, "Weapon modifier", (double)this.a, bpj.a.a));
      $$4.put(bpl.e, new bpj(n, "Weapon modifier", (double)$$2, bpj.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
      return !$$3.f();
   }

   @Override
   public float a(coz $$0, dlf $$1) {
      if ($$1.a(cyq.bs)) {
         return 15.0F;
      } else {
         return $$1.a(atz.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(coz $$0, bog $$1, bog $$2) {
      $$0.a(1, $$2, bnv.a);
      return true;
   }

   @Override
   public boolean a(coz $$0, cvn $$1, dlf $$2, hz $$3, bog $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bnv.a);
      }

      return true;
   }

   @Override
   public boolean a_(dlf $$0) {
      return $$0.a(cyq.bs);
   }

   @Override
   public Multimap<ij<bpg>, bpj> a(bnv $$0) {
      return $$0 == bnv.a ? this.b : super.a($$0);
   }
}
