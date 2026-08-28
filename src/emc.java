import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class emc extends elw {
   public static final MapCodec<emc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               elw.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bsv.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, emc::new)
   );
   private final elw c;
   private final String d;
   @Nullable
   private dzm e;
   private final bsv f;

   public emc(elw $$0, dzm $$1, bsv $$2) {
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

   public emc(elw $$0, String $$1, bsv $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected elx<?> a() {
      return elx.g;
   }

   @Override
   public dym a(azs $$0, jj $$1) {
      dym $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dzm $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dzm a(dym $$0, String $$1) {
      Collection<dzp<?>> $$2 = $$0.F();
      Optional<dzm> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dzm).map($$0x -> (dzm)$$0x).findAny();
      return $$3.orElse(null);
   }
}
