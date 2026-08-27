import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drj implements drn {
   public static final Codec<drj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgw.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dgw.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bhv.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bhv.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, drj::new)
   );
   private final dgw b;
   private final dgw c;
   private final bhv d;
   private final bhv e;

   public drj(dgw $$0, dgw $$1, bhv $$2, bhv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dgw a() {
      return this.b;
   }

   public dgw b() {
      return this.c;
   }

   public bhv c() {
      return this.d;
   }

   public bhv d() {
      return this.e;
   }
}
