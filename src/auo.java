import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class auo {
   private static final Codec<auo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azi.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, auo::new)
   );
   public static final atp<auo> a = atp.a("filter", b);
   private final List<azi> c;

   public auo(List<azi> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
