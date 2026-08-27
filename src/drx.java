import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class drx extends drr {
   public static final Codec<drx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drr.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bfv.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, drx::new)
   );
   private final drr c;
   private final String d;
   @Nullable
   private dfz e;
   private final bfv f;

   public drx(drr $$0, dfz $$1, bfv $$2) {
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

   public drx(drr $$0, String $$1, bfv $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected drs<?> a() {
      return drs.g;
   }

   @Override
   public dez a(aru $$0, gu $$1) {
      dez $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dfz a(dez $$0, String $$1) {
      Collection<dgc<?>> $$2 = $$0.B();
      Optional<dfz> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dfz).map($$0x -> (dfz)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
