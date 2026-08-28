import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fsg {
   static final ale b = new ale("spectator/close");
   static final ale c = new ale("spectator/scroll_left");
   static final ale d = new ale("spectator/scroll_right");
   private static final fsi e = new fsg.a();
   private static final fsi f = new fsg.b(-1, true);
   private static final fsi g = new fsg.b(1, true);
   private static final fsi h = new fsg.b(1, false);
   private static final int i = 8;
   static final xo j = xo.c("spectatorMenu.close");
   static final xo k = xo.c("spectatorMenu.previous_page");
   static final xo l = xo.c("spectatorMenu.next_page");
   public static final fsi a = new fsi() {
      @Override
      public void a(fsg $$0) {
      }

      @Override
      public xo aN_() {
         return xn.a;
      }

      @Override
      public void a(fgq $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aO_() {
         return false;
      }
   };
   private final fsj m;
   private fsh n;
   private int o = -1;
   int p;

   public fsg(fsj $$0) {
      this.n = new fsf();
      this.m = $$0;
   }

   public fsi a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fsi)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fsi> a() {
      List<fsi> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fsi b() {
      return this.a(this.o);
   }

   public fsh c() {
      return this.n;
   }

   public void b(int $$0) {
      fsi $$1 = this.a($$0);
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

   public void a(fsh $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fsk f() {
      return new fsk(this.a(), this.o);
   }

   static class a implements fsi {
      @Override
      public void a(fsg $$0) {
         $$0.d();
      }

      @Override
      public xo aN_() {
         return fsg.j;
      }

      @Override
      public void a(fgq $$0, float $$1, int $$2) {
         $$0.a(fsg.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }

   static class b implements fsi {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fsg $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xo aN_() {
         return this.a < 0 ? fsg.k : fsg.l;
      }

      @Override
      public void a(fgq $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fsg.c, 0, 0, 16, 16);
         } else {
            $$0.a(fsg.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aO_() {
         return this.b;
      }
   }
}
