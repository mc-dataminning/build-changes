import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eus implements eux {
   private static final Logger b = LogUtils.getLogger();
   private final dgz c;
   private final int d;
   private final ArrayDeque<eus.c> e = new ArrayDeque<>();
   private final List<eus.c> f = new ArrayList<>();
   private int g = 0;

   public eus(dgz $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jm $$0, dxo $$1, jh $$2, jh $$3, int $$4, int $$5) {
      this.a($$2, new eus.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(jh $$0, dkd $$1, @Nullable euy $$2) {
      this.a($$0, new eus.e($$0, $$1, $$2));
   }

   @Override
   public void a(dxo $$0, jh $$1, dkd $$2, @Nullable euy $$3, boolean $$4) {
      this.a($$1, new eus.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(jh $$0, dkd $$1, @Nullable jm $$2, @Nullable euy $$3) {
      this.a($$0, new eus.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(jh $$0, eus.c $$1) {
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
            eus.c $$1 = this.e.peek();

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

   static record a(dxo a, jh b, dkd c, @Nullable euy d, boolean e) implements eus.c {
      @Override
      public boolean a(dgz $$0) {
         eux.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements eus.c {
      private final jh a;
      private final dkd b;
      @Nullable
      private euy c;
      @Nullable
      private final jm d;
      private int e = 0;

      b(jh $$0, dkd $$1, @Nullable euy $$2, @Nullable jm $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (eux.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dgz $$0) {
         jm $$1 = eux.a[this.e++];
         jh $$2 = this.a.a($$1);
         dxo $$3 = $$0.a_($$2);
         euy $$4 = null;
         if ($$0.K().b(csm.c)) {
            if (this.c == null) {
               this.c = euu.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         eux.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < eux.a.length && eux.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < eux.a.length;
      }
   }

   interface c {
      boolean a(dgz var1);
   }

   static record d(jm a, dxo b, jh c, jh d, int e, int f) implements eus.c {
      @Override
      public boolean a(dgz $$0) {
         eux.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(jh a, dkd b, @Nullable euy c) implements eus.c {
      @Override
      public boolean a(dgz $$0) {
         dxo $$1 = $$0.a_(this.a);
         eux.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
