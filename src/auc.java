import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class auc {
   private static final Codec<auc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ayu.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, auc::new)
   );
   public static final atd<auc> a = atd.a("filter", b);
   private final List<ayu> c;

   public auc(List<ayu> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
