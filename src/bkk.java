import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bkk {
   public static final int a = 100;
   public static final int b = 300;
   private static final wa c = wa.a.a(new vb(vb.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new vj(vj.a.a, vd.b("MCPE-28723")));
   private final List<bki> d = Lists.newArrayList();
   private final bmf e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bkk(bmf $$0) {
      this.e = $$0;
   }

   public void a(bkn $$0, float $$1) {
      this.c();
      bks $$2 = bks.a(this.e);
      bki $$3 = new bki($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bx() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.g_();
      }
   }

   private static boolean a(bkn $$0) {
      return $$0.d() instanceof bmf;
   }

   private vd a(blp $$0, vd $$1, String $$2, String $$3) {
      cmr $$5 = $$0 instanceof bmf $$4 ? $$4.eT() : cmr.f;
      return !$$5.b() && $$5.A() ? vd.a($$2, this.e.Q_(), $$1, $$5.J()) : vd.a($$3, this.e.Q_(), $$1);
   }

   private vd a(bki $$0, @Nullable blp $$1) {
      bkn $$2 = $$0.a();
      if (!$$2.a(asd.n) && !$$2.a(asd.t)) {
         vd $$4 = a($$1);
         blp $$5 = $$2.d();
         vd $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (vd)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : vd.a("death.fell.killer", this.e.Q_()));
         }
      } else {
         bks $$3 = Objects.requireNonNullElse($$0.c(), bks.a);
         return vd.a($$3.a(), this.e.Q_());
      }
   }

   @Nullable
   private static vd a(@Nullable blp $$0) {
      return $$0 == null ? null : $$0.Q_();
   }

   public vd a() {
      if (this.d.isEmpty()) {
         return vd.a("death.attack.generic", this.e.Q_());
      } else {
         bki $$0 = this.d.get(this.d.size() - 1);
         bkn $$1 = $$0.a();
         bki $$2 = this.d();
         bkr $$3 = $$1.j().e();
         if ($$3 == bkr.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bkr.c) {
            String $$4 = "death.attack." + $$1.e();
            vd $$5 = vg.a((vd)vd.c($$4 + ".link")).c(c);
            return vd.a($$4 + ".message", this.e.Q_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bki d() {
      bki $$0 = null;
      bki $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bki $$5 = this.d.get($$4);
         bki $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bkn $$7 = $$5.a();
         boolean $$8 = $$7.a(asd.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(asd.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bx() || this.e.ah - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ah;
         if ($$1) {
            this.e.h_();
         }

         this.d.clear();
      }
   }
}
