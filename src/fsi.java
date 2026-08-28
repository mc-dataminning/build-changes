import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fsi {
   static final alf b = new alf("spectator/close");
   static final alf c = new alf("spectator/scroll_left");
   static final alf d = new alf("spectator/scroll_right");
   private static final fsk e = new fsi.a();
   private static final fsk f = new fsi.b(-1, true);
   private static final fsk g = new fsi.b(1, true);
   private static final fsk h = new fsi.b(1, false);
   private static final int i = 8;
   static final xp j = xp.c("spectatorMenu.close");
   static final xp k = xp.c("spectatorMenu.previous_page");
   static final xp l = xp.c("spectatorMenu.next_page");
   public static final fsk a = new fsk() {
      @Override
      public void a(fsi $$0) {
      }

      @Override
      public xp aN_() {
         return xo.a;
      }

      @Override
      public void a(fgs $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aO_() {
         return false;
      }
   };
   private final fsl m;
   private fsj n;
   private int o = -1;
   int p;

   public fsi(fsl $$0) {
      this.n = new fsh();
      this.m = $$0;
   }

   public fsk a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fsk)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fsk> a() {
      List<fsk> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fsk b() {
      return this.a(this.o);
   }

   public fsj c() {
      return this.n;
   }

   public void b(int $$0) {
      fsk $$1 = this.a($$0);
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

   public void a(fsj $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fsm f() {
      return new fsm(this.a(), this.o);
   }

   static class a implements fsk {
      @Override
      public void a(fsi $$0) {
         $$0.d();
      }

      @Override
      public xp aN_() {
         return fsi.j;
      }

      @Override
      public void a(fgs $$0, float $$1, int $$2) {
         $$0.a(fsi.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }

   static class b implements fsk {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fsi $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xp aN_() {
         return this.a < 0 ? fsi.k : fsi.l;
      }

      @Override
      public void a(fgs $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fsi.c, 0, 0, 16, 16);
         } else {
            $$0.a(fsi.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aO_() {
         return this.b;
      }
   }
}
