import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebd implements ebf {
   private static final Logger b = LogUtils.getLogger();
   private final cpm c;
   private final int d;
   private final ArrayDeque<ebd.c> e = new ArrayDeque<>();
   private final List<ebd.c> f = new ArrayList<>();
   private int g = 0;

   public ebd(cpm $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ha $$0, dfa $$1, gu $$2, gu $$3, int $$4, int $$5) {
      this.a($$2, new ebd.d($$0, $$1, $$2.i(), $$3.i(), $$4, $$5));
   }

   @Override
   public void a(gu $$0, csm $$1, gu $$2) {
      this.a($$0, new ebd.e($$0, $$1, $$2.i()));
   }

   @Override
   public void a(dfa $$0, gu $$1, csm $$2, gu $$3, boolean $$4) {
      this.a($$1, new ebd.a($$0, $$1.i(), $$2, $$3.i(), $$4));
   }

   @Override
   public void a(gu $$0, csm $$1, @Nullable ha $$2) {
      this.a($$0, new ebd.b($$0.i(), $$1, $$2));
   }

   private void a(gu $$0, ebd.c $$1) {
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
            ebd.c $$1 = this.e.peek();

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

   static record a(dfa a, gu b, csm c, gu d, boolean e) implements ebd.c {
      @Override
      public boolean a(cpm $$0) {
         ebf.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements ebd.c {
      private final gu a;
      private final csm b;
      @Nullable
      private final ha c;
      private int d = 0;

      b(gu $$0, csm $$1, @Nullable ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (ebf.a[this.d] == $$2) {
            this.d++;
         }
      }

      @Override
      public boolean a(cpm $$0) {
         gu $$1 = this.a.a(ebf.a[this.d++]);
         dfa $$2 = $$0.a_($$1);
         $$2.a($$0, $$1, this.b, this.a, false);
         if (this.d < ebf.a.length && ebf.a[this.d] == this.c) {
            this.d++;
         }

         return this.d < ebf.a.length;
      }
   }

   interface c {
      boolean a(cpm var1);
   }

   static record d(ha a, dfa b, gu c, gu d, int e, int f) implements ebd.c {
      @Override
      public boolean a(cpm $$0) {
         ebf.a($$0, this.a, this.b, this.c, this.d, this.e, this.f);
         return false;
      }
   }

   static record e(gu a, csm b, gu c) implements ebd.c {
      @Override
      public boolean a(cpm $$0) {
         dfa $$1 = $$0.a_(this.a);
         ebf.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
