import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fdp {
   static final aey b = new aey("spectator/close");
   static final aey c = new aey("spectator/scroll_left");
   static final aey d = new aey("spectator/scroll_right");
   private static final fdr e = new fdp.a();
   private static final fdr f = new fdp.b(-1, true);
   private static final fdr g = new fdp.b(1, true);
   private static final fdr h = new fdp.b(1, false);
   private static final int i = 8;
   static final tn j = tn.c("spectatorMenu.close");
   static final tn k = tn.c("spectatorMenu.previous_page");
   static final tn l = tn.c("spectatorMenu.next_page");
   public static final fdr a = new fdr() {
      @Override
      public void a(fdp $$0) {
      }

      @Override
      public tn aI_() {
         return tm.a;
      }

      @Override
      public void a(esh $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aJ_() {
         return false;
      }
   };
   private final fds m;
   private fdq n;
   private int o = -1;
   int p;

   public fdp(fds $$0) {
      this.n = new fdo();
      this.m = $$0;
   }

   public fdr a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fdr)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fdr> a() {
      List<fdr> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fdr b() {
      return this.a(this.o);
   }

   public fdq c() {
      return this.n;
   }

   public void b(int $$0) {
      fdr $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aJ_()) {
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

   public void a(fdq $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fdt f() {
      return new fdt(this.a(), this.o);
   }

   static class a implements fdr {
      @Override
      public void a(fdp $$0) {
         $$0.d();
      }

      @Override
      public tn aI_() {
         return fdp.j;
      }

      @Override
      public void a(esh $$0, float $$1, int $$2) {
         $$0.a(fdp.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aJ_() {
         return true;
      }
   }

   static class b implements fdr {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fdp $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public tn aI_() {
         return this.a < 0 ? fdp.k : fdp.l;
      }

      @Override
      public void a(esh $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fdp.c, 0, 0, 16, 16);
         } else {
            $$0.a(fdp.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aJ_() {
         return this.b;
      }
   }
}
