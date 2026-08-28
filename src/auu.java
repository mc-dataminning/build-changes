import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class auu {
   private static final Codec<auu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azo.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, auu::new)
   );
   public static final atv<auu> a = atv.a("filter", b);
   private final List<azo> c;

   public auu(List<azo> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
