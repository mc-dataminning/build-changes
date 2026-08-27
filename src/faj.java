import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class faj extends ezd {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final faj.a k = new faj.a() {
      @Override
      public int a() {
         return 0;
      }

      @Override
      public un a(int $$0) {
         return un.b;
      }
   };
   public static final afw l = new afw("textures/gui/book.png");
   protected static final int m = 114;
   protected static final int n = 128;
   protected static final int o = 192;
   protected static final int p = 192;
   private faj.a q;
   private int s;
   private List<ask> t = Collections.emptyList();
   private int u = -1;
   private ui v = uh.a;
   private fbj w;
   private fbj x;
   private final boolean y;

   public faj(faj.a $$0) {
      this($$0, true);
   }

   public faj() {
      this(k, false);
   }

   private faj(faj.a $$0, boolean $$1) {
      super(erg.a);
      this.q = $$0;
      this.y = $$1;
   }

   public void a(faj.a $$0) {
      this.q = $$0;
      this.s = asy.a(this.s, 0, $$0.a());
      this.H();
      this.u = -1;
   }

   public boolean a(int $$0) {
      int $$1 = asy.a($$0, 0, this.q.a() - 1);
      if ($$1 != this.s) {
         this.s = $$1;
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
   protected void aM_() {
      this.l();
      this.C();
   }

   protected void l() {
      this.d(etj.a(uh.d, $$0 -> this.aC_()).a(this.g / 2 - 100, 196, 200, 20).a());
   }

   @Override
   protected void C() {
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.w = this.d(new fbj($$0 + 116, 159, true, $$0x -> this.F(), this.y));
      this.x = this.d(new fbj($$0 + 43, 159, false, $$0x -> this.E(), this.y));
      this.H();
   }

   private int D() {
      return this.q.a();
   }

   protected void E() {
      if (this.s > 0) {
         this.s--;
      }

      this.H();
   }

   protected void F() {
      if (this.s < this.D() - 1) {
         this.s++;
      }

      this.H();
   }

   private void H() {
      this.w.j = this.s < this.D() - 1;
      this.x.j = this.s > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.x.c();
               return true;
            case 267:
               this.w.c();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      if (this.u != this.s) {
         un $$6 = this.q.b(this.s);
         this.t = this.i.c($$6, 114);
         this.v = ui.a("book.pageIndicator", this.s + 1, Math.max(this.D(), 1));
      }

      this.u = this.s;
      int $$7 = this.i.a(this.v);
      $$0.a(this.i, this.v, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.t.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         ask $$10 = this.t.get($$9);
         $$0.a(this.i, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      vf $$11 = this.a((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.i, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(l, (this.g - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         vf $$3 = this.a($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(vf $$0) {
      ug $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == ug.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == ug.a.c) {
            this.G();
         }

         return $$4;
      }
   }

   protected void G() {
      this.f.a(null);
   }

   @Nullable
   public vf a(double $$0, double $$1) {
      if (this.t.isEmpty()) {
         return null;
      } else {
         int $$2 = asy.a($$0 - (double)((this.g - 192) / 2) - 36.0);
         int $$3 = asy.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.t.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.t.size()) {
                  ask $$6 = this.t.get($$5);
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

   static List<String> a(rt $$0) {
      Builder<String> $$1 = ImmutableList.builder();
      a($$0, $$1::add);
      return $$1.build();
   }

   public static void a(rt $$0, Consumer<String> $$1) {
      rz $$2 = $$0.c("pages", 8).e();
      IntFunction<String> $$4;
      if (ero.O().aQ() && $$0.b("filtered_pages", 10)) {
         rt $$3 = $$0.p("filtered_pages");
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

      un a(int var1);

      default un b(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a($$0) : un.b;
      }

      static faj.a a(ckj $$0) {
         if ($$0.a(ckm.th)) {
            return new faj.c($$0);
         } else {
            return (faj.a)($$0.a(ckm.tg) ? new faj.b($$0) : faj.k);
         }
      }
   }

   public static class b implements faj.a {
      private final List<String> a;

      public b(ckj $$0) {
         this.a = b($$0);
      }

      private static List<String> b(ckj $$0) {
         rt $$1 = $$0.v();
         return (List<String>)($$1 != null ? faj.a($$1) : ImmutableList.of());
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public un a(int $$0) {
         return un.e(this.a.get($$0));
      }
   }

   public static class c implements faj.a {
      private final List<String> a;

      public c(ckj $$0) {
         this.a = b($$0);
      }

      private static List<String> b(ckj $$0) {
         rt $$1 = $$0.v();
         return (List<String>)($$1 != null && cmf.a($$1) ? faj.a($$1) : ImmutableList.of(ui.a.a(ui.c("book.invalid.tag").a(n.e))));
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public un a(int $$0) {
         String $$1 = this.a.get($$0);

         try {
            un $$2 = ui.a.a($$1);
            if ($$2 != null) {
               return $$2;
            }
         } catch (Exception var4) {
         }

         return un.e($$1);
      }
   }
}
