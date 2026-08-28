import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record emp(jr<efj<?, ?>> e, List<ems> f) {
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efj.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ems.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, emp::new)
   );
   public static final Codec<jr<emp>> b = akr.a(mc.aT, a);
   public static final Codec<jv<emp>> c = kg.a(mc.aT, a);
   public static final Codec<List<jv<emp>>> d = kg.a(mc.aT, a, true).listOf();

   public boolean a(dhf $$0, dys $$1, azh $$2, ji $$3) {
      return this.a(new emq($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dhf $$0, dys $$1, azh $$2, ji $$3) {
      return this.a(new emq($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(emq $$0, azh $$1, ji $$2) {
      Stream<ji> $$3 = Stream.of($$2);

      for (ems $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      efj<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<efj<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jr<efj<?, ?>> b() {
      return this.e;
   }

   public List<ems> c() {
      return this.f;
   }
}
