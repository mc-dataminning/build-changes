import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class bww extends bxe implements bzd {
   private static final int e = 5;
   private static final aku<Float> f = aky.a(bww.class, akw.d);
   private static final aku<Boolean> g = aky.a(bww.class, akw.k);
   private static final aku<lx> h = aky.a(bww.class, akw.l);
   private static final float i = 32.0F;
   private static final int j = 0;
   private static final int k = 0;
   private static final float l = 0.0F;
   private static final float m = 0.0F;
   private static final float n = 1.0F;
   private static final float o = 0.5F;
   private static final float p = 3.0F;
   public static final float a = 6.0F;
   public static final float b = 0.5F;
   public static final int c = -1;
   public static final int d = 600;
   private static final int q = 20;
   private static final int r = 20;
   private static final ls s = ls.a(lz.u, -1);
   private dcg t = dcg.a;
   private float u = 1.0F;
   private final Map<bxe, Integer> ay = Maps.newHashMap();
   private int az = -1;
   private int aA = 20;
   private int aB = 20;
   private int aC = 0;
   private float aD = 0.0F;
   private float aE = 0.0F;
   @Nullable
   private byf aF;
   @Nullable
   private UUID aG;

   public bww(bxn<? extends bww> $$0, dkj $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public bww(dkj $$0, double $$1, double $$2, double $$3) {
      this(bxn.e, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, s);
   }

   public void a(float $$0) {
      if (!this.dV().C) {
         this.ar().a(f, azz.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void i_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   public float e() {
      return this.ar().a(f);
   }

   public void a(dcg $$0) {
      this.t = $$0;
      this.s();
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   private void s() {
      lx $$0 = this.al.a(h);
      if ($$0 instanceof ls $$1) {
         int $$2 = this.t.equals(dcg.a) ? 0 : this.t.b();
         this.al.a(h, ls.a($$1.a(), ayh.f($$2)));
      }
   }

   public void a(bwi $$0) {
      this.a(this.t.a($$0));
   }

   public lx f() {
      return this.ar().a(h);
   }

   public void a(lx $$0) {
      this.ar().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.ar().a(g, $$0);
   }

   public boolean g() {
      return this.ar().a(g);
   }

   public int i() {
      return this.az;
   }

   public void a(int $$0) {
      this.az = $$0;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof asb $$0) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   private void t() {
      boolean $$0 = this.g();
      float $$1 = this.e();
      if (!$$0 || !this.ae.h()) {
         lx $$2 = this.f();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = azz.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ae.i() * (float) (Math.PI * 2);
            float $$9 = azz.c(this.ae.i()) * $$4;
            double $$10 = this.dA() + (double)(azz.b($$8) * $$9);
            double $$11 = this.dC();
            double $$12 = this.dG() + (double)(azz.a($$8) * $$9);
            if ($$2.a() == lz.u) {
               if ($$0 && this.ae.h()) {
                  this.dV().b(ls.a(lz.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dV().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dV().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dV().b($$2, $$10, $$11, $$12, (0.5 - this.ae.j()) * 0.15, 0.01F, (0.5 - this.ae.j()) * 0.15);
            }
         }
      }
   }

   private void a(asb $$0) {
      if (this.az != -1 && this.af >= this.aA + this.az) {
         this.aq();
      } else {
         boolean $$1 = this.g();
         boolean $$2 = this.af < this.aA;
         if ($$1 != $$2) {
            this.a($$2);
         }

         if (!$$2) {
            float $$3 = this.e();
            if (this.aE != 0.0F) {
               $$3 += this.aE;
               if ($$3 < 0.5F) {
                  this.aq();
                  return;
               }

               this.a($$3);
            }

            if (this.af % 5 == 0) {
               this.ay.entrySet().removeIf($$0x -> this.af >= (Integer)$$0x.getValue());
               if (!this.t.c()) {
                  this.ay.clear();
               } else {
                  List<bwi> $$4 = new ArrayList<>();
                  this.t.a($$4::add, this.u);
                  List<byf> $$5 = this.dV().a(byf.class, this.cR());
                  if (!$$5.isEmpty()) {
                     for (byf $$6 : $$5) {
                        if (!this.ay.containsKey($$6) && $$6.fL() && !$$4.stream().noneMatch($$6::b)) {
                           double $$7 = $$6.dA() - this.dA();
                           double $$8 = $$6.dG() - this.dG();
                           double $$9 = $$7 * $$7 + $$8 * $$8;
                           if ($$9 <= (double)($$3 * $$3)) {
                              this.ay.put($$6, this.af + this.aB);

                              for (bwi $$10 : $$4) {
                                 if ($$10.c().a().a()) {
                                    $$10.c().a().a($$0, this, this.o(), $$6, $$10.e(), 0.5);
                                 } else {
                                    $$6.b(new bwi($$10), this);
                                 }
                              }

                              if (this.aD != 0.0F) {
                                 $$3 += this.aD;
                                 if ($$3 < 0.5F) {
                                    this.aq();
                                    return;
                                 }

                                 this.a($$3);
                              }

                              if (this.aC != 0 && this.az != -1) {
                                 this.az = this.az + this.aC;
                                 if (this.az <= 0) {
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
      return this.aD;
   }

   public void c(float $$0) {
      this.aD = $$0;
   }

   public float l() {
      return this.aE;
   }

   public void d(float $$0) {
      this.aE = $$0;
   }

   public int m() {
      return this.aC;
   }

   public void b(int $$0) {
      this.aC = $$0;
   }

   public int n() {
      return this.aA;
   }

   public void c(int $$0) {
      this.aA = $$0;
   }

   public void a(@Nullable byf $$0) {
      this.aF = $$0;
      this.aG = $$0 == null ? null : $$0.cG();
   }

   @Nullable
   public byf o() {
      if (this.aF != null && !this.aF.dQ()) {
         return this.aF;
      } else {
         if (this.aG != null && this.dV() instanceof asb $$0) {
            this.aF = $$0.b(this.aG) instanceof byf $$1 ? $$1 : null;
         }

         return this.aF;
      }
   }

   @Override
   protected void a(ua $$0) {
      this.af = $$0.b("Age", 0);
      this.az = $$0.b("Duration", -1);
      this.aA = $$0.b("WaitTime", 20);
      this.aB = $$0.b("ReapplicationDelay", 20);
      this.aC = $$0.b("DurationOnUse", 0);
      this.aD = $$0.b("RadiusOnUse", 0.0F);
      this.aE = $$0.b("RadiusPerTick", 0.0F);
      this.a($$0.b("Radius", 3.0F));
      this.aG = $$0.<UUID>a("Owner", ka.a).orElse(null);
      alp<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<lx>a("Particle", lz.bk, $$1).orElse(s));
      this.a($$0.<dcg>a("potion_contents", dcg.c, $$1).orElse(dcg.a));
      this.u = $$0.b("potion_duration_scale", 1.0F);
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("Age", this.af);
      $$0.a("Duration", this.az);
      $$0.a("WaitTime", this.aA);
      $$0.a("ReapplicationDelay", this.aB);
      $$0.a("DurationOnUse", this.aC);
      $$0.a("RadiusOnUse", this.aD);
      $$0.a("RadiusPerTick", this.aE);
      $$0.a("Radius", this.e());
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("Particle", lz.bk, $$1, this.f());
      $$0.b("Owner", ka.a, this.aG);
      if (!this.t.equals(dcg.a)) {
         $$0.a("potion_contents", dcg.c, $$1, this.t);
      }

      if (this.u != 1.0F) {
         $$0.a("potion_duration_scale", this.u);
      }
   }

   @Override
   public void a(aku<?> $$0) {
      if (f.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public eyf j_() {
      return eyf.d;
   }

   @Override
   public bxh a(byr $$0) {
      return bxh.b(this.e() * 2.0F, 0.5F);
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      if ($$0 == kl.R) {
         return c((kk<T>)$$0, this.t);
      } else {
         return $$0 == kl.S ? c((kk<T>)$$0, Float.valueOf(this.u)) : super.a($$0);
      }
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.R);
      this.a($$0, kl.S);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.R) {
         this.a(c(kl.R, $$1));
         return true;
      } else if ($$0 == kl.S) {
         this.b(c(kl.S, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
