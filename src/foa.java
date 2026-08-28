import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class foa extends fnx {
   private static final Logger a = LogUtils.getLogger();
   private static final akq b = akq.b("textures/misc/credits_vignette.png");
   private static final wy c = wy.b("============").a(n.p);
   private static final String q = "           ";
   private static final String r = "" + n.p + n.q + n.k + n.l;
   private static final float s = 5.0F;
   private static final float u = 15.0F;
   private static final akq v = akq.b("texts/end.txt");
   private static final akq w = akq.b("texts/credits.json");
   private static final akq x = akq.b("texts/postcredits.txt");
   private final boolean y;
   private final Runnable z;
   private float A;
   private List<axz> B;
   private IntSet C;
   private int D;
   private boolean E;
   private final IntSet F = new IntOpenHashSet();
   private float G;
   private final float H;
   private int I;
   private final fix J = new fix(false);

   public foa(boolean $$0, Runnable $$1) {
      super(fga.a);
      this.y = $$0;
      this.z = $$1;
      if (!$$0) {
         this.H = 0.75F;
      } else {
         this.H = 0.5F;
      }

      this.I = 1;
      this.G = this.H;
   }

   private float m() {
      return this.E ? this.H * (5.0F + (float)this.F.size() * 15.0F) * (float)this.I : this.H * (float)this.I;
   }

   @Override
   public void e() {
      this.l.s().a();
      this.l.aj().a(false);
      float $$0 = (float)(this.D + this.n + this.n + 24);
      if (this.A > $$0) {
         this.D();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.I = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.F.add($$0);
      } else if ($$0 == 32) {
         this.E = true;
      }

      this.G = this.m();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.I = 1;
      }

      if ($$0 == 32) {
         this.E = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.F.remove($$0);
      }

      this.G = this.m();
      return super.c($$0, $$1, $$2);
   }

   @Override
   public void d() {
      this.D();
   }

   private void D() {
      this.z.run();
   }

   @Override
   protected void aP_() {
      if (this.B == null) {
         this.B = Lists.newArrayList();
         this.C = new IntOpenHashSet();
         if (this.y) {
            this.a(v, this::a);
         }

         this.a(w, this::b);
         if (this.y) {
            this.a(x, this::a);
         }

         this.D = this.B.size() * 12;
      }
   }

   private void a(akq $$0, foa.a $$1) {
      try (Reader $$2 = this.l.ab().openAsReader($$0)) {
         $$1.read($$2);
      } catch (Exception var8) {
         a.error("Couldn't load credits from file {}", $$0, var8);
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      ayv $$2 = ayv.a(8124371L);

      String $$3;
      while (($$3 = $$1.readLine()) != null) {
         $$3 = $$3.replaceAll("PLAYERNAME", this.l.X().c());

         int $$4;
         while (($$4 = $$3.indexOf(r)) != -1) {
            String $$5 = $$3.substring(0, $$4);
            String $$6 = $$3.substring($$4 + r.length());
            $$3 = $$5 + n.p + n.q + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
         }

         this.a($$3);
         this.E();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.E();
      }
   }

   private void b(Reader $$0) {
      for (JsonElement $$2 : ayd.b($$0)) {
         JsonObject $$3 = $$2.getAsJsonObject();
         String $$4 = $$3.get("section").getAsString();
         this.a(c, true);
         this.a(wy.b($$4).a(n.o), true);
         this.a(c, true);
         this.E();
         this.E();

         for (JsonElement $$6 : $$3.getAsJsonArray("disciplines")) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = $$7.get("discipline").getAsString();
            if (StringUtils.isNotEmpty($$8)) {
               this.a(wy.b($$8).a(n.o), true);
               this.E();
               this.E();
            }

            for (JsonElement $$10 : $$7.getAsJsonArray("titles")) {
               JsonObject $$11 = $$10.getAsJsonObject();
               String $$12 = $$11.get("title").getAsString();
               JsonArray $$13 = $$11.getAsJsonArray("names");
               this.a(wy.b($$12).a(n.h), false);

               for (JsonElement $$14 : $$13) {
                  String $$15 = $$14.getAsString();
                  this.a(wy.b("           ").f($$15).a(n.p), false);
               }

               this.E();
               this.E();
            }
         }
      }
   }

   private void E() {
      this.B.add(axz.a);
   }

   private void a(String $$0) {
      this.B.addAll(this.l.h.c(wy.b($$0), 256));
   }

   private void a(wy $$0, boolean $$1) {
      if ($$1) {
         this.C.add(this.B.size());
      }

      this.B.add($$0.g());
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.A = Math.max(0.0F, this.A + $$3 * this.G);
      int $$4 = this.m / 2 - 128;
      int $$5 = this.n + 50;
      float $$6 = -this.A;
      $$0.c().a();
      $$0.c().a(0.0F, $$6, 0.0F);
      this.J.a($$0, this.m, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.B.size(); $$8++) {
         if ($$8 == this.B.size() - 1) {
            float $$9 = (float)$$7 + $$6 - (float)(this.n / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.c().a(0.0F, -$$9, 0.0F);
            }
         }

         if ((float)$$7 + $$6 + 12.0F + 8.0F > 0.0F && (float)$$7 + $$6 < (float)this.n) {
            axz $$10 = this.B.get($$8);
            if (this.C.contains($$8)) {
               $$0.a(this.o, $$10, $$4 + 128, $$7, -1);
            } else {
               $$0.b(this.o, $$10, $$4, $$7, -1);
            }
         }

         $$7 += 12;
      }

      $$0.c().b();
   }

   private void c(fht $$0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
      $$0.a(b, 0, 0, 0, 0.0F, 0.0F, this.m, this.n, this.m, this.n);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      if (this.y) {
         $$0.b(gfb.s(), 0, 0, this.m, this.n, 0);
      } else {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected void a(fht $$0, int $$1, int $$2, int $$3, int $$4) {
      float $$5 = this.A * 0.5F;
      fnx.a($$0, fnx.f, 0, 0, 0.0F, $$5, $$3, $$4);
   }

   @Override
   public boolean k() {
      return !this.y;
   }

   @Override
   public void j() {
      this.l.s().b(avm.c);
   }

   @Override
   public avl C() {
      return avm.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
