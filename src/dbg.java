import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dbg(List<buw> c, float f) implements dbi {
   public static final MapCodec<dbg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(buw.d.listOf().fieldOf("effects").forGetter(dbg::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dbg::c))
            .apply($$0, dbg::new)
   );
   public static final yt<wg, dbg> b = yt.a(buw.e.a(yr.a()), dbg::b, yr.l, dbg::c, dbg::new);

   public dbg(buw $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dbg(List<buw> $$0) {
      this($$0, 1.0F);
   }

   public dbg(buw $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dbi.a<dbg> a() {
      return dbi.a.a;
   }

   @Override
   public boolean a(dhp $$0, cxy $$1, bwr $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (buw $$4 : this.c) {
            if ($$2.a(new buw($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<buw> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
