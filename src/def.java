import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class def implements dde {
   final String c;
   final ddc d;
   final cyy e;
   final List<ddl> f;
   @Nullable
   private ddo g;

   public def(String $$0, ddc $$1, cyy $$2, List<ddl> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public ddz<def> a() {
      return ddz.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public ddc c() {
      return this.d;
   }

   @Override
   public ddo ak_() {
      if (this.g == null) {
         this.g = ddo.b(this.f);
      }

      return this.g;
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cyy a(ddd $$0, jg.a $$1) {
      return this.e.v();
   }

   @Override
   public List<dev> g() {
      return List.of(new dfa(this.f.stream().map(ddl::c).toList(), new dfb.f(this.e), new dfb.d(czc.fg)));
   }

   public static class a implements ddz<def> {
      private static final MapCodec<def> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  ddc.e.fieldOf("category").orElse(ddc.d).forGetter($$0x -> $$0x.d),
                  cyy.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  ddl.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, def::new)
      );
      public static final yw<wj, def> w = yw.a(yu.o, $$0 -> $$0.c, ddc.g, $$0 -> $$0.d, cyy.i, $$0 -> $$0.e, ddl.a.a(yu.a()), $$0 -> $$0.f, def::new);

      @Override
      public MapCodec<def> a() {
         return x;
      }

      @Override
      public yw<wj, def> b() {
         return w;
      }
   }
}
