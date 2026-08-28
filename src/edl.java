import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edl implements edp {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsl.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dsl.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpm.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpm.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edl::new)
   );
   private final dsl b;
   private final dsl c;
   private final bpm d;
   private final bpm e;

   public edl(dsl $$0, dsl $$1, bpm $$2, bpm $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dsl a() {
      return this.b;
   }

   public dsl b() {
      return this.c;
   }

   public bpm c() {
      return this.d;
   }

   public bpm d() {
      return this.e;
   }
}
