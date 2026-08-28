import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czp(List<btn> c, float f) implements czr {
   public static final MapCodec<czp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btn.d.listOf().fieldOf("effects").forGetter(czp::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czp::c))
            .apply($$0, czp::new)
   );
   public static final zj<ww, czp> b = zj.a(btn.e.a(zh.a()), czp::b, zh.j, czp::c, czp::new);

   public czp(btn $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czp(List<btn> $$0) {
      this($$0, 1.0F);
   }

   public czp(btn $$0) {
      this($$0, 1.0F);
   }

   @Override
   public czr.a<czp> a() {
      return czr.a.a;
   }

   @Override
   public boolean a(dff $$0, cwf $$1, bve $$2) {
      if ($$2.eb().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (btn $$4 : this.c) {
            if ($$2.a(new btn($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<btn> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
