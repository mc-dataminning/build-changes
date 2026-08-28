import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class eif extends ehz {
   public static final MapCodec<eif> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ehz.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bqx.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eif::new)
   );
   private final ehz c;
   private final String d;
   @Nullable
   private dvs e;
   private final bqx f;

   public eif(ehz $$0, dvs $$1, bqx $$2) {
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

   public eif(ehz $$0, String $$1, bqx $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected eia<?> a() {
      return eia.g;
   }

   @Override
   public dus a(azn $$0, jf $$1) {
      dus $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dvs $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dvs a(dus $$0, String $$1) {
      Collection<dvv<?>> $$2 = $$0.F();
      Optional<dvs> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dvs).map($$0x -> (dvs)$$0x).findAny();
      return $$3.orElse(null);
   }
}
