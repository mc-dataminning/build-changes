import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fdi {
   static final aeu b = new aeu("spectator/close");
   static final aeu c = new aeu("spectator/scroll_left");
   static final aeu d = new aeu("spectator/scroll_right");
   private static final fdk e = new fdi.a();
   private static final fdk f = new fdi.b(-1, true);
   private static final fdk g = new fdi.b(1, true);
   private static final fdk h = new fdi.b(1, false);
   private static final int i = 8;
   static final ti j = ti.c("spectatorMenu.close");
   static final ti k = ti.c("spectatorMenu.previous_page");
   static final ti l = ti.c("spectatorMenu.next_page");
   public static final fdk a = new fdk() {
      @Override
      public void a(fdi $$0) {
      }

      @Override
      public ti aE_() {
         return th.a;
      }

      @Override
      public void a(esa $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aF_() {
         return false;
      }
   };
   private final fdl m;
   private fdj n;
   private int o = -1;
   int p;

   public fdi(fdl $$0) {
      this.n = new fdh();
      this.m = $$0;
   }

   public fdk a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fdk)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fdk> a() {
      List<fdk> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fdk b() {
      return this.a(this.o);
   }

   public fdj c() {
      return this.n;
   }

   public void b(int $$0) {
      fdk $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aF_()) {
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

   public void a(fdj $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fdm f() {
      return new fdm(this.a(), this.o);
   }

   static class a implements fdk {
      @Override
      public void a(fdi $$0) {
         $$0.d();
      }

      @Override
      public ti aE_() {
         return fdi.j;
      }

      @Override
      public void a(esa $$0, float $$1, int $$2) {
         $$0.a(fdi.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aF_() {
         return true;
      }
   }

   static class b implements fdk {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fdi $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public ti aE_() {
         return this.a < 0 ? fdi.k : fdi.l;
      }

      @Override
      public void a(esa $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fdi.c, 0, 0, 16, 16);
         } else {
            $$0.a(fdi.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aF_() {
         return this.b;
      }
   }
}
