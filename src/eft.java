import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eft(iw<dyq<?, ?>> e, List<efw> f) {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyq.b.fieldOf("feature").forGetter($$0x -> $$0x.e), efw.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eft::new)
   );
   public static final Codec<iw<eft>> b = akd.a(le.aI, a);
   public static final Codec<ja<eft>> c = jl.a(le.aI, a);
   public static final Codec<List<ja<eft>>> d = jl.a(le.aI, a, true).listOf();

   public boolean a(day $$0, dse $$1, ayg $$2, in $$3) {
      return this.a(new efu($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(day $$0, dse $$1, ayg $$2, in $$3) {
      return this.a(new efu($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(efu $$0, ayg $$1, in $$2) {
      Stream<in> $$3 = Stream.of($$2);

      for (efw $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dyq<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dyq<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public iw<dyq<?, ?>> b() {
      return this.e;
   }

   public List<efw> c() {
      return this.f;
   }
}
