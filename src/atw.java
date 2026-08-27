import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class atw {
   private static final Codec<atw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ayn.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, atw::new)
   );
   public static final asx<atw> a = asx.a("filter", b);
   private final List<ayn> c;

   public atw(List<ayn> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
