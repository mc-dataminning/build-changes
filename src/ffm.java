import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class ffm {
   static final agg b = new agg("spectator/close");
   static final agg c = new agg("spectator/scroll_left");
   static final agg d = new agg("spectator/scroll_right");
   private static final ffo e = new ffm.a();
   private static final ffo f = new ffm.b(-1, true);
   private static final ffo g = new ffm.b(1, true);
   private static final ffo h = new ffm.b(1, false);
   private static final int i = 8;
   static final ur j = ur.c("spectatorMenu.close");
   static final ur k = ur.c("spectatorMenu.previous_page");
   static final ur l = ur.c("spectatorMenu.next_page");
   public static final ffo a = new ffo() {
      @Override
      public void a(ffm $$0) {
      }

      @Override
      public ur aP_() {
         return uq.a;
      }

      @Override
      public void a(eub $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aQ_() {
         return false;
      }
   };
   private final ffp m;
   private ffn n;
   private int o = -1;
   int p;

   public ffm(ffp $$0) {
      this.n = new ffl();
      this.m = $$0;
   }

   public ffo a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (ffo)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<ffo> a() {
      List<ffo> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public ffo b() {
      return this.a(this.o);
   }

   public ffn c() {
      return this.n;
   }

   public void b(int $$0) {
      ffo $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aQ_()) {
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

   public void a(ffn $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public ffq f() {
      return new ffq(this.a(), this.o);
   }

   static class a implements ffo {
      @Override
      public void a(ffm $$0) {
         $$0.d();
      }

      @Override
      public ur aP_() {
         return ffm.j;
      }

      @Override
      public void a(eub $$0, float $$1, int $$2) {
         $$0.a(ffm.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }

   static class b implements ffo {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ffm $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public ur aP_() {
         return this.a < 0 ? ffm.k : ffm.l;
      }

      @Override
      public void a(eub $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(ffm.c, 0, 0, 16, 16);
         } else {
            $$0.a(ffm.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aQ_() {
         return this.b;
      }
   }
}
