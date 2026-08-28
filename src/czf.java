import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czf(List<bte> c, float f) implements czh {
   public static final MapCodec<czf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bte.d.listOf().fieldOf("effects").forGetter(czf::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czf::c))
            .apply($$0, czf::new)
   );
   public static final zf<ws, czf> b = zf.a(bte.e.a(zd.a()), czf::b, zd.j, czf::c, czf::new);

   public czf(bte $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czf(List<bte> $$0) {
      this($$0, 1.0F);
   }

   public czf(bte $$0) {
      this($$0, 1.0F);
   }

   @Override
   public czh.a<czf> a() {
      return czh.a.a;
   }

   @Override
   public boolean a(dev $$0, cvx $$1, buv $$2) {
      if ($$2.ea().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bte $$4 : this.c) {
            if ($$2.a(new bte($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bte> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
