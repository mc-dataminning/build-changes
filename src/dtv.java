import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dtv extends dtr {
   public static final Codec<dtv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlo.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d),
               dlo.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dtv::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dlo d;
   private final dlo e;
   private final int f;

   private dtv(dlo $$0, dlo $$1, int $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public static dtv a(dlo $$0, dlo $$1, int $$2) {
      return new dtv($$0, $$1, $$2);
   }

   @Override
   public int a(ase $$0, dlr $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$3 - $$2 - this.f + 1 <= 0) {
         b.warn("Empty height range: {}", this);
         return $$2;
      } else {
         int $$4 = ary.a($$0, $$2 + this.f, $$3);
         int $$5 = ary.a($$0, $$2, $$4 - 1);
         return ary.a($$0, $$2, $$5 - 1 + this.f);
      }
   }

   @Override
   public dts<?> a() {
      return dts.d;
   }

   @Override
   public String toString() {
      return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
   }
}
