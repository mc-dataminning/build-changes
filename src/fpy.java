import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fpy {
   static final akf b = new akf("spectator/close");
   static final akf c = new akf("spectator/scroll_left");
   static final akf d = new akf("spectator/scroll_right");
   private static final fqa e = new fpy.a();
   private static final fqa f = new fpy.b(-1, true);
   private static final fqa g = new fpy.b(1, true);
   private static final fqa h = new fpy.b(1, false);
   private static final int i = 8;
   static final ws j = ws.c("spectatorMenu.close");
   static final ws k = ws.c("spectatorMenu.previous_page");
   static final ws l = ws.c("spectatorMenu.next_page");
   public static final fqa a = new fqa() {
      @Override
      public void a(fpy $$0) {
      }

      @Override
      public ws aN_() {
         return wr.a;
      }

      @Override
      public void a(feh $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aO_() {
         return false;
      }
   };
   private final fqb m;
   private fpz n;
   private int o = -1;
   int p;

   public fpy(fqb $$0) {
      this.n = new fpx();
      this.m = $$0;
   }

   public fqa a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fqa)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fqa> a() {
      List<fqa> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fqa b() {
      return this.a(this.o);
   }

   public fpz c() {
      return this.n;
   }

   public void b(int $$0) {
      fqa $$1 = this.a($$0);
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

   public void a(fpz $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fqc f() {
      return new fqc(this.a(), this.o);
   }

   static class a implements fqa {
      @Override
      public void a(fpy $$0) {
         $$0.d();
      }

      @Override
      public ws aN_() {
         return fpy.j;
      }

      @Override
      public void a(feh $$0, float $$1, int $$2) {
         $$0.a(fpy.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }

   static class b implements fqa {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fpy $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public ws aN_() {
         return this.a < 0 ? fpy.k : fpy.l;
      }

      @Override
      public void a(feh $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fpy.c, 0, 0, 16, 16);
         } else {
            $$0.a(fpy.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aO_() {
         return this.b;
      }
   }
}
