import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bue extends bul implements bwg {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 5;
   private static final akm<Float> e = akq.a(bue.class, ako.d);
   private static final akm<Boolean> f = akq.a(bue.class, ako.k);
   private static final akm<lq> g = akq.a(bue.class, ako.l);
   private static final float h = 32.0F;
   private static final float i = 0.5F;
   private static final float j = 3.0F;
   public static final float a = 6.0F;
   public static final float b = 0.5F;
   private cyl k = cyl.a;
   private final Map<bul, Integer> l = Maps.newHashMap();
   private int m = 600;
   private int n = 20;
   private int o = 20;
   private int p;
   private float q;
   private float r;
   @Nullable
   private bvh s;
   @Nullable
   private UUID t;

   public bue(bus<? extends bue> $$0, dfm $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public bue(dfm $$0, double $$1, double $$2, double $$3) {
      this(bus.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(e, 3.0F);
      $$0.a(f, false);
      $$0.a(g, ll.a(ls.u, -1));
   }

   public void a(float $$0) {
      if (!this.dV().C) {
         this.au().a(e, azm.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void l_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.l_();
      this.a_($$0, $$1, $$2);
   }

   public float c() {
      return this.au().a(e);
   }

   public void a(cyl $$0) {
      this.k = $$0;
      this.q();
   }

   private void q() {
      lq $$0 = this.al.a(g);
      if ($$0 instanceof ll $$1) {
         int $$2 = this.k.equals(cyl.a) ? 0 : this.k.b();
         this.al.a(g, ll.a($$1.a(), axx.f($$2)));
      }
   }

   public void a(btq $$0) {
      this.a(this.k.a($$0));
   }

   public lq e() {
      return this.au().a(g);
   }

   public void a(lq $$0) {
      this.au().a(g, $$0);
   }

   protected void a(boolean $$0) {
      this.au().a(f, $$0);
   }

   public boolean f() {
      return this.au().a(f);
   }

   public int g() {
      return this.m;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof arp $$0) {
         this.a($$0);
      } else {
         this.s();
      }
   }

   private void s() {
      boolean $$0 = this.f();
      float $$1 = this.c();
      if (!$$0 || !this.ae.h()) {
         lq $$2 = this.e();
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
            double $$10 = this.dA() + (double)(azm.b($$8) * $$9);
            double $$11 = this.dC();
            double $$12 = this.dG() + (double)(azm.a($$8) * $$9);
            if ($$2.a() == ls.u) {
               if ($$0 && this.ae.h()) {
                  this.dV().b(ll.a(ls.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
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

   private void a(arp $$0) {
      if (this.af >= this.n + this.m) {
         this.at();
      } else {
         boolean $$1 = this.f();
         boolean $$2 = this.af < this.n;
         if ($$1 != $$2) {
            this.a($$2);
         }

         if (!$$2) {
            float $$3 = this.c();
            if (this.r != 0.0F) {
               $$3 += this.r;
               if ($$3 < 0.5F) {
                  this.at();
                  return;
               }

               this.a($$3);
            }

            if (this.af % 5 == 0) {
               this.l.entrySet().removeIf($$0x -> this.af >= (Integer)$$0x.getValue());
               if (!this.k.c()) {
                  this.l.clear();
               } else {
                  List<btq> $$4 = Lists.newArrayList();
                  if (this.k.e().isPresent()) {
                     for (btq $$5 : this.k.e().get().a().a()) {
                        $$4.add(new btq($$5.c(), $$5.a($$0x -> $$0x / 4), $$5.e(), $$5.f(), $$5.g()));
                     }
                  }

                  $$4.addAll(this.k.d());
                  List<bvh> $$6 = this.dV().a(bvh.class, this.cR());
                  if (!$$6.isEmpty()) {
                     for (bvh $$7 : $$6) {
                        if (!this.l.containsKey($$7) && $$7.fJ() && !$$4.stream().noneMatch($$7::b)) {
                           double $$8 = $$7.dA() - this.dA();
                           double $$9 = $$7.dG() - this.dG();
                           double $$10 = $$8 * $$8 + $$9 * $$9;
                           if ($$10 <= (double)($$3 * $$3)) {
                              this.l.put($$7, this.af + this.o);

                              for (btq $$11 : $$4) {
                                 if ($$11.c().a().a()) {
                                    $$11.c().a().a($$0, this, this.n(), $$7, $$11.e(), 0.5);
                                 } else {
                                    $$7.b(new btq($$11), this);
                                 }
                              }

                              if (this.q != 0.0F) {
                                 $$3 += this.q;
                                 if ($$3 < 0.5F) {
                                    this.at();
                                    return;
                                 }

                                 this.a($$3);
                              }

                              if (this.p != 0) {
                                 this.m = this.m + this.p;
                                 if (this.m <= 0) {
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

   public float i() {
      return this.q;
   }

   public void b(float $$0) {
      this.q = $$0;
   }

   public float j() {
      return this.r;
   }

   public void c(float $$0) {
      this.r = $$0;
   }

   public int l() {
      return this.p;
   }

   public void b(int $$0) {
      this.p = $$0;
   }

   public int m() {
      return this.n;
   }

   public void c(int $$0) {
      this.n = $$0;
   }

   public void a(@Nullable bvh $$0) {
      this.s = $$0;
      this.t = $$0 == null ? null : $$0.cG();
   }

   @Nullable
   public bvh n() {
      if (this.s == null && this.t != null && this.dV() instanceof arp) {
         bul $$0 = ((arp)this.dV()).a(this.t);
         if ($$0 instanceof bvh) {
            this.s = (bvh)$$0;
         }
      }

      return this.s;
   }

   @Override
   protected void a(ul $$0) {
      this.af = $$0.h("Age");
      this.m = $$0.h("Duration");
      this.n = $$0.h("WaitTime");
      this.o = $$0.h("ReapplicationDelay");
      this.p = $$0.h("DurationOnUse");
      this.q = $$0.j("RadiusOnUse");
      this.r = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.t = $$0.a("Owner");
      }

      alh<vi> $$1 = this.dX().a(uz.a);
      if ($$0.b("Particle", 10)) {
         ls.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> c.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cyl.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> c.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(ul $$0) {
      $$0.a("Age", this.af);
      $$0.a("Duration", this.m);
      $$0.a("WaitTime", this.n);
      $$0.a("ReapplicationDelay", this.o);
      $$0.a("DurationOnUse", this.p);
      $$0.a("RadiusOnUse", this.q);
      $$0.a("RadiusPerTick", this.r);
      $$0.a("Radius", this.c());
      alh<vi> $$1 = this.dX().a(uz.a);
      $$0.a("Particle", (vi)ls.bf.encodeStart($$1, this.e()).getOrThrow());
      if (this.t != null) {
         $$0.a("Owner", this.t);
      }

      if (!this.k.equals(cyl.a)) {
         vi $$2 = (vi)cyl.b.encodeStart($$1, this.k).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(akm<?> $$0) {
      if (e.equals($$0)) {
         this.l_();
      }

      super.a($$0);
   }

   @Override
   public esa m_() {
      return esa.d;
   }

   @Override
   public buo a(bvt $$0) {
      return buo.b(this.c() * 2.0F, 0.5F);
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }
}
