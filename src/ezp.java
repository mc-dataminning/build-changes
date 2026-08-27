import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class ezp {
   private static final ezr b = new ezp.a();
   private static final ezr c = new ezp.b(-1, true);
   private static final ezr d = new ezp.b(1, true);
   private static final ezr e = new ezp.b(1, false);
   private static final int f = 8;
   static final sw g = sw.c("spectatorMenu.close");
   static final sw h = sw.c("spectatorMenu.previous_page");
   static final sw i = sw.c("spectatorMenu.next_page");
   public static final ezr a = new ezr() {
      @Override
      public void a(ezp $$0) {
      }

      @Override
      public sw aI_() {
         return sv.a;
      }

      @Override
      public void a(eox $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aJ_() {
         return false;
      }
   };
   private final ezs j;
   private ezq k;
   private int l = -1;
   int m;

   public ezp(ezs $$0) {
      this.k = new ezo();
      this.j = $$0;
   }

   public ezr a(int $$0) {
      int $$1 = $$0 + this.m * 6;
      if (this.m > 0 && $$0 == 0) {
         return c;
      } else if ($$0 == 7) {
         return $$1 < this.k.a().size() ? d : e;
      } else if ($$0 == 8) {
         return b;
      } else {
         return $$1 >= 0 && $$1 < this.k.a().size() ? (ezr)MoreObjects.firstNonNull(this.k.a().get($$1), a) : a;
      }
   }

   public List<ezr> a() {
      List<ezr> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public ezr b() {
      return this.a(this.l);
   }

   public ezq c() {
      return this.k;
   }

   public void b(int $$0) {
      ezr $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.l == $$0 && $$1.aJ_()) {
            $$1.a(this);
         } else {
            this.l = $$0;
         }
      }
   }

   public void d() {
      this.j.a(this);
   }

   public int e() {
      return this.l;
   }

   public void a(ezq $$0) {
      this.k = $$0;
      this.l = -1;
      this.m = 0;
   }

   public ezt f() {
      return new ezt(this.a(), this.l);
   }

   static class a implements ezr {
      @Override
      public void a(ezp $$0) {
         $$0.d();
      }

      @Override
      public sw aI_() {
         return ezp.g;
      }

      @Override
      public void a(eox $$0, float $$1, int $$2) {
         $$0.a(eqw.a, 0, 0, 128.0F, 0.0F, 16, 16, 256, 256);
      }

      @Override
      public boolean aJ_() {
         return true;
      }
   }

   static class b implements ezr {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(ezp $$0) {
         $$0.m = $$0.m + this.a;
      }

      @Override
      public sw aI_() {
         return this.a < 0 ? ezp.h : ezp.i;
      }

      @Override
      public void a(eox $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(eqw.a, 0, 0, 144.0F, 0.0F, 16, 16, 256, 256);
         } else {
            $$0.a(eqw.a, 0, 0, 160.0F, 0.0F, 16, 16, 256, 256);
         }
      }

      @Override
      public boolean aJ_() {
         return this.b;
      }
   }
}
