import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eps extends epx {
   public static final MapCodec<eps> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eps::new)
   );
   private final ix<ctj> j;

   private eps(ix<ctj> $$0, int $$1, int $$2, List<esl> $$3, List<eqr> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epw a() {
      return ept.c;
   }

   @Override
   public void a(Consumer<cto> $$0, epf $$1) {
      $$0.accept(new cto(this.j));
   }

   public static epx.a<?> a(daw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eps($$0.q().n(), $$1, $$2, $$3, $$4));
   }
}
