import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class ftl {
   static final akq b = akq.b("spectator/close");
   static final akq c = akq.b("spectator/scroll_left");
   static final akq d = akq.b("spectator/scroll_right");
   private static final ftn e = new ftl.a();
   private static final ftn f = new ftl.b(-1, true);
   private static final ftn g = new ftl.b(1, true);
   private static final ftn h = new ftl.b(1, false);
   private static final int i = 8;
   static final wy j = wy.c("spectatorMenu.close");
   static final wy k = wy.c("spectatorMenu.previous_page");
   static final wy l = wy.c("spectatorMenu.next_page");
   public static final ftn a = new ftn() {
      @Override
      public void a(ftl $$0) {
      }

      @Override
      public wy aR_() {
         return wx.a;
      }

      @Override
      public void a(fht $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aS_() {
         return false;
      }
   };
   private final fto m;
   private ftm n;
   private int o = -1;
   int p;

   public ftl(fto $$0) {
      this.n = new ftk();
      this.m = $$0;
   }

   public ftn a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (ftn)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<ftn> a() {
      List<ftn> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public ftn b() {
      return this.a(this.o);
   }

   public ftm c() {
      return this.n;
   }

   public void b(int $$0) {
      ftn $$1 = this.a($$0);
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

   public void a(ftm $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public ftp f() {
      return new ftp(this.a(), this.o);
   }

   static class a implements ftn {
      @Override
      public void a(ftl $$0) {
         $$0.d();
      }

      @Override
      public wy aR_() {
         return ftl.j;
      }

      @Override
      public void a(fht $$0, float $$1, int $$2) {
         $$0.a(ftl.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aS_() {
         return true;
      }
   }

   static class b implements ftn {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ftl $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wy aR_() {
         return this.a < 0 ? ftl.k : ftl.l;
      }

      @Override
      public void a(fht $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(ftl.c, 0, 0, 16, 16);
         } else {
            $$0.a(ftl.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aS_() {
         return this.b;
      }
   }
}
