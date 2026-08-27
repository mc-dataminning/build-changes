import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aun(List<aum> b, boolean c) {
   public static final Codec<aun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aum.a.listOf().fieldOf("values").forGetter(aun::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aun::b)).apply($$0, aun::new)
   );

   public List<aum> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
