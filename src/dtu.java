import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtu implements dty {
   public static final Codec<dtu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djh.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               djh.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bjg.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bjg.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dtu::new)
   );
   private final djh b;
   private final djh c;
   private final bjg d;
   private final bjg e;

   public dtu(djh $$0, djh $$1, bjg $$2, bjg $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public djh a() {
      return this.b;
   }

   public djh b() {
      return this.c;
   }

   public bjg c() {
      return this.d;
   }

   public bjg d() {
      return this.e;
   }
}
