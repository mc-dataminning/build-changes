import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dub(ib<cke> c, dud d) {
   public static final Codec<dub> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aft.a(jz.E).fieldOf("display").forGetter($$0x -> $$0x.c), dud.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dub::new)
   );
   public static final Codec<ib<dub>> b = afs.a(jz.aw, a);

   public ib<cke> a() {
      return this.c;
   }

   public dud b() {
      return this.d;
   }
}
