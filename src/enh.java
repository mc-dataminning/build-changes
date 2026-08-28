import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record enh(jq<egb<?, ?>> e, List<enk> f) {
   public static final Codec<enh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egb.b.fieldOf("feature").forGetter($$0x -> $$0x.e), enk.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, enh::new)
   );
   public static final Codec<jq<enh>> b = all.a(mb.aT, a);
   public static final Codec<ju<enh>> c = kf.a(mb.aT, a);
   public static final Codec<List<ju<enh>>> d = kf.a(mb.aT, a, true).listOf();

   public boolean a(dhx $$0, dzk $$1, bac $$2, jh $$3) {
      return this.a(new eni($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dhx $$0, dzk $$1, bac $$2, jh $$3) {
      return this.a(new eni($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eni $$0, bac $$1, jh $$2) {
      Stream<jh> $$3 = Stream.of($$2);

      for (enk $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      egb<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<egb<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jq<egb<?, ?>> b() {
      return this.e;
   }

   public List<enk> c() {
      return this.f;
   }
}
