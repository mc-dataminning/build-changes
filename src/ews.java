import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ews extends exa {
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alp.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ews::new)
   );
   private final alp j;

   private ews(alp $$0, int $$1, int $$2, List<ezr> $$3, List<exw> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewz a() {
      return eww.e;
   }

   @Override
   public void a(Consumer<cxg> $$0, ewi $$1) {
      $$1.a(this.j, $$0);
   }

   public static exa.a<?> a(alp $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ews($$0, $$1, $$2, $$3, $$4));
   }
}
