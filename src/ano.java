import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ano {
   private static final Codec<ano> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ary.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, ano::new)
   );
   public static final amq<ano> a = amq.a("filter", b);
   private final List<ary> c;

   public ano(List<ary> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
