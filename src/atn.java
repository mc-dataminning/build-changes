import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class atn {
   private static final Codec<atn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(aye.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, atn::new)
   );
   public static final aso<atn> a = aso.a("filter", b);
   private final List<aye> c;

   public atn(List<aye> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
