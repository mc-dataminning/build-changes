import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class eoe extends eny {
   public static final MapCodec<eoe> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eny.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               btl.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eoe::new)
   );
   private final eny c;
   private final String d;
   @Nullable
   private ebo e;
   private final btl f;

   public eoe(eny $$0, ebo $$1, btl $$2) {
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

   public eoe(eny $$0, String $$1, btl $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected enz<?> a() {
      return enz.g;
   }

   @Override
   public eao a(azv $$0, iv $$1) {
      eao $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         ebo $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static ebo a(eao $$0, String $$1) {
      Collection<ebr<?>> $$2 = $$0.F();
      Optional<ebo> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof ebo).map($$0x -> (ebo)$$0x).findAny();
      return $$3.orElse(null);
   }
}
