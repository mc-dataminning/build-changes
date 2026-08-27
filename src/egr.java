import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class egr extends egl {
   public static final Codec<egr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egl.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bpf.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egr::new)
   );
   private final egl c;
   private final String d;
   @Nullable
   private duc e;
   private final bpf f;

   public egr(egl $$0, duc $$1, bpf $$2) {
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

   public egr(egl $$0, String $$1, bpf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected egm<?> a() {
      return egm.g;
   }

   @Override
   public dtc a(ayt $$0, ir $$1) {
      dtc $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static duc a(dtc $$0, String $$1) {
      Collection<duf<?>> $$2 = $$0.B();
      Optional<duc> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof duc).map($$0x -> (duc)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
