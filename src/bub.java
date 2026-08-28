import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bub extends bui implements bwd {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final ako<Float> f = aks.a(bub.class, akq.d);
   private static final ako<Boolean> g = aks.a(bub.class, akq.k);
   private static final ako<lq> h = aks.a(bub.class, akq.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cye l = cye.a;
   private final Map<bui, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private bve t;
   @Nullable
   private UUID u;

   public bub(bup<? extends bub> $$0, dff $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public bub(dff $$0, double $$1, double $$2, double $$3) {
      this(bup.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, ll.a(ls.u, -1));
   }

   public void a(float $$0) {
      if (!this.dY().C) {
         this.aw().a(f, azn.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.dD();
      double $$1 = this.dF();
      double $$2 = this.dJ();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.aw().a(f);
   }

   public void a(cye $$0) {
      this.l = $$0;
      this.t();
   }

   private void t() {
      lq $$0 = this.am.a(h);
      if ($$0 instanceof ll $$1) {
         int $$2 = this.l.equals(cye.a) ? 0 : this.l.b();
         this.am.a(h, ll.a($$1.a(), axy.f($$2)));
      }
   }

   public void a(btn $$0) {
      this.a(this.l.a($$0));
   }

   public lq h() {
      return this.aw().a(h);
   }

   public void a(lq $$0) {
      this.aw().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.aw().a(g, $$0);
   }

   public boolean i() {
      return this.aw().a(g);
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
      if (this.dY().C) {
         if ($$0 && this.af.h()) {
            return;
         }

         lq $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = azn.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.af.i() * (float) (Math.PI * 2);
            float $$9 = azn.c(this.af.i()) * $$4;
            double $$10 = this.dD() + (double)(azn.b($$8) * $$9);
            double $$11 = this.dF();
            double $$12 = this.dJ() + (double)(azn.a($$8) * $$9);
            if ($$2.a() == ls.u) {
               if ($$0 && this.af.h()) {
                  this.dY().b(ll.a(ls.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dY().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dY().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dY().b($$2, $$10, $$11, $$12, (0.5 - this.af.j()) * 0.15, 0.01F, (0.5 - this.af.j()) * 0.15);
            }
         }
      } else {
         if (this.ag >= this.o + this.n) {
            this.av();
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
               this.av();
               return;
            }

            this.a($$1);
         }

         if (this.ag % 5 == 0) {
            this.m.entrySet().removeIf($$0x -> this.ag >= (Integer)$$0x.getValue());
            if (!this.l.c()) {
               this.m.clear();
            } else {
               List<btn> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (btn $$15 : this.l.e().get().a().a()) {
                     $$14.add(new btn($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<bve> $$16 = this.dY().a(bve.class, this.cT());
               if (!$$16.isEmpty()) {
                  for (bve $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fO() && !$$14.stream().noneMatch($$17::b)) {
                        double $$18 = $$17.dD() - this.dD();
                        double $$19 = $$17.dJ() - this.dJ();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ag + this.p);

                           for (btn $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new btn($$21), this);
                              }
                           }

                           if (this.r != 0.0F) {
                              $$1 += this.r;
                              if ($$1 < 0.5F) {
                                 this.av();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.q != 0) {
                              this.n = this.n + this.q;
                              if (this.n <= 0) {
                                 this.av();
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

   public void a(@Nullable bve $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cI();
   }

   @Nullable
   public bve q() {
      if (this.t == null && this.u != null && this.dY() instanceof arq) {
         bui $$0 = ((arq)this.dY()).a(this.u);
         if ($$0 instanceof bve) {
            this.t = (bve)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(un $$0) {
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

      alj<vk> $$1 = this.ea().a(vb.a);
      if ($$0.b("Particle", 10)) {
         ls.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cye.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(un $$0) {
      $$0.a("Age", this.ag);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      alj<vk> $$1 = this.ea().a(vb.a);
      $$0.a("Particle", (vk)ls.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cye.a)) {
         vk $$2 = (vk)cye.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(ako<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public ert k_() {
      return ert.d;
   }

   @Override
   public bul a(bvq $$0) {
      return bul.b(this.g() * 2.0F, 0.5F);
   }
}
