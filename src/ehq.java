import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ehq(ji<ean<?, ?>> e, List<eht> f) {
   public static final Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ean.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eht.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ehq::new)
   );
   public static final Codec<ji<ehq>> b = alb.a(lq.aI, a);
   public static final Codec<jm<ehq>> c = jx.a(lq.aI, a);
   public static final Codec<List<jm<ehq>>> d = jx.a(lq.aI, a, true).listOf();

   public boolean a(dcv $$0, dub $$1, azh $$2, iz $$3) {
      return this.a(new ehr($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dcv $$0, dub $$1, azh $$2, iz $$3) {
      return this.a(new ehr($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ehr $$0, azh $$1, iz $$2) {
      Stream<iz> $$3 = Stream.of($$2);

      for (eht $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ean<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ean<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ji<ean<?, ?>> b() {
      return this.e;
   }

   public List<eht> c() {
      return this.f;
   }
}
