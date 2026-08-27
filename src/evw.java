import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class evw extends euq {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final evw.a k = new evw.a() {
      @Override
      public int a() {
         return 0;
      }

      @Override
      public ta a(int $$0) {
         return ta.b;
      }
   };
   public static final acq l = new acq("textures/gui/book.png");
   protected static final int m = 114;
   protected static final int n = 128;
   protected static final int o = 192;
   protected static final int p = 192;
   private evw.a q;
   private int r;
   private List<aom> s = Collections.emptyList();
   private int t = -1;
   private sw u = sv.a;
   private eww v;
   private eww w;
   private final boolean x;

   public evw(evw.a $$0) {
      this($$0, true);
   }

   public evw() {
      this(k, false);
   }

   private evw(evw.a $$0, boolean $$1) {
      super(enf.a);
      this.q = $$0;
      this.x = $$1;
   }

   public void a(evw.a $$0) {
      this.q = $$0;
      this.r = apa.a(this.r, 0, $$0.a());
      this.G();
      this.t = -1;
   }

   public boolean a(int $$0) {
      int $$1 = apa.a($$0, 0, this.q.a() - 1);
      if ($$1 != this.r) {
         this.r = $$1;
         this.G();
         this.t = -1;
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(int $$0) {
      return this.a($$0);
   }

   @Override
   protected void b() {
      this.l();
      this.B();
   }

   protected void l() {
      this.d(epi.a(sv.d, $$0 -> this.aw_()).a(this.g / 2 - 100, 196, 200, 20).a());
   }

   @Override
   protected void B() {
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.v = this.d(new eww($$0 + 116, 159, true, $$0x -> this.E(), this.x));
      this.w = this.d(new eww($$0 + 43, 159, false, $$0x -> this.D(), this.x));
      this.G();
   }

   private int C() {
      return this.q.a();
   }

   protected void D() {
      if (this.r > 0) {
         this.r--;
      }

      this.G();
   }

   protected void E() {
      if (this.r < this.C() - 1) {
         this.r++;
      }

      this.G();
   }

   private void G() {
      this.v.s = this.r < this.C() - 1;
      this.w.s = this.r > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.w.c();
               return true;
            case 267:
               this.v.c();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      $$0.a(l, $$4, 2, 0, 0, 192, 192);
      if (this.t != this.r) {
         ta $$6 = this.q.b(this.r);
         this.s = this.i.c($$6, 114);
         this.u = sw.a("book.pageIndicator", this.r + 1, Math.max(this.C(), 1));
      }

      this.t = this.r;
      int $$7 = this.i.a(this.u);
      $$0.a(this.i, this.u, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.s.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         aom $$10 = this.s.get($$9);
         $$0.a(this.i, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      ts $$11 = this.a((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.i, $$11, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         ts $$3 = this.a($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(ts $$0) {
      su $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == su.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == su.a.c) {
            this.F();
         }

         return $$4;
      }
   }

   protected void F() {
      this.f.a(null);
   }

   @Nullable
   public ts a(double $$0, double $$1) {
      if (this.s.isEmpty()) {
         return null;
      } else {
         int $$2 = apa.a($$0 - (double)((this.g - 192) / 2) - 36.0);
         int $$3 = apa.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.s.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.s.size()) {
                  aom $$6 = this.s.get($$5);
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

   static List<String> a(qr $$0) {
      Builder<String> $$1 = ImmutableList.builder();
      a($$0, $$1::add);
      return $$1.build();
   }

   public static void a(qr $$0, Consumer<String> $$1) {
      qx $$2 = $$0.c("pages", 8).e();
      IntFunction<String> $$4;
      if (enn.N().aP() && $$0.b("filtered_pages", 10)) {
         qr $$3 = $$0.p("filtered_pages");
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

      ta a(int var1);

      default ta b(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a($$0) : ta.b;
      }

      static evw.a a(cfz $$0) {
         if ($$0.a(cgc.th)) {
            return new evw.c($$0);
         } else {
            return (evw.a)($$0.a(cgc.tg) ? new evw.b($$0) : evw.k);
         }
      }
   }

   public static class b implements evw.a {
      private final List<String> a;

      public b(cfz $$0) {
         this.a = b($$0);
      }

      private static List<String> b(cfz $$0) {
         qr $$1 = $$0.v();
         return (List<String>)($$1 != null ? evw.a($$1) : ImmutableList.of());
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public ta a(int $$0) {
         return ta.e(this.a.get($$0));
      }
   }

   public static class c implements evw.a {
      private final List<String> a;

      public c(cfz $$0) {
         this.a = b($$0);
      }

      private static List<String> b(cfz $$0) {
         qr $$1 = $$0.v();
         return (List<String>)($$1 != null && chv.a($$1) ? evw.a($$1) : ImmutableList.of(sw.a.a(sw.c("book.invalid.tag").a(n.e))));
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public ta a(int $$0) {
         String $$1 = this.a.get($$0);

         try {
            ta $$2 = sw.a.a($$1);
            if ($$2 != null) {
               return $$2;
            }
         } catch (Exception var4) {
         }

         return ta.e($$1);
      }
   }
}
