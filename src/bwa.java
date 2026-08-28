import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwa extends bwi implements byh {
   private static final int c = 5;
   private static final akj<Float> d = akn.a(bwa.class, akl.d);
   private static final akj<Boolean> e = akn.a(bwa.class, akl.k);
   private static final akj<lw> f = akn.a(bwa.class, akl.l);
   private static final float g = 32.0F;
   private static final float h = 0.5F;
   private static final float i = 3.0F;
   public static final float a = 6.0F;
   public static final float b = 0.5F;
   private static final lr j = lr.a(ly.u, -1);
   private dbg k = dbg.a;
   private float l = 1.0F;
   private final Map<bwi, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private bxj t;
   @Nullable
   private UUID u;

   public bwa(bwr<? extends bwa> $$0, djh $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public bwa(djh $$0, double $$1, double $$2, double $$3) {
      this(bwr.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(d, 3.0F);
      $$0.a(e, false);
      $$0.a(f, j);
   }

   public void a(float $$0) {
      if (!this.dU().C) {
         this.ar().a(d, azm.a($$0, 0.0F, 32.0F));
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
      return this.ar().a(d);
   }

   public void a(dbg $$0) {
      this.k = $$0;
      this.s();
   }

   public void b(float $$0) {
      this.l = $$0;
   }

   private void s() {
      lw $$0 = this.al.a(f);
      if ($$0 instanceof lr $$1) {
         int $$2 = this.k.equals(dbg.a) ? 0 : this.k.b();
         this.al.a(f, lr.a($$1.a(), axw.f($$2)));
      }
   }

   public void a(bvm $$0) {
      this.a(this.k.a($$0));
   }

   public lw f() {
      return this.ar().a(f);
   }

   public void a(lw $$0) {
      this.ar().a(f, $$0);
   }

   protected void a(boolean $$0) {
      this.ar().a(e, $$0);
   }

   public boolean g() {
      return this.ar().a(e);
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
      if (this.dU() instanceof arq $$0) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   private void t() {
      boolean $$0 = this.g();
      float $$1 = this.e();
      if (!$$0 || !this.ae.h()) {
         lw $$2 = this.f();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = azm.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ae.i() * (float) (Math.PI * 2);
            float $$9 = azm.c(this.ae.i()) * $$4;
            double $$10 = this.dz() + (double)(azm.b($$8) * $$9);
            double $$11 = this.dB();
            double $$12 = this.dF() + (double)(azm.a($$8) * $$9);
            if ($$2.a() == ly.u) {
               if ($$0 && this.ae.h()) {
                  this.dU().b(lr.a(ly.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
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

   private void a(arq $$0) {
      if (this.af >= this.o + this.n) {
         this.aq();
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
                  this.aq();
                  return;
               }

               this.a($$3);
            }

            if (this.af % 5 == 0) {
               this.m.entrySet().removeIf($$0x -> this.af >= (Integer)$$0x.getValue());
               if (!this.k.c()) {
                  this.m.clear();
               } else {
                  List<bvm> $$4 = new ArrayList<>();
                  this.k.a($$4::add, this.l);
                  List<bxj> $$5 = this.dU().a(bxj.class, this.cQ());
                  if (!$$5.isEmpty()) {
                     for (bxj $$6 : $$5) {
                        if (!this.m.containsKey($$6) && $$6.fK() && !$$4.stream().noneMatch($$6::b)) {
                           double $$7 = $$6.dz() - this.dz();
                           double $$8 = $$6.dF() - this.dF();
                           double $$9 = $$7 * $$7 + $$8 * $$8;
                           if ($$9 <= (double)($$3 * $$3)) {
                              this.m.put($$6, this.af + this.p);

                              for (bvm $$10 : $$4) {
                                 if ($$10.c().a().a()) {
                                    $$10.c().a().a($$0, this, this.o(), $$6, $$10.e(), 0.5);
                                 } else {
                                    $$6.b(new bvm($$10), this);
                                 }
                              }

                              if (this.r != 0.0F) {
                                 $$3 += this.r;
                                 if ($$3 < 0.5F) {
                                    this.aq();
                                    return;
                                 }

                                 this.a($$3);
                              }

                              if (this.q != 0) {
                                 this.n = this.n + this.q;
                                 if (this.n <= 0) {
                                    this.aq();
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

   public void a(@Nullable bxj $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cF();
   }

   @Nullable
   public bxj o() {
      if (this.t != null && !this.t.dP()) {
         return this.t;
      } else {
         if (this.u != null && this.dU() instanceof arq $$0) {
            this.t = $$0.b(this.u) instanceof bxj $$1 ? $$1 : null;
         }

         return this.t;
      }
   }

   @Override
   protected void a(tz $$0) {
      this.af = $$0.f("Age");
      this.n = $$0.f("Duration");
      this.o = $$0.f("WaitTime");
      this.p = $$0.f("ReapplicationDelay");
      this.q = $$0.f("DurationOnUse");
      this.r = $$0.h("RadiusOnUse");
      this.s = $$0.h("RadiusPerTick");
      this.a($$0.h("Radius"));
      this.u = $$0.<UUID>a("Owner", jz.a).orElse(null);
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<lw>a("Particle", ly.bk, $$1).orElse(j));
      this.a($$0.<dbg>a("potion_contents", dbg.c, $$1).orElse(dbg.a));
      this.l = $$0.b("potion_duration_scale", 1.0F);
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("Age", this.af);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.e());
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("Particle", ly.bk, $$1, this.f());
      $$0.b("Owner", jz.a, this.u);
      if (!this.k.equals(dbg.a)) {
         $$0.a("potion_contents", dbg.c, $$1, this.k);
      }

      if (this.l != 1.0F) {
         $$0.a("potion_duration_scale", this.l);
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (d.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public exa j_() {
      return exa.d;
   }

   @Override
   public bwl a(bxv $$0) {
      return bwl.b(this.e() * 2.0F, 0.5F);
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.R) {
         return c((kj<T>)$$0, this.k);
      } else {
         return $$0 == kk.S ? c((kj<T>)$$0, Float.valueOf(this.l)) : super.a($$0);
      }
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.R);
      this.a($$0, kk.S);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.R) {
         this.a(c(kk.R, $$1));
         return true;
      } else if ($$0 == kk.S) {
         this.b(c(kk.S, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
