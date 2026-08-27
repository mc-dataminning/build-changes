import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cej extends chn implements cht {
   private final anl<cpn> a;
   protected final float b;
   private final float c;
   private final Multimap<bhb, bhe> d;

   protected cej(float $$0, float $$1, chm $$2, anl<cpn> $$3, cfu.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bhb, bhe> $$5 = ImmutableMultimap.builder();
      $$5.put(bhg.f, new bhe(m, "Tool modifier", (double)this.c, bhe.a.a));
      $$5.put(bhg.h, new bhe(n, "Tool modifier", (double)$$1, bhe.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cfz $$0, dcb $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cfz $$0, bfz $$1, bfz $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bfo.a));
      return true;
   }

   @Override
   public boolean a(cfz $$0, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bfo.a));
      }

      return true;
   }

   @Override
   public Multimap<bhb, bhe> a(bfo $$0) {
      return $$0 == bfo.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dcb $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(amw.bC)) {
         return false;
      } else if ($$1 < 2 && $$0.a(amw.bD)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(amw.bE) ? false : $$0.a(this.a);
      }
   }
}
