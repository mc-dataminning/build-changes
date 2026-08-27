import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class epp extends epx {
   public static final MapCodec<epp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akm.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, epp::new)
   );
   private final akm j;

   private epp(akm $$0, int $$1, int $$2, List<esl> $$3, List<eqr> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epw a() {
      return ept.e;
   }

   @Override
   public void a(Consumer<cto> $$0, epf $$1) {
      $$1.a(this.j, $$0);
   }

   public static epx.a<?> a(akm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epp($$0, $$1, $$2, $$3, $$4));
   }
}
