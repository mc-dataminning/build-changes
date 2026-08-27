import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chi extends ckm implements cks {
   private final aqa<csm> a;
   protected final float b;
   private final float c;
   private final Multimap<bka, bkd> d;

   protected chi(float $$0, float $$1, ckl $$2, aqa<csm> $$3, cit.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bka, bkd> $$5 = ImmutableMultimap.builder();
      $$5.put(bkf.f, new bkd(m, "Tool modifier", (double)this.c, bkd.a.a));
      $$5.put(bkf.h, new bkd(n, "Tool modifier", (double)$$1, bkd.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(ciy $$0, dfa $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(ciy $$0, biy $$1, biy $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bin.a));
      return true;
   }

   @Override
   public boolean a(ciy $$0, cpm $$1, dfa $$2, gu $$3, biy $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bin.a));
      }

      return true;
   }

   @Override
   public Multimap<bka, bkd> a(bin $$0) {
      return $$0 == bin.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dfa $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(apl.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(apl.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(apl.bG) ? false : $$0.a(this.a);
      }
   }
}
