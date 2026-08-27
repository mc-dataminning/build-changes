import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class fpo implements elx, AutoCloseable {
   public static final String a = "shaders";
   private static final String r = "shaders/core/";
   private static final String s = "shaders/include/";
   static final Logger t = LogUtils.getLogger();
   private static final elq u = new elq();
   private static final boolean v = true;
   private static fpo w;
   private static int x = -1;
   private final Map<String, Object> y = Maps.newHashMap();
   private final List<String> z = Lists.newArrayList();
   private final List<Integer> A = Lists.newArrayList();
   private final List<ely> B = Lists.newArrayList();
   private final List<Integer> C = Lists.newArrayList();
   private final Map<String, ely> D = Maps.newHashMap();
   private final int E;
   private final String F;
   private boolean G;
   private final elr H;
   private final List<Integer> I;
   private final List<String> J;
   private final elv K;
   private final elv L;
   private final emm M;
   @Nullable
   public final ely b;
   @Nullable
   public final ely c;
   @Nullable
   public final ely d;
   @Nullable
   public final ely e;
   @Nullable
   public final ely f;
   @Nullable
   public final ely g;
   @Nullable
   public final ely h;
   @Nullable
   public final ely i;
   @Nullable
   public final ely j;
   @Nullable
   public final ely k;
   @Nullable
   public final ely l;
   @Nullable
   public final ely m;
   @Nullable
   public final ely n;
   @Nullable
   public final ely o;
   @Nullable
   public final ely p;
   @Nullable
   public final ely q;

   public fpo(aow $$0, String $$1, emm $$2) throws IOException {
      this.F = $$1;
      this.M = $$2;
      afw $$3 = new afw("shaders/core/" + $$1 + ".json");

      try (Reader $$4 = $$0.openAsReader($$3)) {
         JsonObject $$5 = aso.a($$4);
         String $$6 = aso.i($$5, "vertex");
         String $$7 = aso.i($$5, "fragment");
         JsonArray $$8 = aso.a($$5, "samplers", null);
         if ($$8 != null) {
            int $$9 = 0;

            for (JsonElement $$10 : $$8) {
               try {
                  this.a($$10);
               } catch (Exception var20) {
                  afz $$12 = afz.a(var20);
                  $$12.a("samplers[" + $$9 + "]");
                  throw $$12;
               }

               $$9++;
            }
         }

         JsonArray $$13 = aso.a($$5, "attributes", null);
         if ($$13 != null) {
            int $$14 = 0;
            this.I = Lists.newArrayListWithCapacity($$13.size());
            this.J = Lists.newArrayListWithCapacity($$13.size());

            for (JsonElement $$15 : $$13) {
               try {
                  this.J.add(aso.a($$15, "attribute"));
               } catch (Exception var19) {
                  afz $$17 = afz.a(var19);
                  $$17.a("attributes[" + $$14 + "]");
                  throw $$17;
               }

               $$14++;
            }
         } else {
            this.I = null;
            this.J = null;
         }

         JsonArray $$18 = aso.a($$5, "uniforms", null);
         if ($$18 != null) {
            int $$19 = 0;

            for (JsonElement $$20 : $$18) {
               try {
                  this.b($$20);
               } catch (Exception var18) {
                  afz $$22 = afz.a(var18);
                  $$22.a("uniforms[" + $$19 + "]");
                  throw $$22;
               }

               $$19++;
            }
         }

         this.H = a(aso.a($$5, "blend", null));
         this.K = a($$0, elv.a.a, $$6);
         this.L = a($$0, elv.a.b, $$7);
         this.E = elw.a();
         if (this.J != null) {
            int $$23 = 0;

            for (UnmodifiableIterator var31 = $$2.d().iterator(); var31.hasNext(); $$23++) {
               String $$24 = (String)var31.next();
               ely.a(this.E, $$23, $$24);
               this.I.add($$23);
            }
         }

         elw.b(this);
         this.j();
      } catch (Exception var22) {
         afz $$27 = afz.a(var22);
         $$27.b($$3.a());
         throw $$27;
      }

      this.b();
      this.b = this.a("ModelViewMat");
      this.c = this.a("ProjMat");
      this.d = this.a("IViewRotMat");
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
      this.q = this.a("ChunkOffset");
   }

   private static elv a(final aow $$0, elv.a $$1, String $$2) throws IOException {
      elv $$3 = $$1.c().get($$2);
      elv $$8;
      if ($$3 == null) {
         String $$4 = "shaders/core/" + $$2 + $$1.b();
         aor $$5 = $$0.getResourceOrThrow(new afw($$4));

         try (InputStream $$6 = $$5.d()) {
            final String $$7 = v.a($$4);
            $$8 = elv.a($$1, $$2, $$6, $$5.b(), new elo() {
               private final Set<String> c = Sets.newHashSet();

               @Override
               public String a(boolean $$0x, String $$1) {
                  $$1 = v.b(($$0 ? $$7 : "shaders/include/") + $$1);
                  if (!this.c.add($$1)) {
                     return null;
                  } else {
                     afw $$2 = new afw($$1);

                     try {
                        String var5;
                        try (Reader $$3 = $$0.openAsReader($$2)) {
                           var5 = IOUtils.toString($$3);
                        }

                        return var5;
                     } catch (IOException var9) {
                        fpo.t.error("Could not open GLSL import {}: {}", $$1, var9.getMessage());
                        return "#error " + var9.getMessage();
                     }
                  }
               }
            });
         }
      } else {
         $$8 = $$3;
      }

      return $$8;
   }

   public static elr a(JsonObject $$0) {
      if ($$0 == null) {
         return new elr();
      } else {
         int $$1 = 32774;
         int $$2 = 1;
         int $$3 = 0;
         int $$4 = 1;
         int $$5 = 0;
         boolean $$6 = true;
         boolean $$7 = false;
         if (aso.a($$0, "func")) {
            $$1 = elr.a($$0.get("func").getAsString());
            if ($$1 != 32774) {
               $$6 = false;
            }
         }

         if (aso.a($$0, "srcrgb")) {
            $$2 = elr.b($$0.get("srcrgb").getAsString());
            if ($$2 != 1) {
               $$6 = false;
            }
         }

         if (aso.a($$0, "dstrgb")) {
            $$3 = elr.b($$0.get("dstrgb").getAsString());
            if ($$3 != 0) {
               $$6 = false;
            }
         }

         if (aso.a($$0, "srcalpha")) {
            $$4 = elr.b($$0.get("srcalpha").getAsString());
            if ($$4 != 1) {
               $$6 = false;
            }

            $$7 = true;
         }

         if (aso.a($$0, "dstalpha")) {
            $$5 = elr.b($$0.get("dstalpha").getAsString());
            if ($$5 != 0) {
               $$6 = false;
            }

            $$7 = true;
         }

         if ($$6) {
            return new elr();
         } else {
            return $$7 ? new elr($$2, $$3, $$4, $$5, $$1) : new elr($$2, $$3, $$1);
         }
      }
   }

   @Override
   public void close() {
      for (ely $$0 : this.B) {
         $$0.close();
      }

      elw.a(this);
   }

   public void f() {
      RenderSystem.assertOnRenderThread();
      elw.a(0);
      x = -1;
      w = null;
      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.A.size(); $$1++) {
         if (this.y.get(this.z.get($$1)) != null) {
            GlStateManager._activeTexture(33984 + $$1);
            GlStateManager._bindTexture(0);
         }
      }

      GlStateManager._activeTexture($$0);
   }

   public void g() {
      RenderSystem.assertOnRenderThread();
      this.G = false;
      w = this;
      this.H.a();
      if (this.E != x) {
         elw.a(this.E);
         x = this.E;
      }

      int $$0 = GlStateManager._getActiveTexture();

      for (int $$1 = 0; $$1 < this.A.size(); $$1++) {
         String $$2 = this.z.get($$1);
         if (this.y.get($$2) != null) {
            int $$3 = ely.a(this.E, $$2);
            ely.b($$3, $$1);
            RenderSystem.activeTexture(33984 + $$1);
            Object $$4 = this.y.get($$2);
            int $$5 = -1;
            if ($$4 instanceof ekt) {
               $$5 = ((ekt)$$4).f();
            } else if ($$4 instanceof fzl) {
               $$5 = ((fzl)$$4).a();
            } else if ($$4 instanceof Integer) {
               $$5 = (Integer)$$4;
            }

            if ($$5 != -1) {
               RenderSystem.bindTexture($$5);
            }
         }
      }

      GlStateManager._activeTexture($$0);

      for (ely $$6 : this.B) {
         $$6.b();
      }
   }

   @Override
   public void b() {
      this.G = true;
   }

   @Nullable
   public ely a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.D.get($$0);
   }

   public elq b(String $$0) {
      RenderSystem.assertOnGameThread();
      ely $$1 = this.a($$0);
      return (elq)($$1 == null ? u : $$1);
   }

   private void j() {
      RenderSystem.assertOnRenderThread();
      IntList $$0 = new IntArrayList();

      for (int $$1 = 0; $$1 < this.z.size(); $$1++) {
         String $$2 = this.z.get($$1);
         int $$3 = ely.a(this.E, $$2);
         if ($$3 == -1) {
            t.warn("Shader {} could not find sampler named {} in the specified shader program.", this.F, $$2);
            this.y.remove($$2);
            $$0.add($$1);
         } else {
            this.A.add($$3);
         }
      }

      for (int $$4 = $$0.size() - 1; $$4 >= 0; $$4--) {
         int $$5 = $$0.getInt($$4);
         this.z.remove($$5);
      }

      for (ely $$6 : this.B) {
         String $$7 = $$6.a();
         int $$8 = ely.a(this.E, $$7);
         if ($$8 == -1) {
            t.warn("Shader {} could not find uniform named {} in the specified shader program.", this.F, $$7);
         } else {
            this.C.add($$8);
            $$6.b($$8);
            this.D.put($$7, $$6);
         }
      }
   }

   private void a(JsonElement $$0) {
      JsonObject $$1 = aso.m($$0, "sampler");
      String $$2 = aso.i($$1, "name");
      if (!aso.a($$1, "file")) {
         this.y.put($$2, null);
         this.z.add($$2);
      } else {
         this.z.add($$2);
      }
   }

   public void a(String $$0, Object $$1) {
      this.y.put($$0, $$1);
      this.b();
   }

   private void b(JsonElement $$0) throws afz {
      JsonObject $$1 = aso.m($$0, "uniform");
      String $$2 = aso.i($$1, "name");
      int $$3 = ely.a(aso.i($$1, "type"));
      int $$4 = aso.o($$1, "count");
      float[] $$5 = new float[Math.max($$4, 16)];
      JsonArray $$6 = aso.v($$1, "values");
      if ($$6.size() != $$4 && $$6.size() > 1) {
         throw new afz("Invalid amount of values specified (expected " + $$4 + ", found " + $$6.size() + ")");
      } else {
         int $$7 = 0;

         for (JsonElement $$8 : $$6) {
            try {
               $$5[$$7] = aso.e($$8, "value");
            } catch (Exception var13) {
               afz $$10 = afz.a(var13);
               $$10.a("values[" + $$7 + "]");
               throw $$10;
            }

            $$7++;
         }

         if ($$4 > 1 && $$6.size() == 1) {
            while ($$7 < $$4) {
               $$5[$$7] = $$5[0];
               $$7++;
            }
         }

         int $$11 = $$4 > 1 && $$4 <= 4 && $$3 < 8 ? $$4 - 1 : 0;
         ely $$12 = new ely($$2, $$3 + $$11, $$4, this);
         if ($$3 <= 3) {
            $$12.a((int)$$5[0], (int)$$5[1], (int)$$5[2], (int)$$5[3]);
         } else if ($$3 <= 7) {
            $$12.b($$5[0], $$5[1], $$5[2], $$5[3]);
         } else {
            $$12.a(Arrays.copyOfRange($$5, 0, $$4));
         }

         this.B.add($$12);
      }
   }

   @Override
   public elv c() {
      return this.K;
   }

   @Override
   public elv d() {
      return this.L;
   }

   @Override
   public void e() {
      this.L.a(this);
      this.K.a(this);
   }

   public emm h() {
      return this.M;
   }

   public String i() {
      return this.F;
   }

   @Override
   public int a() {
      return this.E;
   }
}
