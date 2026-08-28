import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egj implements efu {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duo.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               duo.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bqu.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egj::new)
   );
   public final duo b;
   public final duo c;
   private final bqu d;

   public egj(duo $$0, duo $$1, bqu $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bqu a() {
      return this.d;
   }
}
