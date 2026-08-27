import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fdd {
   static final aer b = new aer("spectator/close");
   static final aer c = new aer("spectator/scroll_left");
   static final aer d = new aer("spectator/scroll_right");
   private static final fdf e = new fdd.a();
   private static final fdf f = new fdd.b(-1, true);
   private static final fdf g = new fdd.b(1, true);
   private static final fdf h = new fdd.b(1, false);
   private static final int i = 8;
   static final tf j = tf.c("spectatorMenu.close");
   static final tf k = tf.c("spectatorMenu.previous_page");
   static final tf l = tf.c("spectatorMenu.next_page");
   public static final fdf a = new fdf() {
      @Override
      public void a(fdd $$0) {
      }

      @Override
      public tf aD_() {
         return te.a;
      }

      @Override
      public void a(erv $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aE_() {
         return false;
      }
   };
   private final fdg m;
   private fde n;
   private int o = -1;
   int p;

   public fdd(fdg $$0) {
      this.n = new fdc();
      this.m = $$0;
   }

   public fdf a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fdf)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fdf> a() {
      List<fdf> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fdf b() {
      return this.a(this.o);
   }

   public fde c() {
      return this.n;
   }

   public void b(int $$0) {
      fdf $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aE_()) {
            $$1.a(this);
         } else {
            this.o = $$0;
         }
      }
   }

   public void d() {
      this.m.a(this);
   }

   public int e() {
      return this.o;
   }

   public void a(fde $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fdh f() {
      return new fdh(this.a(), this.o);
   }

   static class a implements fdf {
      @Override
      public void a(fdd $$0) {
         $$0.d();
      }

      @Override
      public tf aD_() {
         return fdd.j;
      }

      @Override
      public void a(erv $$0, float $$1, int $$2) {
         $$0.a(fdd.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aE_() {
         return true;
      }
   }

   static class b implements fdf {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fdd $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public tf aD_() {
         return this.a < 0 ? fdd.k : fdd.l;
      }

      @Override
      public void a(erv $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fdd.c, 0, 0, 16, 16);
         } else {
            $$0.a(fdd.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aE_() {
         return this.b;
      }
   }
}
