import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bf(cj.c b, cj.c c, cj.c d, cj.c e, cj.c f) {
   public static final Codec<bf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(cj.c.d, "x", cj.c.c).forGetter(bf::b),
               aqy.a(cj.c.d, "y", cj.c.c).forGetter(bf::c),
               aqy.a(cj.c.d, "z", cj.c.c).forGetter(bf::d),
               aqy.a(cj.c.d, "horizontal", cj.c.c).forGetter(bf::e),
               aqy.a(cj.c.d, "absolute", cj.c.c).forGetter(bf::f)
            )
            .apply($$0, bf::new)
   );

   public static bf a(cj.c $$0) {
      return new bf(cj.c.c, cj.c.c, cj.c.c, $$0, cj.c.c);
   }

   public static bf b(cj.c $$0) {
      return new bf(cj.c.c, $$0, cj.c.c, cj.c.c, cj.c.c);
   }

   public static bf c(cj.c $$0) {
      return new bf(cj.c.c, cj.c.c, cj.c.c, cj.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)arp.e($$6)) || !this.c.d((double)arp.e($$7)) || !this.d.d((double)arp.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public static Optional<bf> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }
}
