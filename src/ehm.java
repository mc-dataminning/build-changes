import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ehm(ji<eaj<?, ?>> e, List<ehp> f) {
   public static final Codec<ehm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eaj.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ehp.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ehm::new)
   );
   public static final Codec<ji<ehm>> b = ala.a(lq.aI, a);
   public static final Codec<jm<ehm>> c = jx.a(lq.aI, a);
   public static final Codec<List<jm<ehm>>> d = jx.a(lq.aI, a, true).listOf();

   public boolean a(dcr $$0, dtx $$1, azf $$2, iz $$3) {
      return this.a(new ehn($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dcr $$0, dtx $$1, azf $$2, iz $$3) {
      return this.a(new ehn($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ehn $$0, azf $$1, iz $$2) {
      Stream<iz> $$3 = Stream.of($$2);

      for (ehp $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eaj<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eaj<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ji<eaj<?, ?>> b() {
      return this.e;
   }

   public List<ehp> c() {
      return this.f;
   }
}
