import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record egn(ix<dzk<?, ?>> e, List<egq> f) {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzk.b.fieldOf("feature").forGetter($$0x -> $$0x.e), egq.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, egn::new)
   );
   public static final Codec<ix<egn>> b = aki.a(lf.aI, a);
   public static final Codec<jb<egn>> c = jm.a(lf.aI, a);
   public static final Codec<List<jb<egn>>> d = jm.a(lf.aI, a, true).listOf();

   public boolean a(dbs $$0, dsy $$1, ayk $$2, io $$3) {
      return this.a(new ego($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dbs $$0, dsy $$1, ayk $$2, io $$3) {
      return this.a(new ego($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ego $$0, ayk $$1, io $$2) {
      Stream<io> $$3 = Stream.of($$2);

      for (egq $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dzk<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dzk<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ix<dzk<?, ?>> b() {
      return this.e;
   }

   public List<egq> c() {
      return this.f;
   }
}
