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

public class fnm extends fne {
   private static final Logger a = LogUtils.getLogger();
   private static final alf b = new alf("textures/misc/credits_vignette.png");
   private static final xp c = xp.b("============").a(n.p);
   private static final String d = "           ";
   private static final String r = "" + n.p + n.q + n.k + n.l;
   private static final float s = 5.0F;
   private static final float u = 15.0F;
   private final boolean v;
   private final Runnable w;
   private float x;
   private List<ayl> y;
   private IntSet z;
   private int A;
   private boolean B;
   private final IntSet C = new IntOpenHashSet();
   private float D;
   private final float E;
   private int F;
   private final fhw G = new fhw(false);

   public fnm(boolean $$0, Runnable $$1) {
      super(fey.a);
      this.v = $$0;
      this.w = $$1;
      if (!$$0) {
         this.E = 0.75F;
      } else {
         this.E = 0.5F;
      }

      this.F = 1;
      this.D = this.E;
   }

   private float m() {
      return this.B ? this.E * (5.0F + (float)this.C.size() * 15.0F) * (float)this.F : this.E * (float)this.F;
   }

   @Override
   public void e() {
      this.m.s().a();
      this.m.aj().a(false);
      float $$0 = (float)(this.A + this.o + this.o + 24);
      if (this.x > $$0) {
         this.E();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.F = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.C.add($$0);
      } else if ($$0 == 32) {
         this.B = true;
      }

      this.D = this.m();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.F = 1;
      }

      if ($$0 == 32) {
         this.B = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.C.remove($$0);
      }

      this.D = this.m();
      return super.c($$0, $$1, $$2);
   }

   @Override
   public void d() {
      this.E();
   }

   private void E() {
      this.w.run();
   }

   @Override
   protected void aM_() {
      if (this.y == null) {
         this.y = Lists.newArrayList();
         this.z = new IntOpenHashSet();
         if (this.v) {
            this.a("texts/end.txt", this::a);
         }

         this.a("texts/credits.json", this::b);
         if (this.v) {
            this.a("texts/postcredits.txt", this::a);
         }

         this.A = this.y.size() * 12;
      }
   }

   private void a(String $$0, fnm.a $$1) {
      try (Reader $$2 = this.m.ab().openAsReader(new alf($$0))) {
         $$1.read($$2);
      } catch (Exception var8) {
         a.error("Couldn't load credits", var8);
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      azh $$2 = azh.a(8124371L);

      String $$3;
      while (($$3 = $$1.readLine()) != null) {
         $$3 = $$3.replaceAll("PLAYERNAME", this.m.X().c());

         int $$4;
         while (($$4 = $$3.indexOf(r)) != -1) {
            String $$5 = $$3.substring(0, $$4);
            String $$6 = $$3.substring($$4 + r.length());
            $$3 = $$5 + n.p + n.q + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
         }

         this.a($$3);
         this.F();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.F();
      }
   }

   private void b(Reader $$0) {
      for (JsonElement $$2 : ayp.b($$0)) {
         JsonObject $$3 = $$2.getAsJsonObject();
         String $$4 = $$3.get("section").getAsString();
         this.a(c, true);
         this.a(xp.b($$4).a(n.o), true);
         this.a(c, true);
         this.F();
         this.F();

         for (JsonElement $$6 : $$3.getAsJsonArray("disciplines")) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = $$7.get("discipline").getAsString();
            if (StringUtils.isNotEmpty($$8)) {
               this.a(xp.b($$8).a(n.o), true);
               this.F();
               this.F();
            }

            for (JsonElement $$10 : $$7.getAsJsonArray("titles")) {
               JsonObject $$11 = $$10.getAsJsonObject();
               String $$12 = $$11.get("title").getAsString();
               JsonArray $$13 = $$11.getAsJsonArray("names");
               this.a(xp.b($$12).a(n.h), false);

               for (JsonElement $$14 : $$13) {
                  String $$15 = $$14.getAsString();
                  this.a(xp.b("           ").f($$15).a(n.p), false);
               }

               this.F();
               this.F();
            }
         }
      }
   }

   private void F() {
      this.y.add(ayl.a);
   }

   private void a(String $$0) {
      this.y.addAll(this.m.h.c(xp.b($$0), 256));
   }

   private void a(xp $$0, boolean $$1) {
      if ($$1) {
         this.z.add(this.y.size());
      }

      this.y.add($$0.g());
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.x = Math.max(0.0F, this.x + $$3 * this.D);
      int $$4 = this.n / 2 - 128;
      int $$5 = this.o + 50;
      float $$6 = -this.x;
      $$0.c().a();
      $$0.c().a(0.0F, $$6, 0.0F);
      this.G.a($$0, this.n, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.y.size(); $$8++) {
         if ($$8 == this.y.size() - 1) {
            float $$9 = (float)$$7 + $$6 - (float)(this.o / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.c().a(0.0F, -$$9, 0.0F);
            }
         }

         if ((float)$$7 + $$6 + 12.0F + 8.0F > 0.0F && (float)$$7 + $$6 < (float)this.o) {
            ayl $$10 = this.y.get($$8);
            if (this.z.contains($$8)) {
               $$0.a(this.p, $$10, $$4 + 128, $$7, -1);
            } else {
               $$0.b(this.p, $$10, $$4, $$7, -1);
            }
         }

         $$7 += 12;
      }

      $$0.c().b();
   }

   private void c(fgs $$0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
      $$0.a(b, 0, 0, 0, 0.0F, 0.0F, this.n, this.o, this.n, this.o);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      if (this.v) {
         $$0.b(gdx.u(), 0, 0, this.n, this.o, 0);
      } else {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected void a(fgs $$0, int $$1, int $$2, int $$3, int $$4) {
      float $$5 = this.x * 0.5F;
      fne.a($$0, fne.g, 0, 0, 0.0F, $$5, $$3, $$4);
   }

   @Override
   public boolean k() {
      return !this.v;
   }

   @Override
   public void j() {
      this.m.s().b(avy.c);
   }

   @Override
   public avx D() {
      return avy.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
