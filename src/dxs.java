import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dxs(ie<dqp<?, ?>> e, List<dxv> f) {
   public static final Codec<dxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqp.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dxv.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dxs::new)
   );
   public static final Codec<ie<dxs>> b = agp.a(kc.aB, a);
   public static final Codec<ij<dxs>> c = it.a(kc.aB, a);
   public static final Codec<List<ij<dxs>>> d = it.a(kc.aB, a, true).listOf();

   public boolean a(ctt $$0, dkm $$1, auf $$2, hv $$3) {
      return this.a(new dxt($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(ctt $$0, dkm $$1, auf $$2, hv $$3) {
      return this.a(new dxt($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dxt $$0, auf $$1, hv $$2) {
      Stream<hv> $$3 = Stream.of($$2);

      for (dxv $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dqp<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dqp<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ie<dqp<?, ?>> b() {
      return this.e;
   }

   public List<dxv> c() {
      return this.f;
   }
}
