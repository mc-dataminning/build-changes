import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ehp(ji<eam<?, ?>> e, List<ehs> f) {
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eam.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ehs.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ehp::new)
   );
   public static final Codec<ji<ehp>> b = alb.a(lq.aI, a);
   public static final Codec<jm<ehp>> c = jx.a(lq.aI, a);
   public static final Codec<List<jm<ehp>>> d = jx.a(lq.aI, a, true).listOf();

   public boolean a(dcu $$0, dua $$1, azh $$2, iz $$3) {
      return this.a(new ehq($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dcu $$0, dua $$1, azh $$2, iz $$3) {
      return this.a(new ehq($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ehq $$0, azh $$1, iz $$2) {
      Stream<iz> $$3 = Stream.of($$2);

      for (ehs $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eam<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eam<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ji<eam<?, ?>> b() {
      return this.e;
   }

   public List<ehs> c() {
      return this.f;
   }
}
