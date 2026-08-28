import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class eoy extends eos {
   public static final MapCodec<eoy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eos.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bty.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eoy::new)
   );
   private final eos c;
   private final String d;
   @Nullable
   private ecg e;
   private final bty f;

   public eoy(eos $$0, ecg $$1, bty $$2) {
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

   public eoy(eos $$0, String $$1, bty $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected eot<?> a() {
      return eot.g;
   }

   @Override
   public ebg a(azz $$0, iw $$1) {
      ebg $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         ecg $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static ecg a(ebg $$0, String $$1) {
      Collection<ecj<?>> $$2 = $$0.F();
      Optional<ecg> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof ecg).map($$0x -> (ecg)$$0x).findAny();
      return $$3.orElse(null);
   }
}
