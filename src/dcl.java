import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dcl implements dbk {
   final String c;
   final dbi d;
   final cxh e;
   final List<dbr> f;
   @Nullable
   private dbu g;

   public dcl(String $$0, dbi $$1, cxh $$2, List<dbr> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dcf<dcl> a() {
      return dcf.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbi c() {
      return this.d;
   }

   @Override
   public dbu ao_() {
      if (this.g == null) {
         this.g = dbu.b(this.f);
      }

      return this.g;
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cxh a(dbj $$0, jt.a $$1) {
      return this.e.v();
   }

   @Override
   public List<ddb> g() {
      return List.of(new ddg(this.f.stream().map(dbr::c).toList(), new ddh.f(this.e), new ddh.d(cxl.fe)));
   }

   public static class a implements dcf<dcl> {
      private static final MapCodec<dcl> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbi.e.fieldOf("category").orElse(dbi.d).forGetter($$0x -> $$0x.d),
                  cxh.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  dbr.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dcl::new)
      );
      public static final yn<wa, dcl> w = yn.a(yl.o, $$0 -> $$0.c, dbi.g, $$0 -> $$0.d, cxh.i, $$0 -> $$0.e, dbr.a.a(yl.a()), $$0 -> $$0.f, dcl::new);

      @Override
      public MapCodec<dcl> a() {
         return x;
      }

      @Override
      public yn<wa, dcl> b() {
         return w;
      }
   }
}
