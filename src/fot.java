import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fot {
   static final ajt b = new ajt("spectator/close");
   static final ajt c = new ajt("spectator/scroll_left");
   static final ajt d = new ajt("spectator/scroll_right");
   private static final fov e = new fot.a();
   private static final fov f = new fot.b(-1, true);
   private static final fov g = new fot.b(1, true);
   private static final fov h = new fot.b(1, false);
   private static final int i = 8;
   static final wg j = wg.c("spectatorMenu.close");
   static final wg k = wg.c("spectatorMenu.previous_page");
   static final wg l = wg.c("spectatorMenu.next_page");
   public static final fov a = new fov() {
      @Override
      public void a(fot $$0) {
      }

      @Override
      public wg aO_() {
         return wf.a;
      }

      @Override
      public void a(fdc $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aP_() {
         return false;
      }
   };
   private final fow m;
   private fou n;
   private int o = -1;
   int p;

   public fot(fow $$0) {
      this.n = new fos();
      this.m = $$0;
   }

   public fov a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fov)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fov> a() {
      List<fov> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fov b() {
      return this.a(this.o);
   }

   public fou c() {
      return this.n;
   }

   public void b(int $$0) {
      fov $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aP_()) {
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

   public void a(fou $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fox f() {
      return new fox(this.a(), this.o);
   }

   static class a implements fov {
      @Override
      public void a(fot $$0) {
         $$0.d();
      }

      @Override
      public wg aO_() {
         return fot.j;
      }

      @Override
      public void a(fdc $$0, float $$1, int $$2) {
         $$0.a(fot.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }

   static class b implements fov {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fot $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wg aO_() {
         return this.a < 0 ? fot.k : fot.l;
      }

      @Override
      public void a(fdc $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fot.c, 0, 0, 16, 16);
         } else {
            $$0.a(fot.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aP_() {
         return this.b;
      }
   }
}
