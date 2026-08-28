import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record elm(jq<eei<?, ?>> e, List<elp> f) {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eei.b.fieldOf("feature").forGetter($$0x -> $$0x.e), elp.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, elm::new)
   );
   public static final Codec<jq<elm>> b = alf.a(ma.aR, a);
   public static final Codec<ju<elm>> c = kf.a(ma.aR, a);
   public static final Codec<List<ju<elm>>> d = kf.a(ma.aR, a, true).listOf();

   public boolean a(dgk $$0, dxr $$1, azu $$2, jh $$3) {
      return this.a(new eln($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dgk $$0, dxr $$1, azu $$2, jh $$3) {
      return this.a(new eln($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eln $$0, azu $$1, jh $$2) {
      Stream<jh> $$3 = Stream.of($$2);

      for (elp $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eei<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eei<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jq<eei<?, ?>> b() {
      return this.e;
   }

   public List<elp> c() {
      return this.f;
   }
}
