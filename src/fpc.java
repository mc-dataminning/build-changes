import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fpc {
   static final ajv b = new ajv("spectator/close");
   static final ajv c = new ajv("spectator/scroll_left");
   static final ajv d = new ajv("spectator/scroll_right");
   private static final fpe e = new fpc.a();
   private static final fpe f = new fpc.b(-1, true);
   private static final fpe g = new fpc.b(1, true);
   private static final fpe h = new fpc.b(1, false);
   private static final int i = 8;
   static final wi j = wi.c("spectatorMenu.close");
   static final wi k = wi.c("spectatorMenu.previous_page");
   static final wi l = wi.c("spectatorMenu.next_page");
   public static final fpe a = new fpe() {
      @Override
      public void a(fpc $$0) {
      }

      @Override
      public wi aN_() {
         return wh.a;
      }

      @Override
      public void a(fdl $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aO_() {
         return false;
      }
   };
   private final fpf m;
   private fpd n;
   private int o = -1;
   int p;

   public fpc(fpf $$0) {
      this.n = new fpb();
      this.m = $$0;
   }

   public fpe a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fpe)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fpe> a() {
      List<fpe> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fpe b() {
      return this.a(this.o);
   }

   public fpd c() {
      return this.n;
   }

   public void b(int $$0) {
      fpe $$1 = this.a($$0);
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

   public void a(fpd $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fpg f() {
      return new fpg(this.a(), this.o);
   }

   static class a implements fpe {
      @Override
      public void a(fpc $$0) {
         $$0.d();
      }

      @Override
      public wi aN_() {
         return fpc.j;
      }

      @Override
      public void a(fdl $$0, float $$1, int $$2) {
         $$0.a(fpc.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }

   static class b implements fpe {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fpc $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wi aN_() {
         return this.a < 0 ? fpc.k : fpc.l;
      }

      @Override
      public void a(fdl $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fpc.c, 0, 0, 16, 16);
         } else {
            $$0.a(fpc.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aO_() {
         return this.b;
      }
   }
}
