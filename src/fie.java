import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fie {
   static final ahg b = new ahg("spectator/close");
   static final ahg c = new ahg("spectator/scroll_left");
   static final ahg d = new ahg("spectator/scroll_right");
   private static final fig e = new fie.a();
   private static final fig f = new fie.b(-1, true);
   private static final fig g = new fie.b(1, true);
   private static final fig h = new fie.b(1, false);
   private static final int i = 8;
   static final vf j = vf.c("spectatorMenu.close");
   static final vf k = vf.c("spectatorMenu.previous_page");
   static final vf l = vf.c("spectatorMenu.next_page");
   public static final fig a = new fig() {
      @Override
      public void a(fie $$0) {
      }

      @Override
      public vf aO_() {
         return ve.a;
      }

      @Override
      public void a(ews $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aP_() {
         return false;
      }
   };
   private final fih m;
   private fif n;
   private int o = -1;
   int p;

   public fie(fih $$0) {
      this.n = new fid();
      this.m = $$0;
   }

   public fig a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fig)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fig> a() {
      List<fig> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fig b() {
      return this.a(this.o);
   }

   public fif c() {
      return this.n;
   }

   public void b(int $$0) {
      fig $$1 = this.a($$0);
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

   public void a(fif $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fii f() {
      return new fii(this.a(), this.o);
   }

   static class a implements fig {
      @Override
      public void a(fie $$0) {
         $$0.d();
      }

      @Override
      public vf aO_() {
         return fie.j;
      }

      @Override
      public void a(ews $$0, float $$1, int $$2) {
         $$0.a(fie.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }

   static class b implements fig {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fie $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vf aO_() {
         return this.a < 0 ? fie.k : fie.l;
      }

      @Override
      public void a(ews $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fie.c, 0, 0, 16, 16);
         } else {
            $$0.a(fie.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aP_() {
         return this.b;
      }
   }
}
