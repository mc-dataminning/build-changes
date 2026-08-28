import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czg(List<bsy> c, float f) implements czi {
   public static final MapCodec<czg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsy.d.listOf().fieldOf("effects").forGetter(czg::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czg::c))
            .apply($$0, czg::new)
   );
   public static final zc<wp, czg> b = zc.a(bsy.e.a(za.a()), czg::b, za.j, czg::c, czg::new);

   public czg(bsy $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czg(List<bsy> $$0) {
      this($$0, 1.0F);
   }

   public czg(bsy $$0) {
      this($$0, 1.0F);
   }

   @Override
   public czi.a<czg> a() {
      return czi.a.a;
   }

   @Override
   public boolean a(dej $$0, cvs $$1, bun $$2) {
      if ($$2.dV().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bsy $$4 : this.c) {
            if ($$2.a(new bsy($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bsy> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
