import com.mojang.serialization.Codec;
import java.util.List;

public enum dbr implements auk {
   a("none", h.a),
   b("clockwise_90", h.u),
   c("180", h.c),
   d("counterclockwise_90", h.v);

   public static final Codec<dbr> e = auk.a(dbr::values);
   private final String f;
   private final h g;

   private dbr(String $$0, h $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public dbr a(dbr $$0) {
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

   public ib a(ib $$0) {
      if ($$0.o() == ib.a.b) {
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

   public static dbr a(atw $$0) {
      return ac.a(values(), $$0);
   }

   public static List<dbr> b(atw $$0) {
      return ac.b(values(), $$0);
   }

   @Override
   public String c() {
      return this.f;
   }
}
