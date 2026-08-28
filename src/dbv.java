import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dbv implements dau {
   final String c;
   final das d;
   final cwq e;
   final List<dbb> f;
   @Nullable
   private dbe g;

   public dbv(String $$0, das $$1, cwq $$2, List<dbb> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dbp<dbv> a() {
      return dbp.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public das c() {
      return this.d;
   }

   @Override
   public dbe ao_() {
      if (this.g == null) {
         this.g = dbe.b(this.f);
      }

      return this.g;
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cwq a(dat $$0, jt.a $$1) {
      return this.e.v();
   }

   @Override
   public List<dck> g() {
      return List.of(new dcp(this.f.stream().map(dbb::c).toList(), new dcq.f(this.e), new dcq.d(cwu.fc)));
   }

   public static class a implements dbp<dbv> {
      private static final MapCodec<dbv> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  das.e.fieldOf("category").orElse(das.d).forGetter($$0x -> $$0x.d),
                  cwq.c.fieldOf("result").forGetter($$0x -> $$0x.e),
                  dbb.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dbv::new)
      );
      public static final yn<wa, dbv> w = yn.a(yl.o, $$0 -> $$0.c, das.g, $$0 -> $$0.d, cwq.h, $$0 -> $$0.e, dbb.a.a(yl.a()), $$0 -> $$0.f, dbv::new);

      @Override
      public MapCodec<dbv> a() {
         return x;
      }

      @Override
      public yn<wa, dbv> b() {
         return w;
      }
   }
}
