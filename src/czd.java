import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czd(List<bsv> c, float f) implements czf {
   public static final MapCodec<czd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsv.d.listOf().fieldOf("effects").forGetter(czd::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czd::c))
            .apply($$0, czd::new)
   );
   public static final zb<wo, czd> b = zb.a(bsv.e.a(yz.a()), czd::b, yz.i, czd::c, czd::new);

   public czd(bsv $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czd(List<bsv> $$0) {
      this($$0, 1.0F);
   }

   public czd(bsv $$0) {
      this($$0, 1.0F);
   }

   @Override
   public czf.a<czd> a() {
      return czf.a.a;
   }

   @Override
   public boolean a(deg $$0, cvp $$1, buk $$2) {
      if ($$2.dV().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bsv $$4 : this.c) {
            if ($$2.a(new bsv($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bsv> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
