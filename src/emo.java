import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record emo(jr<efi<?, ?>> e, List<emr> f) {
   public static final Codec<emo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efi.b.fieldOf("feature").forGetter($$0x -> $$0x.e), emr.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, emo::new)
   );
   public static final Codec<jr<emo>> b = akq.a(mc.aT, a);
   public static final Codec<jv<emo>> c = kg.a(mc.aT, a);
   public static final Codec<List<jv<emo>>> d = kg.a(mc.aT, a, true).listOf();

   public boolean a(dhe $$0, dyr $$1, azg $$2, ji $$3) {
      return this.a(new emp($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dhe $$0, dyr $$1, azg $$2, ji $$3) {
      return this.a(new emp($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(emp $$0, azg $$1, ji $$2) {
      Stream<ji> $$3 = Stream.of($$2);

      for (emr $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      efi<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<efi<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jr<efi<?, ?>> b() {
      return this.e;
   }

   public List<emr> c() {
      return this.f;
   }
}
