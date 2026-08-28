import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record ddc(List<ddc.a> e) implements dcg, ddf {
   public static final ddc a = new ddc(List.of());
   public static final int b = 160;
   public static final Codec<ddc> c = ddc.a.a.listOf().xmap(ddc::new, ddc::a);
   public static final za<wn, ddc> d = ddc.a.b.a(yy.a()).a(ddc::new, ddc::a);

   public ddc a(ddc.a $$0) {
      return new ddc(ag.a(this.e, $$0));
   }

   @Override
   public void a(djz $$0, bxw $$1, daa $$2, dcf $$3) {
      for (ddc.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      if ($$2.b()) {
         List<bvz> $$4 = new ArrayList<>();

         for (ddc.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         dbw.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<ddc.a> a() {
      return this.e;
   }

   public static record a(jg<bvx> c, int d) {
      public static final Codec<ddc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvx.a.fieldOf("id").forGetter(ddc.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(ddc.a::c))
               .apply($$0, ddc.a::new)
      );
      public static final za<wn, ddc.a> b = za.a(bvx.b, ddc.a::b, yy.h, ddc.a::c, ddc.a::new);

      public bvz a() {
         return new bvz(this.c, this.d);
      }

      public jg<bvx> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
