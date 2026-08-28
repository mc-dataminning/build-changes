import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record err(jg<ekh<?, ?>> e, List<eru> f) {
   public static final Codec<err> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekh.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eru.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, err::new)
   );
   public static final Codec<jg<err>> b = aln.a(mi.bb, a);
   public static final Codec<jk<err>> c = jv.a(mi.bb, a);
   public static final Codec<List<jk<err>>> d = jv.a(mi.bb, a, true).listOf();

   public boolean a(dli $$0, edo $$1, bai $$2, iw $$3) {
      return this.a(new ers($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dli $$0, edo $$1, bai $$2, iw $$3) {
      return this.a(new ers($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ers $$0, bai $$1, iw $$2) {
      Stream<iw> $$3 = Stream.of($$2);

      for (eru $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ekh<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ekh<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jg<ekh<?, ?>> b() {
      return this.e;
   }

   public List<eru> c() {
      return this.f;
   }
}
