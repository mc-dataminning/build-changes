import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ekg(jn<edc<?, ?>> e, List<ekj> f) {
   public static final Codec<ekg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edc.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ekj.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ekg::new)
   );
   public static final Codec<jn<ekg>> b = aky.a(lv.aR, a);
   public static final Codec<jr<ekg>> c = kc.a(lv.aR, a);
   public static final Codec<List<jr<ekg>>> d = kc.a(lv.aR, a, true).listOf();

   public boolean a(dfd $$0, dwl $$1, azl $$2, je $$3) {
      return this.a(new ekh($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dfd $$0, dwl $$1, azl $$2, je $$3) {
      return this.a(new ekh($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ekh $$0, azl $$1, je $$2) {
      Stream<je> $$3 = Stream.of($$2);

      for (ekj $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      edc<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<edc<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jn<edc<?, ?>> b() {
      return this.e;
   }

   public List<ekj> c() {
      return this.f;
   }
}
