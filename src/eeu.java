import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eeu(in<dxr<?, ?>> e, List<eex> f) {
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxr.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eex.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eeu::new)
   );
   public static final Codec<in<eeu>> b = ajr.a(ku.aF, a);
   public static final Codec<ir<eeu>> c = jc.a(ku.aF, a);
   public static final Codec<List<ir<eeu>>> d = jc.a(ku.aF, a, true).listOf();

   public boolean a(dab $$0, drf $$1, axt $$2, id $$3) {
      return this.a(new eev($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dab $$0, drf $$1, axt $$2, id $$3) {
      return this.a(new eev($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eev $$0, axt $$1, id $$2) {
      Stream<id> $$3 = Stream.of($$2);

      for (eex $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dxr<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dxr<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public in<dxr<?, ?>> b() {
      return this.e;
   }

   public List<eex> c() {
      return this.f;
   }
}
