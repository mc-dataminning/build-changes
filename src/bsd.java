import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsd extends bsh implements bub {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final ajp<Float> f = ajt.a(bsd.class, ajr.d);
   private static final ajp<Boolean> g = ajt.a(bsd.class, ajr.k);
   private static final ajp<lh> h = ajt.a(bsd.class, ajr.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cwe l = cwe.a;
   private final Map<bsh, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private btc t;
   @Nullable
   private UUID u;

   public bsd(bsn<? extends bsd> $$0, dcg $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public bsd(dcg $$0, double $$1, double $$2, double $$3) {
      this(bsn.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, lc.a(lj.u, -1));
   }

   public void a(float $$0) {
      if (!this.dR().B) {
         this.ar().a(f, ayg.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void i_() {
      double $$0 = this.dw();
      double $$1 = this.dy();
      double $$2 = this.dC();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.ar().a(f);
   }

   public void a(cwe $$0) {
      this.l = $$0;
      this.t();
   }

   private void t() {
      lh $$0 = this.ao.a(h);
      if ($$0 instanceof lc $$1) {
         int $$2 = this.l.equals(cwe.a) ? 0 : this.l.b();
         this.ao.a(h, lc.a($$1.a(), axq.b.e($$2)));
      }
   }

   public void a(brp $$0) {
      this.a(this.l.a($$0));
   }

   public lh h() {
      return this.ar().a(h);
   }

   public void a(lh $$0) {
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
      if (this.dR().B) {
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
            double $$10 = this.dw() + (double)(ayg.b($$8) * $$9);
            double $$11 = this.dy();
            double $$12 = this.dC() + (double)(ayg.a($$8) * $$9);
            if ($$2.a() == lj.u) {
               if ($$0 && this.ah.h()) {
                  this.dR().b(lc.a(lj.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dR().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dR().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dR().b($$2, $$10, $$11, $$12, (0.5 - this.ah.j()) * 0.15, 0.01F, (0.5 - this.ah.j()) * 0.15);
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
               List<brp> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (brp $$15 : this.l.e().get().a().a()) {
                     $$14.add(new brp($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<btc> $$16 = this.dR().a(btc.class, this.cM());
               if (!$$16.isEmpty()) {
                  for (btc $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fE()) {
                        double $$18 = $$17.dw() - this.dw();
                        double $$19 = $$17.dC() - this.dC();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ai + this.p);

                           for (brp $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new brp($$21), this);
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

   public void a(@Nullable btc $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cB();
   }

   @Nullable
   public btc q() {
      if (this.t == null && this.u != null && this.dR() instanceof aqm) {
         bsh $$0 = ((aqm)this.dR()).a(this.u);
         if ($$0 instanceof btc) {
            this.t = (btc)$$0;
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

      aki<uu> $$1 = this.dT().a(ul.a);
      if ($$0.b("Particle", 10)) {
         lj.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cwe.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
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
      aki<uu> $$1 = this.dT().a(ul.a);
      $$0.a("Particle", (uu)lj.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cwe.a)) {
         uu $$2 = (uu)cwe.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (f.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public eoo j_() {
      return eoo.d;
   }

   @Override
   public bsk a(bto $$0) {
      return bsk.b(this.g() * 2.0F, 0.5F);
   }
}
