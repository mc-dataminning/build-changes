import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chg extends ckk implements ckq {
   private final apy<csk> a;
   protected final float b;
   private final float c;
   private final Multimap<bjy, bkb> d;

   protected chg(float $$0, float $$1, ckj $$2, apy<csk> $$3, cir.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bjy, bkb> $$5 = ImmutableMultimap.builder();
      $$5.put(bkd.f, new bkb(m, "Tool modifier", (double)this.c, bkb.a.a));
      $$5.put(bkd.h, new bkb(n, "Tool modifier", (double)$$1, bkb.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(ciw $$0, dey $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(ciw $$0, biw $$1, biw $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bil.a));
      return true;
   }

   @Override
   public boolean a(ciw $$0, cpk $$1, dey $$2, gv $$3, biw $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bil.a));
      }

      return true;
   }

   @Override
   public Multimap<bjy, bkb> a(bil $$0) {
      return $$0 == bil.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dey $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(apj.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(apj.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(apj.bG) ? false : $$0.a(this.a);
      }
   }
}
