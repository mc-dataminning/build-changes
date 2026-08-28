import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eok(js<ehd<?, ?>> e, List<eon> f) {
   public static final Codec<eok> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehd.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eon.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eok::new)
   );
   public static final Codec<js<eok>> b = akz.a(me.aY, a);
   public static final Codec<jw<eok>> c = kh.a(me.aY, a);
   public static final Codec<List<jw<eok>>> d = kh.a(me.aY, a, true).listOf();

   public boolean a(dio $$0, eak $$1, azs $$2, jj $$3) {
      return this.a(new eol($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dio $$0, eak $$1, azs $$2, jj $$3) {
      return this.a(new eol($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eol $$0, azs $$1, jj $$2) {
      Stream<jj> $$3 = Stream.of($$2);

      for (eon $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ehd<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ehd<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public js<ehd<?, ?>> b() {
      return this.e;
   }

   public List<eon> c() {
      return this.f;
   }
}
