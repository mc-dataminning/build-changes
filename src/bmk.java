import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bmk {
   public static final int a = 100;
   public static final int b = 300;
   private static final wn c = wn.a.a(new vo(vo.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new vw(vw.a.a, vq.b("MCPE-28723")));
   private final List<bmi> d = Lists.newArrayList();
   private final bog e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bmk(bog $$0) {
      this.e = $$0;
   }

   public void a(bmn $$0, float $$1) {
      this.c();
      bms $$2 = bms.a(this.e);
      bmi $$3 = new bmi($$0, $$1, $$2, this.e.aa);
      this.d.add($$3);
      this.f = this.e.ag;
      this.j = true;
      if (!this.i && this.e.bx() && a($$0)) {
         this.i = true;
         this.g = this.e.ag;
         this.h = this.g;
         this.e.g_();
      }
   }

   private static boolean a(bmn $$0) {
      return $$0.d() instanceof bog;
   }

   private vq a(bno $$0, vq $$1, String $$2, String $$3) {
      coz $$5 = $$0 instanceof bog $$4 ? $$4.eT() : coz.h;
      return !$$5.b() && $$5.B() ? vq.a($$2, this.e.Q_(), $$1, $$5.K()) : vq.a($$3, this.e.Q_(), $$1);
   }

   private vq a(bmi $$0, @Nullable bno $$1) {
      bmn $$2 = $$0.a();
      if (!$$2.a(aub.n) && !$$2.a(aub.t)) {
         vq $$4 = a($$1);
         bno $$5 = $$2.d();
         vq $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (vq)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : vq.a("death.fell.killer", this.e.Q_()));
         }
      } else {
         bms $$3 = Objects.requireNonNullElse($$0.c(), bms.a);
         return vq.a($$3.a(), this.e.Q_());
      }
   }

   @Nullable
   private static vq a(@Nullable bno $$0) {
      return $$0 == null ? null : $$0.Q_();
   }

   public vq a() {
      if (this.d.isEmpty()) {
         return vq.a("death.attack.generic", this.e.Q_());
      } else {
         bmi $$0 = this.d.get(this.d.size() - 1);
         bmn $$1 = $$0.a();
         bmi $$2 = this.d();
         bmr $$3 = $$1.j().e();
         if ($$3 == bmr.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bmr.c) {
            String $$4 = "death.attack." + $$1.e();
            vq $$5 = vt.a((vq)vq.c($$4 + ".link")).c(c);
            return vq.a($$4 + ".message", this.e.Q_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bmi d() {
      bmi $$0 = null;
      bmi $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bmi $$5 = this.d.get($$4);
         bmi $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bmn $$7 = $$5.a();
         boolean $$8 = $$7.a(aub.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(aub.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
            if ($$4 > 0) {
               $$0 = $$6;
            } else {
               $$0 = $$5;
            }

            $$3 = $$9;
         }

         if ($$5.c() != null && ($$1 == null || $$5.b() > $$2)) {
            $$1 = $$5;
            $$2 = $$5.b();
         }
      }

      if ($$3 > 5.0F && $$0 != null) {
         return $$0;
      } else {
         return $$2 > 5.0F && $$1 != null ? $$1 : null;
      }
   }

   public int b() {
      return this.i ? this.e.ag - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bx() || this.e.ag - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ag;
         if ($$1) {
            this.e.h_();
         }

         this.d.clear();
      }
   }
}
