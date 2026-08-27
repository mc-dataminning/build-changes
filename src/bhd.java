import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bhd {
   public static final int a = 100;
   public static final int b = 300;
   private static final ub c = ub.a.a(new td(td.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new tk(tk.a.a, tf.b("MCPE-28723")));
   private final List<bhb> d = Lists.newArrayList();
   private final biy e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bhd(biy $$0) {
      this.e = $$0;
   }

   public void a(bhg $$0, float $$1) {
      this.c();
      bhl $$2 = bhl.a(this.e);
      bhb $$3 = new bhb($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bv() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.Q_();
      }
   }

   private static boolean a(bhg $$0) {
      return $$0.d() instanceof biy;
   }

   private tf a(bii $$0, tf $$1, String $$2, String $$3) {
      cix $$5 = $$0 instanceof biy $$4 ? $$4.eR() : cix.b;
      return !$$5.b() && $$5.A() ? tf.a($$2, this.e.H_(), $$1, $$5.J()) : tf.a($$3, this.e.H_(), $$1);
   }

   private tf a(bhb $$0, @Nullable bii $$1) {
      bhg $$2 = $$0.a();
      if (!$$2.a(apn.m) && !$$2.a(apn.s)) {
         tf $$4 = a($$1);
         bii $$5 = $$2.d();
         tf $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (tf)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : tf.a("death.fell.killer", this.e.H_()));
         }
      } else {
         bhl $$3 = Objects.requireNonNullElse($$0.c(), bhl.a);
         return tf.a($$3.a(), this.e.H_());
      }
   }

   @Nullable
   private static tf a(@Nullable bii $$0) {
      return $$0 == null ? null : $$0.H_();
   }

   public tf a() {
      if (this.d.isEmpty()) {
         return tf.a("death.attack.generic", this.e.H_());
      } else {
         bhb $$0 = this.d.get(this.d.size() - 1);
         bhg $$1 = $$0.a();
         bhb $$2 = this.d();
         bhk $$3 = $$1.j().e();
         if ($$3 == bhk.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bhk.c) {
            String $$4 = "death.attack." + $$1.e();
            tf $$5 = th.a((tf)tf.c($$4 + ".link")).c(c);
            return tf.a($$4 + ".message", this.e.H_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bhb d() {
      bhb $$0 = null;
      bhb $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bhb $$5 = this.d.get($$4);
         bhb $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bhg $$7 = $$5.a();
         boolean $$8 = $$7.a(apn.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(apn.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.ah - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bv() || this.e.ah - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ah;
         if ($$1) {
            this.e.F_();
         }

         this.d.clear();
      }
   }
}
