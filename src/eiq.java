import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eiq(jm<ebn<?, ?>> e, List<eit> f) {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebn.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eit.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eiq::new)
   );
   public static final Codec<jm<eiq>> b = akm.a(lu.aQ, a);
   public static final Codec<jq<eiq>> c = kb.a(lu.aQ, a);
   public static final Codec<List<jq<eiq>>> d = kb.a(lu.aQ, a, true).listOf();

   public boolean a(ddq $$0, dux $$1, ayv $$2, jd $$3) {
      return this.a(new eir($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(ddq $$0, dux $$1, ayv $$2, jd $$3) {
      return this.a(new eir($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eir $$0, ayv $$1, jd $$2) {
      Stream<jd> $$3 = Stream.of($$2);

      for (eit $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ebn<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ebn<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jm<ebn<?, ?>> b() {
      return this.e;
   }

   public List<eit> c() {
      return this.f;
   }
}
