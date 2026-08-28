import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ekj extends ekd {
   public static final MapCodec<ekj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ekd.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               brp.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ekj::new)
   );
   private final ekd c;
   private final String d;
   @Nullable
   private dxw e;
   private final brp f;

   public ekj(ekd $$0, dxw $$1, brp $$2) {
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

   public ekj(ekd $$0, String $$1, brp $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected eke<?> a() {
      return eke.g;
   }

   @Override
   public dwx a(azh $$0, ji $$1) {
      dwx $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dxw $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dxw a(dwx $$0, String $$1) {
      Collection<dxz<?>> $$2 = $$0.F();
      Optional<dxw> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dxw).map($$0x -> (dxw)$$0x).findAny();
      return $$3.orElse(null);
   }
}
