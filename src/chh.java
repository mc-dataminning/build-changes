import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chh extends ckl implements ckr {
   private final aqa<csl> a;
   protected final float b;
   private final float c;
   private final Multimap<bjz, bkc> d;

   protected chh(float $$0, float $$1, ckk $$2, aqa<csl> $$3, cis.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bjz, bkc> $$5 = ImmutableMultimap.builder();
      $$5.put(bke.f, new bkc(m, "Tool modifier", (double)this.c, bkc.a.a));
      $$5.put(bke.h, new bkc(n, "Tool modifier", (double)$$1, bkc.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cix $$0, dez $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cix $$0, biy $$1, biy $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bin.a));
      return true;
   }

   @Override
   public boolean a(cix $$0, cpl $$1, dez $$2, gu $$3, biy $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bin.a));
      }

      return true;
   }

   @Override
   public Multimap<bjz, bkc> a(bin $$0) {
      return $$0 == bin.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dez $$0) {
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
