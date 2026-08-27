import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fhy {
   static final ahd b = new ahd("spectator/close");
   static final ahd c = new ahd("spectator/scroll_left");
   static final ahd d = new ahd("spectator/scroll_right");
   private static final fia e = new fhy.a();
   private static final fia f = new fhy.b(-1, true);
   private static final fia g = new fhy.b(1, true);
   private static final fia h = new fhy.b(1, false);
   private static final int i = 8;
   static final vd j = vd.c("spectatorMenu.close");
   static final vd k = vd.c("spectatorMenu.previous_page");
   static final vd l = vd.c("spectatorMenu.next_page");
   public static final fia a = new fia() {
      @Override
      public void a(fhy $$0) {
      }

      @Override
      public vd aO_() {
         return vc.a;
      }

      @Override
      public void a(ewm $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aP_() {
         return false;
      }
   };
   private final fib m;
   private fhz n;
   private int o = -1;
   int p;

   public fhy(fib $$0) {
      this.n = new fhx();
      this.m = $$0;
   }

   public fia a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fia)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fia> a() {
      List<fia> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fia b() {
      return this.a(this.o);
   }

   public fhz c() {
      return this.n;
   }

   public void b(int $$0) {
      fia $$1 = this.a($$0);
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

   public void a(fhz $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fic f() {
      return new fic(this.a(), this.o);
   }

   static class a implements fia {
      @Override
      public void a(fhy $$0) {
         $$0.d();
      }

      @Override
      public vd aO_() {
         return fhy.j;
      }

      @Override
      public void a(ewm $$0, float $$1, int $$2) {
         $$0.a(fhy.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }

   static class b implements fia {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fhy $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vd aO_() {
         return this.a < 0 ? fhy.k : fhy.l;
      }

      @Override
      public void a(ewm $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fhy.c, 0, 0, 16, 16);
         } else {
            $$0.a(fhy.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aP_() {
         return this.b;
      }
   }
}
