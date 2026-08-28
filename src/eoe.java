import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eoe implements enr {
   private final List<enq> a = Lists.newArrayList();

   @Override
   public void a(enq $$0) {
      this.a.add($$0);
   }

   @Nullable
   @Override
   public enq a(ene $$0) {
      return enq.a(this.a, $$0);
   }

   @Deprecated
   public void a(int $$0) {
      for (enq $$1 : this.a) {
         $$1.a(0, $$0, 0);
      }
   }

   @Deprecated
   public int a(int $$0, int $$1, azh $$2, int $$3) {
      int $$4 = $$0 - $$3;
      ene $$5 = this.d();
      int $$6 = $$5.e() + $$1 + 1;
      if ($$6 < $$4) {
         $$6 += $$2.a($$4 - $$6);
      }

      int $$7 = $$6 - $$5.l();
      this.a($$7);
      return $$7;
   }

   /** @deprecated */
   public void a(azh $$0, int $$1, int $$2) {
      ene $$3 = this.d();
      int $$4 = $$2 - $$1 + 1 - $$3.e();
      int $$5;
      if ($$4 > 1) {
         $$5 = $$1 + $$0.a($$4);
      } else {
         $$5 = $$1;
      }

      int $$7 = $$5 - $$3.i();
      this.a($$7);
   }

   public eob a() {
      return new eob(this.a);
   }

   public void b() {
      this.a.clear();
   }

   public boolean c() {
      return this.a.isEmpty();
   }

   public ene d() {
      return enq.a(this.a.stream());
   }
}
