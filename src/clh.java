import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class clh extends col implements cos {
   private final asv<cwp> a;
   protected final float b;
   private final float c;
   private final Multimap<bnl, bno> d;

   protected clh(float $$0, float $$1, cok $$2, asv<cwp> $$3, cms.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bnl, bno> $$5 = ImmutableMultimap.builder();
      $$5.put(bnq.c, new bno(m, "Tool modifier", (double)this.c, bno.a.a));
      $$5.put(bnq.e, new bno(n, "Tool modifier", (double)$$1, bno.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cmx $$0, djg $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cmx $$0, bmk $$1, bmk $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(blz.a));
      return true;
   }

   @Override
   public boolean a(cmx $$0, cto $$1, djg $$2, hx $$3, bmk $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(blz.a));
      }

      return true;
   }

   @Override
   public Multimap<bnl, bno> a(blz $$0) {
      return $$0 == blz.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(djg $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(asg.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(asg.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(asg.bG) ? false : $$0.a(this.a);
      }
   }
}
