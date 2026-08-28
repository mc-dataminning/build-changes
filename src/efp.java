import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class efp extends efj {
   public static final MapCodec<efp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               efj.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bpi.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efp::new)
   );
   private final efj c;
   private final String d;
   @Nullable
   private dth e;
   private final bpi f;

   public efp(efj $$0, dth $$1, bpi $$2) {
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

   public efp(efj $$0, String $$1, bpi $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected efk<?> a() {
      return efk.g;
   }

   @Override
   public dsh a(aym $$0, ja $$1) {
      dsh $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dth a(dsh $$0, String $$1) {
      Collection<dtk<?>> $$2 = $$0.B();
      Optional<dth> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dth).map($$0x -> (dth)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
