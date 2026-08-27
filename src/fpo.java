import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fpo {
   public static final fpo a = new fpo(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
   public final Vector3f b;
   public final Vector3f c;
   public final Vector3f d;

   public fpo(Vector3f $$0, Vector3f $$1, Vector3f $$2) {
      this.b = new Vector3f($$0);
      this.c = new Vector3f($$1);
      this.d = new Vector3f($$2);
   }

   public void a(boolean $$0, elr $$1) {
      if (this != a) {
         float $$2 = this.b.x();
         float $$3 = this.b.y();
         float $$4 = this.b.z();
         if ($$0) {
            $$3 = -$$3;
            $$4 = -$$4;
         }

         int $$5 = $$0 ? -1 : 1;
         $$1.a((float)$$5 * this.c.x(), this.c.y(), this.c.z());
         $$1.a(new Quaternionf().rotationXYZ($$2 * (float) (Math.PI / 180.0), $$3 * (float) (Math.PI / 180.0), $$4 * (float) (Math.PI / 180.0)));
         $$1.b(this.d.x(), this.d.y(), this.d.z());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (this.getClass() != $$0.getClass()) {
         return false;
      } else {
         fpo $$1 = (fpo)$$0;
         return this.b.equals($$1.b) && this.d.equals($$1.d) && this.c.equals($$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      $$0 = 31 * $$0 + this.c.hashCode();
      return 31 * $$0 + this.d.hashCode();
   }

   protected static class a implements JsonDeserializer<fpo> {
      private static final Vector3f c = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f d = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f e = new Vector3f(1.0F, 1.0F, 1.0F);
      public static final float a = 5.0F;
      public static final float b = 4.0F;

      public fpo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Vector3f $$4 = this.a($$3, "rotation", c);
         Vector3f $$5 = this.a($$3, "translation", d);
         $$5.mul(0.0625F);
         $$5.set(ary.a($$5.x, -5.0F, 5.0F), ary.a($$5.y, -5.0F, 5.0F), ary.a($$5.z, -5.0F, 5.0F));
         Vector3f $$6 = this.a($$3, "scale", e);
         $$6.set(ary.a($$6.x, -4.0F, 4.0F), ary.a($$6.y, -4.0F, 4.0F), ary.a($$6.z, -4.0F, 4.0F));
         return new fpo($$4, $$5, $$6);
      }

      private Vector3f a(JsonObject $$0, String $$1, Vector3f $$2) {
         if (!$$0.has($$1)) {
            return $$2;
         } else {
            JsonArray $$3 = arp.v($$0, $$1);
            if ($$3.size() != 3) {
               throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$3.size());
            } else {
               float[] $$4 = new float[3];

               for (int $$5 = 0; $$5 < $$4.length; $$5++) {
                  $$4[$$5] = arp.e($$3.get($$5), $$1 + "[" + $$5 + "]");
               }

               return new Vector3f($$4[0], $$4[1], $$4[2]);
            }
         }
      }
   }
}
