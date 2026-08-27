import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fcy {
   static final aer b = new aer("spectator/close");
   static final aer c = new aer("spectator/scroll_left");
   static final aer d = new aer("spectator/scroll_right");
   private static final fda e = new fcy.a();
   private static final fda f = new fcy.b(-1, true);
   private static final fda g = new fcy.b(1, true);
   private static final fda h = new fcy.b(1, false);
   private static final int i = 8;
   static final tf j = tf.c("spectatorMenu.close");
   static final tf k = tf.c("spectatorMenu.previous_page");
   static final tf l = tf.c("spectatorMenu.next_page");
   public static final fda a = new fda() {
      @Override
      public void a(fcy $$0) {
      }

      @Override
      public tf aF_() {
         return te.a;
      }

      @Override
      public void a(erw $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aG_() {
         return false;
      }
   };
   private final fdb m;
   private fcz n;
   private int o = -1;
   int p;

   public fcy(fdb $$0) {
      this.n = new fcx();
      this.m = $$0;
   }

   public fda a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fda)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fda> a() {
      List<fda> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fda b() {
      return this.a(this.o);
   }

   public fcz c() {
      return this.n;
   }

   public void b(int $$0) {
      fda $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aG_()) {
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

   public void a(fcz $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fdc f() {
      return new fdc(this.a(), this.o);
   }

   static class a implements fda {
      @Override
      public void a(fcy $$0) {
         $$0.d();
      }

      @Override
      public tf aF_() {
         return fcy.j;
      }

      @Override
      public void a(erw $$0, float $$1, int $$2) {
         $$0.a(fcy.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aG_() {
         return true;
      }
   }

   static class b implements fda {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fcy $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public tf aF_() {
         return this.a < 0 ? fcy.k : fcy.l;
      }

      @Override
      public void a(erw $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fcy.c, 0, 0, 16, 16);
         } else {
            $$0.a(fcy.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aG_() {
         return this.b;
      }
   }
}
