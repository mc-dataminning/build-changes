import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fsp {
   static final akk b = new akk("spectator/close");
   static final akk c = new akk("spectator/scroll_left");
   static final akk d = new akk("spectator/scroll_right");
   private static final fsr e = new fsp.a();
   private static final fsr f = new fsp.b(-1, true);
   private static final fsr g = new fsp.b(1, true);
   private static final fsr h = new fsp.b(1, false);
   private static final int i = 8;
   static final wu j = wu.c("spectatorMenu.close");
   static final wu k = wu.c("spectatorMenu.previous_page");
   static final wu l = wu.c("spectatorMenu.next_page");
   public static final fsr a = new fsr() {
      @Override
      public void a(fsp $$0) {
      }

      @Override
      public wu aQ_() {
         return wt.a;
      }

      @Override
      public void a(fgz $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aR_() {
         return false;
      }
   };
   private final fss m;
   private fsq n;
   private int o = -1;
   int p;

   public fsp(fss $$0) {
      this.n = new fso();
      this.m = $$0;
   }

   public fsr a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fsr)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fsr> a() {
      List<fsr> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fsr b() {
      return this.a(this.o);
   }

   public fsq c() {
      return this.n;
   }

   public void b(int $$0) {
      fsr $$1 = this.a($$0);
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

   public void a(fsq $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public fst f() {
      return new fst(this.a(), this.o);
   }

   static class a implements fsr {
      @Override
      public void a(fsp $$0) {
         $$0.d();
      }

      @Override
      public wu aQ_() {
         return fsp.j;
      }

      @Override
      public void a(fgz $$0, float $$1, int $$2) {
         $$0.a(fsp.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }

   static class b implements fsr {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fsp $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wu aQ_() {
         return this.a < 0 ? fsp.k : fsp.l;
      }

      @Override
      public void a(fgz $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fsp.c, 0, 0, 16, 16);
         } else {
            $$0.a(fsp.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aR_() {
         return this.b;
      }
   }
}
