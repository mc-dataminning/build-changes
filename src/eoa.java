import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eoa extends eof {
   public static final Codec<eoa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kt.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eoa::new)
   );
   private final in<crn> j;

   private eoa(in<crn> $$0, int $$1, int $$2, List<eql> $$3, List<eoy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eoe a() {
      return eob.c;
   }

   @Override
   public void a(Consumer<crs> $$0, enk $$1) {
      $$0.accept(new crs(this.j));
   }

   public static eof.a<?> a(czf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eoa($$0.p().n(), $$1, $$2, $$3, $$4));
   }
}
