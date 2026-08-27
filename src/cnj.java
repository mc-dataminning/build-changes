import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cnj extends cqn {
   private final auo<cyo> a;
   protected final float b;
   private final float c;
   private final Multimap<ij<bpg>, bpj> d;

   protected cnj(float $$0, float $$1, cqm $$2, auo<cyo> $$3, cou.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<ij<bpg>, bpj> $$5 = ImmutableMultimap.builder();
      $$5.put(bpl.c, new bpj(m, "Tool modifier", (double)this.c, bpj.a.a));
      $$5.put(bpl.e, new bpj(n, "Tool modifier", (double)$$1, bpj.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(coz $$0, dlf $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(coz $$0, bog $$1, bog $$2) {
      $$0.a(2, $$2, bnv.a);
      return true;
   }

   @Override
   public boolean a(coz $$0, cvn $$1, dlf $$2, hz $$3, bog $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bnv.a);
      }

      return true;
   }

   @Override
   public Multimap<ij<bpg>, bpj> a(bnv $$0) {
      return $$0 == bnv.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dlf $$0) {
      int $$1 = this.w().d();
      if ($$1 < 3 && $$0.a(atz.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(atz.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(atz.bG) ? false : $$0.a(this.a);
      }
   }
}
