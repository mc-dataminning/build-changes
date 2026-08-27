import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class apc {
   private static final Codec<apc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(atp.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, apc::new)
   );
   public static final aoe<apc> a = aoe.a("filter", b);
   private final List<atp> c;

   public apc(List<atp> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
