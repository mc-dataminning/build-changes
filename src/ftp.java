import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class ftp {
   static final akr b = akr.b("spectator/close");
   static final akr c = akr.b("spectator/scroll_left");
   static final akr d = akr.b("spectator/scroll_right");
   private static final ftr e = new ftp.a();
   private static final ftr f = new ftp.b(-1, true);
   private static final ftr g = new ftp.b(1, true);
   private static final ftr h = new ftp.b(1, false);
   private static final int i = 8;
   static final wz j = wz.c("spectatorMenu.close");
   static final wz k = wz.c("spectatorMenu.previous_page");
   static final wz l = wz.c("spectatorMenu.next_page");
   public static final ftr a = new ftr() {
      @Override
      public void a(ftp $$0) {
      }

      @Override
      public wz aU_() {
         return wy.a;
      }

      @Override
      public void a(fhx $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aV_() {
         return false;
      }
   };
   private final fts m;
   private ftq n;
   private int o = -1;
   int p;

   public ftp(fts $$0) {
      this.n = new fto();
      this.m = $$0;
   }

   public ftr a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (ftr)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<ftr> a() {
      List<ftr> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public ftr b() {
      return this.a(this.o);
   }

   public ftq c() {
      return this.n;
   }

   public void b(int $$0) {
      ftr $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aV_()) {
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

   public void a(ftq $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public ftt f() {
      return new ftt(this.a(), this.o);
   }

   static class a implements ftr {
      @Override
      public void a(ftp $$0) {
         $$0.d();
      }

      @Override
      public wz aU_() {
         return ftp.j;
      }

      @Override
      public void a(fhx $$0, float $$1, int $$2) {
         $$0.a(ftp.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }

   static class b implements ftr {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ftp $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wz aU_() {
         return this.a < 0 ? ftp.k : ftp.l;
      }

      @Override
      public void a(fhx $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(ftp.c, 0, 0, 16, 16);
         } else {
            $$0.a(ftp.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aV_() {
         return this.b;
      }
   }
}
