import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class fne implements anl, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float e = 512.0F;
   private static final int f = 32;
   private static final int g = 10;
   private static final int h = 21;
   private static final int i = 15;
   private static final aep j = new aep("textures/environment/moon_phases.png");
   private static final aep k = new aep("textures/environment/sun.png");
   private static final aep l = new aep("textures/environment/clouds.png");
   private static final aep m = new aep("textures/environment/end_sky.png");
   private static final aep n = new aep("textures/misc/forcefield.png");
   private static final aep o = new aep("textures/environment/rain.png");
   private static final aep p = new aep("textures/environment/snow.png");
   public static final hb[] c = hb.values();
   private final eqn q;
   private final fsh r;
   private final fpf s;
   private final fnm t;
   @Nullable
   private fie u;
   private final fns v = new fns();
   private final ObjectArrayList<fqe.b> w = new ObjectArrayList(10000);
   private final Set<dck> x = Sets.newHashSet();
   @Nullable
   private fnw y;
   @Nullable
   private elk z;
   @Nullable
   private elk A;
   @Nullable
   private elk B;
   private boolean C = true;
   @Nullable
   private elk D;
   private final fnp E = new fnp(100);
   private int F;
   private final Int2ObjectMap<ajq> G = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<ajq>> H = new Long2ObjectOpenHashMap();
   private final Map<gv, gbo> I = Maps.newHashMap();
   @Nullable
   private ejt J;
   @Nullable
   private fnj K;
   @Nullable
   private ejt L;
   @Nullable
   private ejt M;
   @Nullable
   private ejt N;
   @Nullable
   private ejt O;
   @Nullable
   private ejt P;
   @Nullable
   private fnj Q;
   private int R = Integer.MIN_VALUE;
   private int S = Integer.MIN_VALUE;
   private int T = Integer.MIN_VALUE;
   private double U = Double.MIN_VALUE;
   private double V = Double.MIN_VALUE;
   private double W = Double.MIN_VALUE;
   private double X = Double.MIN_VALUE;
   private double Y = Double.MIN_VALUE;
   private int Z = Integer.MIN_VALUE;
   private int aa = Integer.MIN_VALUE;
   private int ab = Integer.MIN_VALUE;
   private ehf ac = ehf.b;
   @Nullable
   private eqb ad;
   @Nullable
   private fqe ae;
   private int af = -1;
   private int ag;
   private int ah;
   private fqi ai;
   private boolean aj;
   @Nullable
   private fqi ak;
   private final Vector4f[] al = new Vector4f[8];
   private final Vector3d am = new Vector3d(0.0, 0.0, 0.0);
   private double an;
   private double ao;
   private double ap;
   private int aq;
   private final float[] ar = new float[1024];
   private final float[] as = new float[1024];

   public fne(eqn $$0, fsh $$1, fpf $$2, fnm $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = aro.c($$6 * $$6 + $$7 * $$7);
            this.ar[$$4 << 5 | $$5] = -$$7 / $$8;
            this.as[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(fnf $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.q.s.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         cpk $$6 = this.q.s;
         int $$7 = aro.a($$2);
         int $$8 = aro.a($$3);
         int $$9 = aro.a($$4);
         elj $$10 = elj.a();
         elc $$11 = $$10.c();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (eqn.K()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(eqn.L());
         int $$13 = -1;
         float $$14 = (float)this.F + $$1;
         RenderSystem.setShader(fmz::u);
         gv.a $$15 = new gv.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.ar[$$18] * 0.5;
               double $$20 = (double)this.as[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               cqi $$21 = $$6.s($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(dkh.a.e, $$17, $$16);
                  int $$23 = $$8 - $$12;
                  int $$24 = $$8 + $$12;
                  if ($$23 < $$22) {
                     $$23 = $$22;
                  }

                  if ($$24 < $$22) {
                     $$24 = $$22;
                  }

                  int $$25 = $$22;
                  if ($$22 < $$8) {
                     $$25 = $$8;
                  }

                  if ($$23 != $$24) {
                     art $$26 = art.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     cqi.c $$27 = $$21.a($$15);
                     if ($$27 == cqi.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              $$10.b();
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, o);
                           $$11.a(elm.b.h, elf.l);
                        }

                        int $$28 = this.F + $$17 * $$17 * 3121 + $$17 * 45238971 + $$16 * $$16 * 418711 + $$16 * 13761 & 31;
                        float $$29 = -((float)$$28 + $$1) / 32.0F * (3.0F + $$26.i());
                        double $$30 = (double)$$17 + 0.5 - $$2;
                        double $$31 = (double)$$16 + 0.5 - $$4;
                        float $$32 = (float)Math.sqrt($$30 * $$30 + $$31 * $$31) / (float)$$12;
                        float $$33 = ((1.0F - $$32 * $$32) * 0.5F + 0.5F) * $$5;
                        $$15.d($$17, $$25, $$16);
                        int $$34 = a($$6, $$15);
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F, (float)$$23 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F, (float)$$23 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F, (float)$$24 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F, (float)$$24 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                     } else if ($$27 == cqi.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              $$10.b();
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, p);
                           $$11.a(elm.b.h, elf.l);
                        }

                        float $$35 = -((float)(this.F & 511) + $$1) / 512.0F;
                        float $$36 = (float)($$26.j() + (double)$$14 * 0.01 * (double)((float)$$26.k()));
                        float $$37 = (float)($$26.j() + (double)($$14 * (float)$$26.k()) * 0.001);
                        double $$38 = (double)$$17 + 0.5 - $$2;
                        double $$39 = (double)$$16 + 0.5 - $$4;
                        float $$40 = (float)Math.sqrt($$38 * $$38 + $$39 * $$39) / (float)$$12;
                        float $$41 = ((1.0F - $$40 * $$40) * 0.3F + 0.5F) * $$5;
                        $$15.d($$17, $$25, $$16);
                        int $$42 = a($$6, $$15);
                        int $$43 = $$42 >> 16 & 65535;
                        int $$44 = $$42 & 65535;
                        int $$45 = ($$43 * 3 + 240) / 4;
                        int $$46 = ($$44 * 3 + 240) / 4;
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F + $$36, (float)$$23 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F + $$36, (float)$$23 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F + $$36, (float)$$24 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F + $$36, (float)$$24 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                     }
                  }
               }
            }
         }

         if ($$13 >= 0) {
            $$10.b();
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         $$0.b();
      }
   }

   public void a(epy $$0) {
      float $$1 = this.q.s.d(1.0F) / (eqn.K() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         art $$2 = art.a((long)this.F * 312987231L);
         cpn $$3 = this.q.s;
         gv $$4 = gv.a($$0.b());
         gv $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.q.m.am().c() == eqs.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            gv $$10 = $$3.a(dkh.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.C_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               cqi $$11 = $$3.s($$10).a();
               if ($$11.a($$10) == cqi.c.b) {
                  $$5 = $$10.d();
                  if (this.q.m.am().c() == eqs.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dey $$14 = $$3.a_($$5);
                  eab $$15 = $$3.b_($$5);
                  ehy $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(hb.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  iu $$20 = !$$15.a(apo.b) && !$$14.a(csl.kJ) && !csx.g($$14) ? iw.Y : iw.Z;
                  this.q.s.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aq++) {
            this.aq = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dkh.a.e, $$4).v() > aro.d((float)$$4.v())) {
               this.q.s.a($$5, aou.zN, aov.d, 0.1F, 0.5F, false);
            } else {
               this.q.s.a($$5, aou.zM, aov.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   @Override
   public void close() {
      if (this.K != null) {
         this.K.close();
      }

      if (this.Q != null) {
         this.Q.close();
      }
   }

   @Override
   public void a(ank $$0) {
      this.a();
      if (eqn.L()) {
         this.y();
      }
   }

   public void a() {
      if (this.K != null) {
         this.K.close();
      }

      aep $$0 = new aep("shaders/post/entity_outline.json");

      try {
         this.K = new fnj(this.q.X(), this.q.Y(), this.q.f(), $$0);
         this.K.a(this.q.aM().k(), this.q.aM().l());
         this.J = this.K.a("final");
      } catch (IOException var3) {
         d.warn("Failed to load shader: {}", $$0, var3);
         this.K = null;
         this.J = null;
      } catch (JsonSyntaxException var4) {
         d.warn("Failed to parse shader: {}", $$0, var4);
         this.K = null;
         this.J = null;
      }
   }

   private void y() {
      this.z();
      aep $$0 = new aep("shaders/post/transparency.json");

      try {
         fnj $$1 = new fnj(this.q.X(), this.q.Y(), this.q.f(), $$0);
         $$1.a(this.q.aM().k(), this.q.aM().l());
         ejt $$2 = $$1.a("translucent");
         ejt $$3 = $$1.a("itemEntity");
         ejt $$4 = $$1.a("particles");
         ejt $$5 = $$1.a("weather");
         ejt $$6 = $$1.a("clouds");
         this.Q = $$1;
         this.L = $$2;
         this.M = $$3;
         this.N = $$4;
         this.O = $$5;
         this.P = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         fne.a $$10 = new fne.a($$9, var8);
         if (this.q.Z().d().size() > 1) {
            te $$11 = this.q.Y().b().findFirst().map($$0x -> te.b($$0x.a())).orElse(null);
            this.q.m.i().a(eqg.b);
            this.q.a($$10, $$11);
         } else {
            o $$12 = this.q.d(new o($$9, $$10));
            this.q.m.i().a(eqg.b);
            this.q.m.aq();
            d.error(LogUtils.FATAL_MARKER, $$9, $$10);
            this.q.o();
            eqn.c($$12);
         }
      }
   }

   private void z() {
      if (this.Q != null) {
         this.Q.close();
         this.L.a();
         this.M.a();
         this.N.a();
         this.O.a();
         this.P.a();
         this.Q = null;
         this.L = null;
         this.M = null;
         this.N = null;
         this.O = null;
         this.P = null;
      }
   }

   public void b() {
      if (this.d()) {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ZERO,
            GlStateManager.DestFactor.ONE
         );
         this.J.c(this.q.aM().k(), this.q.aM().l(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.q.j.a() && this.J != null && this.K != null && this.q.t != null;
   }

   private void A() {
      elj $$0 = elj.a();
      elc $$1 = $$0.c();
      if (this.B != null) {
         this.B.close();
      }

      this.B = new elk(elk.a.a);
      elc.b $$2 = a($$1, -16.0F);
      this.B.a();
      this.B.a($$2);
      elk.b();
   }

   private void B() {
      elj $$0 = elj.a();
      elc $$1 = $$0.c();
      if (this.A != null) {
         this.A.close();
      }

      this.A = new elk(elk.a.a);
      elc.b $$2 = a($$1, 16.0F);
      this.A.a();
      this.A.a($$2);
      elk.b();
   }

   private static elc.b a(elc $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(fmz::p);
      $$0.a(elm.b.g, elf.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * aro.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * aro.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      elj $$0 = elj.a();
      elc $$1 = $$0.c();
      RenderSystem.setShader(fmz::p);
      if (this.z != null) {
         this.z.close();
      }

      this.z = new elk(elk.a.a);
      elc.b $$2 = this.a($$1);
      this.z.a();
      this.z.a($$2);
      elk.b();
   }

   private elc.b a(elc $$0) {
      art $$1 = art.a(10842L);
      $$0.a(elm.b.h, elf.m);

      for (int $$2 = 0; $$2 < 1500; $$2++) {
         double $$3 = (double)($$1.i() * 2.0F - 1.0F);
         double $$4 = (double)($$1.i() * 2.0F - 1.0F);
         double $$5 = (double)($$1.i() * 2.0F - 1.0F);
         double $$6 = (double)(0.15F + $$1.i() * 0.1F);
         double $$7 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
         if ($$7 < 1.0 && $$7 > 0.01) {
            $$7 = 1.0 / Math.sqrt($$7);
            $$3 *= $$7;
            $$4 *= $$7;
            $$5 *= $$7;
            double $$8 = $$3 * 100.0;
            double $$9 = $$4 * 100.0;
            double $$10 = $$5 * 100.0;
            double $$11 = Math.atan2($$3, $$5);
            double $$12 = Math.sin($$11);
            double $$13 = Math.cos($$11);
            double $$14 = Math.atan2(Math.sqrt($$3 * $$3 + $$5 * $$5), $$4);
            double $$15 = Math.sin($$14);
            double $$16 = Math.cos($$14);
            double $$17 = $$1.j() * Math.PI * 2.0;
            double $$18 = Math.sin($$17);
            double $$19 = Math.cos($$17);

            for (int $$20 = 0; $$20 < 4; $$20++) {
               double $$21 = 0.0;
               double $$22 = (double)(($$20 & 2) - 1) * $$6;
               double $$23 = (double)(($$20 + 1 & 2) - 1) * $$6;
               double $$24 = 0.0;
               double $$25 = $$22 * $$19 - $$23 * $$18;
               double $$26 = $$23 * $$19 + $$22 * $$18;
               double $$28 = $$25 * $$15 + 0.0 * $$16;
               double $$29 = 0.0 * $$15 - $$25 * $$16;
               double $$30 = $$29 * $$12 - $$26 * $$13;
               double $$32 = $$26 * $$12 + $$29 * $$13;
               $$0.a($$8 + $$30, $$9 + $$28, $$10 + $$32).e();
            }
         }
      }

      return $$0.d();
   }

   public void a(@Nullable fie $$0) {
      this.R = Integer.MIN_VALUE;
      this.S = Integer.MIN_VALUE;
      this.T = Integer.MIN_VALUE;
      this.r.a($$0);
      this.u = $$0;
      if ($$0 != null) {
         this.f();
      } else {
         if (this.y != null) {
            this.y.a();
            this.y = null;
         }

         if (this.ae != null) {
            this.ae.i();
         }

         this.ae = null;
         this.x.clear();
         this.v.a(null);
         this.w.clear();
      }
   }

   public void e() {
      if (eqn.L()) {
         this.y();
      } else {
         this.z();
      }
   }

   public void f() {
      if (this.u != null) {
         this.e();
         this.u.g();
         if (this.ae == null) {
            this.ae = new fqe(this.u, this, ac.f(), this.q.ae(), this.t.a());
         } else {
            this.ae.a(this.u);
         }

         this.C = true;
         fnb.a(eqn.K());
         this.af = this.q.m.ax();
         if (this.y != null) {
            this.y.a();
         }

         this.ae.g();
         synchronized (this.x) {
            this.x.clear();
         }

         this.y = new fnw(this.ae, this.u, this.q.m.ax(), this);
         this.v.a(this.y);
         this.w.clear();
         big $$0 = this.q.al();
         if ($$0 != null) {
            this.y.a($$0.dp(), $$0.dv());
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.r();
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      if (this.Q != null) {
         this.Q.a($$0, $$1);
      }
   }

   public String g() {
      int $$0 = this.y.f.length;
      int $$1 = this.k();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.q.E ? "(s) " : "", this.af, this.ae == null ? "null" : this.ae.a());
   }

   public fqe h() {
      return this.ae;
   }

   public double i() {
      return (double)this.y.f.length;
   }

   public double j() {
      return (double)this.af;
   }

   public int k() {
      int $$0 = 0;
      ObjectListIterator var2 = this.w.iterator();

      while (var2.hasNext()) {
         fqe.b $$1 = (fqe.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ag + "/" + this.u.h() + ", B: " + this.ah + ", SD: " + this.u.m();
   }

   private void a(epy $$0, fqi $$1, boolean $$2, boolean $$3) {
      ehf $$4 = $$0.b();
      if (this.q.m.ax() != this.af) {
         this.f();
      }

      this.u.ad().a("camera");
      double $$5 = this.q.t.dp();
      double $$6 = this.q.t.dr();
      double $$7 = this.q.t.dv();
      int $$8 = hy.a($$5);
      int $$9 = hy.a($$6);
      int $$10 = hy.a($$7);
      if (this.R != $$8 || this.S != $$9 || this.T != $$10) {
         this.R = $$8;
         this.S = $$9;
         this.T = $$10;
         this.y.a($$5, $$7);
      }

      this.ae.a($$4);
      this.u.ad().b("cull");
      this.q.aG().b("culling");
      gv $$11 = $$0.c();
      double $$12 = Math.floor($$4.c / 8.0);
      double $$13 = Math.floor($$4.d / 8.0);
      double $$14 = Math.floor($$4.e / 8.0);
      if ($$12 != this.U || $$13 != this.V || $$14 != this.W) {
         this.v.a();
      }

      this.U = $$12;
      this.V = $$13;
      this.W = $$14;
      this.q.aG().b("update");
      if (!$$2) {
         boolean $$15 = this.q.E;
         if ($$3 && this.u.a_($$11).i(this.u, $$11)) {
            $$15 = false;
         }

         big.b(aro.a((double)this.q.m.ax() / 8.0, 1.0, 2.5) * this.q.m.f().c());
         this.q.aG().a("section_occlusion_graph");
         this.v.a($$15, $$0, $$1, this.w);
         this.q.aG().c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.v.b() || $$16 != this.X || $$17 != this.Y) {
            this.b(a($$1));
            this.X = $$16;
            this.Y = $$17;
         }
      }

      this.q.aG().c();
   }

   public static fqi a(fqi $$0) {
      return new fqi($$0).a(8);
   }

   private void b(fqi $$0) {
      if (!eqn.N().bm()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.q.aG().a("apply_frustum");
         this.w.clear();
         this.v.a($$0, this.w);
         this.q.aG().c();
      }
   }

   public void a(fqe.b $$0) {
      this.v.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, fqi $$5) {
      this.ak = $$5;
      Matrix4f $$6 = new Matrix4f($$1);
      $$6.mul($$0);
      $$6.invert();
      this.am.x = $$2;
      this.am.y = $$3;
      this.am.z = $$4;
      this.al[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.al[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.al[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.al[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.al[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.al[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.al[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.al[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int $$7 = 0; $$7 < 8; $$7++) {
         $$6.transform(this.al[$$7]);
         this.al[$$7].div(this.al[$$7].w());
      }
   }

   public void a(elh $$0, ehf $$1, Matrix4f $$2) {
      Matrix4f $$3 = $$0.c().a();
      double $$4 = $$1.a();
      double $$5 = $$1.b();
      double $$6 = $$1.c();
      this.ai = new fqi($$3, $$2);
      this.ai.a($$4, $$5, $$6);
   }

   public void a(elh $$0, float $$1, long $$2, boolean $$3, epy $$4, fmz $$5, fnf $$6, Matrix4f $$7) {
      RenderSystem.setShaderGameTime(this.u.V(), $$1);
      this.s.a(this.u, $$4, this.q.w);
      this.r.a(this.u, $$4, this.q.v);
      bde $$8 = this.u.ad();
      $$8.b("light_update_queue");
      this.u.b();
      $$8.b("light_updates");
      this.u.i().p().a();
      ehf $$9 = $$4.b();
      double $$10 = $$9.a();
      double $$11 = $$9.b();
      double $$12 = $$9.c();
      Matrix4f $$13 = $$0.c().a();
      $$8.b("culling");
      boolean $$14 = this.ak != null;
      fqi $$15;
      if ($$14) {
         $$15 = this.ak;
         $$15.a(this.am.x, this.am.y, this.am.z);
      } else {
         $$15 = this.ai;
      }

      this.q.aG().b("captureFrustum");
      if (this.aj) {
         this.a($$13, $$7, $$9.c, $$9.d, $$9.e, $$14 ? new fqi($$13, $$7) : $$15);
         this.aj = false;
      }

      $$8.b("clear");
      fmy.a($$4, $$1, this.q.s, this.q.m.ax(), $$5.b($$1));
      fmy.b();
      RenderSystem.clear(16640, eqn.a);
      float $$17 = $$5.l();
      boolean $$18 = this.q.s.d().a(aro.a($$10), aro.a($$11)) || this.q.l.j().d();
      $$8.b("sky");
      RenderSystem.setShader(fmz::p);
      this.a($$0, $$7, $$1, $$4, $$18, () -> fmy.a($$4, fmy.d.a, $$17, $$18, $$1));
      $$8.b("fog");
      fmy.a($$4, fmy.d.b, Math.max($$17, 32.0F), $$18, $$1);
      $$8.b("terrain_setup");
      this.a($$4, $$15, $$14, this.q.t.G_());
      $$8.b("compile_sections");
      this.c($$4);
      $$8.b("terrain");
      this.a(fno.c(), $$0, $$10, $$11, $$12, $$7);
      this.a(fno.d(), $$0, $$10, $$11, $$12, $$7);
      this.a(fno.e(), $$0, $$10, $$11, $$12, $$7);
      if (this.u.d().e()) {
         ekd.a($$0.c().a());
      } else {
         ekd.b($$0.c().a());
      }

      $$8.b("entities");
      this.ag = 0;
      this.ah = 0;
      if (this.M != null) {
         this.M.b(eqn.a);
         this.M.a(this.q.f());
         this.q.f().a(false);
      }

      if (this.O != null) {
         this.O.b(eqn.a);
      }

      if (this.d()) {
         this.J.b(eqn.a);
         this.q.f().a(false);
      }

      boolean $$19 = false;
      fng.a $$20 = this.t.b();

      for (big $$21 : this.u.e()) {
         if (this.r.a($$21, $$15, $$10, $$11, $$12) || $$21.z(this.q.t)) {
            gv $$22 = $$21.dk();
            if ((this.u.d($$22.v()) || this.a($$22))
               && ($$21 != $$4.g() || $$4.i() || $$4.g() instanceof biw && ((biw)$$4.g()).fB())
               && (!($$21 instanceof fmi) || $$4.g() == $$21)) {
               this.ag++;
               if ($$21.ah == 0) {
                  $$21.ac = $$21.dp();
                  $$21.ad = $$21.dr();
                  $$21.ae = $$21.dv();
               }

               fng $$24;
               if (this.d() && this.q.b($$21)) {
                  $$19 = true;
                  fnh $$23 = this.t.d();
                  $$24 = $$23;
                  int $$25 = $$21.c_();
                  $$23.a(aqy.b.b($$25), aqy.b.c($$25), aqy.b.d($$25), 255);
               } else {
                  $$24 = $$20;
               }

               this.a($$21, $$10, $$11, $$12, $$1, $$0, $$24);
            }
         }
      }

      $$20.a();
      this.a($$0);
      $$20.a(fno.b(fyf.e));
      $$20.a(fno.c(fyf.e));
      $$20.a(fno.d(fyf.e));
      $$20.a(fno.j(fyf.e));
      $$8.b("blockentities");
      ObjectListIterator var39 = this.w.iterator();

      while (var39.hasNext()) {
         fqe.b $$27 = (fqe.b)var39.next();
         List<dck> $$28 = $$27.d().b();
         if (!$$28.isEmpty()) {
            for (dck $$29 : $$28) {
               gv $$30 = $$29.p();
               fng $$31 = $$20;
               $$0.a();
               $$0.a((double)$$30.u() - $$10, (double)$$30.v() - $$11, (double)$$30.w() - $$12);
               SortedSet<ajq> $$32 = (SortedSet<ajq>)this.H.get($$30.a());
               if ($$32 != null && !$$32.isEmpty()) {
                  int $$33 = $$32.last().c();
                  if ($$33 >= 0) {
                     elh.a $$34 = $$0.c();
                     ell $$35 = new eli(this.t.c().getBuffer(gam.l.get($$33)), $$34.a(), $$34.b(), 1.0F);
                     $$31 = $$2x -> {
                        ell $$3x = $$20.getBuffer($$2x);
                        return $$2x.M() ? elo.a($$35, $$3x) : $$3x;
                     };
                  }
               }

               this.s.a($$29, $$1, $$0, $$31);
               $$0.b();
            }
         }
      }

      synchronized (this.x) {
         for (dck $$36 : this.x) {
            gv $$37 = $$36.p();
            $$0.a();
            $$0.a((double)$$37.u() - $$10, (double)$$37.v() - $$11, (double)$$37.w() - $$12);
            this.s.a($$36, $$1, $$0, $$20);
            $$0.b();
         }
      }

      this.a($$0);
      $$20.a(fno.c());
      $$20.a(fno.v());
      $$20.a(fno.w());
      $$20.a(fnu.i());
      $$20.a(fnu.j());
      $$20.a(fnu.c());
      $$20.a(fnu.d());
      $$20.a(fnu.e());
      $$20.a(fnu.f());
      $$20.a(fnu.g());
      this.t.d().a();
      if ($$19) {
         this.K.a($$1);
         this.q.f().a(false);
      }

      $$8.b("destroyProgress");
      ObjectIterator var41 = this.H.long2ObjectEntrySet().iterator();

      while (var41.hasNext()) {
         Entry<SortedSet<ajq>> $$38 = (Entry<SortedSet<ajq>>)var41.next();
         gv $$39 = gv.d($$38.getLongKey());
         double $$40 = (double)$$39.u() - $$10;
         double $$41 = (double)$$39.v() - $$11;
         double $$42 = (double)$$39.w() - $$12;
         if (!($$40 * $$40 + $$41 * $$41 + $$42 * $$42 > 1024.0)) {
            SortedSet<ajq> $$43 = (SortedSet<ajq>)$$38.getValue();
            if ($$43 != null && !$$43.isEmpty()) {
               int $$44 = $$43.last().c();
               $$0.a();
               $$0.a((double)$$39.u() - $$10, (double)$$39.v() - $$11, (double)$$39.w() - $$12);
               elh.a $$45 = $$0.c();
               ell $$46 = new eli(this.t.c().getBuffer(gam.l.get($$44)), $$45.a(), $$45.b(), 1.0F);
               this.q.am().a(this.u.a_($$39), $$39, this.u, $$0, $$46);
               $$0.b();
            }
         }
      }

      this.a($$0);
      ehd $$47 = this.q.w;
      if ($$3 && $$47 != null && $$47.c() == ehd.a.b) {
         $$8.b("outline");
         gv $$48 = ((ehb)$$47).a();
         dey $$49 = this.u.a_($$48);
         if (!$$49.i() && this.u.w_().a($$48)) {
            ell $$50 = $$20.getBuffer(fno.x());
            this.a($$0, $$50, $$4.g(), $$10, $$11, $$12, $$48, $$49);
         }
      }

      this.q.k.a($$0, $$20, $$10, $$11, $$12);
      $$20.a();
      elh $$51 = RenderSystem.getModelViewStack();
      RenderSystem.applyModelViewMatrix();
      $$20.a(fnu.l());
      $$20.a(fnu.a());
      $$20.a(fnu.b());
      $$20.a(fno.k());
      $$20.a(fno.l());
      $$20.a(fno.n());
      $$20.a(fno.o());
      $$20.a(fno.m());
      $$20.a(fno.p());
      $$20.a(fno.q());
      $$20.a(fno.j());
      this.t.c().b();
      if (this.Q != null) {
         $$20.a(fno.x());
         $$20.b();
         this.L.b(eqn.a);
         this.L.a(this.q.f());
         $$8.b("translucent");
         this.a(fno.f(), $$0, $$10, $$11, $$12, $$7);
         $$8.b("string");
         this.a(fno.u(), $$0, $$10, $$11, $$12, $$7);
         this.N.b(eqn.a);
         this.N.a(this.q.f());
         fnn.aL.a();
         $$8.b("particles");
         this.q.g.a($$0, $$20, $$6, $$4, $$1);
         fnn.aL.b();
      } else {
         $$8.b("translucent");
         if (this.L != null) {
            this.L.b(eqn.a);
         }

         this.a(fno.f(), $$0, $$10, $$11, $$12, $$7);
         $$20.a(fno.x());
         $$20.b();
         $$8.b("string");
         this.a(fno.u(), $$0, $$10, $$11, $$12, $$7);
         $$8.b("particles");
         this.q.g.a($$0, $$20, $$6, $$4, $$1);
      }

      $$51.a();
      $$51.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();
      if (this.q.m.as() != eqb.a) {
         if (this.Q != null) {
            this.P.b(eqn.a);
            fnn.aN.a();
            $$8.b("clouds");
            this.a($$0, $$7, $$1, $$10, $$11, $$12);
            fnn.aN.b();
         } else {
            $$8.b("clouds");
            RenderSystem.setShader(fmz::x);
            this.a($$0, $$7, $$1, $$10, $$11, $$12);
         }
      }

      if (this.Q != null) {
         fnn.aM.a();
         $$8.b("weather");
         this.a($$6, $$1, $$10, $$11, $$12);
         this.d($$4);
         fnn.aM.b();
         this.Q.a($$1);
         this.q.f().a(false);
      } else {
         RenderSystem.depthMask(false);
         $$8.b("weather");
         this.a($$6, $$1, $$10, $$11, $$12);
         this.d($$4);
         RenderSystem.depthMask(true);
      }

      $$51.b();
      RenderSystem.applyModelViewMatrix();
      this.a($$0, $$20, $$4);
      $$20.a();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      fmy.a();
   }

   private void a(elh $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(big $$0, double $$1, double $$2, double $$3, float $$4, elh $$5, fng $$6) {
      double $$7 = aro.d((double)$$4, $$0.ac, $$0.dp());
      double $$8 = aro.d((double)$$4, $$0.ad, $$0.dr());
      double $$9 = aro.d((double)$$4, $$0.ae, $$0.dv());
      float $$10 = aro.i($$4, $$0.N, $$0.dA());
      this.r.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.r.a($$0, $$4));
   }

   private void a(fno $$0, elh $$1, double $$2, double $$3, double $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == fno.f()) {
         this.q.aG().a("translucent_sort");
         double $$6 = $$2 - this.an;
         double $$7 = $$3 - this.ao;
         double $$8 = $$4 - this.ap;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = hy.a($$2);
            int $$10 = hy.a($$3);
            int $$11 = hy.a($$4);
            boolean $$12 = $$9 != hy.a(this.an) || $$11 != hy.a(this.ap) || $$10 != hy.a(this.ao);
            this.an = $$2;
            this.ao = $$3;
            this.ap = $$4;
            int $$13 = 0;
            ObjectListIterator var21 = this.w.iterator();

            while (var21.hasNext()) {
               fqe.b $$14 = (fqe.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ae)) {
                  $$13++;
               }
            }
         }

         this.q.aG().c();
      }

      this.q.aG().a("filterempty");
      this.q.aG().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != fno.f();
      ObjectListIterator<fqe.b> $$16 = this.w.listIterator($$15 ? 0 : this.w.size());
      fnt $$17 = RenderSystem.getShader();

      for (int $$18 = 0; $$18 < 12; $$18++) {
         int $$19 = RenderSystem.getShaderTexture($$18);
         $$17.a("Sampler" + $$18, $$19);
      }

      if ($$17.b != null) {
         $$17.b.a($$1.c().a());
      }

      if ($$17.c != null) {
         $$17.c.a($$5);
      }

      if ($$17.g != null) {
         $$17.g.a(RenderSystem.getShaderColor());
      }

      if ($$17.j != null) {
         $$17.j.a(RenderSystem.getShaderGlintAlpha());
      }

      if ($$17.k != null) {
         $$17.k.a(RenderSystem.getShaderFogStart());
      }

      if ($$17.l != null) {
         $$17.l.a(RenderSystem.getShaderFogEnd());
      }

      if ($$17.m != null) {
         $$17.m.a(RenderSystem.getShaderFogColor());
      }

      if ($$17.n != null) {
         $$17.n.a(RenderSystem.getShaderFogShape().a());
      }

      if ($$17.e != null) {
         $$17.e.a(RenderSystem.getTextureMatrix());
      }

      if ($$17.p != null) {
         $$17.p.a(RenderSystem.getShaderGameTime());
      }

      RenderSystem.setupShaderLights($$17);
      $$17.g();
      eky $$20 = $$17.q;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         fqe.b $$21 = $$15 ? (fqe.b)$$16.next() : (fqe.b)$$16.previous();
         if (!$$21.d().a($$0)) {
            elk $$22 = $$21.a($$0);
            gv $$23 = $$21.f();
            if ($$20 != null) {
               $$20.a((float)((double)$$23.u() - $$2), (float)((double)$$23.v() - $$3), (float)((double)$$23.w() - $$4));
               $$20.b();
            }

            $$22.a();
            $$22.c();
         }
      }

      if ($$20 != null) {
         $$20.a(0.0F, 0.0F, 0.0F);
      }

      $$17.f();
      elk.b();
      this.q.aG().c();
      $$0.b();
   }

   private void a(elh $$0, fng $$1, epy $$2) {
      if (this.q.C || this.q.D) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.w.iterator();

         while (var10.hasNext()) {
            fqe.b $$6 = (fqe.b)var10.next();
            fns.d $$7 = this.v.b($$6);
            if ($$7 != null) {
               gv $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.q.C) {
                  ell $$10 = $$1.getBuffer(fno.x());
                  int $$11 = $$7.b == 0 ? 0 : aro.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < c.length; $$15++) {
                     if ($$7.a($$15)) {
                        hb $$16 = c[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                           .e();
                     }
                  }
               }

               if (this.q.D && !$$6.d().a()) {
                  ell $$17 = $$1.getBuffer(fno.x());
                  int $$18 = 0;

                  for (hb $$19 : c) {
                     for (hb $$20 : c) {
                        boolean $$21 = $$6.d().a($$19, $$20);
                        if (!$$21) {
                           $$18++;
                           $$17.a($$9, (float)(8 + 8 * $$19.j()), (float)(8 + 8 * $$19.k()), (float)(8 + 8 * $$19.l()))
                              .a(255, 0, 0, 255)
                              .a((float)$$19.j(), (float)$$19.k(), (float)$$19.l())
                              .e();
                           $$17.a($$9, (float)(8 + 8 * $$20.j()), (float)(8 + 8 * $$20.k()), (float)(8 + 8 * $$20.l()))
                              .a(255, 0, 0, 255)
                              .a((float)$$20.j(), (float)$$20.k(), (float)$$20.l())
                              .e();
                        }
                     }
                  }

                  if ($$18 > 0) {
                     ell $$22 = $$1.getBuffer(fno.A());
                     float $$23 = 0.5F;
                     float $$24 = 0.2F;
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                  }
               }

               $$0.b();
            }
         }
      }

      if (this.ak != null) {
         $$0.a();
         $$0.a((float)(this.am.x - $$2.b().c), (float)(this.am.y - $$2.b().d), (float)(this.am.z - $$2.b().e));
         Matrix4f $$25 = $$0.c().a();
         ell $$26 = $$1.getBuffer(fno.A());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         ell $$27 = $$1.getBuffer(fno.x());
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 7);
         this.a($$27, $$25, 7);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 7);
         $$0.b();
      }
   }

   private void a(ell $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(ell $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      float $$9 = 0.25F;
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$3].x(), this.al[$$3].y(), this.al[$$3].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$4].x(), this.al[$$4].y(), this.al[$$4].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$5].x(), this.al[$$5].y(), this.al[$$5].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
   }

   public void m() {
      this.aj = true;
   }

   public void n() {
      this.ak = null;
   }

   public void o() {
      this.F++;
      if (this.F % 20 == 0) {
         Iterator<ajq> $$0 = this.G.values().iterator();

         while ($$0.hasNext()) {
            ajq $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.F - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(ajq $$0) {
      long $$1 = $$0.b().a();
      Set<ajq> $$2 = (Set<ajq>)this.H.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.H.remove($$1);
      }
   }

   private void b(elh $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(fmz::t);
      RenderSystem.setShaderTexture(0, m);
      elj $$1 = elj.a();
      elc $$2 = $$1.c();

      for (int $$3 = 0; $$3 < 6; $$3++) {
         $$0.a();
         if ($$3 == 1) {
            $$0.a(a.b.rotationDegrees(90.0F));
         }

         if ($$3 == 2) {
            $$0.a(a.b.rotationDegrees(-90.0F));
         }

         if ($$3 == 3) {
            $$0.a(a.b.rotationDegrees(180.0F));
         }

         if ($$3 == 4) {
            $$0.a(a.f.rotationDegrees(90.0F));
         }

         if ($$3 == 5) {
            $$0.a(a.f.rotationDegrees(-90.0F));
         }

         Matrix4f $$4 = $$0.c().a();
         $$2.a(elm.b.h, elf.s);
         $$2.a($$4, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(40, 40, 40, 255).e();
         $$1.b();
         $$0.b();
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   public void a(elh $$0, Matrix4f $$1, float $$2, epy $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         ead $$6 = $$3.k();
         if ($$6 != ead.c && $$6 != ead.a && !this.b($$3)) {
            if (this.q.s.d().c() == fmv.d.c) {
               this.b($$0);
            } else if (this.q.s.d().c() == fmv.d.b) {
               ehf $$7 = this.u.a(this.q.j.m().b(), $$2);
               float $$8 = (float)$$7.c;
               float $$9 = (float)$$7.d;
               float $$10 = (float)$$7.e;
               fmy.b();
               elc $$11 = elj.a().c();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$8, $$9, $$10, 1.0F);
               fnt $$12 = RenderSystem.getShader();
               this.A.a();
               this.A.a($$0.c().a(), $$1, $$12);
               elk.b();
               RenderSystem.enableBlend();
               float[] $$13 = this.u.d().a(this.u.f($$2), $$2);
               if ($$13 != null) {
                  RenderSystem.setShader(fmz::q);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$0.a();
                  $$0.a(a.b.rotationDegrees(90.0F));
                  float $$14 = aro.a(this.u.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$0.a(a.f.rotationDegrees($$14));
                  $$0.a(a.f.rotationDegrees(90.0F));
                  float $$15 = $$13[0];
                  float $$16 = $$13[1];
                  float $$17 = $$13[2];
                  Matrix4f $$18 = $$0.c().a();
                  $$11.a(elm.b.g, elf.n);
                  $$11.a($$18, 0.0F, 100.0F, 0.0F).a($$15, $$16, $$17, $$13[3]).e();
                  int $$19 = 16;

                  for (int $$20 = 0; $$20 <= 16; $$20++) {
                     float $$21 = (float)$$20 * (float) (Math.PI * 2) / 16.0F;
                     float $$22 = aro.a($$21);
                     float $$23 = aro.b($$21);
                     $$11.a($$18, $$22 * 120.0F, $$23 * 120.0F, -$$23 * 40.0F * $$13[3]).a($$13[0], $$13[1], $$13[2], 0.0F).e();
                  }

                  eld.a($$11.d());
                  $$0.b();
               }

               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
               );
               $$0.a();
               float $$24 = 1.0F - this.u.d($$2);
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$24);
               $$0.a(a.d.rotationDegrees(-90.0F));
               $$0.a(a.b.rotationDegrees(this.u.f($$2) * 360.0F));
               Matrix4f $$25 = $$0.c().a();
               float $$26 = 30.0F;
               RenderSystem.setShader(fmz::s);
               RenderSystem.setShaderTexture(0, k);
               $$11.a(elm.b.h, elf.q);
               $$11.a($$25, -$$26, 100.0F, -$$26).a(0.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, -$$26).a(1.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, $$26).a(1.0F, 1.0F).e();
               $$11.a($$25, -$$26, 100.0F, $$26).a(0.0F, 1.0F).e();
               eld.a($$11.d());
               $$26 = 20.0F;
               RenderSystem.setShaderTexture(0, j);
               int $$27 = this.u.ao();
               int $$28 = $$27 % 4;
               int $$29 = $$27 / 4 % 2;
               float $$30 = (float)($$28 + 0) / 4.0F;
               float $$31 = (float)($$29 + 0) / 2.0F;
               float $$32 = (float)($$28 + 1) / 4.0F;
               float $$33 = (float)($$29 + 1) / 2.0F;
               $$11.a(elm.b.h, elf.q);
               $$11.a($$25, -$$26, -100.0F, $$26).a($$32, $$33).e();
               $$11.a($$25, $$26, -100.0F, $$26).a($$30, $$33).e();
               $$11.a($$25, $$26, -100.0F, -$$26).a($$30, $$31).e();
               $$11.a($$25, -$$26, -100.0F, -$$26).a($$32, $$31).e();
               eld.a($$11.d());
               float $$34 = this.u.i($$2) * $$24;
               if ($$34 > 0.0F) {
                  RenderSystem.setShaderColor($$34, $$34, $$34, $$34);
                  fmy.a();
                  this.z.a();
                  this.z.a($$0.c().a(), $$1, fmz.p());
                  elk.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$0.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$35 = this.q.t.j($$2).d - this.u.k().a(this.u);
               if ($$35 < 0.0) {
                  $$0.a();
                  $$0.a(0.0F, 12.0F, 0.0F);
                  this.B.a();
                  this.B.a($$0.c().a(), $$1, $$12);
                  elk.b();
                  $$0.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(epy $$0) {
      return !($$0.g() instanceof biw $$1) ? false : $$1.a(bhv.o) || $$1.a(bhv.G);
   }

   public void a(elh $$0, Matrix4f $$1, float $$2, double $$3, double $$4, double $$5) {
      float $$6 = this.u.d().a();
      if (!Float.isNaN($$6)) {
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ONE,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
         );
         RenderSystem.depthMask(true);
         float $$7 = 12.0F;
         float $$8 = 4.0F;
         double $$9 = 2.0E-4;
         double $$10 = (double)(((float)this.F + $$2) * 0.03F);
         double $$11 = ($$3 + $$10) / 12.0;
         double $$12 = (double)($$6 - (float)$$4 + 0.33F);
         double $$13 = $$5 / 12.0 + 0.33F;
         $$11 -= (double)(aro.a($$11 / 2048.0) * 2048);
         $$13 -= (double)(aro.a($$13 / 2048.0) * 2048);
         float $$14 = (float)($$11 - (double)aro.a($$11));
         float $$15 = (float)($$12 / 4.0 - (double)aro.a($$12 / 4.0)) * 4.0F;
         float $$16 = (float)($$13 - (double)aro.a($$13));
         ehf $$17 = this.u.h($$2);
         int $$18 = (int)Math.floor($$11);
         int $$19 = (int)Math.floor($$12 / 4.0);
         int $$20 = (int)Math.floor($$13);
         if ($$18 != this.Z || $$19 != this.aa || $$20 != this.ab || this.q.m.as() != this.ad || this.ac.g($$17) > 2.0E-4) {
            this.Z = $$18;
            this.aa = $$19;
            this.ab = $$20;
            this.ac = $$17;
            this.ad = this.q.m.as();
            this.C = true;
         }

         if (this.C) {
            this.C = false;
            elc $$21 = elj.a().c();
            if (this.D != null) {
               this.D.close();
            }

            this.D = new elk(elk.a.a);
            elc.b $$22 = this.a($$21, $$11, $$12, $$13, $$17);
            this.D.a();
            this.D.a($$22);
            elk.b();
         }

         RenderSystem.setShader(fmz::x);
         RenderSystem.setShaderTexture(0, l);
         fmy.b();
         $$0.a();
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$14, $$15, -$$16);
         if (this.D != null) {
            this.D.a();
            int $$23 = this.ad == eqb.c ? 0 : 1;

            for (int $$24 = $$23; $$24 < 2; $$24++) {
               if ($$24 == 0) {
                  RenderSystem.colorMask(false, false, false, false);
               } else {
                  RenderSystem.colorMask(true, true, true, true);
               }

               fnt $$25 = RenderSystem.getShader();
               this.D.a($$0.c().a(), $$1, $$25);
            }

            elk.b();
         }

         $$0.b();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   private elc.b a(elc $$0, double $$1, double $$2, double $$3, ehf $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)aro.a($$1) * 0.00390625F;
      float $$11 = (float)aro.a($$3) * 0.00390625F;
      float $$12 = (float)$$4.c;
      float $$13 = (float)$$4.d;
      float $$14 = (float)$$4.e;
      float $$15 = $$12 * 0.9F;
      float $$16 = $$13 * 0.9F;
      float $$17 = $$14 * 0.9F;
      float $$18 = $$12 * 0.7F;
      float $$19 = $$13 * 0.7F;
      float $$20 = $$14 * 0.7F;
      float $$21 = $$12 * 0.8F;
      float $$22 = $$13 * 0.8F;
      float $$23 = $$14 * 0.8F;
      RenderSystem.setShader(fmz::x);
      $$0.a(elm.b.h, elf.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.ad == eqb.c) {
         for (int $$25 = -3; $$25 <= 4; $$25++) {
            for (int $$26 = -3; $$26 <= 4; $$26++) {
               float $$27 = (float)($$25 * 8);
               float $$28 = (float)($$26 * 8);
               if ($$24 > -5.0F) {
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
               }

               if ($$24 <= 5.0F) {
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 8.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 8.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 0.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 0.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
               }

               if ($$25 > -1) {
                  for (int $$29 = 0; $$29 < 8; $$29++) {
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                  }
               }

               if ($$25 <= 1) {
                  for (int $$30 = 0; $$30 < 8; $$30++) {
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 4.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 4.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                  }
               }

               if ($$26 > -1) {
                  for (int $$31 = 0; $$31 < 8; $$31++) {
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                  }
               }

               if ($$26 <= 1) {
                  for (int $$32 = 0; $$32 < 8; $$32++) {
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                  }
               }
            }
         }
      } else {
         int $$33 = 1;
         int $$34 = 32;

         for (int $$35 = -32; $$35 < 32; $$35 += 32) {
            for (int $$36 = -32; $$36 < 32; $$36 += 32) {
               $$0.a((double)($$35 + 0), (double)$$24, (double)($$36 + 32))
                  .a((float)($$35 + 0) * 0.00390625F + $$10, (float)($$36 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 32), (double)$$24, (double)($$36 + 32))
                  .a((float)($$35 + 32) * 0.00390625F + $$10, (float)($$36 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 32), (double)$$24, (double)($$36 + 0))
                  .a((float)($$35 + 32) * 0.00390625F + $$10, (float)($$36 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 0), (double)$$24, (double)($$36 + 0))
                  .a((float)($$35 + 0) * 0.00390625F + $$10, (float)($$36 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
            }
         }
      }

      return $$0.d();
   }

   private void c(epy $$0) {
      this.q.aG().a("populate_sections_to_compile");
      dzq $$1 = this.u.s_();
      fqd $$2 = new fqd();
      gv $$3 = $$0.c();
      List<fqe.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.w.iterator();

      while (var6.hasNext()) {
         fqe.b $$5 = (fqe.b)var6.next();
         hy $$6 = hy.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.q.m.k().c() == equ.c) {
               gv $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.q.m.k().c() == equ.b) {
               $$7 = $$5.i();
            }

            if ($$7) {
               this.q.aG().a("build_near_sync");
               this.ae.a($$5, $$2);
               $$5.g();
               this.q.aG().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.q.aG().b("upload");
      this.ae.f();
      this.q.aG().b("schedule_async_compile");

      for (fqe.b $$9 : $$4) {
         $$9.a(this.ae, $$2);
         $$9.g();
      }

      this.q.aG().c();
   }

   private void d(epy $$0) {
      elc $$1 = elj.a().c();
      dgp $$2 = this.u.w_();
      double $$3 = (double)(this.q.m.ax() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = aro.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.q.j.h();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, n);
         RenderSystem.depthMask(eqn.L());
         elh $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         RenderSystem.applyModelViewMatrix();
         int $$9 = $$2.d().a();
         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$10, $$11, $$12, (float)$$4);
         RenderSystem.setShader(fmz::s);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$13 = (float)(ac.b() % 3000L) / 3000.0F;
         float $$14 = (float)(-aro.e($$0.b().d * 0.5));
         float $$15 = $$14 + (float)$$7;
         $$1.a(elm.b.h, elf.q);
         double $$16 = Math.max((double)aro.a($$6 - $$3), $$2.f());
         double $$17 = Math.min((double)aro.c($$6 + $$3), $$2.h());
         float $$18 = (float)(aro.a($$16) & 1) * 0.5F;
         if ($$5 > $$2.g() - $$3) {
            float $$19 = $$18;

            for (double $$20 = $$16; $$20 < $$17; $$19 += 0.5F) {
               double $$21 = Math.min(1.0, $$17 - $$20);
               float $$22 = (float)$$21 * 0.5F;
               $$1.a($$2.g() - $$5, -$$7, $$20 - $$6).a($$13 - $$19, $$13 + $$15).e();
               $$1.a($$2.g() - $$5, -$$7, $$20 + $$21 - $$6).a($$13 - ($$22 + $$19), $$13 + $$15).e();
               $$1.a($$2.g() - $$5, $$7, $$20 + $$21 - $$6).a($$13 - ($$22 + $$19), $$13 + $$14).e();
               $$1.a($$2.g() - $$5, $$7, $$20 - $$6).a($$13 - $$19, $$13 + $$14).e();
               $$20++;
            }
         }

         if ($$5 < $$2.e() + $$3) {
            float $$23 = $$18;

            for (double $$24 = $$16; $$24 < $$17; $$23 += 0.5F) {
               double $$25 = Math.min(1.0, $$17 - $$24);
               float $$26 = (float)$$25 * 0.5F;
               $$1.a($$2.e() - $$5, -$$7, $$24 - $$6).a($$13 + $$23, $$13 + $$15).e();
               $$1.a($$2.e() - $$5, -$$7, $$24 + $$25 - $$6).a($$13 + $$26 + $$23, $$13 + $$15).e();
               $$1.a($$2.e() - $$5, $$7, $$24 + $$25 - $$6).a($$13 + $$26 + $$23, $$13 + $$14).e();
               $$1.a($$2.e() - $$5, $$7, $$24 - $$6).a($$13 + $$23, $$13 + $$14).e();
               $$24++;
            }
         }

         $$16 = Math.max((double)aro.a($$5 - $$3), $$2.e());
         $$17 = Math.min((double)aro.c($$5 + $$3), $$2.g());
         $$18 = (float)(aro.a($$16) & 1) * 0.5F;
         if ($$6 > $$2.h() - $$3) {
            float $$27 = $$18;

            for (double $$28 = $$16; $$28 < $$17; $$27 += 0.5F) {
               double $$29 = Math.min(1.0, $$17 - $$28);
               float $$30 = (float)$$29 * 0.5F;
               $$1.a($$28 - $$5, -$$7, $$2.h() - $$6).a($$13 + $$27, $$13 + $$15).e();
               $$1.a($$28 + $$29 - $$5, -$$7, $$2.h() - $$6).a($$13 + $$30 + $$27, $$13 + $$15).e();
               $$1.a($$28 + $$29 - $$5, $$7, $$2.h() - $$6).a($$13 + $$30 + $$27, $$13 + $$14).e();
               $$1.a($$28 - $$5, $$7, $$2.h() - $$6).a($$13 + $$27, $$13 + $$14).e();
               $$28++;
            }
         }

         if ($$6 < $$2.f() + $$3) {
            float $$31 = $$18;

            for (double $$32 = $$16; $$32 < $$17; $$31 += 0.5F) {
               double $$33 = Math.min(1.0, $$17 - $$32);
               float $$34 = (float)$$33 * 0.5F;
               $$1.a($$32 - $$5, -$$7, $$2.f() - $$6).a($$13 - $$31, $$13 + $$15).e();
               $$1.a($$32 + $$33 - $$5, -$$7, $$2.f() - $$6).a($$13 - ($$34 + $$31), $$13 + $$15).e();
               $$1.a($$32 + $$33 - $$5, $$7, $$2.f() - $$6).a($$13 - ($$34 + $$31), $$13 + $$14).e();
               $$1.a($$32 - $$5, $$7, $$2.f() - $$6).a($$13 - $$31, $$13 + $$14).e();
               $$32++;
            }
         }

         eld.a($$1.d());
         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         $$8.b();
         RenderSystem.applyModelViewMatrix();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(elh $$0, ell $$1, big $$2, double $$3, double $$4, double $$5, gv $$6, dey $$7) {
      a($$0, $$1, $$7.a(this.u, $$6, ehk.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static ehf a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(aro.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ehf(1.0, (double)$$3, 0.0);
         case 1 -> new ehf((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ehf(0.0, 1.0, (double)$$3);
         case 3 -> new ehf(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ehf((double)$$3, 0.0, 1.0);
         case 5 -> new ehf(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ehf a(float $$0, float $$1, float $$2, float $$3) {
      ehf $$4 = a($$3).a((double)$$0);
      ehf $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      ehf $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      ehf $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new ehf($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(elh $$0, ell $$1, ehy $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<eha> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, ehv.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            eha $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ehf $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, ehv.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(elh $$0, ell $$1, ehy $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      elh.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = aro.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10.a(), (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
         $$1.a($$10.a(), (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
      });
   }

   public static void a(ell $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new elh(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(elh $$0, ell $$1, eha $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(elh $$0, ell $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      elh $$0,
      ell $$1,
      double $$2,
      double $$3,
      double $$4,
      double $$5,
      double $$6,
      double $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14
   ) {
      Matrix4f $$15 = $$0.c().a();
      Matrix3f $$16 = $$0.c().b();
      float $$17 = (float)$$2;
      float $$18 = (float)$$3;
      float $$19 = (float)$$4;
      float $$20 = (float)$$5;
      float $$21 = (float)$$6;
      float $$22 = (float)$$7;
      $$1.a($$15, $$17, $$18, $$19).a($$8, $$13, $$14, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$13, $$14, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$19).a($$12, $$9, $$14, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$12, $$9, $$14, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$19).a($$12, $$13, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$12, $$13, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
   }

   public static void b(elh $$0, ell $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elh $$0, ell $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
      Matrix4f $$12 = $$0.c().a();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
   }

   public void a(coq $$0, gv $$1, dey $$2, dey $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(gv $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(hy.a($$3), hy.a($$4), hy.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(hy.a($$7), hy.a($$8), hy.a($$6));
            }
         }
      }
   }

   public void a(gv $$0, dey $$1, dey $$2) {
      if (this.q.aC().a($$1, $$2)) {
         this.a($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      for (int $$3 = $$2 - 1; $$3 <= $$2 + 1; $$3++) {
         for (int $$4 = $$0 - 1; $$4 <= $$0 + 1; $$4++) {
            for (int $$5 = $$1 - 1; $$5 <= $$1 + 1; $$5++) {
               this.b($$4, $$5, $$3);
            }
         }
      }
   }

   public void b(int $$0, int $$1, int $$2) {
      this.a($$0, $$1, $$2, false);
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.y.a($$0, $$1, $$2, $$3);
   }

   public void a(@Nullable aot $$0, gv $$1) {
      gbo $$2 = this.I.get($$1);
      if ($$2 != null) {
         this.q.ah().b($$2);
         this.I.remove($$1);
      }

      if ($$0 != null) {
         cjo $$3 = cjo.a($$0);
         if ($$3 != null) {
            this.q.l.a($$3.i());
         }

         gbo var5 = gbj.a($$0, ehf.b($$1));
         this.I.put($$1, var5);
         this.q.ah().a(var5);
      }

      this.a(this.u, $$1, $$0 != null);
   }

   private void a(cpk $$0, gv $$1, boolean $$2) {
      for (biw $$4 : $$0.a(biw.class, new eha($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(iu $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(iu $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", jc.k.b($$0.b()));
         $$11.a("Parameters", $$0.a());
         $$11.a("Position", () -> p.a(this.u, $$3, $$4, $$5));
         throw new y($$10);
      }
   }

   private <T extends iu> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private fkw b(iu $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private fkw b(iu $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      epy $$9 = this.q.j.m();
      eqs $$10 = this.a($$2);
      if ($$1) {
         return this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == eqs.c ? null : this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private eqs a(boolean $$0) {
      eqs $$1 = this.q.m.am().c();
      if ($$0 && $$1 == eqs.c && this.u.z.a(10) == 0) {
         $$1 = eqs.b;
      }

      if ($$1 == eqs.b && this.u.z.a(3) == 0) {
         $$1 = eqs.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, gv $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            epy $$3 = this.q.j.m();
            if ($$3.h()) {
               double $$4 = (double)$$1.u() - $$3.b().c;
               double $$5 = (double)$$1.v() - $$3.b().d;
               double $$6 = (double)$$1.w() - $$3.b().e;
               double $$7 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
               double $$8 = $$3.b().c;
               double $$9 = $$3.b().d;
               double $$10 = $$3.b().e;
               if ($$7 > 0.0) {
                  $$8 += $$4 / $$7 * 2.0;
                  $$9 += $$5 / $$7 * 2.0;
                  $$10 += $$6 / $$7 * 2.0;
               }

               if ($$0 == 1023) {
                  this.u.a($$8, $$9, $$10, aou.Ai, aov.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.u.a($$8, $$9, $$10, aou.hp, aov.f, 1.0F, 1.0F, false);
               } else {
                  this.u.a($$8, $$9, $$10, aou.gU, aov.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, gv $$1, int $$2) {
      art $$3 = this.u.z;
      switch ($$0) {
         case 1000:
            this.u.a($$1, aou.fM, aov.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.u.a($$1, aou.fN, aov.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.u.a($$1, aou.fO, aov.e, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.u.a($$1, aou.hb, aov.g, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.u.a($$1, aou.hJ, aov.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.u.a($$1, aou.hN, aov.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.u.a($$1, aou.iY, aov.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (cir.b($$2) instanceof cjo $$87) {
               this.a($$87.x(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.u.a($$1, aou.ji, aov.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.u.a($$1, aou.jh, aov.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.u.a($$1, aou.gZ, aov.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.u.a($$1, aou.bV, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.u.a($$1, aou.AR, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.u.a($$1, aou.AS, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.u.a($$1, aou.AT, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.u.a($$1, aou.Aa, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.u.a($$1, aou.Ad, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.u.a($$1, aou.bu, aov.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.u.a($$1, aou.Bb, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.u.a($$1, aou.Bi, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.u.a($$1, aou.V, aov.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.u.a($$1, aou.ab, aov.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.u.a($$1, aou.Y, aov.e, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.q.ah().a(gbj.b(aou.sV, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.u.a($$1, aou.ez, aov.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.u.a($$1, aou.ey, aov.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.u.a($$1, aou.ck, aov.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.u.a($$1, aou.rJ, aov.f, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.u.a($$1, aou.AU, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.u.a($$1, aou.ly, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.u.a($$1, aou.kh, aov.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.u.a($$1, aou.ce, aov.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.u.a($$1, aou.ww, aov.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.u.a($$1, aou.gp, aov.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.u.a($$1, aou.gs, aov.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.u.a($$1, aou.gt, aov.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.u.a($$1, aou.vp, aov.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1500:
            ctt.a(this.u, $$1, $$2 > 0);
            break;
         case 1501:
            this.u.a($$1, aou.mo, aov.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$70 = 0; $$70 < 8; $$70++) {
               this.u.a(iw.S, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.u.a($$1, aou.tI, aov.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$71 = 0; $$71 < 5; $$71++) {
               double $$72 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$73 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$74 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.u.a(iw.Z, $$72, $$73, $$74, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.u.a($$1, aou.ho, aov.e, 1.0F, 1.0F, false);

            for (int $$75 = 0; $$75 < 16; $$75++) {
               double $$76 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$77 = (double)$$1.v() + 0.8125;
               double $$78 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.u.a(iw.Z, $$76, $$77, $$78, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            cya.a(this.u, $$1, this.u.a_($$1));
            break;
         case 1505:
            cgr.a(this.u, $$1, $$2);
            this.u.a($$1, aou.cd, aov.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            hb $$4 = hb.a($$2);
            int $$5 = $$4.j();
            int $$6 = $$4.k();
            int $$7 = $$4.l();
            double $$8 = (double)$$1.u() + (double)$$5 * 0.6 + 0.5;
            double $$9 = (double)$$1.v() + (double)$$6 * 0.6 + 0.5;
            double $$10 = (double)$$1.w() + (double)$$7 * 0.6 + 0.5;

            for (int $$11 = 0; $$11 < 10; $$11++) {
               double $$12 = $$3.j() * 0.2 + 0.01;
               double $$13 = $$8 + (double)$$5 * 0.01 + ($$3.j() - 0.5) * (double)$$7 * 0.5;
               double $$14 = $$9 + (double)$$6 * 0.01 + ($$3.j() - 0.5) * (double)$$6 * 0.5;
               double $$15 = $$10 + (double)$$7 * 0.01 + ($$3.j() - 0.5) * (double)$$5 * 0.5;
               double $$16 = (double)$$5 * $$12 + $$3.k() * 0.01;
               double $$17 = (double)$$6 * $$12 + $$3.k() * 0.01;
               double $$18 = (double)$$7 * $$12 + $$3.k() * 0.01;
               this.a(iw.Z, $$13, $$14, $$15, $$16, $$17, $$18);
            }
            break;
         case 2001:
            dey $$38 = csk.a($$2);
            if (!$$38.i()) {
               czx $$39 = $$38.w();
               this.u.a($$1, $$39.c(), aov.e, ($$39.a() + 1.0F) / 2.0F, $$39.b() * 0.8F, false);
            }

            this.u.a($$1, $$38);
            break;
         case 2002:
         case 2007:
            ehf $$24 = ehf.c($$1);

            for (int $$25 = 0; $$25 < 8; $$25++) {
               this.a(new is(iw.O, new ciw(ciz.uu)), $$24.c, $$24.d, $$24.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$26 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$27 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$28 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            iu $$29 = $$0 == 2007 ? iw.N : iw.q;

            for (int $$30 = 0; $$30 < 100; $$30++) {
               double $$31 = $$3.j() * 4.0;
               double $$32 = $$3.j() * Math.PI * 2.0;
               double $$33 = Math.cos($$32) * $$31;
               double $$34 = 0.01 + $$3.j() * 0.5;
               double $$35 = Math.sin($$32) * $$31;
               fkw $$36 = this.b($$29, $$29.b().c(), $$24.c + $$33 * 0.1, $$24.d + 0.3, $$24.e + $$35 * 0.1, $$33, $$34, $$35);
               if ($$36 != null) {
                  float $$37 = 0.75F + $$3.i() * 0.25F;
                  $$36.a($$26 * $$37, $$27 * $$37, $$28 * $$37);
                  $$36.c((float)$$31);
               }
            }

            this.u.a($$1, aou.xc, aov.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$19 = (double)$$1.u() + 0.5;
            double $$20 = (double)$$1.v();
            double $$21 = (double)$$1.w() + 0.5;

            for (int $$22 = 0; $$22 < 8; $$22++) {
               this.a(new is(iw.O, new ciw(ciz.rD)), $$19, $$20, $$21, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$23 = 0.0; $$23 < Math.PI * 2; $$23 += Math.PI / 20) {
               this.a(iw.X, $$19 + Math.cos($$23) * 5.0, $$20 - 0.4, $$21 + Math.sin($$23) * 5.0, Math.cos($$23) * -5.0, 0.0, Math.sin($$23) * -5.0);
               this.a(iw.X, $$19 + Math.cos($$23) * 5.0, $$20 - 0.4, $$21 + Math.sin($$23) * 5.0, Math.cos($$23) * -7.0, 0.0, Math.sin($$23) * -7.0);
            }
            break;
         case 2004:
            for (int $$42 = 0; $$42 < 20; $$42++) {
               double $$43 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$44 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$45 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.u.a(iw.Z, $$43, $$44, $$45, 0.0, 0.0, 0.0);
               this.u.a(iw.C, $$43, $$44, $$45, 0.0, 0.0, 0.0);
            }
            break;
         case 2005:
            cgr.a(this.u, $$1, $$2);
            break;
         case 2006:
            for (int $$79 = 0; $$79 < 200; $$79++) {
               float $$80 = $$3.i() * 4.0F;
               float $$81 = $$3.i() * (float) (Math.PI * 2);
               double $$82 = (double)(aro.b($$81) * $$80);
               double $$83 = 0.01 + $$3.j() * 0.5;
               double $$84 = (double)(aro.a($$81) * $$80);
               fkw $$85 = this.b(iw.i, false, (double)$$1.u() + $$82 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$84 * 0.1, $$82, $$83, $$84);
               if ($$85 != null) {
                  $$85.c($$80);
               }
            }

            if ($$2 == 1) {
               this.u.a($$1, aou.gV, aov.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.u.a(iw.x, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$86 = 0; $$86 < 8; $$86++) {
               this.u.a(iw.f, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 3000:
            this.u.a(iw.w, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.u.a($$1, aou.hn, aov.e, 10.0F, (1.0F + (this.u.z.i() - this.u.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.u.a($$1, aou.gX, aov.f, 64.0F, 0.8F + this.u.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < hb.a.d.length) {
               arr.a(hb.a.d[$$2], this.u, $$1, 0.125, iw.aN, bfz.a(10, 19));
            } else {
               arr.a(this.u, $$1, iw.aN, bfz.a(3, 5));
            }
            break;
         case 3003:
            arr.a(this.u, $$1, iw.aL, bfz.a(3, 5));
            this.u.a($$1, aou.la, aov.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            arr.a(this.u, $$1, iw.aM, bfz.a(3, 5));
            break;
         case 3005:
            arr.a(this.u, $$1, iw.aO, bfz.a(3, 5));
            break;
         case 3006:
            int $$46 = $$2 >> 6;
            if ($$46 > 0) {
               if ($$3.i() < 0.3F + (float)$$46 * 0.1F) {
                  float $$47 = 0.15F + 0.02F * (float)$$46 * (float)$$46 * $$3.i();
                  float $$48 = 0.4F + 0.3F * (float)$$46 * $$3.i();
                  this.u.a($$1, aou.uh, aov.e, $$47, $$48, false);
               }

               byte $$49 = (byte)($$2 & 63);
               bft $$50 = bfz.a(0, $$46);
               float $$51 = 0.005F;
               Supplier<ehf> $$52 = () -> new ehf(aro.a($$3, -0.005F, 0.005F), aro.a($$3, -0.005F, 0.005F), aro.a($$3, -0.005F, 0.005F));
               if ($$49 == 0) {
                  for (hb $$53 : hb.values()) {
                     float $$54 = $$53 == hb.a ? (float) Math.PI : 0.0F;
                     double $$55 = $$53.o() == hb.a.b ? 0.65 : 0.57;
                     arr.a(this.u, $$1, new ix($$54), $$50, $$53, $$52, $$55);
                  }
               } else {
                  for (hb $$56 : cxi.a($$49)) {
                     float $$57 = $$56 == hb.b ? (float) Math.PI : 0.0F;
                     double $$58 = 0.35;
                     arr.a(this.u, $$1, new ix($$57), $$50, $$56, $$52, 0.35);
                  }
               }
            } else {
               this.u.a($$1, aou.uh, aov.e, 1.0F, 1.0F, false);
               boolean $$59 = this.u.a_($$1).r(this.u, $$1);
               int $$60 = $$59 ? 40 : 20;
               float $$61 = $$59 ? 0.45F : 0.25F;
               float $$62 = 0.07F;

               for (int $$63 = 0; $$63 < $$60; $$63++) {
                  float $$64 = 2.0F * $$3.i() - 1.0F;
                  float $$65 = 2.0F * $$3.i() - 1.0F;
                  float $$66 = 2.0F * $$3.i() - 1.0F;
                  this.u
                     .a(
                        iw.G,
                        (double)$$1.u() + 0.5 + (double)($$64 * $$61),
                        (double)$$1.v() + 0.5 + (double)($$65 * $$61),
                        (double)$$1.w() + 0.5 + (double)($$66 * $$61),
                        (double)($$64 * 0.07F),
                        (double)($$65 * 0.07F),
                        (double)($$66 * 0.07F)
                     );
               }
            }
            break;
         case 3007:
            for (int $$67 = 0; $$67 < 10; $$67++) {
               this.u.a(new iy($$67 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + cze.e, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dey $$68 = this.u.a_($$1);
            boolean $$69 = $$68.b(dfo.C) && $$68.c(dfo.C);
            if (!$$69) {
               this.u.a((double)$$1.u() + 0.5, (double)$$1.v() + cze.e, (double)$$1.w() + 0.5, aou.uE, aov.e, 2.0F, 0.6F + this.u.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dey $$40 = csk.a($$2);
            if ($$40.b() instanceof cso $$41) {
               this.u.a($$1, $$41.c(), aov.h, 1.0F, 1.0F, false);
            }

            this.u.a($$1, $$40);
            break;
         case 3009:
            arr.a(this.u, $$1, iw.aQ, bfz.a(3, 6));
      }
   }

   public void c(int $$0, gv $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         ajq $$4 = (ajq)this.G.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new ajq($$0, $$1);
            this.G.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.F);
         ((SortedSet)this.H.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         ajq $$3 = (ajq)this.G.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ae.h();
   }

   public void a(cor $$0) {
      this.v.a($$0);
   }

   public void r() {
      this.v.a();
      this.C = true;
   }

   public void a(Collection<dck> $$0, Collection<dck> $$1) {
      synchronized (this.x) {
         this.x.removeAll($$0);
         this.x.addAll($$1);
      }
   }

   public static int a(com $$0, gv $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(com $$0, dey $$1, gv $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(cpt.a, $$2);
         int $$4 = $$0.a(cpt.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(gv $$0) {
      fqe.b $$1 = this.y.a($$0);
      return $$1 != null && $$1.c.get() != fqe.a.a;
   }

   @Nullable
   public ejt s() {
      return this.J;
   }

   @Nullable
   public ejt t() {
      return this.L;
   }

   @Nullable
   public ejt u() {
      return this.M;
   }

   @Nullable
   public ejt v() {
      return this.N;
   }

   @Nullable
   public ejt w() {
      return this.O;
   }

   @Nullable
   public ejt x() {
      return this.P;
   }

   public static class a extends RuntimeException {
      public a(String $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }
}
