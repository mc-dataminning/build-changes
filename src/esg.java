import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esg implements esl {
   private static final Logger b = LogUtils.getLogger();
   private final dev c;
   private final int d;
   private final ArrayDeque<esg.c> e = new ArrayDeque<>();
   private final List<esg.c> f = new ArrayList<>();
   private int g = 0;

   public esg(dev $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jl $$0, dvd $$1, jg $$2, jg $$3, int $$4, int $$5) {
      this.a($$2, new esg.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(jg $$0, dhy $$1, @Nullable esm $$2) {
      this.a($$0, new esg.e($$0, $$1, $$2));
   }

   @Override
   public void a(dvd $$0, jg $$1, dhy $$2, @Nullable esm $$3, boolean $$4) {
      this.a($$1, new esg.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(jg $$0, dhy $$1, @Nullable jl $$2, @Nullable esm $$3) {
      this.a($$0, new esg.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(jg $$0, esg.c $$1) {
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
            esg.c $$1 = this.e.peek();

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

   static record a(dvd a, jg b, dhy c, @Nullable esm d, boolean e) implements esg.c {
      @Override
      public boolean a(dev $$0) {
         esl.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements esg.c {
      private final jg a;
      private final dhy b;
      @Nullable
      private esm c;
      @Nullable
      private final jl d;
      private int e = 0;

      b(jg $$0, dhy $$1, @Nullable esm $$2, @Nullable jl $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (esl.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dev $$0) {
         jl $$1 = esl.a[this.e++];
         jg $$2 = this.a.a($$1);
         dvd $$3 = $$0.a_($$2);
         esm $$4 = null;
         if ($$0.J().b(crc.d)) {
            if (this.c == null) {
               this.c = esi.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         esl.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < esl.a.length && esl.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < esl.a.length;
      }
   }

   interface c {
      boolean a(dev var1);
   }

   static record d(jl a, dvd b, jg c, jg d, int e, int f) implements esg.c {
      @Override
      public boolean a(dev $$0) {
         esl.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(jg a, dhy b, @Nullable esm c) implements esg.c {
      @Override
      public boolean a(dev $$0) {
         dvd $$1 = $$0.a_(this.a);
         esl.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
