import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record duo(hg<dnl<?, ?>> e, List<dur> f) {
   public static final Codec<duo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnl.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dur.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, duo::new)
   );
   public static final Codec<hg<duo>> b = aeu.a(je.ay, a);
   public static final Codec<hk<duo>> c = hv.a(je.ay, a);
   public static final Codec<List<hk<duo>>> d = hv.a(je.ay, a, true).listOf();

   public boolean a(cqr $$0, dhi $$1, ase $$2, gw $$3) {
      return this.a(new dup($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cqr $$0, dhi $$1, ase $$2, gw $$3) {
      return this.a(new dup($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dup $$0, ase $$1, gw $$2) {
      Stream<gw> $$3 = Stream.of($$2);

      for (dur $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dnl<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dnl<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public hg<dnl<?, ?>> b() {
      return this.e;
   }

   public List<dur> c() {
      return this.f;
   }
}
