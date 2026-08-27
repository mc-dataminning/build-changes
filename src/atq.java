import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class atq {
   private static final Codec<atq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ayh.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, atq::new)
   );
   public static final asr<atq> a = asr.a("filter", b);
   private final List<ayh> c;

   public atq(List<ayh> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
