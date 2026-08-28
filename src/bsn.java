import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsn extends bsr implements bun {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final ajw<Float> f = aka.a(bsn.class, ajy.d);
   private static final ajw<Boolean> g = aka.a(bsn.class, ajy.k);
   private static final ajw<lk> h = aka.a(bsn.class, ajy.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cwu l = cwu.a;
   private final Map<bsr, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private btn t;
   @Nullable
   private UUID u;

   public bsn(bsx<? extends bsn> $$0, dcw $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public bsn(dcw $$0, double $$1, double $$2, double $$3) {
      this(bsx.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, lf.a(lm.u, -1));
   }

   public void a(float $$0) {
      if (!this.dP().B) {
         this.ar().a(f, ayo.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void i_() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.ar().a(f);
   }

   public void a(cwu $$0) {
      this.l = $$0;
      this.t();
   }

   private void t() {
      lk $$0 = this.ao.a(h);
      if ($$0 instanceof lf $$1) {
         int $$2 = this.l.equals(cwu.a) ? 0 : this.l.b();
         this.ao.a(h, lf.a($$1.a(), axy.b.e($$2)));
      }
   }

   public void a(brz $$0) {
      this.a(this.l.a($$0));
   }

   public lk h() {
      return this.ar().a(h);
   }

   public void a(lk $$0) {
      this.ar().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.ar().a(g, $$0);
   }

   public boolean i() {
      return this.ar().a(g);
   }

   public int j() {
      return this.n;
   }

   public void a(int $$0) {
      this.n = $$0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.i();
      float $$1 = this.g();
      if (this.dP().B) {
         if ($$0 && this.ah.h()) {
            return;
         }

         lk $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = ayo.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ah.i() * (float) (Math.PI * 2);
            float $$9 = ayo.c(this.ah.i()) * $$4;
            double $$10 = this.du() + (double)(ayo.b($$8) * $$9);
            double $$11 = this.dw();
            double $$12 = this.dA() + (double)(ayo.a($$8) * $$9);
            if ($$2.a() == lm.u) {
               if ($$0 && this.ah.h()) {
                  this.dP().b(lf.a(lm.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dP().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dP().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dP().b($$2, $$10, $$11, $$12, (0.5 - this.ah.j()) * 0.15, 0.01F, (0.5 - this.ah.j()) * 0.15);
            }
         }
      } else {
         if (this.ai >= this.o + this.n) {
            this.aq();
            return;
         }

         boolean $$13 = this.ai < this.o;
         if ($$0 != $$13) {
            this.a($$13);
         }

         if ($$13) {
            return;
         }

         if (this.s != 0.0F) {
            $$1 += this.s;
            if ($$1 < 0.5F) {
               this.aq();
               return;
            }

            this.a($$1);
         }

         if (this.ai % 5 == 0) {
            this.m.entrySet().removeIf($$0x -> this.ai >= (Integer)$$0x.getValue());
            if (!this.l.c()) {
               this.m.clear();
            } else {
               List<brz> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (brz $$15 : this.l.e().get().a().a()) {
                     $$14.add(new brz($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<btn> $$16 = this.dP().a(btn.class, this.cL());
               if (!$$16.isEmpty()) {
                  for (btn $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fD()) {
                        double $$18 = $$17.du() - this.du();
                        double $$19 = $$17.dA() - this.dA();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ai + this.p);

                           for (brz $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new brz($$21), this);
                              }
                           }

                           if (this.r != 0.0F) {
                              $$1 += this.r;
                              if ($$1 < 0.5F) {
                                 this.aq();
                                 return;
                              }

                              this.a($$1);
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

   public float k() {
      return this.r;
   }

   public void b(float $$0) {
      this.r = $$0;
   }

   public float m() {
      return this.s;
   }

   public void c(float $$0) {
      this.s = $$0;
   }

   public int o() {
      return this.q;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   public int p() {
      return this.o;
   }

   public void c(int $$0) {
      this.o = $$0;
   }

   public void a(@Nullable btn $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cA();
   }

   @Nullable
   public btn q() {
      if (this.t == null && this.u != null && this.dP() instanceof aqu) {
         bsr $$0 = ((aqu)this.dP()).a(this.u);
         if ($$0 instanceof btn) {
            this.t = (btn)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(ub $$0) {
      this.ai = $$0.h("Age");
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

      akp<uy> $$1 = this.dR().a(up.a);
      if ($$0.b("Particle", 10)) {
         lm.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cwu.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(ub $$0) {
      $$0.a("Age", this.ai);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      akp<uy> $$1 = this.dR().a(up.a);
      $$0.a("Particle", (uy)lm.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cwu.a)) {
         uy $$2 = (uy)cwu.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(ajw<?> $$0) {
      if (f.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public eph j_() {
      return eph.d;
   }

   @Override
   public bsu a(bua $$0) {
      return bsu.b(this.g() * 2.0F, 0.5F);
   }
}
