import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class ftr {
   static final akr b = akr.b("spectator/close");
   static final akr c = akr.b("spectator/scroll_left");
   static final akr d = akr.b("spectator/scroll_right");
   private static final ftt e = new ftr.a();
   private static final ftt f = new ftr.b(-1, true);
   private static final ftt g = new ftr.b(1, true);
   private static final ftt h = new ftr.b(1, false);
   private static final int i = 8;
   static final wz j = wz.c("spectatorMenu.close");
   static final wz k = wz.c("spectatorMenu.previous_page");
   static final wz l = wz.c("spectatorMenu.next_page");
   public static final ftt a = new ftt() {
      @Override
      public void a(ftr $$0) {
      }

      @Override
      public wz aU_() {
         return wy.a;
      }

      @Override
      public void a(fhz $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aV_() {
         return false;
      }
   };
   private final ftu m;
   private fts n;
   private int o = -1;
   int p;

   public ftr(ftu $$0) {
      this.n = new ftq();
      this.m = $$0;
   }

   public ftt a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (ftt)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<ftt> a() {
      List<ftt> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public ftt b() {
      return this.a(this.o);
   }

   public fts c() {
      return this.n;
   }

   public void b(int $$0) {
      ftt $$1 = this.a($$0);
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

   public void a(fts $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public ftv f() {
      return new ftv(this.a(), this.o);
   }

   static class a implements ftt {
      @Override
      public void a(ftr $$0) {
         $$0.d();
      }

      @Override
      public wz aU_() {
         return ftr.j;
      }

      @Override
      public void a(fhz $$0, float $$1, int $$2) {
         $$0.a(ftr.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }

   static class b implements ftt {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ftr $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wz aU_() {
         return this.a < 0 ? ftr.k : ftr.l;
      }

      @Override
      public void a(fhz $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(ftr.c, 0, 0, 16, 16);
         } else {
            $$0.a(ftr.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aV_() {
         return this.b;
      }
   }
}
