import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class feh {
   static final afw b = new afw("spectator/close");
   static final afw c = new afw("spectator/scroll_left");
   static final afw d = new afw("spectator/scroll_right");
   private static final fej e = new feh.a();
   private static final fej f = new feh.b(-1, true);
   private static final fej g = new feh.b(1, true);
   private static final fej h = new feh.b(1, false);
   private static final int i = 8;
   static final ui j = ui.c("spectatorMenu.close");
   static final ui k = ui.c("spectatorMenu.previous_page");
   static final ui l = ui.c("spectatorMenu.next_page");
   public static final fej a = new fej() {
      @Override
      public void a(feh $$0) {
      }

      @Override
      public ui aN_() {
         return uh.a;
      }

      @Override
      public void a(esy $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aO_() {
         return false;
      }
   };
   private final fek m;
   private fei n;
   private int o = -1;
   int p;

   public feh(fek $$0) {
      this.n = new feg();
      this.m = $$0;
   }

   public fej a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fej)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fej> a() {
      List<fej> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fej b() {
      return this.a(this.o);
   }

   public fei c() {
      return this.n;
   }

   public void b(int $$0) {
      fej $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aO_()) {
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

   public void a(fei $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fel f() {
      return new fel(this.a(), this.o);
   }

   static class a implements fej {
      @Override
      public void a(feh $$0) {
         $$0.d();
      }

      @Override
      public ui aN_() {
         return feh.j;
      }

      @Override
      public void a(esy $$0, float $$1, int $$2) {
         $$0.a(feh.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }

   static class b implements fej {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(feh $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public ui aN_() {
         return this.a < 0 ? feh.k : feh.l;
      }

      @Override
      public void a(esy $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(feh.c, 0, 0, 16, 16);
         } else {
            $$0.a(feh.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aO_() {
         return this.b;
      }
   }
}
