import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bkp {
   public static final int a = 100;
   public static final int b = 300;
   private static final wc c = wc.a.a(new vd(vd.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new vl(vl.a.a, vf.b("MCPE-28723")));
   private final List<bkn> d = Lists.newArrayList();
   private final bmk e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bkp(bmk $$0) {
      this.e = $$0;
   }

   public void a(bks $$0, float $$1) {
      this.c();
      bkx $$2 = bkx.a(this.e);
      bkn $$3 = new bkn($$0, $$1, $$2, this.e.ab);
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

   private static boolean a(bks $$0) {
      return $$0.d() instanceof bmk;
   }

   private vf a(blu $$0, vf $$1, String $$2, String $$3) {
      cmx $$5 = $$0 instanceof bmk $$4 ? $$4.eT() : cmx.f;
      return !$$5.b() && $$5.A() ? vf.a($$2, this.e.Q_(), $$1, $$5.J()) : vf.a($$3, this.e.Q_(), $$1);
   }

   private vf a(bkn $$0, @Nullable blu $$1) {
      bks $$2 = $$0.a();
      if (!$$2.a(asi.n) && !$$2.a(asi.t)) {
         vf $$4 = a($$1);
         blu $$5 = $$2.d();
         vf $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (vf)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : vf.a("death.fell.killer", this.e.Q_()));
         }
      } else {
         bkx $$3 = Objects.requireNonNullElse($$0.c(), bkx.a);
         return vf.a($$3.a(), this.e.Q_());
      }
   }

   @Nullable
   private static vf a(@Nullable blu $$0) {
      return $$0 == null ? null : $$0.Q_();
   }

   public vf a() {
      if (this.d.isEmpty()) {
         return vf.a("death.attack.generic", this.e.Q_());
      } else {
         bkn $$0 = this.d.get(this.d.size() - 1);
         bks $$1 = $$0.a();
         bkn $$2 = this.d();
         bkw $$3 = $$1.j().e();
         if ($$3 == bkw.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bkw.c) {
            String $$4 = "death.attack." + $$1.e();
            vf $$5 = vi.a((vf)vf.c($$4 + ".link")).c(c);
            return vf.a($$4 + ".message", this.e.Q_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bkn d() {
      bkn $$0 = null;
      bkn $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bkn $$5 = this.d.get($$4);
         bkn $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bks $$7 = $$5.a();
         boolean $$8 = $$7.a(asi.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(asi.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
