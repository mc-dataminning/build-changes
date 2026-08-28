import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ekh extends ekb {
   public static final MapCodec<ekh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ekb.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               brn.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ekh::new)
   );
   private final ekb c;
   private final String d;
   @Nullable
   private dxu e;
   private final brn f;

   public ekh(ekb $$0, dxu $$1, brn $$2) {
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

   public ekh(ekb $$0, String $$1, brn $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ekc<?> a() {
      return ekc.g;
   }

   @Override
   public dwv a(azg $$0, ji $$1) {
      dwv $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dxu $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dxu a(dwv $$0, String $$1) {
      Collection<dxx<?>> $$2 = $$0.F();
      Optional<dxu> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dxu).map($$0x -> (dxu)$$0x).findAny();
      return $$3.orElse(null);
   }
}
