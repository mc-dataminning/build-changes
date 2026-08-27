import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebz implements ecd {
   public static final Codec<ebz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drd.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               drd.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpb.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpb.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ebz::new)
   );
   private final drd b;
   private final drd c;
   private final bpb d;
   private final bpb e;

   public ebz(drd $$0, drd $$1, bpb $$2, bpb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public drd a() {
      return this.b;
   }

   public drd b() {
      return this.c;
   }

   public bpb c() {
      return this.d;
   }

   public bpb d() {
      return this.e;
   }
}
