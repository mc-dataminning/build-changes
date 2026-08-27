import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cjy extends cnc implements cni {
   private final arz<cvf> a;
   protected final float b;
   private final float c;
   private final Multimap<bmm, bmp> d;

   protected cjy(float $$0, float $$1, cnb $$2, arz<cvf> $$3, clj.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bmm, bmp> $$5 = ImmutableMultimap.builder();
      $$5.put(bmr.c, new bmp(m, "Tool modifier", (double)this.c, bmp.a.a));
      $$5.put(bmr.e, new bmp(n, "Tool modifier", (double)$$1, bmp.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(clo $$0, dhn $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(clo $$0, bll $$1, bll $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bla.a));
      return true;
   }

   @Override
   public boolean a(clo $$0, csf $$1, dhn $$2, hx $$3, bll $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bla.a));
      }

      return true;
   }

   @Override
   public Multimap<bmm, bmp> a(bla $$0) {
      return $$0 == bla.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dhn $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(ark.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(ark.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(ark.bG) ? false : $$0.a(this.a);
      }
   }
}
