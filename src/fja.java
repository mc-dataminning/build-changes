import com.google.common.collect.Sets;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;

public class fja implements AutoCloseable {
   private static final Logger r = LogUtils.getLogger();
   public static Set<String> a = Sets.newHashSet(
      new String[]{
         "ModelViewMat",
         "ProjMat",
         "TextureMat",
         "ScreenSize",
         "ColorModulator",
         "Light0_Direction",
         "Light1_Direction",
         "GlintAlpha",
         "FogStart",
         "FogEnd",
         "FogColor",
         "FogShape",
         "LineWidth",
         "GameTime",
         "ModelOffset"
      }
   );
   public static fja b = new fja(-1, "invalid");
   private static final fiu s = new fiu();
   private final List<String> t = new ArrayList<>();
   private final Object2ObjectMap<String, flj> u = new Object2ObjectOpenHashMap();
   private final IntList v = new IntArrayList();
   private final List<fjf> w = new ArrayList<>();
   private final Map<String, fjf> x = new HashMap<>();
   private final int y;
   private final String z;
   @Nullable
   public fjf c;
   @Nullable
   public fjf d;
   @Nullable
   public fjf e;
   @Nullable
   public fjf f;
   @Nullable
   public fjf g;
   @Nullable
   public fjf h;
   @Nullable
   public fjf i;
   @Nullable
   public fjf j;
   @Nullable
   public fjf k;
   @Nullable
   public fjf l;
   @Nullable
   public fjf m;
   @Nullable
   public fjf n;
   @Nullable
   public fjf o;
   @Nullable
   public fjf p;
   @Nullable
   public fjf q;

   private fja(int $$0, String $$1) {
      this.y = $$0;
      this.z = $$1;
   }

   public static fja a(fjd $$0, fjd $$1, flu $$2, String $$3) throws gsu.b {
      int $$4 = GlStateManager.glCreateProgram();
      if ($$4 <= 0) {
         throw new gsu.b("Could not create shader program (returned program ID " + $$4 + ")");
      } else {
         int $$5 = 0;

         for (String $$6 : $$2.d()) {
            GlStateManager._glBindAttribLocation($$4, $$5, $$6);
            $$5++;
         }

         GlStateManager.glAttachShader($$4, $$0.b());
         GlStateManager.glAttachShader($$4, $$1.b());
         GlStateManager.glLinkProgram($$4);
         int $$7 = GlStateManager.glGetProgrami($$4, 35714);
         if ($$7 == 0) {
            String $$8 = GlStateManager.glGetProgramInfoLog($$4, 32768);
            throw new gsu.b("Error encountered when linking program containing VS " + $$0.a() + " and FS " + $$1.a() + ". Log output: " + $$8);
         } else {
            return new fja($$4, $$3);
         }
      }
   }

   public void a(List<fjr.c> $$0, List<String> $$1) {
      RenderSystem.assertOnRenderThread();

      for (fjr.c $$2 : $$0) {
         String $$3 = $$2.a();
         int $$4 = fjf.a(this.y, $$3);
         if ($$4 != -1) {
            fjf $$5 = this.a($$2);
            $$5.b($$4);
            this.w.add($$5);
            this.x.put($$3, $$5);
         }
      }

      for (String $$6 : $$1) {
         int $$7 = fjf.a(this.y, $$6);
         if ($$7 == -1) {
            r.warn("{} shader program does not use sampler {} defined in the pipeline. This might be a bug.", this.z, $$6);
         } else {
            this.t.add($$6);
            this.v.add($$7);
         }
      }

      int $$8 = GlStateManager.glGetProgrami(this.y, 35718);
      MemoryStack $$9 = MemoryStack.stackPush();

      try {
         IntBuffer $$10 = $$9.mallocInt(1);
         IntBuffer $$11 = $$9.mallocInt(1);

         for (int $$12 = 0; $$12 < $$8; $$12++) {
            String $$13 = GL20.glGetActiveUniform(this.y, $$12, $$10, $$11);
            fkz $$14 = a($$11.get(0));
            if (!this.x.containsKey($$13) && !$$1.contains($$13)) {
               if ($$14 != null) {
                  r.info("Found unknown but potentially supported uniform {} in {}", $$13, this.z);
                  fjf $$15 = new fjf($$13, $$14);
                  $$15.b($$12);
                  this.w.add($$15);
                  this.x.put($$13, $$15);
               } else {
                  r.warn("Found unknown and unsupported uniform {} in {}", $$13, this.z);
               }
            }
         }
      } catch (Throwable var12) {
         if ($$9 != null) {
            try {
               $$9.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if ($$9 != null) {
         $$9.close();
      }

      this.c = this.a("ModelViewMat");
      this.d = this.a("ProjMat");
      this.e = this.a("TextureMat");
      this.f = this.a("ScreenSize");
      this.g = this.a("ColorModulator");
      this.h = this.a("Light0_Direction");
      this.i = this.a("Light1_Direction");
      this.j = this.a("GlintAlpha");
      this.k = this.a("FogStart");
      this.l = this.a("FogEnd");
      this.m = this.a("FogColor");
      this.n = this.a("FogShape");
      this.o = this.a("LineWidth");
      this.p = this.a("GameTime");
      this.q = this.a("ModelOffset");
   }

   private fjf a(fjr.c $$0) {
      return new fjf($$0.a(), $$0.b());
   }

   @Override
   public void close() {
      this.w.forEach(fjf::close);
      GlStateManager.glDeleteProgram(this.y);
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram(0);
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.v.size(); $$1++) {
         String $$2 = this.t.get($$1);
         if (!this.u.containsKey($$2)) {
            GlStateManager._activeTexture(33984 + $$1);
            GlStateManager._bindTexture(0);
         }
      }

      GlStateManager._activeTexture($$0);
   }

   @Nullable
   public fjf a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.x.get($$0);
   }

   public fiu b(String $$0) {
      fjf $$1 = this.a($$0);
      return (fiu)($$1 == null ? s : $$1);
   }

   public void a(String $$0, @Nullable flj $$1) {
      this.u.put($$0, $$1);
   }

   public void a(flu.c $$0, Matrix4f $$1, Matrix4f $$2, float $$3, float $$4) {
      for (int $$5 = 0; $$5 < 12; $$5++) {
         flj $$6 = RenderSystem.getShaderTexture($$5);
         this.a("Sampler" + $$5, $$6);
      }

      if (this.c != null) {
         this.c.a($$1);
      }

      if (this.d != null) {
         this.d.a($$2);
      }

      if (this.g != null) {
         this.g.a(RenderSystem.getShaderColor());
      }

      if (this.j != null) {
         this.j.a(RenderSystem.getShaderGlintAlpha());
      }

      grq $$7 = RenderSystem.getShaderFog();
      if (this.k != null) {
         this.k.a($$7.a());
      }

      if (this.l != null) {
         this.l.a($$7.b());
      }

      if (this.m != null) {
         this.m.a($$7.d(), $$7.e(), $$7.f(), $$7.g());
      }

      if (this.n != null) {
         this.n.a($$7.c().a());
      }

      if (this.e != null) {
         this.e.a(RenderSystem.getTextureMatrix());
      }

      if (this.p != null) {
         this.p.a(RenderSystem.getShaderGameTime());
      }

      if (this.q != null) {
         this.q.a(RenderSystem.getModelOffset());
      }

      if (this.f != null) {
         this.f.a($$3, $$4);
      }

      if (this.o != null && ($$0 == flu.c.a || $$0 == flu.c.b)) {
         this.o.a(RenderSystem.getShaderLineWidth());
      }

      Vector3f[] $$8 = RenderSystem.getShaderLights();
      if (this.h != null) {
         this.h.a($$8[0]);
      }

      if (this.i != null) {
         this.i.a($$8[1]);
      }
   }

   @VisibleForTesting
   public int b() {
      return this.y;
   }

   @Override
   public String toString() {
      return this.z;
   }

   public String c() {
      return this.z;
   }

   public IntList d() {
      return this.v;
   }

   public List<String> e() {
      return this.t;
   }

   public List<fjf> f() {
      return this.w;
   }

   @Nullable
   private static fkz a(int $$0) {
      return switch ($$0) {
         case 5124 -> fkz.a;
         case 5126 -> fkz.c;
         case 35664 -> fkz.d;
         case 35665 -> fkz.e;
         case 35666 -> fkz.f;
         case 35668 -> fkz.b;
         case 35676 -> fkz.g;
         default -> null;
      };
   }
}
