import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehz implements eid {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwy.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dwy.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               brq.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               brq.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehz::new)
   );
   private final dwy b;
   private final dwy c;
   private final brq d;
   private final brq e;

   public ehz(dwy $$0, dwy $$1, brq $$2, brq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dwy a() {
      return this.b;
   }

   public dwy b() {
      return this.c;
   }

   public brq c() {
      return this.d;
   }

   public brq d() {
      return this.e;
   }
}
