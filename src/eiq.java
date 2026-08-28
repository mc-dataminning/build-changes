import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class eiq extends eik {
   public static final MapCodec<eiq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eik.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               brd.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eiq::new)
   );
   private final eik c;
   private final String d;
   @Nullable
   private dwd e;
   private final brd f;

   public eiq(eik $$0, dwd $$1, brd $$2) {
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

   public eiq(eik $$0, String $$1, brd $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected eil<?> a() {
      return eil.g;
   }

   @Override
   public dvd a(azr $$0, jg $$1) {
      dvd $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dwd $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dwd a(dvd $$0, String $$1) {
      Collection<dwg<?>> $$2 = $$0.F();
      Optional<dwd> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dwd).map($$0x -> (dwd)$$0x).findAny();
      return $$3.orElse(null);
   }
}
