import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etq extends esy {
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evt.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, etq::new)
   );
   private final evs b;
   private final boolean c;

   private etq(List<euw> $$0, evs $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eta<etq> b() {
      return etb.e;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.a();
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      int $$2 = this.c ? $$0.H() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static esy.a<?> a(evs $$0) {
      return a($$1 -> new etq($$1, $$0, false));
   }

   public static esy.a<?> a(evs $$0, boolean $$1) {
      return a($$2 -> new etq($$2, $$0, $$1));
   }
}
