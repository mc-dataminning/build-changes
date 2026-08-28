import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class elh extends elb {
   public static final MapCodec<elh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               elb.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bso.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, elh::new)
   );
   private final elb c;
   private final String d;
   @Nullable
   private dyu e;
   private final bso f;

   public elh(elb $$0, dyu $$1, bso $$2) {
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

   public elh(elb $$0, String $$1, bso $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected elc<?> a() {
      return elc.g;
   }

   @Override
   public dxv a(bam $$0, jh $$1) {
      dxv $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dyu $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dyu a(dxv $$0, String $$1) {
      Collection<dyx<?>> $$2 = $$0.F();
      Optional<dyu> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dyu).map($$0x -> (dyu)$$0x).findAny();
      return $$3.orElse(null);
   }
}
