import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class apk {
   private static final Codec<apk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(atx.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, apk::new)
   );
   public static final aom<apk> a = aom.a("filter", b);
   private final List<atx> c;

   public apk(List<atx> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
