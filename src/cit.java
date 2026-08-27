import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cit extends clx implements cmd {
   private final arh<cua> a;
   protected final float b;
   private final float c;
   private final Multimap<blk, bln> d;

   protected cit(float $$0, float $$1, clw $$2, arh<cua> $$3, cke.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<blk, bln> $$5 = ImmutableMultimap.builder();
      $$5.put(blp.c, new bln(m, "Tool modifier", (double)this.c, bln.a.a));
      $$5.put(blp.e, new bln(n, "Tool modifier", (double)$$1, bln.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(ckj $$0, dgb $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(ckj $$0, bkj $$1, bkj $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bjy.a));
      return true;
   }

   @Override
   public boolean a(ckj $$0, cqz $$1, dgb $$2, ht $$3, bkj $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bjy.a));
      }

      return true;
   }

   @Override
   public Multimap<blk, bln> a(bjy $$0) {
      return $$0 == bjy.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dgb $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(aqs.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(aqs.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(aqs.bG) ? false : $$0.a(this.a);
      }
   }
}
