import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record erh(jg<ejx<?, ?>> e, List<erk> f) {
   public static final Codec<erh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejx.b.fieldOf("feature").forGetter($$0x -> $$0x.e), erk.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, erh::new)
   );
   public static final Codec<jg<erh>> b = alg.a(mi.bb, a);
   public static final Codec<jk<erh>> c = jv.a(mi.bb, a);
   public static final Codec<List<jk<erh>>> d = jv.a(mi.bb, a, true).listOf();

   public boolean a(dky $$0, ede $$1, azz $$2, iw $$3) {
      return this.a(new eri($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dky $$0, ede $$1, azz $$2, iw $$3) {
      return this.a(new eri($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eri $$0, azz $$1, iw $$2) {
      Stream<iw> $$3 = Stream.of($$2);

      for (erk $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ejx<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ejx<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jg<ejx<?, ?>> b() {
      return this.e;
   }

   public List<erk> c() {
      return this.f;
   }
}
