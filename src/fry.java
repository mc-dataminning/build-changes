import com.google.common.collect.Lists;
import java.util.List;

public class fry implements frj.a {
   private final List<gw> a = Lists.newArrayList();
   private final List<Float> b = Lists.newArrayList();
   private final List<Float> c = Lists.newArrayList();
   private final List<Float> d = Lists.newArrayList();
   private final List<Float> e = Lists.newArrayList();
   private final List<Float> f = Lists.newArrayList();

   public void a(gw $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a.add($$0);
      this.b.add($$1);
      this.c.add($$5);
      this.d.add($$2);
      this.e.add($$3);
      this.f.add($$4);
   }

   @Override
   public void a(elj $$0, foa $$1, double $$2, double $$3, double $$4) {
      eln $$5 = $$1.getBuffer(foi.z());

      for (int $$6 = 0; $$6 < this.a.size(); $$6++) {
         gw $$7 = this.a.get($$6);
         Float $$8 = this.b.get($$6);
         float $$9 = $$8 / 2.0F;
         fny.b(
            $$0,
            $$5,
            (double)((float)$$7.u() + 0.5F - $$9) - $$2,
            (double)((float)$$7.v() + 0.5F - $$9) - $$3,
            (double)((float)$$7.w() + 0.5F - $$9) - $$4,
            (double)((float)$$7.u() + 0.5F + $$9) - $$2,
            (double)((float)$$7.v() + 0.5F + $$9) - $$3,
            (double)((float)$$7.w() + 0.5F + $$9) - $$4,
            this.d.get($$6),
            this.e.get($$6),
            this.f.get($$6),
            this.c.get($$6)
         );
      }
   }
}
