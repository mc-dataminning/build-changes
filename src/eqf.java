import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eqf(je<eiy<?, ?>> e, List<eqi> f) {
   public static final Codec<eqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiy.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eqi.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eqf::new)
   );
   public static final Codec<je<eqf>> b = alc.a(mg.bb, a);
   public static final Codec<ji<eqf>> c = jt.a(mg.bb, a);
   public static final Codec<List<ji<eqf>>> d = jt.a(mg.bb, a, true).listOf();

   public boolean a(djz $$0, ecf $$1, azv $$2, iu $$3) {
      return this.a(new eqg($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(djz $$0, ecf $$1, azv $$2, iu $$3) {
      return this.a(new eqg($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eqg $$0, azv $$1, iu $$2) {
      Stream<iu> $$3 = Stream.of($$2);

      for (eqi $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eiy<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eiy<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public je<eiy<?, ?>> b() {
      return this.e;
   }

   public List<eqi> c() {
      return this.f;
   }
}
