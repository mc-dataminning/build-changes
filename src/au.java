import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class au {
   private final ai a;
   @Nullable
   private final au b;
   @Nullable
   private final au c;
   private final int d;
   private final List<au> e = Lists.newArrayList();
   private au f;
   @Nullable
   private au g;
   private int h;
   private float i;
   private float j;
   private float k;
   private float l;

   public au(ai $$0, @Nullable au $$1, @Nullable au $$2, int $$3, int $$4) {
      if ($$0.a().c().isEmpty()) {
         throw new IllegalArgumentException("Can't position an invisible advancement!");
      } else {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.f = this;
         this.h = $$4;
         this.i = -1.0F;
         au $$5 = null;

         for (ai $$6 : $$0.e()) {
            $$5 = this.a($$6, $$5);
         }
      }
   }

   @Nullable
   private au a(ai $$0, @Nullable au $$1) {
      if ($$0.a().c().isPresent()) {
         $$1 = new au($$0, this, $$1, this.e.size() + 1, this.h + 1);
         this.e.add($$1);
      } else {
         for (ai $$2 : $$0.e()) {
            $$1 = this.a($$2, $$1);
         }
      }

      return $$1;
   }

   private void a() {
      if (this.e.isEmpty()) {
         if (this.c != null) {
            this.i = this.c.i + 1.0F;
         } else {
            this.i = 0.0F;
         }
      } else {
         au $$0 = null;

         for (au $$1 : this.e) {
            $$1.a();
            $$0 = $$1.a($$0 == null ? $$1 : $$0);
         }

         this.b();
         float $$2 = (this.e.get(0).i + this.e.get(this.e.size() - 1).i) / 2.0F;
         if (this.c != null) {
            this.i = this.c.i + 1.0F;
            this.j = this.i - $$2;
         } else {
            this.i = $$2;
         }
      }
   }

   private float a(float $$0, int $$1, float $$2) {
      this.i += $$0;
      this.h = $$1;
      if (this.i < $$2) {
         $$2 = this.i;
      }

      for (au $$3 : this.e) {
         $$2 = $$3.a($$0 + this.j, $$1 + 1, $$2);
      }

      return $$2;
   }

   private void a(float $$0) {
      this.i += $$0;

      for (au $$1 : this.e) {
         $$1.a($$0);
      }
   }

   private void b() {
      float $$0 = 0.0F;
      float $$1 = 0.0F;

      for (int $$2 = this.e.size() - 1; $$2 >= 0; $$2--) {
         au $$3 = this.e.get($$2);
         $$3.i += $$0;
         $$3.j += $$0;
         $$1 += $$3.k;
         $$0 += $$3.l + $$1;
      }
   }

   @Nullable
   private au c() {
      if (this.g != null) {
         return this.g;
      } else {
         return !this.e.isEmpty() ? this.e.get(0) : null;
      }
   }

   @Nullable
   private au d() {
      if (this.g != null) {
         return this.g;
      } else {
         return !this.e.isEmpty() ? this.e.get(this.e.size() - 1) : null;
      }
   }

   private au a(au $$0) {
      if (this.c == null) {
         return $$0;
      } else {
         au $$1 = this;
         au $$2 = this;
         au $$3 = this.c;
         au $$4 = this.b.e.get(0);
         float $$5 = this.j;
         float $$6 = this.j;
         float $$7 = $$3.j;

         float $$8;
         for ($$8 = $$4.j; $$3.d() != null && $$1.c() != null; $$6 += $$2.j) {
            $$3 = $$3.d();
            $$1 = $$1.c();
            $$4 = $$4.c();
            $$2 = $$2.d();
            $$2.f = this;
            float $$9 = $$3.i + $$7 - ($$1.i + $$5) + 1.0F;
            if ($$9 > 0.0F) {
               $$3.a(this, $$0).a(this, $$9);
               $$5 += $$9;
               $$6 += $$9;
            }

            $$7 += $$3.j;
            $$5 += $$1.j;
            $$8 += $$4.j;
         }

         if ($$3.d() != null && $$2.d() == null) {
            $$2.g = $$3.d();
            $$2.j += $$7 - $$6;
         } else {
            if ($$1.c() != null && $$4.c() == null) {
               $$4.g = $$1.c();
               $$4.j += $$5 - $$8;
            }

            $$0 = this;
         }

         return $$0;
      }
   }

   private void a(au $$0, float $$1) {
      float $$2 = (float)($$0.d - this.d);
      if ($$2 != 0.0F) {
         $$0.k -= $$1 / $$2;
         this.k += $$1 / $$2;
      }

      $$0.l += $$1;
      $$0.i += $$1;
      $$0.j += $$1;
   }

   private au a(au $$0, au $$1) {
      return this.f != null && $$0.b.e.contains(this.f) ? this.f : $$1;
   }

   private void e() {
      this.a.a().c().ifPresent($$0x -> $$0x.a((float)this.h, this.i));
      if (!this.e.isEmpty()) {
         for (au $$0 : this.e) {
            $$0.e();
         }
      }
   }

   public static void a(ai $$0) {
      if ($$0.a().c().isEmpty()) {
         throw new IllegalArgumentException("Can't position children of an invisible root!");
      } else {
         au $$1 = new au($$0, null, null, 1, 0);
         $$1.a();
         float $$2 = $$1.a(0.0F, 0, $$1.i);
         if ($$2 < 0.0F) {
            $$1.a(-$$2);
         }

         $$1.e();
      }
   }
}
