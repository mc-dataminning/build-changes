import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ekk(jo<edg<?, ?>> e, List<ekn> f) {
   public static final Codec<ekk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edg.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ekn.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ekk::new)
   );
   public static final Codec<jo<ekk>> b = ala.a(lw.aS, a);
   public static final Codec<js<ekk>> c = kd.a(lw.aS, a);
   public static final Codec<List<js<ekk>>> d = kd.a(lw.aS, a, true).listOf();

   public boolean a(dfg $$0, dwp $$1, azn $$2, jf $$3) {
      return this.a(new ekl($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dfg $$0, dwp $$1, azn $$2, jf $$3) {
      return this.a(new ekl($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ekl $$0, azn $$1, jf $$2) {
      Stream<jf> $$3 = Stream.of($$2);

      for (ekn $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      edg<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<edg<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jo<edg<?, ?>> b() {
      return this.e;
   }

   public List<ekn> c() {
      return this.f;
   }
}
