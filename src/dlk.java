import com.mojang.serialization.Codec;
import java.util.List;

public enum dlk implements azs {
   a("none", h.a),
   b("clockwise_90", h.u),
   c("180", h.c),
   d("counterclockwise_90", h.v);

   public static final Codec<dlk> e = azs.a(dlk::values);
   private final String f;
   private final h g;

   private dlk(final String $$0, final h $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public dlk a(dlk $$0) {
      switch ($$0) {
         case c:
            switch (this) {
               case a:
                  return c;
               case b:
                  return d;
               case c:
                  return a;
               case d:
                  return b;
            }
         case d:
            switch (this) {
               case a:
                  return d;
               case b:
                  return a;
               case c:
                  return b;
               case d:
                  return c;
            }
         case b:
            switch (this) {
               case a:
                  return b;
               case b:
                  return c;
               case c:
                  return d;
               case d:
                  return a;
            }
         default:
            return this;
      }
   }

   public h a() {
      return this.g;
   }

   public je a(je $$0) {
      if ($$0.o() == je.a.b) {
         return $$0;
      } else {
         switch (this) {
            case b:
               return $$0.h();
            case c:
               return $$0.g();
            case d:
               return $$0.i();
            default:
               return $$0;
         }
      }
   }

   public int a(int $$0, int $$1) {
      switch (this) {
         case b:
            return ($$0 + $$1 / 4) % $$1;
         case c:
            return ($$0 + $$1 / 2) % $$1;
         case d:
            return ($$0 + $$1 * 3 / 4) % $$1;
         default:
            return $$0;
      }
   }

   public static dlk a(azf $$0) {
      return ac.a(values(), $$0);
   }

   public static List<dlk> b(azf $$0) {
      return ac.b(values(), $$0);
   }

   @Override
   public String c() {
      return this.f;
   }
}
