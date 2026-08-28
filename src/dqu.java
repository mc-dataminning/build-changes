import com.mojang.serialization.Codec;
import java.util.List;

public enum dqu implements bba {
   a("none", h.a),
   b("clockwise_90", h.u),
   c("180", h.c),
   d("counterclockwise_90", h.v);

   public static final Codec<dqu> e = bba.a(dqu::values);
   private final String f;
   private final h g;

   private dqu(final String $$0, final h $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public dqu a(dqu $$0) {
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

   public jm a(jm $$0) {
      if ($$0.o() == jm.a.b) {
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

   public static dqu a(bam $$0) {
      return ae.a(values(), $$0);
   }

   public static List<dqu> b(bam $$0) {
      return ae.b(values(), $$0);
   }

   @Override
   public String c() {
      return this.f;
   }
}
