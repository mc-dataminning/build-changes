import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyc implements eyh {
   private static final Logger b = LogUtils.getLogger();
   private final djm c;
   private final int d;
   private final ArrayDeque<eyc.c> e = new ArrayDeque<>();
   private final List<eyc.c> f = new ArrayList<>();
   private int g = 0;

   public eyc(djm $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jb $$0, eat $$1, iv $$2, iv $$3, int $$4, int $$5) {
      this.a($$2, new eyc.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(iv $$0, dmr $$1, @Nullable eyi $$2) {
      this.a($$0, new eyc.e($$0, $$1, $$2));
   }

   @Override
   public void a(eat $$0, iv $$1, dmr $$2, @Nullable eyi $$3, boolean $$4) {
      this.a($$1, new eyc.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(iv $$0, dmr $$1, @Nullable jb $$2, @Nullable eyi $$3) {
      this.a($$0, new eyc.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(iv $$0, eyc.c $$1) {
      boolean $$2 = this.g > 0;
      boolean $$3 = this.d >= 0 && this.g >= this.d;
      this.g++;
      if (!$$3) {
         if ($$2) {
            this.f.add($$1);
         } else {
            this.e.push($$1);
         }
      } else if (this.g - 1 == this.d) {
         b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: " + $$0.x());
      }

      if (!$$2) {
         this.a();
      }
   }

   private void a() {
      try {
         while (!this.e.isEmpty() || !this.f.isEmpty()) {
            for (int $$0 = this.f.size() - 1; $$0 >= 0; $$0--) {
               this.e.push(this.f.get($$0));
            }

            this.f.clear();
            eyc.c $$1 = this.e.peek();

            while (this.f.isEmpty()) {
               if (!$$1.a(this.c)) {
                  this.e.pop();
                  break;
               }
            }
         }
      } finally {
         this.e.clear();
         this.f.clear();
         this.g = 0;
      }
   }

   static record a(eat a, iv b, dmr c, @Nullable eyi d, boolean e) implements eyc.c {
      @Override
      public boolean a(djm $$0) {
         eyh.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eyc.c {
      private final iv a;
      private final dmr b;
      @Nullable
      private eyi c;
      @Nullable
      private final jb d;
      private int e = 0;

      b(iv $$0, dmr $$1, @Nullable eyi $$2, @Nullable jb $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (eyh.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(djm $$0) {
         jb $$1 = eyh.a[this.e++];
         iv $$2 = this.a.a($$1);
         eat $$3 = $$0.a_($$2);
         eyi $$4 = null;
         if ($$0.K().b(cuy.c)) {
            if (this.c == null) {
               this.c = eye.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         eyh.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < eyh.a.length && eyh.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < eyh.a.length;
      }
   }

   interface c {
      boolean a(djm var1);
   }

   static record d(jb a, eat b, iv c, iv d, int e, int f) implements eyc.c {
      @Override
      public boolean a(djm $$0) {
         eyh.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(iv a, dmr b, @Nullable eyi c) implements eyc.c {
      @Override
      public boolean a(djm $$0) {
         eat $$1 = $$0.a_(this.a);
         eyh.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
