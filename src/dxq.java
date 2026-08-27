import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxq implements dxu {
   public static final Codec<dxq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmz.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dmz.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bmh.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bmh.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dxq::new)
   );
   private final dmz b;
   private final dmz c;
   private final bmh d;
   private final bmh e;

   public dxq(dmz $$0, dmz $$1, bmh $$2, bmh $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dmz a() {
      return this.b;
   }

   public dmz b() {
      return this.c;
   }

   public bmh c() {
      return this.d;
   }

   public bmh d() {
      return this.e;
   }
}
