import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fsh {
   static final alf b = new alf("spectator/close");
   static final alf c = new alf("spectator/scroll_left");
   static final alf d = new alf("spectator/scroll_right");
   private static final fsj e = new fsh.a();
   private static final fsj f = new fsh.b(-1, true);
   private static final fsj g = new fsh.b(1, true);
   private static final fsj h = new fsh.b(1, false);
   private static final int i = 8;
   static final xp j = xp.c("spectatorMenu.close");
   static final xp k = xp.c("spectatorMenu.previous_page");
   static final xp l = xp.c("spectatorMenu.next_page");
   public static final fsj a = new fsj() {
      @Override
      public void a(fsh $$0) {
      }

      @Override
      public xp aN_() {
         return xo.a;
      }

      @Override
      public void a(fgr $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aO_() {
         return false;
      }
   };
   private final fsk m;
   private fsi n;
   private int o = -1;
   int p;

   public fsh(fsk $$0) {
      this.n = new fsg();
      this.m = $$0;
   }

   public fsj a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fsj)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fsj> a() {
      List<fsj> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fsj b() {
      return this.a(this.o);
   }

   public fsi c() {
      return this.n;
   }

   public void b(int $$0) {
      fsj $$1 = this.a($$0);
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

   public void a(fsi $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fsl f() {
      return new fsl(this.a(), this.o);
   }

   static class a implements fsj {
      @Override
      public void a(fsh $$0) {
         $$0.d();
      }

      @Override
      public xp aN_() {
         return fsh.j;
      }

      @Override
      public void a(fgr $$0, float $$1, int $$2) {
         $$0.a(fsh.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }

   static class b implements fsj {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fsh $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xp aN_() {
         return this.a < 0 ? fsh.k : fsh.l;
      }

      @Override
      public void a(fgr $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fsh.c, 0, 0, 16, 16);
         } else {
            $$0.a(fsh.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aO_() {
         return this.b;
      }
   }
}
