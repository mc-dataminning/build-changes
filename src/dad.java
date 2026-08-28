import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dad implements czj {
   final String a;
   final czh b;
   final cvl c;
   final List<czp> d;
   @Nullable
   private czs e;

   public dad(String $$0, czh $$1, cvl $$2, List<czp> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public czy<?> as_() {
      return czy.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public czh d() {
      return this.b;
   }

   @Override
   public cvl a(jp.a $$0) {
      return this.c;
   }

   @Override
   public czs a() {
      if (this.e == null) {
         this.e = czs.b(this.d);
      }

      return this.e;
   }

   public boolean a(czi $$0, dds $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cvl a(czi $$0, jp.a $$1) {
      return this.c.u();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements czy<dad> {
      private static final MapCodec<dad> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  czh.e.fieldOf("category").orElse(czh.d).forGetter($$0x -> $$0x.b),
                  cvl.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  czp.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dad::new)
      );
      public static final zb<wo, dad> w = zb.a(yz.l, $$0 -> $$0.a, czh.g, $$0 -> $$0.b, cvl.i, $$0 -> $$0.c, czp.a.a(yz.a()), $$0 -> $$0.d, dad::new);

      @Override
      public MapCodec<dad> a() {
         return x;
      }

      @Override
      public zb<wo, dad> b() {
         return w;
      }
   }
}
