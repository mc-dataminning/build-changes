import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eng(jq<ega<?, ?>> e, List<enj> f) {
   public static final Codec<eng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ega.b.fieldOf("feature").forGetter($$0x -> $$0x.e), enj.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eng::new)
   );
   public static final Codec<jq<eng>> b = alv.a(mb.aS, a);
   public static final Codec<ju<eng>> c = kf.a(mb.aS, a);
   public static final Codec<List<ju<eng>>> d = kf.a(mb.aS, a, true).listOf();

   public boolean a(dhy $$0, dzj $$1, bam $$2, jh $$3) {
      return this.a(new enh($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dhy $$0, dzj $$1, bam $$2, jh $$3) {
      return this.a(new enh($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(enh $$0, bam $$1, jh $$2) {
      Stream<jh> $$3 = Stream.of($$2);

      for (enj $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ega<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ega<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jq<ega<?, ?>> b() {
      return this.e;
   }

   public List<enj> c() {
      return this.f;
   }
}
