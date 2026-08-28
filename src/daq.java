import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record daq(List<bue> c, float f) implements das {
   public static final MapCodec<daq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bue.d.listOf().fieldOf("effects").forGetter(daq::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(daq::c))
            .apply($$0, daq::new)
   );
   public static final yn<wa, daq> b = yn.a(bue.e.a(yl.a()), daq::b, yl.l, daq::c, daq::new);

   public daq(bue $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public daq(List<bue> $$0) {
      this($$0, 1.0F);
   }

   public daq(bue $$0) {
      this($$0, 1.0F);
   }

   @Override
   public das.a<daq> a() {
      return das.a.a;
   }

   @Override
   public boolean a(dgz $$0, cxh $$1, bvy $$2) {
      if ($$2.dX().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bue $$4 : this.c) {
            if ($$2.a(new bue($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bue> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
