import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dws implements dwf {
   private final List<dwe> a = Lists.newArrayList();

   @Override
   public void a(dwe $$0) {
      this.a.add($$0);
   }

   @Nullable
   @Override
   public dwe a(dvs $$0) {
      return dwe.a(this.a, $$0);
   }

   @Deprecated
   public void a(int $$0) {
      for (dwe $$1 : this.a) {
         $$1.a(0, $$0, 0);
      }
   }

   @Deprecated
   public int a(int $$0, int $$1, ate $$2, int $$3) {
      int $$4 = $$0 - $$3;
      dvs $$5 = this.d();
      int $$6 = $$5.d() + $$1 + 1;
      if ($$6 < $$4) {
         $$6 += $$2.a($$4 - $$6);
      }

      int $$7 = $$6 - $$5.k();
      this.a($$7);
      return $$7;
   }

   /** @deprecated */
   public void a(ate $$0, int $$1, int $$2) {
      dvs $$3 = this.d();
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

   public dwp a() {
      return new dwp(this.a);
   }

   public void b() {
      this.a.clear();
   }

   public boolean c() {
      return this.a.isEmpty();
   }

   public dvs d() {
      return dwe.a(this.a.stream());
   }
}
