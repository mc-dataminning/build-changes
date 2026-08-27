import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dvv implements dvi {
   private final List<dvh> a = Lists.newArrayList();

   @Override
   public void a(dvh $$0) {
      this.a.add($$0);
   }

   @Nullable
   @Override
   public dvh a(duv $$0) {
      return dvh.a(this.a, $$0);
   }

   @Deprecated
   public void a(int $$0) {
      for (dvh $$1 : this.a) {
         $$1.a(0, $$0, 0);
      }
   }

   @Deprecated
   public int a(int $$0, int $$1, arx $$2, int $$3) {
      int $$4 = $$0 - $$3;
      duv $$5 = this.d();
      int $$6 = $$5.d() + $$1 + 1;
      if ($$6 < $$4) {
         $$6 += $$2.a($$4 - $$6);
      }

      int $$7 = $$6 - $$5.k();
      this.a($$7);
      return $$7;
   }

   /** @deprecated */
   public void a(arx $$0, int $$1, int $$2) {
      duv $$3 = this.d();
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

   public dvs a() {
      return new dvs(this.a);
   }

   public void b() {
      this.a.clear();
   }

   public boolean c() {
      return this.a.isEmpty();
   }

   public duv d() {
      return dvh.a(this.a.stream());
   }
}
