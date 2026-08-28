import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class epi extends epc {
   public static final MapCodec<epi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               epc.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               buh.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, epi::new)
   );
   private final epc c;
   private final String d;
   @Nullable
   private ecq e;
   private final buh f;

   public epi(epc $$0, ecq $$1, buh $$2) {
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

   public epi(epc $$0, String $$1, buh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected epd<?> a() {
      return epd.g;
   }

   @Override
   public ebq a(bai $$0, iw $$1) {
      ebq $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         ecq $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static ecq a(ebq $$0, String $$1) {
      Collection<ect<?>> $$2 = $$0.F();
      Optional<ecq> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof ecq).map($$0x -> (ecq)$$0x).findAny();
      return $$3.orElse(null);
   }
}
