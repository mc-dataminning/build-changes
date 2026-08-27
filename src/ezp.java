import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ezp extends eyk {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   public static final ezp.a k = new ezp.a() {
      @Override
      public int a() {
         return 0;
      }

      @Override
      public tp a(int $$0) {
         return tp.b;
      }
   };
   public static final aew l = new aew("textures/gui/book.png");
   protected static final int m = 114;
   protected static final int n = 128;
   protected static final int o = 192;
   protected static final int p = 192;
   private ezp.a q;
   private int s;
   private List<arj> t = Collections.emptyList();
   private int u = -1;
   private tl v = tk.a;
   private fap w;
   private fap x;
   private final boolean y;

   public ezp(ezp.a $$0) {
      this($$0, true);
   }

   public ezp() {
      this(k, false);
   }

   private ezp(ezp.a $$0, boolean $$1) {
      super(eqn.a);
      this.q = $$0;
      this.y = $$1;
   }

   public void a(ezp.a $$0) {
      this.q = $$0;
      this.s = arw.a(this.s, 0, $$0.a());
      this.I();
      this.u = -1;
   }

   public boolean a(int $$0) {
      int $$1 = arw.a($$0, 0, this.q.a() - 1);
      if ($$1 != this.s) {
         this.s = $$1;
         this.I();
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
   protected void aH_() {
      this.l();
      this.D();
   }

   protected void l() {
      this.d(esq.a(tk.d, $$0 -> this.az_()).a(this.g / 2 - 100, 196, 200, 20).a());
   }

   @Override
   protected void D() {
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.w = this.d(new fap($$0 + 116, 159, true, $$0x -> this.G(), this.y));
      this.x = this.d(new fap($$0 + 43, 159, false, $$0x -> this.F(), this.y));
      this.I();
   }

   private int E() {
      return this.q.a();
   }

   protected void F() {
      if (this.s > 0) {
         this.s--;
      }

      this.I();
   }

   protected void G() {
      if (this.s < this.E() - 1) {
         this.s++;
      }

      this.I();
   }

   private void I() {
      this.w.j = this.s < this.E() - 1;
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      if (this.u != this.s) {
         tp $$6 = this.q.b(this.s);
         this.t = this.i.c($$6, 114);
         this.v = tl.a("book.pageIndicator", this.s + 1, Math.max(this.E(), 1));
      }

      this.u = this.s;
      int $$7 = this.i.a(this.v);
      $$0.a(this.i, this.v, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.t.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         arj $$10 = this.t.get($$9);
         $$0.a(this.i, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      uh $$11 = this.a((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.i, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(l, (this.g - 192) / 2, 2, 0, 0, 192, 192);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         uh $$3 = this.a($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(uh $$0) {
      tj $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == tj.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == tj.a.c) {
            this.H();
         }

         return $$4;
      }
   }

   protected void H() {
      this.f.a(null);
   }

   @Nullable
   public uh a(double $$0, double $$1) {
      if (this.t.isEmpty()) {
         return null;
      } else {
         int $$2 = arw.a($$0 - (double)((this.g - 192) / 2) - 36.0);
         int $$3 = arw.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.t.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.t.size()) {
                  arj $$6 = this.t.get($$5);
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

   static List<String> a(qw $$0) {
      Builder<String> $$1 = ImmutableList.builder();
      a($$0, $$1::add);
      return $$1.build();
   }

   public static void a(qw $$0, Consumer<String> $$1) {
      rc $$2 = $$0.c("pages", 8).e();
      IntFunction<String> $$4;
      if (eqv.O().aQ() && $$0.b("filtered_pages", 10)) {
         qw $$3 = $$0.p("filtered_pages");
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

      tp a(int var1);

      default tp b(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a($$0) : tp.b;
      }

      static ezp.a a(cjf $$0) {
         if ($$0.a(cji.th)) {
            return new ezp.c($$0);
         } else {
            return (ezp.a)($$0.a(cji.tg) ? new ezp.b($$0) : ezp.k);
         }
      }
   }

   public static class b implements ezp.a {
      private final List<String> a;

      public b(cjf $$0) {
         this.a = b($$0);
      }

      private static List<String> b(cjf $$0) {
         qw $$1 = $$0.v();
         return (List<String>)($$1 != null ? ezp.a($$1) : ImmutableList.of());
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public tp a(int $$0) {
         return tp.e(this.a.get($$0));
      }
   }

   public static class c implements ezp.a {
      private final List<String> a;

      public c(cjf $$0) {
         this.a = b($$0);
      }

      private static List<String> b(cjf $$0) {
         qw $$1 = $$0.v();
         return (List<String>)($$1 != null && clb.a($$1) ? ezp.a($$1) : ImmutableList.of(tl.a.a(tl.c("book.invalid.tag").a(n.e))));
      }

      @Override
      public int a() {
         return this.a.size();
      }

      @Override
      public tp a(int $$0) {
         String $$1 = this.a.get($$0);

         try {
            tp $$2 = tl.a.a($$1);
            if ($$2 != null) {
               return $$2;
            }
         } catch (Exception var4) {
         }

         return tp.e($$1);
      }
   }
}
