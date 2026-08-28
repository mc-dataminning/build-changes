import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egw implements eha {
   public static final Codec<egw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvv.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dvv.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               brp.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               brp.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egw::new)
   );
   private final dvv b;
   private final dvv c;
   private final brp d;
   private final brp e;

   public egw(dvv $$0, dvv $$1, brp $$2, brp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dvv a() {
      return this.b;
   }

   public dvv b() {
      return this.c;
   }

   public brp c() {
      return this.d;
   }

   public brp d() {
      return this.e;
   }
}
