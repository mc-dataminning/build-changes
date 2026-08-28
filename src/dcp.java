import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dcp(List<dcp.a> e) implements dbt, dcs {
   public static final dcp a = new dcp(List.of());
   public static final int b = 160;
   public static final Codec<dcp> c = dcp.a.a.listOf().xmap(dcp::new, dcp::a);
   public static final yw<wj, dcp> d = dcp.a.b.a(yu.a()).a(dcp::new, dcp::a);

   public dcp a(dcp.a $$0) {
      return new dcp(ag.a(this.e, $$0));
   }

   @Override
   public void a(djm $$0, bxj $$1, czn $$2, dbs $$3) {
      for (dcp.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      if ($$2.b()) {
         List<bvm> $$4 = new ArrayList<>();

         for (dcp.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         dbj.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<dcp.a> a() {
      return this.e;
   }

   public static record a(jf<bvk> c, int d) {
      public static final Codec<dcp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvk.a.fieldOf("id").forGetter(dcp.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dcp.a::c))
               .apply($$0, dcp.a::new)
      );
      public static final yw<wj, dcp.a> b = yw.a(bvk.b, dcp.a::b, yu.h, dcp.a::c, dcp.a::new);

      public bvm a() {
         return new bvm(this.c, this.d);
      }

      public jf<bvk> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
