import com.mojang.serialization.Codec;
import java.util.List;

public record cue(List<cua.a<cud, cub>> c) {
   public static final cue a = new cue(List.of());
   public static final Codec<cue> b = cua.a.a(cub.b).listOf().xmap(cue::new, cue::a);

   public static cue a(cub $$0, int $$1) {
      return new cue(cua.a($$0, $$1));
   }

   public static cue a(int $$0) {
      return new cue(cua.a($$0));
   }

   public List<cua.a<cud, cub>> a() {
      return this.c;
   }
}
