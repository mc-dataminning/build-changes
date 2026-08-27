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

public class fjw extends fjo {
   private static final Logger a = LogUtils.getLogger();
   private static final ajt b = new ajt("textures/misc/vignette.png");
   private static final wg c = wg.b("============").a(n.p);
   private static final String d = "           ";
   private static final String o = "" + n.p + n.q + n.k + n.l;
   private static final float p = 5.0F;
   private static final float q = 15.0F;
   private final boolean r;
   private final Runnable s;
   private float u;
   private List<aww> v;
   private IntSet w;
   private int x;
   private boolean y;
   private final IntSet z = new IntOpenHashSet();
   private float A;
   private final float B;
   private int C;
   private final feg D = new feg(false);

   public fjw(boolean $$0, Runnable $$1) {
      super(fbh.a);
      this.r = $$0;
      this.s = $$1;
      if (!$$0) {
         this.B = 0.75F;
      } else {
         this.B = 0.5F;
      }

      this.C = 1;
      this.A = this.B;
   }

   private float m() {
      return this.y ? this.B * (5.0F + (float)this.z.size() * 15.0F) * (float)this.C : this.B * (float)this.C;
   }

   @Override
   public void e() {
      this.j.s().a();
      this.j.ak().a(false);
      float $$0 = (float)(this.x + this.l + this.l + 24);
      if (this.u > $$0) {
         this.C();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.C = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.z.add($$0);
      } else if ($$0 == 32) {
         this.y = true;
      }

      this.A = this.m();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.C = 1;
      }

      if ($$0 == 32) {
         this.y = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.z.remove($$0);
      }

      this.A = this.m();
      return super.c($$0, $$1, $$2);
   }

   @Override
   public void d() {
      this.C();
   }

   private void C() {
      this.s.run();
   }

   @Override
   protected void aN_() {
      if (this.v == null) {
         this.v = Lists.newArrayList();
         this.w = new IntOpenHashSet();
         if (this.r) {
            this.a("texts/end.txt", this::a);
         }

         this.a("texts/credits.json", this::b);
         if (this.r) {
            this.a("texts/postcredits.txt", this::a);
         }

         this.x = this.v.size() * 12;
      }
   }

   private void a(String $$0, fjw.a $$1) {
      try (Reader $$2 = this.j.ab().openAsReader(new ajt($$0))) {
         $$1.read($$2);
      } catch (Exception var8) {
         a.error("Couldn't load credits", var8);
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      axr $$2 = axr.a(8124371L);

      String $$3;
      while (($$3 = $$1.readLine()) != null) {
         $$3 = $$3.replaceAll("PLAYERNAME", this.j.X().c());

         int $$4;
         while (($$4 = $$3.indexOf(o)) != -1) {
            String $$5 = $$3.substring(0, $$4);
            String $$6 = $$3.substring($$4 + o.length());
            $$3 = $$5 + n.p + n.q + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
         }

         this.a($$3);
         this.D();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.D();
      }
   }

   private void b(Reader $$0) {
      for (JsonElement $$2 : axa.b($$0)) {
         JsonObject $$3 = $$2.getAsJsonObject();
         String $$4 = $$3.get("section").getAsString();
         this.a(c, true);
         this.a(wg.b($$4).a(n.o), true);
         this.a(c, true);
         this.D();
         this.D();

         for (JsonElement $$6 : $$3.getAsJsonArray("disciplines")) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = $$7.get("discipline").getAsString();
            if (StringUtils.isNotEmpty($$8)) {
               this.a(wg.b($$8).a(n.o), true);
               this.D();
               this.D();
            }

            for (JsonElement $$10 : $$7.getAsJsonArray("titles")) {
               JsonObject $$11 = $$10.getAsJsonObject();
               String $$12 = $$11.get("title").getAsString();
               JsonArray $$13 = $$11.getAsJsonArray("names");
               this.a(wg.b($$12).a(n.h), false);

               for (JsonElement $$14 : $$13) {
                  String $$15 = $$14.getAsString();
                  this.a(wg.b("           ").f($$15).a(n.p), false);
               }

               this.D();
               this.D();
            }
         }
      }
   }

   private void D() {
      this.v.add(aww.a);
   }

   private void a(String $$0) {
      this.v.addAll(this.j.h.c(wg.b($$0), 256));
   }

   private void a(wg $$0, boolean $$1) {
      if ($$1) {
         this.w.add(this.v.size());
      }

      this.v.add($$0.g());
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.u = Math.max(0.0F, this.u + $$3 * this.A);
      int $$4 = this.k / 2 - 128;
      int $$5 = this.l + 50;
      float $$6 = -this.u;
      $$0.c().a();
      $$0.c().a(0.0F, $$6, 0.0F);
      this.D.a($$0, this.k, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.v.size(); $$8++) {
         if ($$8 == this.v.size() - 1) {
            float $$9 = (float)$$7 + $$6 - (float)(this.l / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.c().a(0.0F, -$$9, 0.0F);
            }
         }

         if ((float)$$7 + $$6 + 12.0F + 8.0F > 0.0F && (float)$$7 + $$6 < (float)this.l) {
            aww $$10 = this.v.get($$8);
            if (this.w.contains($$8)) {
               $$0.a(this.m, $$10, $$4 + 128, $$7, -1);
            } else {
               $$0.b(this.m, $$10, $$4, $$7, -1);
            }
         }

         $$7 += 12;
      }

      $$0.c().b();
   }

   private void c(fdc $$0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
      $$0.a(b, 0, 0, 0, 0.0F, 0.0F, this.k, this.l, this.k, this.l);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      if (this.r) {
         $$0.b(gah.u(), 0, 0, this.k, this.l, 0);
      } else {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public void j() {
      this.j.s().b(auk.c);
   }

   @Override
   public auj B() {
      return auk.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
