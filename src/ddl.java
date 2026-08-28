import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddl(ddh f, ddh g, ddh h) implements ddb {
   public static final MapCodec<ddl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddh.a.fieldOf("input").forGetter(ddl::b), ddh.a.fieldOf("result").forGetter(ddl::d), ddh.a.fieldOf("crafting_station").forGetter(ddl::e))
            .apply($$0, ddl::new)
   );
   public static final yn<wa, ddl> b = yn.a(ddh.b, ddl::b, ddh.b, ddl::d, ddh.b, ddl::e, ddl::new);
   public static final ddb.a<ddl> c = new ddb.a<>(a, b);

   @Override
   public ddb.a<ddl> a() {
      return c;
   }

   public ddh b() {
      return this.f;
   }

   @Override
   public ddh d() {
      return this.g;
   }

   @Override
   public ddh e() {
      return this.h;
   }
}
