import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fcu {
   static final aep b = new aep("spectator/close");
   static final aep c = new aep("spectator/scroll_left");
   static final aep d = new aep("spectator/scroll_right");
   private static final fcw e = new fcu.a();
   private static final fcw f = new fcu.b(-1, true);
   private static final fcw g = new fcu.b(1, true);
   private static final fcw h = new fcu.b(1, false);
   private static final int i = 8;
   static final te j = te.c("spectatorMenu.close");
   static final te k = te.c("spectatorMenu.previous_page");
   static final te l = te.c("spectatorMenu.next_page");
   public static final fcw a = new fcw() {
      @Override
      public void a(fcu $$0) {
      }

      @Override
      public te aF_() {
         return td.a;
      }

      @Override
      public void a(erx $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aG_() {
         return false;
      }
   };
   private final fcx m;
   private fcv n;
   private int o = -1;
   int p;

   public fcu(fcx $$0) {
      this.n = new fct();
      this.m = $$0;
   }

   public fcw a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fcw)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fcw> a() {
      List<fcw> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fcw b() {
      return this.a(this.o);
   }

   public fcv c() {
      return this.n;
   }

   public void b(int $$0) {
      fcw $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aG_()) {
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

   public void a(fcv $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fcy f() {
      return new fcy(this.a(), this.o);
   }

   static class a implements fcw {
      @Override
      public void a(fcu $$0) {
         $$0.d();
      }

      @Override
      public te aF_() {
         return fcu.j;
      }

      @Override
      public void a(erx $$0, float $$1, int $$2) {
         $$0.a(fcu.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aG_() {
         return true;
      }
   }

   static class b implements fcw {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fcu $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public te aF_() {
         return this.a < 0 ? fcu.k : fcu.l;
      }

      @Override
      public void a(erx $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fcu.c, 0, 0, 16, 16);
         } else {
            $$0.a(fcu.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aG_() {
         return this.b;
      }
   }
}
