import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class egp extends egj {
   public static final MapCodec<egp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               egj.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bpw.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egp::new)
   );
   private final egj c;
   private final String d;
   @Nullable
   private duc e;
   private final bpw f;

   public egp(egj $$0, duc $$1, bpw $$2) {
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

   public egp(egj $$0, String $$1, bpw $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected egk<?> a() {
      return egk.g;
   }

   @Override
   public dtc a(ayw $$0, jd $$1) {
      dtc $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         duc $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static duc a(dtc $$0, String $$1) {
      Collection<duf<?>> $$2 = $$0.B();
      Optional<duc> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof duc).map($$0x -> (duc)$$0x).findAny();
      return $$3.orElse(null);
   }
}
