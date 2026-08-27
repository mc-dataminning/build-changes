import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bec {
   public static final Codec<bec> a = RecordCodecBuilder.create($$0 -> $$0.group(dil.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bec::new));
   private final dil b;

   public bec(dil $$0) {
      this.b = $$0;
   }

   public bec(long $$0, acq $$1) {
      this(a($$0, $$1));
   }

   private static dil a(long $$0, acq $$1) {
      return new dil(dhz.b($$0).a(a($$1)).a());
   }

   public static dhz.a a(acq $$0) {
      return dhz.a($$0.toString());
   }

   public apf a() {
      return this.b;
   }
}
