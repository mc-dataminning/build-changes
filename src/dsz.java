import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsz extends dst {
   public static final Codec<dsz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dst.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bhg.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dsz::new)
   );
   private final dst c;
   private final String d;
   @Nullable
   private dhb e;
   private final bhg f;

   public dsz(dst $$0, dhb $$1, bhg $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$1.f();
      this.f = $$2;
      Collection<Integer> $$3 = $$1.a();

      for (int $$4 = $$2.a(); $$4 <= $$2.b(); $$4++) {
         if (!$$3.contains($$4)) {
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
         }
      }
   }

   public dsz(dst $$0, String $$1, bhg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dsu<?> a() {
      return dsu.g;
   }

   @Override
   public dgb a(ate $$0, ht $$1) {
      dgb $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dhb a(dgb $$0, String $$1) {
      Collection<dhe<?>> $$2 = $$0.B();
      Optional<dhb> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dhb).map($$0x -> (dhb)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
