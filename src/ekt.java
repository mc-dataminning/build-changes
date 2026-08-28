import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekt implements ekx {
   public static final Codec<ekt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzo.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dzo.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               btd.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               btd.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ekt::new)
   );
   private final dzo b;
   private final dzo c;
   private final btd d;
   private final btd e;

   public ekt(dzo $$0, dzo $$1, btd $$2, btd $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dzo a() {
      return this.b;
   }

   public dzo b() {
      return this.c;
   }

   public btd c() {
      return this.d;
   }

   public btd d() {
      return this.e;
   }
}
