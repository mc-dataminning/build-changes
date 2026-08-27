import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dvp implements dvc {
   private final List<dvb> a = Lists.newArrayList();

   @Override
   public void a(dvb $$0) {
      this.a.add($$0);
   }

   @Nullable
   @Override
   public dvb a(dup $$0) {
      return dvb.a(this.a, $$0);
   }

   @Deprecated
   public void a(int $$0) {
      for (dvb $$1 : this.a) {
         $$1.a(0, $$0, 0);
      }
   }

   @Deprecated
   public int a(int $$0, int $$1, art $$2, int $$3) {
      int $$4 = $$0 - $$3;
      dup $$5 = this.d();
      int $$6 = $$5.d() + $$1 + 1;
      if ($$6 < $$4) {
         $$6 += $$2.a($$4 - $$6);
      }

      int $$7 = $$6 - $$5.k();
      this.a($$7);
      return $$7;
   }

   /** @deprecated */
   public void a(art $$0, int $$1, int $$2) {
      dup $$3 = this.d();
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

   public dvm a() {
      return new dvm(this.a);
   }

   public void b() {
      this.a.clear();
   }

   public boolean c() {
      return this.a.isEmpty();
   }

   public dup d() {
      return dvb.a(this.a.stream());
   }
}
