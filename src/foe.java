import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class foe {
   @Nullable
   private cwi<?> a;
   private final List<foe.a> b = Lists.newArrayList();
   float c;

   public void a() {
      this.a = null;
      this.b.clear();
      this.c = 0.0F;
   }

   public void a(cwd $$0, int $$1, int $$2) {
      this.b.add(new foe.a($$0, $$1, $$2));
   }

   public foe.a a(int $$0) {
      return this.b.get($$0);
   }

   public int b() {
      return this.b.size();
   }

   @Nullable
   public cwi<?> c() {
      return this.a;
   }

   public void a(cwi<?> $$0) {
      this.a = $$0;
   }

   public void a(feh $$0, fcu $$1, int $$2, int $$3, boolean $$4, float $$5) {
      if (!fkt.r()) {
         this.c += $$5;
      }

      for (int $$6 = 0; $$6 < this.b.size(); $$6++) {
         foe.a $$7 = this.b.get($$6);
         int $$8 = $$7.a() + $$2;
         int $$9 = $$7.b() + $$3;
         if ($$6 == 0 && $$4) {
            $$0.a($$8 - 4, $$9 - 4, $$8 + 20, $$9 + 20, 822018048);
         } else {
            $$0.a($$8, $$9, $$8 + 16, $$9 + 16, 822018048);
         }

         csd $$10 = $$7.c();
         $$0.b($$10, $$8, $$9);
         $$0.a(gbm.G(), $$8, $$9, $$8 + 16, $$9 + 16, 822083583);
         if ($$6 == 0) {
            $$0.a($$1.h, $$10, $$8, $$9);
         }
      }
   }

   public class a {
      private final cwd b;
      private final int c;
      private final int d;

      public a(cwd $$1, int $$2, int $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }

      public csd c() {
         csd[] $$0 = this.b.a();
         return $$0.length == 0 ? csd.i : $$0[axw.d(foe.this.c / 30.0F) % $$0.length];
      }
   }
}
