import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ela extends eku {
   public static final MapCodec<ela> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eku.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bsf.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ela::new)
   );
   private final eku c;
   private final String d;
   @Nullable
   private dyn e;
   private final bsf f;

   public ela(eku $$0, dyn $$1, bsf $$2) {
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

   public ela(eku $$0, String $$1, bsf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ekv<?> a() {
      return ekv.g;
   }

   @Override
   public dxo a(bac $$0, jh $$1) {
      dxo $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dyn $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dyn a(dxo $$0, String $$1) {
      Collection<dyq<?>> $$2 = $$0.F();
      Optional<dyn> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dyn).map($$0x -> (dyn)$$0x).findAny();
      return $$3.orElse(null);
   }
}
