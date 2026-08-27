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

public class bpr extends bpv implements brm {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final aiy<Float> f = ajc.a(bpr.class, aja.d);
   private static final aiy<Integer> g = ajc.a(bpr.class, aja.b);
   private static final aiy<Boolean> h = ajc.a(bpr.class, aja.k);
   private static final aiy<kj> i = ajc.a(bpr.class, aja.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cth m = cth.a;
   private final Map<bpv, Integer> n = Maps.newHashMap();
   private int o = 600;
   private int p = 20;
   private int q = 20;
   private int r;
   private float s;
   private float t;
   @Nullable
   private bqo u;
   @Nullable
   private UUID v;

   public bpr(bqb<? extends bpr> $$0, cyx $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public bpr(cyx $$0, double $$1, double $$2, double $$3) {
      this(bqb.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(g, 0);
      $$0.a(f, 3.0F);
      $$0.a(h, false);
      $$0.a(i, kl.v);
   }

   public void a(float $$0) {
      if (!this.dM().B) {
         this.an().a(f, axk.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.an().a(f);
   }

   public void a(cth $$0) {
      this.m = $$0;
      this.v();
   }

   private void v() {
      this.an.a(g, this.m.equals(cth.a) ? 0 : this.m.b());
   }

   public void a(bph $$0) {
      this.a(this.m.a($$0));
   }

   public int h() {
      return this.an().a(g);
   }

   public kj i() {
      return this.an().a(i);
   }

   public void a(kj $$0) {
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
      if (this.dM().B) {
         if ($$0 && this.ag.h()) {
            return;
         }

         kj $$2 = this.i();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = axk.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ag.i() * (float) (Math.PI * 2);
            float $$9 = axk.c(this.ag.i()) * $$4;
            double $$10 = this.dr() + (double)(axk.b($$8) * $$9);
            double $$11 = this.dt();
            double $$12 = this.dx() + (double)(axk.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.a() == kl.v) {
               int $$13 = $$0 && this.ag.h() ? 16777215 : this.h();
               $$14 = (double)((float)($$13 >> 16 & 0xFF) / 255.0F);
               $$15 = (double)((float)($$13 >> 8 & 0xFF) / 255.0F);
               $$16 = (double)((float)($$13 & 0xFF) / 255.0F);
            } else if ($$0) {
               $$14 = 0.0;
               $$15 = 0.0;
               $$16 = 0.0;
            } else {
               $$14 = (0.5 - this.ag.j()) * 0.15;
               $$15 = 0.01F;
               $$16 = (0.5 - this.ag.j()) * 0.15;
            }

            this.dM().b($$2, $$10, $$11, $$12, $$14, $$15, $$16);
         }
      } else {
         if (this.ah >= this.p + this.o) {
            this.am();
            return;
         }

         boolean $$23 = this.ah < this.p;
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

         if (this.ah % 5 == 0) {
            this.n.entrySet().removeIf($$0x -> this.ah >= (Integer)$$0x.getValue());
            if (!this.m.d()) {
               this.n.clear();
            } else {
               List<bph> $$24 = Lists.newArrayList();
               if (this.m.f().isPresent()) {
                  for (bph $$25 : this.m.f().get().a().a()) {
                     $$24.add(new bph($$25.b(), $$25.a($$0x -> $$0x / 4), $$25.d(), $$25.e(), $$25.f()));
                  }
               }

               $$24.addAll(this.m.e());
               List<bqo> $$26 = this.dM().a(bqo.class, this.cH());
               if (!$$26.isEmpty()) {
                  for (bqo $$27 : $$26) {
                     if (!this.n.containsKey($$27) && $$27.fD()) {
                        double $$28 = $$27.dr() - this.dr();
                        double $$29 = $$27.dx() - this.dx();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.n.put($$27, this.ah + this.q);

                           for (bph $$31 : $$24) {
                              if ($$31.b().a().a()) {
                                 $$31.b().a().a(this, this.r(), $$27, $$31.d(), 0.5);
                              } else {
                                 $$27.b(new bph($$31), this);
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

   public void a(@Nullable bqo $$0) {
      this.u = $$0;
      this.v = $$0 == null ? null : $$0.cw();
   }

   @Nullable
   public bqo r() {
      if (this.u == null && this.v != null && this.dM() instanceof aps) {
         bpv $$0 = ((aps)this.dM()).a(this.v);
         if ($$0 instanceof bqo) {
            this.u = (bqo)$$0;
         }
      }

      return this.u;
   }

   @Override
   protected void a(tm $$0) {
      this.ah = $$0.h("Age");
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
            this.a(er.a(new StringReader($$0.l("Particle")), this.dO()));
         } catch (CommandSyntaxException var3) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var3);
         }
      }

      if ($$0.e("potion_contents")) {
         cth.b
            .parse(ua.a, $$0.c("potion_contents"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x))
            .ifPresent(this::a);
      }
   }

   @Override
   protected void b(tm $$0) {
      $$0.a("Age", this.ah);
      $$0.a("Duration", this.o);
      $$0.a("WaitTime", this.p);
      $$0.a("ReapplicationDelay", this.q);
      $$0.a("DurationOnUse", this.r);
      $$0.a("RadiusOnUse", this.s);
      $$0.a("RadiusPerTick", this.t);
      $$0.a("Radius", this.g());
      $$0.a("Particle", this.i().a(this.dO()));
      if (this.v != null) {
         $$0.a("Owner", this.v);
      }

      if (!this.m.equals(cth.a)) {
         uj $$1 = ac.a(cth.b.encodeStart(ua.a, this.m), IllegalStateException::new);
         $$0.a("potion_contents", $$1);
      }
   }

   @Override
   public void a(aiy<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public ekx k_() {
      return ekx.d;
   }

   @Override
   public bpy a(bqz $$0) {
      return bpy.b(this.g() * 2.0F, 0.5F);
   }
}
