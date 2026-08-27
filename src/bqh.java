import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqh extends bql implements bsc {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final ajk<Float> f = ajo.a(bqh.class, ajm.d);
   private static final ajk<Integer> g = ajo.a(bqh.class, ajm.b);
   private static final ajk<Boolean> h = ajo.a(bqh.class, ajm.k);
   private static final ajk<ku> i = ajo.a(bqh.class, ajm.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cuc m = cuc.a;
   private final Map<bql, Integer> n = Maps.newHashMap();
   private int o = 600;
   private int p = 20;
   private int q = 20;
   private int r;
   private float s;
   private float t;
   @Nullable
   private bre u;
   @Nullable
   private UUID v;

   public bqh(bqr<? extends bqh> $$0, czu $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public bqh(czu $$0, double $$1, double $$2, double $$3) {
      this(bqr.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(g, 0);
      $$0.a(f, 3.0F);
      $$0.a(h, false);
      $$0.a(i, ko.a(kw.u, 0.0F, 0.0F, 0.0F));
   }

   public void a(float $$0) {
      if (!this.dN().B) {
         this.an().a(f, axw.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.an().a(f);
   }

   public void a(cuc $$0) {
      this.m = $$0;
      this.v();
   }

   private void v() {
      this.ao.a(g, this.m.equals(cuc.a) ? 0 : this.m.b());
   }

   public void a(bpx $$0) {
      this.a(this.m.a($$0));
   }

   public int h() {
      return this.an().a(g);
   }

   public ku i() {
      return this.an().a(i);
   }

   public void a(ku $$0) {
      this.an().a(i, $$0);
   }

   protected void a(boolean $$0) {
      this.an().a(h, $$0);
   }

   public boolean j() {
      return this.an().a(h);
   }

   public int k() {
      return this.o;
   }

   public void a(int $$0) {
      this.o = $$0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.j();
      float $$1 = this.g();
      if (this.dN().B) {
         if ($$0 && this.ah.h()) {
            return;
         }

         ku $$2 = this.i();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = axw.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ah.i() * (float) (Math.PI * 2);
            float $$9 = axw.c(this.ah.i()) * $$4;
            double $$10 = this.ds() + (double)(axw.b($$8) * $$9);
            double $$11 = this.du();
            double $$12 = this.dy() + (double)(axw.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.a() == kw.u) {
               int $$13 = $$0 && this.ah.h() ? 16777215 : this.h();
               $$14 = (double)((float)($$13 >> 16 & 0xFF) / 255.0F);
               $$15 = (double)((float)($$13 >> 8 & 0xFF) / 255.0F);
               $$16 = (double)((float)($$13 & 0xFF) / 255.0F);
            } else if ($$0) {
               $$14 = 0.0;
               $$15 = 0.0;
               $$16 = 0.0;
            } else {
               $$14 = (0.5 - this.ah.j()) * 0.15;
               $$15 = 0.01F;
               $$16 = (0.5 - this.ah.j()) * 0.15;
            }

            this.dN().b($$2, $$10, $$11, $$12, $$14, $$15, $$16);
         }
      } else {
         if (this.ai >= this.p + this.o) {
            this.am();
            return;
         }

         boolean $$23 = this.ai < this.p;
         if ($$0 != $$23) {
            this.a($$23);
         }

         if ($$23) {
            return;
         }

         if (this.t != 0.0F) {
            $$1 += this.t;
            if ($$1 < 0.5F) {
               this.am();
               return;
            }

            this.a($$1);
         }

         if (this.ai % 5 == 0) {
            this.n.entrySet().removeIf($$0x -> this.ai >= (Integer)$$0x.getValue());
            if (!this.m.d()) {
               this.n.clear();
            } else {
               List<bpx> $$24 = Lists.newArrayList();
               if (this.m.f().isPresent()) {
                  for (bpx $$25 : this.m.f().get().a().a()) {
                     $$24.add(new bpx($$25.c(), $$25.a($$0x -> $$0x / 4), $$25.e(), $$25.f(), $$25.g()));
                  }
               }

               $$24.addAll(this.m.e());
               List<bre> $$26 = this.dN().a(bre.class, this.cI());
               if (!$$26.isEmpty()) {
                  for (bre $$27 : $$26) {
                     if (!this.n.containsKey($$27) && $$27.fE()) {
                        double $$28 = $$27.ds() - this.ds();
                        double $$29 = $$27.dy() - this.dy();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.n.put($$27, this.ai + this.q);

                           for (bpx $$31 : $$24) {
                              if ($$31.c().a().a()) {
                                 $$31.c().a().a(this, this.r(), $$27, $$31.e(), 0.5);
                              } else {
                                 $$27.b(new bpx($$31), this);
                              }
                           }

                           if (this.s != 0.0F) {
                              $$1 += this.s;
                              if ($$1 < 0.5F) {
                                 this.am();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.r != 0) {
                              this.o = this.o + this.r;
                              if (this.o <= 0) {
                                 this.am();
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

   public float m() {
      return this.s;
   }

   public void b(float $$0) {
      this.s = $$0;
   }

   public float o() {
      return this.t;
   }

   public void c(float $$0) {
      this.t = $$0;
   }

   public int p() {
      return this.r;
   }

   public void b(int $$0) {
      this.r = $$0;
   }

   public int q() {
      return this.p;
   }

   public void c(int $$0) {
      this.p = $$0;
   }

   public void a(@Nullable bre $$0) {
      this.u = $$0;
      this.v = $$0 == null ? null : $$0.cx();
   }

   @Nullable
   public bre r() {
      if (this.u == null && this.v != null && this.dN() instanceof aqe) {
         bql $$0 = ((aqe)this.dN()).a(this.v);
         if ($$0 instanceof bre) {
            this.u = (bre)$$0;
         }
      }

      return this.u;
   }

   @Override
   protected void a(ty $$0) {
      this.ai = $$0.h("Age");
      this.o = $$0.h("Duration");
      this.p = $$0.h("WaitTime");
      this.q = $$0.h("ReapplicationDelay");
      this.r = $$0.h("DurationOnUse");
      this.s = $$0.j("RadiusOnUse");
      this.t = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.v = $$0.a("Owner");
      }

      if ($$0.b("Particle", 8)) {
         try {
            this.a(ez.a(new StringReader($$0.l("Particle")), this.dP()));
         } catch (CommandSyntaxException var3) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var3);
         }
      }

      if ($$0.e("potion_contents")) {
         cuc.c
            .parse(um.a, $$0.c("potion_contents"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x))
            .ifPresent(this::a);
      }
   }

   @Override
   protected void b(ty $$0) {
      $$0.a("Age", this.ai);
      $$0.a("Duration", this.o);
      $$0.a("WaitTime", this.p);
      $$0.a("ReapplicationDelay", this.q);
      $$0.a("DurationOnUse", this.r);
      $$0.a("RadiusOnUse", this.s);
      $$0.a("RadiusPerTick", this.t);
      $$0.a("Radius", this.g());
      $$0.a("Particle", this.i().a(this.dP()));
      if (this.v != null) {
         $$0.a("Owner", this.v);
      }

      if (!this.m.equals(cuc.a)) {
         uv $$1 = ac.a(cuc.c.encodeStart(um.a, this.m), IllegalStateException::new);
         $$0.a("potion_contents", $$1);
      }
   }

   @Override
   public void a(ajk<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public elw k_() {
      return elw.d;
   }

   @Override
   public bqo a(brp $$0) {
      return bqo.b(this.g() * 2.0F, 0.5F);
   }
}
