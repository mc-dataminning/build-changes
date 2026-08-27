import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class fca extends fau {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final fca.a k = new fca.a() {
      @Override
      public int a() {
         return 0;
      }

      @Override
      public uw a(int $$0) {
         return uw.b;
      }
   };
   public static final agi l = new agi("textures/gui/book.png");
   protected static final int m = 114;
   protected static final int n = 128;
   protected static final int o = 192;
   protected static final int p = 192;
   private fca.a q;
   private int r;
   private List<asy> t = Collections.emptyList();
   private int u = -1;
   private ur v = uq.a;
   private fdb w;
   private fdb x;
   private final boolean y;

   public fca(fca.a $$0) {
      this($$0, true);
   }

   public fca() {
      this(k, false);
   }

   private fca(fca.a $$0, boolean $$1) {
      super(esv.a);
      this.q = $$0;
      this.y = $$1;
   }

   public void a(fca.a $$0) {
      this.q = $$0;
      this.r = atm.a(this.r, 0, $$0.a());
      this.H();
      this.u = -1;
   }

   public boolean a(int $$0) {
      int $$1 = atm.a($$0, 0, this.q.a() - 1);
      if ($$1 != this.r) {
         this.r = $$1;
         this.H();
         this.u = -1;
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(int $$0) {
      return this.a($$0);
   }

   @Override
   protected void aP_() {
      this.l();
      this.C();
   }

   protected void l() {
      this.d(euz.a(uq.d, $$0 -> this.aF_()).a(this.g / 2 - 100, 196, 200, 20).a());
   }

   @Override
   protected void C() {
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.w = this.d(new fdb($$0 + 116, 159, true, $$0x -> this.F(), this.y));
      this.x = this.d(new fdb($$0 + 43, 159, false, $$0x -> this.E(), this.y));
      this.H();
   }

   private int D() {
      return this.q.a();
   }

   protected void E() {
      if (this.r > 0) {
         this.r--;
      }

      this.H();
   }

   protected void F() {
      if (this.r < this.D() - 1) {
         this.r++;
      }

      this.H();
   }

   private void H() {
      this.w.j = this.r < this.D() - 1;
      this.x.j = this.r > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.x.b();
               return true;
            case 267:
               this.w.b();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      if (this.u != this.r) {
         uw $$6 = this.q.b(this.r);
         this.t = this.i.c($$6, 114);
         this.v = ur.a("book.pageIndicator", this.r + 1, Math.max(this.D(), 1));
      }

      this.u = this.r;
      int $$7 = this.i.a(this.v);
      $$0.a(this.i, this.v, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.t.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         asy $$10 = this.t.get($$9);
         $$0.a(this.i, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      vo $$11 = this.a((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.i, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(l, (this.g - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         vo $$3 = this.a($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(vo $$0) {
      up $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == up.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == up.a.c) {
            this.G();
         }

         return $$4;
      }
   }

   protected void G() {
      this.f.a(null);
   }

   @Nullable
   public vo a(double $$0, double $$1) {
      if (this.t.isEmpty()) {
         return null;
      } else {
         int $$2 = atm.a($$0 - (double)((this.g - 192) / 2) - 36.0);
         int $$3 = atm.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.t.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.t.size()) {
                  asy $$6 = this.t.get($$5);
                  return this.f.h.b().a($$6, $$2);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   static List<String> a(rz $$0) {
      Builder<String> $$1 = ImmutableList.builder();
      a($$0, $$1::add);
      return $$1.build();
   }

   public static void a(rz $$0, Consumer<String> $$1) {
      sf $$2 = $$0.c("pages", 8).e();
      IntFunction<String> $$4;
      if (etd.N().aP() && $$0.b("filtered_pages", 10)) {
         rz $$3 = $$0.p("filtered_pages");
         $$4 = $$2x -> {
            String $$3x = String.valueOf($$2x);
            return $$3.e($$3x) ? $$3.l($$3x) : $$2.j($$2x);
         };
      } else {
         $$4 = $$2::j;
      }

      for (int $$6 = 0; $$6 < $$2.size(); $$6++) {
         $$1.accept($$4.apply($$6));
      }
   }

   public interface a {
      int a();

      uw a(int var1);

      default uw b(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a($$0) : uw.b;
      }

      static fca.a a(clj $$0) {
         if ($$0.a(clm.tT)) {
            return new fca.c($$0);
         } else {
            return (fca.a)($$0.a(clm.tS) ? new fca.b($$0) : fca.k);
         }
      }
   }

   public static class b implements fca.a {
      private final List<String> a;

      public b(clj $$0) {
         this.a = b($$0);
      }

      private static List<String> b(clj $$0) {
         rz $$1 = $$0.v();
         return (List<String>)($$1 != null ? fca.a($$1) : ImmutableList.of());
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public uw a(int $$0) {
         return uw.e(this.a.get($$0));
      }
   }

   public static class c implements fca.a {
      private final List<String> a;

      public c(clj $$0) {
         this.a = b($$0);
      }

      private static List<String> b(clj $$0) {
         rz $$1 = $$0.v();
         return (List<String>)($$1 != null && cnf.a($$1) ? fca.a($$1) : ImmutableList.of(ur.a.a(ur.c("book.invalid.tag").a(n.e))));
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public uw a(int $$0) {
         String $$1 = this.a.get($$0);

         try {
            uw $$2 = ur.a.a($$1);
            if ($$2 != null) {
               return $$2;
            }
         } catch (Exception var4) {
         }

         return uw.e($$1);
      }
   }
}
