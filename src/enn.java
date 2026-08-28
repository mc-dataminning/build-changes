import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record enn(jq<egh<?, ?>> e, List<enq> f) {
   public static final Codec<enn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egh.b.fieldOf("feature").forGetter($$0x -> $$0x.e), enq.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, enn::new)
   );
   public static final Codec<jq<enn>> b = alv.a(mb.aT, a);
   public static final Codec<ju<enn>> c = kf.a(mb.aT, a);
   public static final Codec<List<ju<enn>>> d = kf.a(mb.aT, a, true).listOf();

   public boolean a(dif $$0, dzq $$1, bam $$2, jh $$3) {
      return this.a(new eno($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dif $$0, dzq $$1, bam $$2, jh $$3) {
      return this.a(new eno($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eno $$0, bam $$1, jh $$2) {
      Stream<jh> $$3 = Stream.of($$2);

      for (enq $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      egh<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<egh<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jq<egh<?, ?>> b() {
      return this.e;
   }

   public List<enq> c() {
      return this.f;
   }
}
