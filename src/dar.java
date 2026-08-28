import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dar implements czx {
   final String a;
   final czv b;
   final cvp c;
   final List<dad> d;
   @Nullable
   private dag e;

   public dar(String $$0, czv $$1, cvp $$2, List<dad> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public dam<?> aq_() {
      return dam.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public czv d() {
      return this.b;
   }

   @Override
   public cvp a(jp.a $$0) {
      return this.c;
   }

   @Override
   public dag a() {
      if (this.e == null) {
         this.e = dag.b(this.d);
      }

      return this.e;
   }

   public boolean a(czw $$0, deg $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cvp a(czw $$0, jp.a $$1) {
      return this.c.u();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements dam<dar> {
      private static final MapCodec<dar> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  czv.e.fieldOf("category").orElse(czv.d).forGetter($$0x -> $$0x.b),
                  cvp.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  dad.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dar::new)
      );
      public static final zb<wo, dar> w = zb.a(yz.l, $$0 -> $$0.a, czv.g, $$0 -> $$0.b, cvp.i, $$0 -> $$0.c, dad.a.a(yz.a()), $$0 -> $$0.d, dar::new);

      @Override
      public MapCodec<dar> a() {
         return x;
      }

      @Override
      public zb<wo, dar> b() {
         return w;
      }
   }
}
