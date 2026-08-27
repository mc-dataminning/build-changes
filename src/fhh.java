import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fhh {
   static final agt b = new agt("spectator/close");
   static final agt c = new agt("spectator/scroll_left");
   static final agt d = new agt("spectator/scroll_right");
   private static final fhj e = new fhh.a();
   private static final fhj f = new fhh.b(-1, true);
   private static final fhj g = new fhh.b(1, true);
   private static final fhj h = new fhh.b(1, false);
   private static final int i = 8;
   static final vb j = vb.c("spectatorMenu.close");
   static final vb k = vb.c("spectatorMenu.previous_page");
   static final vb l = vb.c("spectatorMenu.next_page");
   public static final fhj a = new fhj() {
      @Override
      public void a(fhh $$0) {
      }

      @Override
      public vb aQ_() {
         return va.a;
      }

      @Override
      public void a(evw $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aR_() {
         return false;
      }
   };
   private final fhk m;
   private fhi n;
   private int o = -1;
   int p;

   public fhh(fhk $$0) {
      this.n = new fhg();
      this.m = $$0;
   }

   public fhj a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fhj)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fhj> a() {
      List<fhj> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fhj b() {
      return this.a(this.o);
   }

   public fhi c() {
      return this.n;
   }

   public void b(int $$0) {
      fhj $$1 = this.a($$0);
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

   public void a(fhi $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fhl f() {
      return new fhl(this.a(), this.o);
   }

   static class a implements fhj {
      @Override
      public void a(fhh $$0) {
         $$0.d();
      }

      @Override
      public vb aQ_() {
         return fhh.j;
      }

      @Override
      public void a(evw $$0, float $$1, int $$2) {
         $$0.a(fhh.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }

   static class b implements fhj {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fhh $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vb aQ_() {
         return this.a < 0 ? fhh.k : fhh.l;
      }

      @Override
      public void a(evw $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fhh.c, 0, 0, 16, 16);
         } else {
            $$0.a(fhh.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aR_() {
         return this.b;
      }
   }
}
