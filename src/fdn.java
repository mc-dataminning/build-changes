import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fdn {
   static final aex b = new aex("spectator/close");
   static final aex c = new aex("spectator/scroll_left");
   static final aex d = new aex("spectator/scroll_right");
   private static final fdp e = new fdn.a();
   private static final fdp f = new fdn.b(-1, true);
   private static final fdp g = new fdn.b(1, true);
   private static final fdp h = new fdn.b(1, false);
   private static final int i = 8;
   static final tm j = tm.c("spectatorMenu.close");
   static final tm k = tm.c("spectatorMenu.previous_page");
   static final tm l = tm.c("spectatorMenu.next_page");
   public static final fdp a = new fdp() {
      @Override
      public void a(fdn $$0) {
      }

      @Override
      public tm aJ_() {
         return tl.a;
      }

      @Override
      public void a(esf $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aK_() {
         return false;
      }
   };
   private final fdq m;
   private fdo n;
   private int o = -1;
   int p;

   public fdn(fdq $$0) {
      this.n = new fdm();
      this.m = $$0;
   }

   public fdp a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fdp)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fdp> a() {
      List<fdp> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fdp b() {
      return this.a(this.o);
   }

   public fdo c() {
      return this.n;
   }

   public void b(int $$0) {
      fdp $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aK_()) {
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

   public void a(fdo $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fdr f() {
      return new fdr(this.a(), this.o);
   }

   static class a implements fdp {
      @Override
      public void a(fdn $$0) {
         $$0.d();
      }

      @Override
      public tm aJ_() {
         return fdn.j;
      }

      @Override
      public void a(esf $$0, float $$1, int $$2) {
         $$0.a(fdn.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aK_() {
         return true;
      }
   }

   static class b implements fdp {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fdn $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public tm aJ_() {
         return this.a < 0 ? fdn.k : fdn.l;
      }

      @Override
      public void a(esf $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fdn.c, 0, 0, 16, 16);
         } else {
            $$0.a(fdn.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aK_() {
         return this.b;
      }
   }
}
