import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fgy {
   @Nullable
   private cqm<?> a;
   private final List<fgy.a> b = Lists.newArrayList();
   float c;

   public void a() {
      this.a = null;
      this.b.clear();
      this.c = 0.0F;
   }

   public void a(cqh $$0, int $$1, int $$2) {
      this.b.add(new fgy.a($$0, $$1, $$2));
   }

   public fgy.a a(int $$0) {
      return this.b.get($$0);
   }

   public int b() {
      return this.b.size();
   }

   @Nullable
   public cqm<?> c() {
      return this.a;
   }

   public void a(cqm<?> $$0) {
      this.a = $$0;
   }

   public void a(exe $$0, evr $$1, int $$2, int $$3, boolean $$4, float $$5) {
      if (!fdm.t()) {
         this.c += $$5;
      }

      for (int $$6 = 0; $$6 < this.b.size(); $$6++) {
         fgy.a $$7 = this.b.get($$6);
         int $$8 = $$7.a() + $$2;
         int $$9 = $$7.b() + $$3;
         if ($$6 == 0 && $$4) {
            $$0.a($$8 - 4, $$9 - 4, $$8 + 20, $$9 + 20, 822018048);
         } else {
            $$0.a($$8, $$9, $$8 + 16, $$9 + 16, 822018048);
         }

         cng $$10 = $$7.c();
         $$0.b($$10, $$8, $$9);
         $$0.a(fub.E(), $$8, $$9, $$8 + 16, $$9 + 16, 822083583);
         if ($$6 == 0) {
            $$0.a($$1.h, $$10, $$8, $$9);
         }
      }
   }

   public class a {
      private final cqh b;
      private final int c;
      private final int d;

      public a(cqh $$1, int $$2, int $$3) {
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

      public cng c() {
         cng[] $$0 = this.b.a();
         return $$0.length == 0 ? cng.f : $$0[aup.d(fgy.this.c / 30.0F) % $$0.length];
      }
   }
}
