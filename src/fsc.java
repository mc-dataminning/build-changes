import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fsc {
   static final alb b = new alb("spectator/close");
   static final alb c = new alb("spectator/scroll_left");
   static final alb d = new alb("spectator/scroll_right");
   private static final fse e = new fsc.a();
   private static final fse f = new fsc.b(-1, true);
   private static final fse g = new fsc.b(1, true);
   private static final fse h = new fsc.b(1, false);
   private static final int i = 8;
   static final xl j = xl.c("spectatorMenu.close");
   static final xl k = xl.c("spectatorMenu.previous_page");
   static final xl l = xl.c("spectatorMenu.next_page");
   public static final fse a = new fse() {
      @Override
      public void a(fsc $$0) {
      }

      @Override
      public xl aO_() {
         return xk.a;
      }

      @Override
      public void a(fgm $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aP_() {
         return false;
      }
   };
   private final fsf m;
   private fsd n;
   private int o = -1;
   int p;

   public fsc(fsf $$0) {
      this.n = new fsb();
      this.m = $$0;
   }

   public fse a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fse)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fse> a() {
      List<fse> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fse b() {
      return this.a(this.o);
   }

   public fsd c() {
      return this.n;
   }

   public void b(int $$0) {
      fse $$1 = this.a($$0);
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

   public void a(fsd $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fsg f() {
      return new fsg(this.a(), this.o);
   }

   static class a implements fse {
      @Override
      public void a(fsc $$0) {
         $$0.d();
      }

      @Override
      public xl aO_() {
         return fsc.j;
      }

      @Override
      public void a(fgm $$0, float $$1, int $$2) {
         $$0.a(fsc.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }

   static class b implements fse {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fsc $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xl aO_() {
         return this.a < 0 ? fsc.k : fsc.l;
      }

      @Override
      public void a(fgm $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fsc.c, 0, 0, 16, 16);
         } else {
            $$0.a(fsc.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aP_() {
         return this.b;
      }
   }
}
