import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record czn(List<czn.a> e) implements cyt, czp {
   public static final czn a = new czn(List.of());
   public static final int b = 160;
   public static final Codec<czn> c = czn.a.a.listOf().xmap(czn::new, czn::a);
   public static final zh<wu, czn> d = czn.a.b.a(zf.a()).a(czn::new, czn::a);

   public czn a(czn.a $$0) {
      return new czn(ae.a(this.e, $$0));
   }

   @Override
   public void a(dfm $$0, bvh $$1, cwm $$2, cys $$3) {
      for (czn.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      if ($$2.b()) {
         List<btq> $$3 = new ArrayList<>();

         for (czn.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cyl.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<czn.a> a() {
      return this.e;
   }

   public static record a(jq<bto> c, int d) {
      public static final Codec<czn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bto.a.fieldOf("id").forGetter(czn.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(czn.a::c))
               .apply($$0, czn.a::new)
      );
      public static final zh<wu, czn.a> b = zh.a(bto.b, czn.a::b, zf.h, czn.a::c, czn.a::new);

      public btq a() {
         return new btq(this.c, this.d);
      }

      public jq<bto> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
