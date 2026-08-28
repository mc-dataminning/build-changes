import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eno(jq<egi<?, ?>> e, List<enr> f) {
   public static final Codec<eno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egi.b.fieldOf("feature").forGetter($$0x -> $$0x.e), enr.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eno::new)
   );
   public static final Codec<jq<eno>> b = alv.a(mb.aT, a);
   public static final Codec<ju<eno>> c = kf.a(mb.aT, a);
   public static final Codec<List<ju<eno>>> d = kf.a(mb.aT, a, true).listOf();

   public boolean a(dig $$0, dzr $$1, bam $$2, jh $$3) {
      return this.a(new enp($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dig $$0, dzr $$1, bam $$2, jh $$3) {
      return this.a(new enp($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(enp $$0, bam $$1, jh $$2) {
      Stream<jh> $$3 = Stream.of($$2);

      for (enr $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      egi<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<egi<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jq<egi<?, ?>> b() {
      return this.e;
   }

   public List<enr> c() {
      return this.f;
   }
}
