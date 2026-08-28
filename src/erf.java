import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record erf(jf<ejv<?, ?>> e, List<eri> f) {
   public static final Codec<erf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejv.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eri.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, erf::new)
   );
   public static final Codec<jf<erf>> b = ale.a(mh.bb, a);
   public static final Codec<jj<erf>> c = ju.a(mh.bb, a);
   public static final Codec<List<jj<erf>>> d = ju.a(mh.bb, a, true).listOf();

   public boolean a(dkw $$0, edc $$1, azx $$2, iv $$3) {
      return this.a(new erg($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dkw $$0, edc $$1, azx $$2, iv $$3) {
      return this.a(new erg($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(erg $$0, azx $$1, iv $$2) {
      Stream<iv> $$3 = Stream.of($$2);

      for (eri $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ejv<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ejv<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jf<ejv<?, ?>> b() {
      return this.e;
   }

   public List<eri> c() {
      return this.f;
   }
}
