import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class ftw {
   static final akt b = new akt("spectator/close");
   static final akt c = new akt("spectator/scroll_left");
   static final akt d = new akt("spectator/scroll_right");
   private static final fty e = new ftw.a();
   private static final fty f = new ftw.b(-1, true);
   private static final fty g = new ftw.b(1, true);
   private static final fty h = new ftw.b(1, false);
   private static final int i = 8;
   static final xe j = xe.c("spectatorMenu.close");
   static final xe k = xe.c("spectatorMenu.previous_page");
   static final xe l = xe.c("spectatorMenu.next_page");
   public static final fty a = new fty() {
      @Override
      public void a(ftw $$0) {
      }

      @Override
      public xe aO_() {
         return xd.a;
      }

      @Override
      public void a(fia $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aP_() {
         return false;
      }
   };
   private final ftz m;
   private ftx n;
   private int o = -1;
   int p;

   public ftw(ftz $$0) {
      this.n = new ftv();
      this.m = $$0;
   }

   public fty a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fty)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fty> a() {
      List<fty> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fty b() {
      return this.a(this.o);
   }

   public ftx c() {
      return this.n;
   }

   public void b(int $$0) {
      fty $$1 = this.a($$0);
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

   public void a(ftx $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fua f() {
      return new fua(this.a(), this.o);
   }

   static class a implements fty {
      @Override
      public void a(ftw $$0) {
         $$0.d();
      }

      @Override
      public xe aO_() {
         return ftw.j;
      }

      @Override
      public void a(fia $$0, float $$1, int $$2) {
         $$0.a(ftw.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }

   static class b implements fty {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ftw $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xe aO_() {
         return this.a < 0 ? ftw.k : ftw.l;
      }

      @Override
      public void a(fia $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(ftw.c, 0, 0, 16, 16);
         } else {
            $$0.a(ftw.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aP_() {
         return this.b;
      }
   }
}
