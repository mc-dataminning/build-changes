import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bh(cl.c b, cl.c c, cl.c d, cl.c e, cl.c f) {
   public static final Codec<bh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asu.a(cl.c.d, "x", cl.c.c).forGetter(bh::b),
               asu.a(cl.c.d, "y", cl.c.c).forGetter(bh::c),
               asu.a(cl.c.d, "z", cl.c.c).forGetter(bh::d),
               asu.a(cl.c.d, "horizontal", cl.c.c).forGetter(bh::e),
               asu.a(cl.c.d, "absolute", cl.c.c).forGetter(bh::f)
            )
            .apply($$0, bh::new)
   );

   public static bh a(cl.c $$0) {
      return new bh(cl.c.c, cl.c.c, cl.c.c, $$0, cl.c.c);
   }

   public static bh b(cl.c $$0) {
      return new bh(cl.c.c, $$0, cl.c.c, cl.c.c, cl.c.c);
   }

   public static bh c(cl.c $$0) {
      return new bh(cl.c.c, cl.c.c, cl.c.c, cl.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)atm.e($$6)) || !this.c.d((double)atm.e($$7)) || !this.d.d((double)atm.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public static Optional<bh> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }
}
