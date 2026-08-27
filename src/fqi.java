import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fqi {
   static final akh b = new akh("spectator/close");
   static final akh c = new akh("spectator/scroll_left");
   static final akh d = new akh("spectator/scroll_right");
   private static final fqk e = new fqi.a();
   private static final fqk f = new fqi.b(-1, true);
   private static final fqk g = new fqi.b(1, true);
   private static final fqk h = new fqi.b(1, false);
   private static final int i = 8;
   static final wu j = wu.c("spectatorMenu.close");
   static final wu k = wu.c("spectatorMenu.previous_page");
   static final wu l = wu.c("spectatorMenu.next_page");
   public static final fqk a = new fqk() {
      @Override
      public void a(fqi $$0) {
      }

      @Override
      public wu aN_() {
         return wt.a;
      }

      @Override
      public void a(fer $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aO_() {
         return false;
      }
   };
   private final fql m;
   private fqj n;
   private int o = -1;
   int p;

   public fqi(fql $$0) {
      this.n = new fqh();
      this.m = $$0;
   }

   public fqk a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fqk)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fqk> a() {
      List<fqk> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fqk b() {
      return this.a(this.o);
   }

   public fqj c() {
      return this.n;
   }

   public void b(int $$0) {
      fqk $$1 = this.a($$0);
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

   public void a(fqj $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fqm f() {
      return new fqm(this.a(), this.o);
   }

   static class a implements fqk {
      @Override
      public void a(fqi $$0) {
         $$0.d();
      }

      @Override
      public wu aN_() {
         return fqi.j;
      }

      @Override
      public void a(fer $$0, float $$1, int $$2) {
         $$0.a(fqi.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }

   static class b implements fqk {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fqi $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wu aN_() {
         return this.a < 0 ? fqi.k : fqi.l;
      }

      @Override
      public void a(fer $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fqi.c, 0, 0, 16, 16);
         } else {
            $$0.a(fqi.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aO_() {
         return this.b;
      }
   }
}
