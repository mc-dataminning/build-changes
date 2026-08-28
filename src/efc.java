import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efc implements efg {
   public static final Codec<efc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dua.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bqp.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bqp.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, efc::new)
   );
   private final dua b;
   private final dua c;
   private final bqp d;
   private final bqp e;

   public efc(dua $$0, dua $$1, bqp $$2, bqp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dua a() {
      return this.b;
   }

   public dua b() {
      return this.c;
   }

   public bqp c() {
      return this.d;
   }

   public bqp d() {
      return this.e;
   }
}
