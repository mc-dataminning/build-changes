import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class avc {
   private static final Codec<avc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azv.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, avc::new)
   );
   public static final auc<avc> a = auc.a("filter", b);
   private final List<azv> c;

   public avc(List<azv> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
