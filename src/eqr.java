import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eqr(jf<ejk<?, ?>> e, List<equ> f) {
   public static final Codec<eqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejk.b.fieldOf("feature").forGetter($$0x -> $$0x.e), equ.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eqr::new)
   );
   public static final Codec<jf<eqr>> b = alc.a(mh.bb, a);
   public static final Codec<jj<eqr>> c = ju.a(mh.bb, a);
   public static final Codec<List<jj<eqr>>> d = ju.a(mh.bb, a, true).listOf();

   public boolean a(dkl $$0, ecr $$1, azv $$2, iv $$3) {
      return this.a(new eqs($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dkl $$0, ecr $$1, azv $$2, iv $$3) {
      return this.a(new eqs($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eqs $$0, azv $$1, iv $$2) {
      Stream<iv> $$3 = Stream.of($$2);

      for (equ $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ejk<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ejk<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jf<ejk<?, ?>> b() {
      return this.e;
   }

   public List<equ> c() {
      return this.f;
   }
}
