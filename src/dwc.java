import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dwc implements dvp {
   private final List<dvo> a = Lists.newArrayList();

   @Override
   public void a(dvo $$0) {
      this.a.add($$0);
   }

   @Nullable
   @Override
   public dvo a(dvc $$0) {
      return dvo.a(this.a, $$0);
   }

   @Deprecated
   public void a(int $$0) {
      for (dvo $$1 : this.a) {
         $$1.a(0, $$0, 0);
      }
   }

   @Deprecated
   public int a(int $$0, int $$1, ase $$2, int $$3) {
      int $$4 = $$0 - $$3;
      dvc $$5 = this.d();
      int $$6 = $$5.d() + $$1 + 1;
      if ($$6 < $$4) {
         $$6 += $$2.a($$4 - $$6);
      }

      int $$7 = $$6 - $$5.k();
      this.a($$7);
      return $$7;
   }

   /** @deprecated */
   public void a(ase $$0, int $$1, int $$2) {
      dvc $$3 = this.d();
      int $$4 = $$2 - $$1 + 1 - $$3.d();
      int $$5;
      if ($$4 > 1) {
         $$5 = $$1 + $$0.a($$4);
      } else {
         $$5 = $$1;
      }

      int $$7 = $$5 - $$3.h();
      this.a($$7);
   }

   public dvz a() {
      return new dvz(this.a);
   }

   public void b() {
      this.a.clear();
   }

   public boolean c() {
      return this.a.isEmpty();
   }

   public dvc d() {
      return dvo.a(this.a.stream());
   }
}
