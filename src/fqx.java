import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fqx implements AutoCloseable {
   private static final String a = "minecraft:main";
   private final emi b;
   private final aph c;
   private final String d;
   private final List<fqy> e = Lists.newArrayList();
   private final Map<String, emi> f = Maps.newHashMap();
   private final List<emi> g = Lists.newArrayList();
   private Matrix4f h;
   private int i;
   private int j;
   private float k;
   private float l;

   public fqx(gbv $$0, aph $$1, emi $$2, agi $$3) throws IOException, JsonSyntaxException {
      this.c = $$1;
      this.b = $$2;
      this.k = 0.0F;
      this.l = 0.0F;
      this.i = $$2.e;
      this.j = $$2.f;
      this.d = $$3.toString();
      this.b();
      this.a($$0, $$3);
   }

   private void a(gbv $$0, agi $$1) throws IOException, JsonSyntaxException {
      apf $$2 = this.c.getResourceOrThrow($$1);

      try {
         try (Reader $$3 = $$2.e()) {
            JsonObject $$4 = atc.a($$3);
            if (atc.d($$4, "targets")) {
               JsonArray $$5 = $$4.getAsJsonArray("targets");
               int $$6 = 0;

               for (JsonElement $$7 : $$5) {
                  try {
                     this.a($$7);
                  } catch (Exception var14) {
                     agl $$9 = agl.a(var14);
                     $$9.a("targets[" + $$6 + "]");
                     throw $$9;
                  }

                  $$6++;
               }
            }

            if (atc.d($$4, "passes")) {
               JsonArray $$10 = $$4.getAsJsonArray("passes");
               int $$11 = 0;

               for (JsonElement $$12 : $$10) {
                  try {
                     this.a($$0, $$12);
                  } catch (Exception var13) {
                     agl $$14 = agl.a(var13);
                     $$14.a("passes[" + $$11 + "]");
                     throw $$14;
                  }

                  $$11++;
               }
            }
         }
      } catch (Exception var16) {
         agl $$16 = agl.a(var16);
         $$16.b($$1.a() + " (" + $$2.b() + ")");
         throw $$16;
      }
   }

   private void a(JsonElement $$0) throws agl {
      if (atc.a($$0)) {
         this.a($$0.getAsString(), this.i, this.j);
      } else {
         JsonObject $$1 = atc.m($$0, "target");
         String $$2 = atc.i($$1, "name");
         int $$3 = atc.a($$1, "width", this.i);
         int $$4 = atc.a($$1, "height", this.j);
         if (this.f.containsKey($$2)) {
            throw new agl($$2 + " is already defined");
         }

         this.a($$2, $$3, $$4);
      }
   }

   private void a(gbv $$0, JsonElement $$1) throws IOException {
      JsonObject $$2 = atc.m($$1, "pass");
      String $$3 = atc.i($$2, "name");
      String $$4 = atc.i($$2, "intarget");
      String $$5 = atc.i($$2, "outtarget");
      emi $$6 = this.b($$4);
      emi $$7 = this.b($$5);
      if ($$6 == null) {
         throw new agl("Input target '" + $$4 + "' does not exist");
      } else if ($$7 == null) {
         throw new agl("Output target '" + $$5 + "' does not exist");
      } else {
         fqy $$8 = this.a($$3, $$6, $$7);
         JsonArray $$9 = atc.a($$2, "auxtargets", null);
         if ($$9 != null) {
            int $$10 = 0;

            for (JsonElement $$11 : $$9) {
               try {
                  JsonObject $$12 = atc.m($$11, "auxtarget");
                  String $$13 = atc.i($$12, "name");
                  String $$14 = atc.i($$12, "id");
                  boolean $$15;
                  String $$16;
                  if ($$14.endsWith(":depth")) {
                     $$15 = true;
                     $$16 = $$14.substring(0, $$14.lastIndexOf(58));
                  } else {
                     $$15 = false;
                     $$16 = $$14;
                  }

                  emi $$19 = this.b($$16);
                  if ($$19 == null) {
                     if ($$15) {
                        throw new agl("Render target '" + $$16 + "' can't be used as depth buffer");
                     }

                     agi $$20 = new agi("textures/effect/" + $$16 + ".png");
                     this.c.getResource($$20).orElseThrow(() -> new agl("Render target or texture '" + $$16 + "' does not exist"));
                     RenderSystem.setShaderTexture(0, $$20);
                     $$0.a($$20);
                     gbf $$21 = $$0.b($$20);
                     int $$22 = atc.o($$12, "width");
                     int $$23 = atc.o($$12, "height");
                     boolean $$24 = atc.k($$12, "bilinear");
                     if ($$24) {
                        RenderSystem.texParameter(3553, 10241, 9729);
                        RenderSystem.texParameter(3553, 10240, 9729);
                     } else {
                        RenderSystem.texParameter(3553, 10241, 9728);
                        RenderSystem.texParameter(3553, 10240, 9728);
                     }

                     $$8.a($$13, $$21::a, $$22, $$23);
                  } else if ($$15) {
                     $$8.a($$13, $$19::g, $$19.c, $$19.d);
                  } else {
                     $$8.a($$13, $$19::f, $$19.c, $$19.d);
                  }
               } catch (Exception var26) {
                  agl $$26 = agl.a(var26);
                  $$26.a("auxtargets[" + $$10 + "]");
                  throw $$26;
               }

               $$10++;
            }
         }

         JsonArray $$27 = atc.a($$2, "uniforms", null);
         if ($$27 != null) {
            int $$28 = 0;

            for (JsonElement $$29 : $$27) {
               try {
                  this.b($$29);
               } catch (Exception var25) {
                  agl $$31 = agl.a(var25);
                  $$31.a("uniforms[" + $$28 + "]");
                  throw $$31;
               }

               $$28++;
            }
         }
      }
   }

   private void b(JsonElement $$0) throws agl {
      JsonObject $$1 = atc.m($$0, "uniform");
      String $$2 = atc.i($$1, "name");
      enn $$3 = this.e.get(this.e.size() - 1).b().a($$2);
      if ($$3 == null) {
         throw new agl("Uniform '" + $$2 + "' does not exist");
      } else {
         float[] $$4 = new float[4];
         int $$5 = 0;

         for (JsonElement $$7 : atc.v($$1, "values")) {
            try {
               $$4[$$5] = atc.e($$7, "value");
            } catch (Exception var12) {
               agl $$9 = agl.a(var12);
               $$9.a("values[" + $$5 + "]");
               throw $$9;
            }

            $$5++;
         }

         switch ($$5) {
            case 0:
            default:
               break;
            case 1:
               $$3.a($$4[0]);
               break;
            case 2:
               $$3.a($$4[0], $$4[1]);
               break;
            case 3:
               $$3.a($$4[0], $$4[1], $$4[2]);
               break;
            case 4:
               $$3.a($$4[0], $$4[1], $$4[2], $$4[3]);
         }
      }
   }

   public emi a(String $$0) {
      return this.f.get($$0);
   }

   public void a(String $$0, int $$1, int $$2) {
      emi $$3 = new emj($$1, $$2, true, etd.a);
      $$3.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.f.put($$0, $$3);
      if ($$1 == this.i && $$2 == this.j) {
         this.g.add($$3);
      }
   }

   @Override
   public void close() {
      for (emi $$0 : this.f.values()) {
         $$0.a();
      }

      for (fqy $$1 : this.e) {
         $$1.close();
      }

      this.e.clear();
   }

   public fqy a(String $$0, emi $$1, emi $$2) throws IOException {
      fqy $$3 = new fqy(this.c, $$0, $$1, $$2);
      this.e.add(this.e.size(), $$3);
      return $$3;
   }

   private void b() {
      this.h = new Matrix4f().setOrtho(0.0F, (float)this.b.c, 0.0F, (float)this.b.d, 0.1F, 1000.0F);
   }

   public void a(int $$0, int $$1) {
      this.i = this.b.c;
      this.j = this.b.d;
      this.b();

      for (fqy $$2 : this.e) {
         $$2.a(this.h);
      }

      for (emi $$3 : this.g) {
         $$3.a($$0, $$1, etd.a);
      }
   }

   public void a(float $$0) {
      if ($$0 < this.l) {
         this.k = this.k + (1.0F - this.l);
         this.k += $$0;
      } else {
         this.k = this.k + ($$0 - this.l);
      }

      this.l = $$0;

      while (this.k > 20.0F) {
         this.k -= 20.0F;
      }

      for (fqy $$1 : this.e) {
         $$1.a(this.k / 20.0F);
      }
   }

   public final String a() {
      return this.d;
   }

   @Nullable
   private emi b(@Nullable String $$0) {
      if ($$0 == null) {
         return null;
      } else {
         return $$0.equals("minecraft:main") ? this.b : this.f.get($$0);
      }
   }
}
