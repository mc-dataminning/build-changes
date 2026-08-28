import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class eow extends eoq {
   public static final MapCodec<eow> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eoq.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               btw.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eow::new)
   );
   private final eoq c;
   private final String d;
   @Nullable
   private ece e;
   private final btw f;

   public eow(eoq $$0, ece $$1, btw $$2) {
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

   public eow(eoq $$0, String $$1, btw $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected eor<?> a() {
      return eor.g;
   }

   @Override
   public ebe a(azx $$0, iv $$1) {
      ebe $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         ece $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static ece a(ebe $$0, String $$1) {
      Collection<ech<?>> $$2 = $$0.F();
      Optional<ece> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof ece).map($$0x -> (ece)$$0x).findAny();
      return $$3.orElse(null);
   }
}
