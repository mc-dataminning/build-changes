import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bqm {
   public static final int a = 100;
   public static final int b = 300;
   private static final xu c = xu.a.a(new wv(wv.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xd(xd.a.a, wx.b("MCPE-28723")));
   private final List<bqk> d = Lists.newArrayList();
   private final bsq e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bqm(bsq $$0) {
      this.e = $$0;
   }

   public void a(bqp $$0, float $$1) {
      this.c();
      bqu $$2 = bqu.a(this.e);
      bqk $$3 = new bqk($$0, $$1, $$2, this.e.ac);
      this.d.add($$3);
      this.f = this.e.ai;
      this.j = true;
      if (!this.i && this.e.bD() && a($$0)) {
         this.i = true;
         this.g = this.e.ai;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bqp $$0) {
      return $$0.d() instanceof bsq;
   }

   private wx a(brw $$0, wx $$1, String $$2, String $$3) {
      ctq $$5 = $$0 instanceof bsq $$4 ? $$4.eX() : ctq.i;
      return !$$5.e() && $$5.b(kb.f) ? wx.a($$2, this.e.O_(), $$1, $$5.G()) : wx.a($$3, this.e.O_(), $$1);
   }

   private wx a(bqk $$0, @Nullable brw $$1) {
      bqp $$2 = $$0.a();
      if (!$$2.a(avz.n) && !$$2.a(avz.t)) {
         wx $$4 = a($$1);
         brw $$5 = $$2.d();
         wx $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wx)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wx.a("death.fell.killer", this.e.O_()));
         }
      } else {
         bqu $$3 = Objects.requireNonNullElse($$0.c(), bqu.a);
         return wx.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static wx a(@Nullable brw $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public wx a() {
      if (this.d.isEmpty()) {
         return wx.a("death.attack.generic", this.e.O_());
      } else {
         bqk $$0 = this.d.get(this.d.size() - 1);
         bqp $$1 = $$0.a();
         bqk $$2 = this.d();
         bqt $$3 = $$1.j().e();
         if ($$3 == bqt.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bqt.c) {
            String $$4 = "death.attack." + $$1.e();
            wx $$5 = xa.a((wx)wx.c($$4 + ".link")).c(c);
            return wx.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bqk d() {
      bqk $$0 = null;
      bqk $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bqk $$5 = this.d.get($$4);
         bqk $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bqp $$7 = $$5.a();
         boolean $$8 = $$7.a(avz.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(avz.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.ai - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bD() || this.e.ai - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ai;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
