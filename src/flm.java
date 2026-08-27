import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class flm {
   static final ajc b = new ajc("spectator/close");
   static final ajc c = new ajc("spectator/scroll_left");
   static final ajc d = new ajc("spectator/scroll_right");
   private static final flo e = new flm.a();
   private static final flo f = new flm.b(-1, true);
   private static final flo g = new flm.b(1, true);
   private static final flo h = new flm.b(1, false);
   private static final int i = 8;
   static final vs j = vs.c("spectatorMenu.close");
   static final vs k = vs.c("spectatorMenu.previous_page");
   static final vs l = vs.c("spectatorMenu.next_page");
   public static final flo a = new flo() {
      @Override
      public void a(flm $$0) {
      }

      @Override
      public vs aQ_() {
         return vr.a;
      }

      @Override
      public void a(ezx $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aR_() {
         return false;
      }
   };
   private final flp m;
   private fln n;
   private int o = -1;
   int p;

   public flm(flp $$0) {
      this.n = new fll();
      this.m = $$0;
   }

   public flo a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (flo)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<flo> a() {
      List<flo> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public flo b() {
      return this.a(this.o);
   }

   public fln c() {
      return this.n;
   }

   public void b(int $$0) {
      flo $$1 = this.a($$0);
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

   public void a(fln $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public flq f() {
      return new flq(this.a(), this.o);
   }

   static class a implements flo {
      @Override
      public void a(flm $$0) {
         $$0.d();
      }

      @Override
      public vs aQ_() {
         return flm.j;
      }

      @Override
      public void a(ezx $$0, float $$1, int $$2) {
         $$0.a(flm.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }

   static class b implements flo {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(flm $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public vs aQ_() {
         return this.a < 0 ? flm.k : flm.l;
      }

      @Override
      public void a(ezx $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(flm.c, 0, 0, 16, 16);
         } else {
            $$0.a(flm.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aR_() {
         return this.b;
      }
   }
}
