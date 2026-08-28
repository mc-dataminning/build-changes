import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbx(String b) implements fbz {
   public static final MapCodec<fbx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fbx::c)).apply($$0, fbx::new));

   public static fbz a(String $$0) {
      return new fbx($$0);
   }

   @Override
   public fby a() {
      return fca.b;
   }

   @Override
   public fdy a(exl $$0) {
      return fdy.c(this.b);
   }

   @Override
   public Set<bat<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
