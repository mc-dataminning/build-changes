import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class fhn extends fgh {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final fhn.a k = new fhn.a() {
      @Override
      public int a() {
         return 0;
      }

      @Override
      public vx a(int $$0) {
         return vx.b;
      }
   };
   public static final ajc l = new ajc("textures/gui/book.png");
   protected static final int m = 114;
   protected static final int n = 128;
   protected static final int o = 192;
   protected static final int p = 192;
   private fhn.a q;
   private int r;
   private List<avy> t = Collections.emptyList();
   private int u = -1;
   private vs v = vr.a;
   private fio w;
   private fio x;
   private final boolean y;

   public fhn(fhn.a $$0) {
      this($$0, true);
   }

   public fhn() {
      this(k, false);
   }

   private fhn(fhn.a $$0, boolean $$1) {
      super(eyc.a);
      this.q = $$0;
      this.y = $$1;
   }

   public void a(fhn.a $$0) {
      this.q = $$0;
      this.r = awm.a(this.r, 0, $$0.a());
      this.L();
      this.u = -1;
   }

   public boolean a(int $$0) {
      int $$1 = awm.a($$0, 0, this.q.a() - 1);
      if ($$1 != this.r) {
         this.r = $$1;
         this.L();
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
      this.o();
      this.E();
   }

   protected void o() {
      this.c(fak.a(vr.d, $$0 -> this.d()).a(this.g / 2 - 100, 196, 200, 20).a());
   }

   protected void E() {
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.w = this.c(new fio($$0 + 116, 159, true, $$0x -> this.J(), this.y));
      this.x = this.c(new fio($$0 + 43, 159, false, $$0x -> this.I(), this.y));
      this.L();
   }

   private int H() {
      return this.q.a();
   }

   protected void I() {
      if (this.r > 0) {
         this.r--;
      }

      this.L();
   }

   protected void J() {
      if (this.r < this.H() - 1) {
         this.r++;
      }

      this.L();
   }

   private void L() {
      this.w.k = this.r < this.H() - 1;
      this.x.k = this.r > 0;
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
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      if (this.u != this.r) {
         vx $$6 = this.q.b(this.r);
         this.t = this.i.c($$6, 114);
         this.v = vs.a("book.pageIndicator", this.r + 1, Math.max(this.H(), 1));
      }

      this.u = this.r;
      int $$7 = this.i.a(this.v);
      $$0.a(this.i, this.v, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.t.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         avy $$10 = this.t.get($$9);
         $$0.a(this.i, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      wp $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.i, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(l, (this.g - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         wp $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(wp $$0) {
      vq $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == vq.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == vq.a.c) {
            this.K();
         }

         return $$4;
      }
   }

   protected void K() {
      this.f.a(null);
   }

   @Nullable
   public wp b(double $$0, double $$1) {
      if (this.t.isEmpty()) {
         return null;
      } else {
         int $$2 = awm.a($$0 - (double)((this.g - 192) / 2) - 36.0);
         int $$3 = awm.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.t.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.t.size()) {
                  avy $$6 = this.t.get($$5);
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

   static List<String> a(sy $$0) {
      Builder<String> $$1 = ImmutableList.builder();
      a($$0, $$1::add);
      return $$1.build();
   }

   public static void a(sy $$0, Consumer<String> $$1) {
      te $$2 = $$0.c("pages", 8).e();
      IntFunction<String> $$4;
      if (eyk.P().aR() && $$0.b("filtered_pages", 10)) {
         sy $$3 = $$0.p("filtered_pages");
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

      vx a(int var1);

      default vx b(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a($$0) : vx.b;
      }

      static fhn.a a(cpq $$0) {
         if ($$0.a(cpt.tX)) {
            return new fhn.c($$0);
         } else {
            return (fhn.a)($$0.a(cpt.tW) ? new fhn.b($$0) : fhn.k);
         }
      }
   }

   public static class b implements fhn.a {
      private final List<String> a;

      public b(cpq $$0) {
         this.a = b($$0);
      }

      private static List<String> b(cpq $$0) {
         sy $$1 = $$0.w();
         return (List<String>)($$1 != null ? fhn.a($$1) : ImmutableList.of());
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public vx a(int $$0) {
         return vx.e(this.a.get($$0));
      }
   }

   public static class c implements fhn.a {
      private final List<String> a;

      public c(cpq $$0) {
         this.a = b($$0);
      }

      private static List<String> b(cpq $$0) {
         sy $$1 = $$0.w();
         return (List<String>)($$1 != null && crl.a($$1) ? fhn.a($$1) : ImmutableList.of(vs.a.a(vs.c("book.invalid.tag").a(n.e))));
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public vx a(int $$0) {
         String $$1 = this.a.get($$0);

         try {
            vx $$2 = vs.a.a($$1);
            if ($$2 != null) {
               return $$2;
            }
         } catch (Exception var4) {
         }

         return vx.e($$1);
      }
   }
}
