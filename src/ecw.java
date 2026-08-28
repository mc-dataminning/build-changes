import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecw implements eda {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsa.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dsa.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpx.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpx.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ecw::new)
   );
   private final dsa b;
   private final dsa c;
   private final bpx d;
   private final bpx e;

   public ecw(dsa $$0, dsa $$1, bpx $$2, bpx $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dsa a() {
      return this.b;
   }

   public dsa b() {
      return this.c;
   }

   public bpx c() {
      return this.d;
   }

   public bpx d() {
      return this.e;
   }
}
