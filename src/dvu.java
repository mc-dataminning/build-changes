import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dvu implements dvh {
   private final List<dvg> a = Lists.newArrayList();

   @Override
   public void a(dvg $$0) {
      this.a.add($$0);
   }

   @Nullable
   @Override
   public dvg a(duu $$0) {
      return dvg.a(this.a, $$0);
   }

   @Deprecated
   public void a(int $$0) {
      for (dvg $$1 : this.a) {
         $$1.a(0, $$0, 0);
      }
   }

   @Deprecated
   public int a(int $$0, int $$1, ash $$2, int $$3) {
      int $$4 = $$0 - $$3;
      duu $$5 = this.d();
      int $$6 = $$5.d() + $$1 + 1;
      if ($$6 < $$4) {
         $$6 += $$2.a($$4 - $$6);
      }

      int $$7 = $$6 - $$5.k();
      this.a($$7);
      return $$7;
   }

   /** @deprecated */
   public void a(ash $$0, int $$1, int $$2) {
      duu $$3 = this.d();
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

   public dvr a() {
      return new dvr(this.a);
   }

   public void b() {
      this.a.clear();
   }

   public boolean c() {
      return this.a.isEmpty();
   }

   public duu d() {
      return dvg.a(this.a.stream());
   }
}
