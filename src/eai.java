import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eai(ij<dtf<?, ?>> e, List<eal> f) {
   public static final Codec<eai> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtf.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eal.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eai::new)
   );
   public static final Codec<ij<eai>> b = aiu.a(kg.aC, a);
   public static final Codec<in<eai>> c = ix.a(kg.aC, a);
   public static final Codec<List<in<eai>>> d = ix.a(kg.aC, a, true).listOf();

   public boolean a(cwi $$0, dnc $$1, awo $$2, hz $$3) {
      return this.a(new eaj($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cwi $$0, dnc $$1, awo $$2, hz $$3) {
      return this.a(new eaj($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eaj $$0, awo $$1, hz $$2) {
      Stream<hz> $$3 = Stream.of($$2);

      for (eal $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dtf<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dtf<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ij<dtf<?, ?>> b() {
      return this.e;
   }

   public List<eal> c() {
      return this.f;
   }
}
