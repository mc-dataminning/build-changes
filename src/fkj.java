import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fkj {
   static final aiy b = new aiy("spectator/close");
   static final aiy c = new aiy("spectator/scroll_left");
   static final aiy d = new aiy("spectator/scroll_right");
   private static final fkl e = new fkj.a();
   private static final fkl f = new fkj.b(-1, true);
   private static final fkl g = new fkj.b(1, true);
   private static final fkl h = new fkj.b(1, false);
   private static final int i = 8;
   static final vq j = vq.c("spectatorMenu.close");
   static final vq k = vq.c("spectatorMenu.previous_page");
   static final vq l = vq.c("spectatorMenu.next_page");
   public static final fkl a = new fkl() {
      @Override
      public void a(fkj $$0) {
      }

      @Override
      public vq aR_() {
         return vp.a;
      }

      @Override
      public void a(eyu $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aS_() {
         return false;
      }
   };
   private final fkm m;
   private fkk n;
   private int o = -1;
   int p;

   public fkj(fkm $$0) {
      this.n = new fki();
      this.m = $$0;
   }

   public fkl a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fkl)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fkl> a() {
      List<fkl> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fkl b() {
      return this.a(this.o);
   }

   public fkk c() {
      return this.n;
   }

   public void b(int $$0) {
      fkl $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aS_()) {
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

   public void a(fkk $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fkn f() {
      return new fkn(this.a(), this.o);
   }

   static class a implements fkl {
      @Override
      public void a(fkj $$0) {
         $$0.d();
      }

      @Override
      public vq aR_() {
         return fkj.j;
      }

      @Override
      public void a(eyu $$0, float $$1, int $$2) {
         $$0.a(fkj.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aS_() {
         return true;
      }
   }

   static class b implements fkl {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fkj $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vq aR_() {
         return this.a < 0 ? fkj.k : fkj.l;
      }

      @Override
      public void a(eyu $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fkj.c, 0, 0, 16, 16);
         } else {
            $$0.a(fkj.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aS_() {
         return this.b;
      }
   }
}
