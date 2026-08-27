import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bqq {
   public static final int a = 100;
   public static final int b = 300;
   private static final yb c = yb.a.a(new xc(xc.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xk(xk.a.a, xe.b("MCPE-28723")));
   private final List<bqo> d = Lists.newArrayList();
   private final bso e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bqq(bso $$0) {
      this.e = $$0;
   }

   public void a(bqt $$0, float $$1) {
      this.c();
      bqy $$2 = bqy.a(this.e);
      bqo $$3 = new bqo($$0, $$1, $$2, this.e.ad);
      this.d.add($$3);
      this.f = this.e.am;
      this.j = true;
      if (!this.i && this.e.bI() && a($$0)) {
         this.i = true;
         this.g = this.e.am;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bqt $$0) {
      return $$0.d() instanceof bso;
   }

   private xe a(brv $$0, xe $$1, String $$2, String $$3) {
      cuh $$5 = $$0 instanceof bso $$4 ? $$4.fg() : cuh.i;
      return !$$5.d() && $$5.b(ke.f) ? xe.a($$2, this.e.P_(), $$1, $$5.E()) : xe.a($$3, this.e.P_(), $$1);
   }

   private xe a(bqo $$0, @Nullable brv $$1) {
      bqt $$2 = $$0.a();
      if (!$$2.a(awg.n) && !$$2.a(awg.t)) {
         xe $$4 = a($$1);
         brv $$5 = $$2.d();
         xe $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xe)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xe.a("death.fell.killer", this.e.P_()));
         }
      } else {
         bqy $$3 = Objects.requireNonNullElse($$0.c(), bqy.a);
         return xe.a($$3.a(), this.e.P_());
      }
   }

   @Nullable
   private static xe a(@Nullable brv $$0) {
      return $$0 == null ? null : $$0.P_();
   }

   public xe a() {
      if (this.d.isEmpty()) {
         return xe.a("death.attack.generic", this.e.P_());
      } else {
         bqo $$0 = this.d.get(this.d.size() - 1);
         bqt $$1 = $$0.a();
         bqo $$2 = this.d();
         bqx $$3 = $$1.j().e();
         if ($$3 == bqx.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bqx.c) {
            String $$4 = "death.attack." + $$1.e();
            xe $$5 = xh.a((xe)xe.c($$4 + ".link")).c(c);
            return xe.a($$4 + ".message", this.e.P_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bqo d() {
      bqo $$0 = null;
      bqo $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bqo $$5 = this.d.get($$4);
         bqo $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bqt $$7 = $$5.a();
         boolean $$8 = $$7.a(awg.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awg.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.am - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bI() || this.e.am - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.am;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
