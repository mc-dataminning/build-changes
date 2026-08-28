import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class egl extends egf {
   public static final MapCodec<egl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               egf.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bpv.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egl::new)
   );
   private final egf c;
   private final String d;
   @Nullable
   private dua e;
   private final bpv f;

   public egl(egf $$0, dua $$1, bpv $$2) {
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

   public egl(egf $$0, String $$1, bpv $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected egg<?> a() {
      return egg.g;
   }

   @Override
   public dta a(ayv $$0, jd $$1) {
      dta $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dua $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dua a(dta $$0, String $$1) {
      Collection<dud<?>> $$2 = $$0.B();
      Optional<dua> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dua).map($$0x -> (dua)$$0x).findAny();
      return $$3.orElse(null);
   }
}
