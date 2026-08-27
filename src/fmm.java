import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fmm {
   static final ajh b = new ajh("spectator/close");
   static final ajh c = new ajh("spectator/scroll_left");
   static final ajh d = new ajh("spectator/scroll_right");
   private static final fmo e = new fmm.a();
   private static final fmo f = new fmm.b(-1, true);
   private static final fmo g = new fmm.b(1, true);
   private static final fmo h = new fmm.b(1, false);
   private static final int i = 8;
   static final vu j = vu.c("spectatorMenu.close");
   static final vu k = vu.c("spectatorMenu.previous_page");
   static final vu l = vu.c("spectatorMenu.next_page");
   public static final fmo a = new fmo() {
      @Override
      public void a(fmm $$0) {
      }

      @Override
      public vu aP_() {
         return vt.a;
      }

      @Override
      public void a(fav $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aQ_() {
         return false;
      }
   };
   private final fmp m;
   private fmn n;
   private int o = -1;
   int p;

   public fmm(fmp $$0) {
      this.n = new fml();
      this.m = $$0;
   }

   public fmo a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fmo)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fmo> a() {
      List<fmo> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fmo b() {
      return this.a(this.o);
   }

   public fmn c() {
      return this.n;
   }

   public void b(int $$0) {
      fmo $$1 = this.a($$0);
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

   public void a(fmn $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fmq f() {
      return new fmq(this.a(), this.o);
   }

   static class a implements fmo {
      @Override
      public void a(fmm $$0) {
         $$0.d();
      }

      @Override
      public vu aP_() {
         return fmm.j;
      }

      @Override
      public void a(fav $$0, float $$1, int $$2) {
         $$0.a(fmm.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }

   static class b implements fmo {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fmm $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vu aP_() {
         return this.a < 0 ? fmm.k : fmm.l;
      }

      @Override
      public void a(fav $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fmm.c, 0, 0, 16, 16);
         } else {
            $$0.a(fmm.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aQ_() {
         return this.b;
      }
   }
}
