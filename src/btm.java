import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class btm extends btr implements bvl {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final akh<Float> f = akl.a(btm.class, akj.d);
   private static final akh<Boolean> g = akl.a(btm.class, akj.k);
   private static final akh<lm> h = akl.a(btm.class, akj.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cxr l = cxr.a;
   private final Map<btr, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private bun t;
   @Nullable
   private UUID u;

   public btm(bty<? extends btm> $$0, dej $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public btm(dej $$0, double $$1, double $$2, double $$3) {
      this(bty.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, lh.a(lo.u, -1));
   }

   public void a(float $$0) {
      if (!this.dS().B) {
         this.at().a(f, azf.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.at().a(f);
   }

   public void a(cxr $$0) {
      this.l = $$0;
      this.t();
   }

   private void t() {
      lm $$0 = this.am.a(h);
      if ($$0 instanceof lh $$1) {
         int $$2 = this.l.equals(cxr.a) ? 0 : this.l.b();
         this.am.a(h, lh.a($$1.a(), axq.f($$2)));
      }
   }

   public void a(bsy $$0) {
      this.a(this.l.a($$0));
   }

   public lm h() {
      return this.at().a(h);
   }

   public void a(lm $$0) {
      this.at().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.at().a(g, $$0);
   }

   public boolean i() {
      return this.at().a(g);
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
      if (this.dS().B) {
         if ($$0 && this.af.h()) {
            return;
         }

         lm $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = azf.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.af.i() * (float) (Math.PI * 2);
            float $$9 = azf.c(this.af.i()) * $$4;
            double $$10 = this.dx() + (double)(azf.b($$8) * $$9);
            double $$11 = this.dz();
            double $$12 = this.dD() + (double)(azf.a($$8) * $$9);
            if ($$2.a() == lo.u) {
               if ($$0 && this.af.h()) {
                  this.dS().b(lh.a(lo.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dS().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dS().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dS().b($$2, $$10, $$11, $$12, (0.5 - this.af.j()) * 0.15, 0.01F, (0.5 - this.af.j()) * 0.15);
            }
         }
      } else {
         if (this.ag >= this.o + this.n) {
            this.as();
            return;
         }

         boolean $$13 = this.ag < this.o;
         if ($$0 != $$13) {
            this.a($$13);
         }

         if ($$13) {
            return;
         }

         if (this.s != 0.0F) {
            $$1 += this.s;
            if ($$1 < 0.5F) {
               this.as();
               return;
            }

            this.a($$1);
         }

         if (this.ag % 5 == 0) {
            this.m.entrySet().removeIf($$0x -> this.ag >= (Integer)$$0x.getValue());
            if (!this.l.c()) {
               this.m.clear();
            } else {
               List<bsy> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (bsy $$15 : this.l.e().get().a().a()) {
                     $$14.add(new bsy($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<bun> $$16 = this.dS().a(bun.class, this.cO());
               if (!$$16.isEmpty()) {
                  for (bun $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fH() && !$$14.stream().noneMatch($$17::b)) {
                        double $$18 = $$17.dx() - this.dx();
                        double $$19 = $$17.dD() - this.dD();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ag + this.p);

                           for (bsy $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new bsy($$21), this);
                              }
                           }

                           if (this.r != 0.0F) {
                              $$1 += this.r;
                              if ($$1 < 0.5F) {
                                 this.as();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.q != 0) {
                              this.n = this.n + this.q;
                              if (this.n <= 0) {
                                 this.as();
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

   public void a(@Nullable bun $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cD();
   }

   @Nullable
   public bun q() {
      if (this.t == null && this.u != null && this.dS() instanceof arj) {
         btr $$0 = ((arj)this.dS()).a(this.u);
         if ($$0 instanceof bun) {
            this.t = (bun)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(ug $$0) {
      this.ag = $$0.h("Age");
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

      alc<vd> $$1 = this.dU().a(uu.a);
      if ($$0.b("Particle", 10)) {
         lo.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cxr.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(ug $$0) {
      $$0.a("Age", this.ag);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      alc<vd> $$1 = this.dU().a(uu.a);
      $$0.a("Particle", (vd)lo.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cxr.a)) {
         vd $$2 = (vd)cxr.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(akh<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public eqy k_() {
      return eqy.d;
   }

   @Override
   public btu a(buz $$0) {
      return btu.b(this.g() * 2.0F, 0.5F);
   }
}
