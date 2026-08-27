import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dwz extends dwv {
   public static final Codec<dwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dos.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dos.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dwz::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dos d;
   private final dos e;
   private final int f;

   private dwz(dos $$0, dos $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dwz a(dos $$0, dos $$1, int $$2) {
      return new dwz($$0, $$1, $$2);
   }

   @Override
   public int a(auf $$0, dov $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = aty.a($$0, $$2 + this.f, $$3);
         int $$5 = aty.a($$0, $$2, $$4 - 1);
         return aty.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public dww<?> a() {
      return dww.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
