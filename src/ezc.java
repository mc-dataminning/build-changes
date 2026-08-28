import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezc implements ezh {
   private static final Logger b = LogUtils.getLogger();
   private final dkj c;
   private final int d;
   private final ArrayDeque<ezc.c> e = new ArrayDeque<>();
   private final List<ezc.c> f = new ArrayList<>();
   private int g = 0;

   public ezc(dkj $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jc $$0, ebq $$1, iw $$2, iw $$3, int $$4, int $$5) {
      this.a($$2, new ezc.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(iw $$0, dno $$1, @Nullable ezi $$2) {
      this.a($$0, new ezc.e($$0, $$1, $$2));
   }

   @Override
   public void a(ebq $$0, iw $$1, dno $$2, @Nullable ezi $$3, boolean $$4) {
      this.a($$1, new ezc.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(iw $$0, dno $$1, @Nullable jc $$2, @Nullable ezi $$3) {
      this.a($$0, new ezc.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(iw $$0, ezc.c $$1) {
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
            ezc.c $$1 = this.e.peek();

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

   static record a(ebq a, iw b, dno c, @Nullable ezi d, boolean e) implements ezc.c {
      @Override
      public boolean a(dkj $$0) {
         ezh.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ezc.c {
      private final iw a;
      private final dno b;
      @Nullable
      private ezi c;
      @Nullable
      private final jc d;
      private int e = 0;

      b(iw $$0, dno $$1, @Nullable ezi $$2, @Nullable jc $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (ezh.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dkj $$0) {
         jc $$1 = ezh.a[this.e++];
         iw $$2 = this.a.a($$1);
         ebq $$3 = $$0.a_($$2);
         ezi $$4 = null;
         if ($$0.K().b(cvu.c)) {
            if (this.c == null) {
               this.c = eze.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         ezh.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < ezh.a.length && ezh.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < ezh.a.length;
      }
   }

   interface c {
      boolean a(dkj var1);
   }

   static record d(jc a, ebq b, iw c, iw d, int e, int f) implements ezc.c {
      @Override
      public boolean a(dkj $$0) {
         ezh.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(iw a, dno b, @Nullable ezi c) implements ezc.c {
      @Override
      public boolean a(dkj $$0) {
         ebq $$1 = $$0.a_(this.a);
         ezh.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
