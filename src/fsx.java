import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class fsx {
   static final akk b = new akk("spectator/close");
   static final akk c = new akk("spectator/scroll_left");
   static final akk d = new akk("spectator/scroll_right");
   private static final fsz e = new fsx.a();
   private static final fsz f = new fsx.b(-1, true);
   private static final fsz g = new fsx.b(1, true);
   private static final fsz h = new fsx.b(1, false);
   private static final int i = 8;
   static final wu j = wu.c("spectatorMenu.close");
   static final wu k = wu.c("spectatorMenu.previous_page");
   static final wu l = wu.c("spectatorMenu.next_page");
   public static final fsz a = new fsz() {
      @Override
      public void a(fsx $$0) {
      }

      @Override
      public wu aR_() {
         return wt.a;
      }

      @Override
      public void a(fhh $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aS_() {
         return false;
      }
   };
   private final fta m;
   private fsy n;
   private int o = -1;
   int p;

   public fsx(fta $$0) {
      this.n = new fsw();
      this.m = $$0;
   }

   public fsz a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (fsz)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<fsz> a() {
      List<fsz> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public fsz b() {
      return this.a(this.o);
   }

   public fsy c() {
      return this.n;
   }

   public void b(int $$0) {
      fsz $$1 = this.a($$0);
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

   public void a(fsy $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public ftb f() {
      return new ftb(this.a(), this.o);
   }

   static class a implements fsz {
      @Override
      public void a(fsx $$0) {
         $$0.d();
      }

      @Override
      public wu aR_() {
         return fsx.j;
      }

      @Override
      public void a(fhh $$0, float $$1, int $$2) {
         $$0.a(fsx.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aS_() {
         return true;
      }
   }

   static class b implements fsz {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(fsx $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wu aR_() {
         return this.a < 0 ? fsx.k : fsx.l;
      }

      @Override
      public void a(fhh $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(fsx.c, 0, 0, 16, 16);
         } else {
            $$0.a(fsx.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aS_() {
         return this.b;
      }
   }
}
