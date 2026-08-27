import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record egp(ix<dzm<?, ?>> e, List<egs> f) {
   public static final Codec<egp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzm.b.fieldOf("feature").forGetter($$0x -> $$0x.e), egs.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, egp::new)
   );
   public static final Codec<ix<egp>> b = akj.a(lf.aI, a);
   public static final Codec<jb<egp>> c = jm.a(lf.aI, a);
   public static final Codec<List<jb<egp>>> d = jm.a(lf.aI, a, true).listOf();

   public boolean a(dbu $$0, dta $$1, aym $$2, io $$3) {
      return this.a(new egq($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dbu $$0, dta $$1, aym $$2, io $$3) {
      return this.a(new egq($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(egq $$0, aym $$1, io $$2) {
      Stream<io> $$3 = Stream.of($$2);

      for (egs $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dzm<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dzm<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ix<dzm<?, ?>> b() {
      return this.e;
   }

   public List<egs> c() {
      return this.f;
   }
}
