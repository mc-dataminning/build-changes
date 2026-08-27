import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehc extends ehk {
   public static final Codec<ehc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahd.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehc::new)
   );
   private final ahd j;

   private ehc(ahd $$0, int $$1, int $$2, List<ejo> $$3, List<eic> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehj a() {
      return ehg.e;
   }

   @Override
   public void a(Consumer<cmr> $$0, egp $$1) {
      $$1.a(this.j, $$0);
   }

   public static ehk.a<?> a(ahd $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehc($$0, $$1, $$2, $$3, $$4));
   }
}
