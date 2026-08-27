import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record efk(iv<dyh<?, ?>> e, List<efn> f) {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyh.b.fieldOf("feature").forGetter($$0x -> $$0x.e), efn.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, efk::new)
   );
   public static final Codec<iv<efk>> b = akb.a(ld.aH, a);
   public static final Codec<iz<efk>> c = jk.a(ld.aH, a);
   public static final Codec<List<iz<efk>>> d = jk.a(ld.aH, a, true).listOf();

   public boolean a(dap $$0, drv $$1, ayd $$2, im $$3) {
      return this.a(new efl($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dap $$0, drv $$1, ayd $$2, im $$3) {
      return this.a(new efl($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(efl $$0, ayd $$1, im $$2) {
      Stream<im> $$3 = Stream.of($$2);

      for (efn $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dyh<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dyh<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public iv<dyh<?, ?>> b() {
      return this.e;
   }

   public List<efn> c() {
      return this.f;
   }
}
