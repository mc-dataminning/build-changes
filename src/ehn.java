import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ehn(ji<eak<?, ?>> e, List<ehq> f) {
   public static final Codec<ehn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eak.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ehq.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ehn::new)
   );
   public static final Codec<ji<ehn>> b = ala.a(lq.aI, a);
   public static final Codec<jm<ehn>> c = jx.a(lq.aI, a);
   public static final Codec<List<jm<ehn>>> d = jx.a(lq.aI, a, true).listOf();

   public boolean a(dcs $$0, dty $$1, azg $$2, iz $$3) {
      return this.a(new eho($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dcs $$0, dty $$1, azg $$2, iz $$3) {
      return this.a(new eho($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eho $$0, azg $$1, iz $$2) {
      Stream<iz> $$3 = Stream.of($$2);

      for (ehq $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eak<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eak<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ji<eak<?, ?>> b() {
      return this.e;
   }

   public List<ehq> c() {
      return this.f;
   }
}
