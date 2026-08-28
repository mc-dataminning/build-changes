import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record epm(je<eif<?, ?>> e, List<epp> f) {
   public static final Codec<epm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eif.b.fieldOf("feature").forGetter($$0x -> $$0x.e), epp.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, epm::new)
   );
   public static final Codec<je<epm>> b = ala.a(mg.aZ, a);
   public static final Codec<ji<epm>> c = jt.a(mg.aZ, a);
   public static final Codec<List<ji<epm>>> d = jt.a(mg.aZ, a, true).listOf();

   public boolean a(djo $$0, ebm $$1, azt $$2, iu $$3) {
      return this.a(new epn($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(djo $$0, ebm $$1, azt $$2, iu $$3) {
      return this.a(new epn($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(epn $$0, azt $$1, iu $$2) {
      Stream<iu> $$3 = Stream.of($$2);

      for (epp $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eif<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eif<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public je<eif<?, ?>> b() {
      return this.e;
   }

   public List<epp> c() {
      return this.f;
   }
}
