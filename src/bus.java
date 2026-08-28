import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bus extends bva implements bwx {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 5;
   private static final ajx<Float> e = akb.a(bus.class, ajz.d);
   private static final ajx<Boolean> f = akb.a(bus.class, ajz.k);
   private static final ajx<lr> g = akb.a(bus.class, ajz.l);
   private static final float h = 32.0F;
   private static final float i = 0.5F;
   private static final float j = 3.0F;
   public static final float a = 6.0F;
   public static final float b = 0.5F;
   private cze k = cze.a;
   private float l = 1.0F;
   private final Map<bva, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private bvy t;
   @Nullable
   private UUID u;

   public bus(bvi<? extends bus> $$0, dgz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public bus(dgz $$0, double $$1, double $$2, double $$3) {
      this(bvi.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(e, 3.0F);
      $$0.a(f, false);
      $$0.a(g, lm.a(lt.u, -1));
   }

   public void a(float $$0) {
      if (!this.dU().C) {
         this.au().a(e, ayz.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void i_() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   public float e() {
      return this.au().a(e);
   }

   public void a(cze $$0) {
      this.k = $$0;
      this.s();
   }

   public void b(float $$0) {
      this.l = $$0;
   }

   private void s() {
      lr $$0 = this.al.a(g);
      if ($$0 instanceof lm $$1) {
         int $$2 = this.k.equals(cze.a) ? 0 : this.k.b();
         this.al.a(g, lm.a($$1.a(), axk.f($$2)));
      }
   }

   public void a(bue $$0) {
      this.a(this.k.a($$0));
   }

   public lr f() {
      return this.au().a(g);
   }

   public void a(lr $$0) {
      this.au().a(g, $$0);
   }

   protected void a(boolean $$0) {
      this.au().a(f, $$0);
   }

   public boolean g() {
      return this.au().a(f);
   }

   public int i() {
      return this.n;
   }

   public void a(int $$0) {
      this.n = $$0;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU() instanceof ard $$0) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   private void t() {
      boolean $$0 = this.g();
      float $$1 = this.e();
      if (!$$0 || !this.ae.h()) {
         lr $$2 = this.f();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = ayz.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ae.i() * (float) (Math.PI * 2);
            float $$9 = ayz.c(this.ae.i()) * $$4;
            double $$10 = this.dz() + (double)(ayz.b($$8) * $$9);
            double $$11 = this.dB();
            double $$12 = this.dF() + (double)(ayz.a($$8) * $$9);
            if ($$2.a() == lt.u) {
               if ($$0 && this.ae.h()) {
                  this.dU().b(lm.a(lt.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dU().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dU().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dU().b($$2, $$10, $$11, $$12, (0.5 - this.ae.j()) * 0.15, 0.01F, (0.5 - this.ae.j()) * 0.15);
            }
         }
      }
   }

   private void a(ard $$0) {
      if (this.af >= this.o + this.n) {
         this.at();
      } else {
         boolean $$1 = this.g();
         boolean $$2 = this.af < this.o;
         if ($$1 != $$2) {
            this.a($$2);
         }

         if (!$$2) {
            float $$3 = this.e();
            if (this.s != 0.0F) {
               $$3 += this.s;
               if ($$3 < 0.5F) {
                  this.at();
                  return;
               }

               this.a($$3);
            }

            if (this.af % 5 == 0) {
               this.m.entrySet().removeIf($$0x -> this.af >= (Integer)$$0x.getValue());
               if (!this.k.c()) {
                  this.m.clear();
               } else {
                  List<bue> $$4 = new ArrayList<>();
                  this.k.a($$4::add, this.l);
                  List<bvy> $$5 = this.dU().a(bvy.class, this.cQ());
                  if (!$$5.isEmpty()) {
                     for (bvy $$6 : $$5) {
                        if (!this.m.containsKey($$6) && $$6.fN() && !$$4.stream().noneMatch($$6::b)) {
                           double $$7 = $$6.dz() - this.dz();
                           double $$8 = $$6.dF() - this.dF();
                           double $$9 = $$7 * $$7 + $$8 * $$8;
                           if ($$9 <= (double)($$3 * $$3)) {
                              this.m.put($$6, this.af + this.p);

                              for (bue $$10 : $$4) {
                                 if ($$10.c().a().a()) {
                                    $$10.c().a().a($$0, this, this.o(), $$6, $$10.e(), 0.5);
                                 } else {
                                    $$6.b(new bue($$10), this);
                                 }
                              }

                              if (this.r != 0.0F) {
                                 $$3 += this.r;
                                 if ($$3 < 0.5F) {
                                    this.at();
                                    return;
                                 }

                                 this.a($$3);
                              }

                              if (this.q != 0) {
                                 this.n = this.n + this.q;
                                 if (this.n <= 0) {
                                    this.at();
                                    return;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public float j() {
      return this.r;
   }

   public void c(float $$0) {
      this.r = $$0;
   }

   public float l() {
      return this.s;
   }

   public void d(float $$0) {
      this.s = $$0;
   }

   public int m() {
      return this.q;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   public int n() {
      return this.o;
   }

   public void c(int $$0) {
      this.o = $$0;
   }

   public void a(@Nullable bvy $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cF();
   }

   @Nullable
   public bvy o() {
      if (this.t != null && !this.t.dP()) {
         return this.t;
      } else {
         if (this.u != null && this.dU() instanceof ard $$0) {
            this.t = $$0.b(this.u) instanceof bvy $$1 ? $$1 : null;
         }

         return this.t;
      }
   }

   @Override
   protected void a(tq $$0) {
      this.af = $$0.h("Age");
      this.n = $$0.h("Duration");
      this.o = $$0.h("WaitTime");
      this.p = $$0.h("ReapplicationDelay");
      this.q = $$0.h("DurationOnUse");
      this.r = $$0.j("RadiusOnUse");
      this.s = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.u = $$0.a("Owner");
      }

      aks<un> $$1 = this.dW().a(ue.a);
      if ($$0.b("Particle", 10)) {
         lt.bj
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> c.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cze.c.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> c.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }

      this.l = $$0.b("potion_duration_scale", 1.0F);
   }

   @Override
   protected void b(tq $$0) {
      $$0.a("Age", this.af);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.e());
      aks<un> $$1 = this.dW().a(ue.a);
      $$0.a("Particle", (un)lt.bj.encodeStart($$1, this.f()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.k.equals(cze.a)) {
         un $$2 = (un)cze.c.encodeStart($$1, this.k).getOrThrow();
         $$0.a("potion_contents", $$2);
      }

      if (this.l != 1.0F) {
         $$0.a("potion_duration_scale", this.l);
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      if (e.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public eub j_() {
      return eub.d;
   }

   @Override
   public bvd a(bwk $$0) {
      return bvd.b(this.e() * 2.0F, 0.5F);
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }
}
