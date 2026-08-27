import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class frd {
   static final akn b = new akn("spectator/close");
   static final akn c = new akn("spectator/scroll_left");
   static final akn d = new akn("spectator/scroll_right");
   private static final frf e = new frd.a();
   private static final frf f = new frd.b(-1, true);
   private static final frf g = new frd.b(1, true);
   private static final frf h = new frd.b(1, false);
   private static final int i = 8;
   static final wx j = wx.c("spectatorMenu.close");
   static final wx k = wx.c("spectatorMenu.previous_page");
   static final wx l = wx.c("spectatorMenu.next_page");
   public static final frf a = new frf() {
      @Override
      public void a(frd $$0) {
      }

      @Override
      public wx aO_() {
         return ww.a;
      }

      @Override
      public void a(ffn $$0, float $$1, int $$2) {
      }

      @Override
      public boolean aP_() {
         return false;
      }
   };
   private final frg m;
   private fre n;
   private int o = -1;
   int p;

   public frd(frg $$0) {
      this.n = new frc();
      this.m = $$0;
   }

   public frf a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (frf)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<frf> a() {
      List<frf> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public frf b() {
      return this.a(this.o);
   }

   public fre c() {
      return this.n;
   }

   public void b(int $$0) {
      frf $$1 = this.a($$0);
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

   public void a(fre $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public frh f() {
      return new frh(this.a(), this.o);
   }

   static class a implements frf {
      @Override
      public void a(frd $$0) {
         $$0.d();
      }

      @Override
      public wx aO_() {
         return frd.j;
      }

      @Override
      public void a(ffn $$0, float $$1, int $$2) {
         $$0.a(frd.b, 0, 0, 16, 16);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }

   static class b implements frf {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(frd $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public wx aO_() {
         return this.a < 0 ? frd.k : frd.l;
      }

      @Override
      public void a(ffn $$0, float $$1, int $$2) {
         if (this.a < 0) {
            $$0.a(frd.c, 0, 0, 16, 16);
         } else {
            $$0.a(frd.d, 0, 0, 16, 16);
         }
      }

      @Override
      public boolean aP_() {
         return this.b;
      }
   }
}
