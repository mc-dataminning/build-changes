import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fir {
   static final ahh b = new ahh("spectator/close");
   static final ahh c = new ahh("spectator/scroll_left");
   static final ahh d = new ahh("spectator/scroll_right");
   private static final fit e = new fir.a();
   private static final fit f = new fir.b(-1, true);
   private static final fit g = new fir.b(1, true);
   private static final fit h = new fir.b(1, false);
   private static final int i = 8;
   static final vg j = vg.c("spectatorMenu.close");
   static final vg k = vg.c("spectatorMenu.previous_page");
   static final vg l = vg.c("spectatorMenu.next_page");
   public static final fit a = new fit() {
      @Override
      public void a(fir $$0) {
      }

      @Override
      public vg aQ_() {
         return vf.a;
      }

      @Override
      public void a(exe $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aR_() {
         return false;
      }
   };
   private final fiu m;
   private fis n;
   private int o = -1;
   int p;

   public fir(fiu $$0) {
      this.n = new fiq();
      this.m = $$0;
   }

   public fit a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fit)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fit> a() {
      List<fit> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fit b() {
      return this.a(this.o);
   }

   public fis c() {
      return this.n;
   }

   public void b(int $$0) {
      fit $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aR_()) {
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

   public void a(fis $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fiv f() {
      return new fiv(this.a(), this.o);
   }

   static class a implements fit {
      @Override
      public void a(fir $$0) {
         $$0.d();
      }

      @Override
      public vg aQ_() {
         return fir.j;
      }

      @Override
      public void a(exe $$0, float $$1, int $$2) {
         $$0.a(fir.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }

   static class b implements fit {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fir $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vg aQ_() {
         return this.a < 0 ? fir.k : fir.l;
      }

      @Override
      public void a(exe $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fir.c, 0, 0, 16, 16);
         } else {
            $$0.a(fir.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aR_() {
         return this.b;
      }
   }
}
