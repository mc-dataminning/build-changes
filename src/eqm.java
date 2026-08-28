import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eqm(jf<ejf<?, ?>> e, List<eqp> f) {
   public static final Codec<eqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejf.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eqp.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eqm::new)
   );
   public static final Codec<jf<eqm>> b = alc.a(mh.bb, a);
   public static final Codec<jj<eqm>> c = ju.a(mh.bb, a);
   public static final Codec<List<jj<eqm>>> d = ju.a(mh.bb, a, true).listOf();

   public boolean a(dkg $$0, ecm $$1, azv $$2, iv $$3) {
      return this.a(new eqn($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dkg $$0, ecm $$1, azv $$2, iv $$3) {
      return this.a(new eqn($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eqn $$0, azv $$1, iv $$2) {
      Stream<iv> $$3 = Stream.of($$2);

      for (eqp $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ejf<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ejf<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jf<ejf<?, ?>> b() {
      return this.e;
   }

   public List<eqp> c() {
      return this.f;
   }
}
