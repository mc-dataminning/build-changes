import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class clu extends clx implements cmd {
   private final float a;
   private final Multimap<blk, bln> b;

   public clu(clw $$0, int $$1, float $$2, cke.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<blk, bln> $$4 = ImmutableMultimap.builder();
      $$4.put(blp.c, new bln(m, "Weapon modifier", (double)this.a, bln.a.a));
      $$4.put(blp.e, new bln(n, "Weapon modifier", (double)$$2, bln.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dgb $$0, cqz $$1, ht $$2, ccx $$3) {
      return !$$3.f();
   }

   @Override
   public float a(ckj $$0, dgb $$1) {
      if ($$1.a(cuc.bs)) {
         return 15.0F;
      } else {
         return $$1.a(aqs.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(ckj $$0, bkj $$1, bkj $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bjy.a));
      return true;
   }

   @Override
   public boolean a(ckj $$0, cqz $$1, dgb $$2, ht $$3, bkj $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bjy.a));
      }

      return true;
   }

   @Override
   public boolean a_(dgb $$0) {
      return $$0.a(cuc.bs);
   }

   @Override
   public Multimap<blk, bln> a(bjy $$0) {
      return $$0 == bjy.a ? this.b : super.a($$0);
   }
}
