import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fmk {
   static final ajh b = new ajh("spectator/close");
   static final ajh c = new ajh("spectator/scroll_left");
   static final ajh d = new ajh("spectator/scroll_right");
   private static final fmm e = new fmk.a();
   private static final fmm f = new fmk.b(-1, true);
   private static final fmm g = new fmk.b(1, true);
   private static final fmm h = new fmk.b(1, false);
   private static final int i = 8;
   static final vu j = vu.c("spectatorMenu.close");
   static final vu k = vu.c("spectatorMenu.previous_page");
   static final vu l = vu.c("spectatorMenu.next_page");
   public static final fmm a = new fmm() {
      @Override
      public void a(fmk $$0) {
      }

      @Override
      public vu aP_() {
         return vt.a;
      }

      @Override
      public void a(fat $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aQ_() {
         return false;
      }
   };
   private final fmn m;
   private fml n;
   private int o = -1;
   int p;

   public fmk(fmn $$0) {
      this.n = new fmj();
      this.m = $$0;
   }

   public fmm a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fmm)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fmm> a() {
      List<fmm> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fmm b() {
      return this.a(this.o);
   }

   public fml c() {
      return this.n;
   }

   public void b(int $$0) {
      fmm $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aQ_()) {
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

   public void a(fml $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fmo f() {
      return new fmo(this.a(), this.o);
   }

   static class a implements fmm {
      @Override
      public void a(fmk $$0) {
         $$0.d();
      }

      @Override
      public vu aP_() {
         return fmk.j;
      }

      @Override
      public void a(fat $$0, float $$1, int $$2) {
         $$0.a(fmk.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }

   static class b implements fmm {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fmk $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vu aP_() {
         return this.a < 0 ? fmk.k : fmk.l;
      }

      @Override
      public void a(fat $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fmk.c, 0, 0, 16, 16);
         } else {
            $$0.a(fmk.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aQ_() {
         return this.b;
      }
   }
}
