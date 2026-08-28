import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsc extends bsg implements bua {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final ajp<Float> f = ajt.a(bsc.class, ajr.d);
   private static final ajp<Boolean> g = ajt.a(bsc.class, ajr.k);
   private static final ajp<lh> h = ajt.a(bsc.class, ajr.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cwd l = cwd.a;
   private final Map<bsg, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private btb t;
   @Nullable
   private UUID u;

   public bsc(bsm<? extends bsc> $$0, dcf $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public bsc(dcf $$0, double $$1, double $$2, double $$3) {
      this(bsm.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, lc.a(lj.u, -1));
   }

   public void a(float $$0) {
      if (!this.dQ().B) {
         this.aq().a(f, ayg.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.aq().a(f);
   }

   public void a(cwd $$0) {
      this.l = $$0;
      this.u();
   }

   private void u() {
      lh $$0 = this.ao.a(h);
      if ($$0 instanceof lc $$1) {
         int $$2 = this.l.equals(cwd.a) ? 0 : this.l.b();
         this.ao.a(h, lc.a($$1.a(), axq.b.e($$2)));
      }
   }

   public void a(bro $$0) {
      this.a(this.l.a($$0));
   }

   public lh h() {
      return this.aq().a(h);
   }

   public void a(lh $$0) {
      this.aq().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.aq().a(g, $$0);
   }

   public boolean i() {
      return this.aq().a(g);
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
      if (this.dQ().B) {
         if ($$0 && this.ah.h()) {
            return;
         }

         lh $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = ayg.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ah.i() * (float) (Math.PI * 2);
            float $$9 = ayg.c(this.ah.i()) * $$4;
            double $$10 = this.dv() + (double)(ayg.b($$8) * $$9);
            double $$11 = this.dx();
            double $$12 = this.dB() + (double)(ayg.a($$8) * $$9);
            if ($$2.a() == lj.u) {
               if ($$0 && this.ah.h()) {
                  this.dQ().b(lc.a(lj.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dQ().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dQ().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dQ().b($$2, $$10, $$11, $$12, (0.5 - this.ah.j()) * 0.15, 0.01F, (0.5 - this.ah.j()) * 0.15);
            }
         }
      } else {
         if (this.ai >= this.o + this.n) {
            this.ap();
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
               this.ap();
               return;
            }

            this.a($$1);
         }

         if (this.ai % 5 == 0) {
            this.m.entrySet().removeIf($$0x -> this.ai >= (Integer)$$0x.getValue());
            if (!this.l.c()) {
               this.m.clear();
            } else {
               List<bro> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (bro $$15 : this.l.e().get().a().a()) {
                     $$14.add(new bro($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<btb> $$16 = this.dQ().a(btb.class, this.cL());
               if (!$$16.isEmpty()) {
                  for (btb $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fD()) {
                        double $$18 = $$17.dv() - this.dv();
                        double $$19 = $$17.dB() - this.dB();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ai + this.p);

                           for (bro $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new bro($$21), this);
                              }
                           }

                           if (this.r != 0.0F) {
                              $$1 += this.r;
                              if ($$1 < 0.5F) {
                                 this.ap();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.q != 0) {
                              this.n = this.n + this.q;
                              if (this.n <= 0) {
                                 this.ap();
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

   public void a(@Nullable btb $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cA();
   }

   @Nullable
   public btb q() {
      if (this.t == null && this.u != null && this.dQ() instanceof aqm) {
         bsg $$0 = ((aqm)this.dQ()).a(this.u);
         if ($$0 instanceof btb) {
            this.t = (btb)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(tx $$0) {
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

      aki<uu> $$1 = this.dS().a(ul.a);
      if ($$0.b("Particle", 10)) {
         lj.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cwd.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("Age", this.ai);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      aki<uu> $$1 = this.dS().a(ul.a);
      $$0.a("Particle", (uu)lj.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cwd.a)) {
         uu $$2 = (uu)cwd.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public eom k_() {
      return eom.d;
   }

   @Override
   public bsj a(btn $$0) {
      return bsj.b(this.g() * 2.0F, 0.5F);
   }
}
