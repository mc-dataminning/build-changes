import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dau implements daa {
   final String a;
   final czy b;
   final cvs c;
   final List<dag> d;
   @Nullable
   private daj e;

   public dau(String $$0, czy $$1, cvs $$2, List<dag> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public dap<?> ar_() {
      return dap.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public czy d() {
      return this.b;
   }

   @Override
   public cvs a(jq.a $$0) {
      return this.c;
   }

   @Override
   public daj a() {
      if (this.e == null) {
         this.e = daj.b(this.d);
      }

      return this.e;
   }

   public boolean a(czz $$0, dej $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cvs a(czz $$0, jq.a $$1) {
      return this.c.u();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements dap<dau> {
      private static final MapCodec<dau> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  czy.e.fieldOf("category").orElse(czy.d).forGetter($$0x -> $$0x.b),
                  cvs.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  dag.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dau::new)
      );
      public static final zc<wp, dau> w = zc.a(za.m, $$0 -> $$0.a, czy.g, $$0 -> $$0.b, cvs.i, $$0 -> $$0.c, dag.a.a(za.a()), $$0 -> $$0.d, dau::new);

      @Override
      public MapCodec<dau> a() {
         return x;
      }

      @Override
      public zc<wp, dau> b() {
         return w;
      }
   }
}
