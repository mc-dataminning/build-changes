import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coi extends col implements cos {
   private final float a;
   private final Multimap<bnl, bno> b;

   public coi(cok $$0, int $$1, float $$2, cms.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bnl, bno> $$4 = ImmutableMultimap.builder();
      $$4.put(bnq.c, new bno(m, "Weapon modifier", (double)this.a, bno.a.a));
      $$4.put(bnq.e, new bno(n, "Weapon modifier", (double)$$2, bno.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(djg $$0, cto $$1, hx $$2, cfh $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cmx $$0, djg $$1) {
      if ($$1.a(cwr.bs)) {
         return 15.0F;
      } else {
         return $$1.a(asg.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cmx $$0, bmk $$1, bmk $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(blz.a));
      return true;
   }

   @Override
   public boolean a(cmx $$0, cto $$1, djg $$2, hx $$3, bmk $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(blz.a));
      }

      return true;
   }

   @Override
   public boolean a_(djg $$0) {
      return $$0.a(cwr.bs);
   }

   @Override
   public Multimap<bnl, bno> a(blz $$0) {
      return $$0 == blz.a ? this.b : super.a($$0);
   }
}
