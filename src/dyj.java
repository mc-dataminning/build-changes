import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyj implements dxu {
   public static final Codec<dyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmz.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dmz.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bmh.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dyj::new)
   );
   public final dmz b;
   public final dmz c;
   private final bmh d;

   public dyj(dmz $$0, dmz $$1, bmh $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bmh a() {
      return this.d;
   }
}
