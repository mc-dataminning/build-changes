import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dfr implements deq {
   final String d;
   final deo e;
   final dak f;
   final List<dex> g;
   @Nullable
   private dfa h;

   public dfr(String $$0, deo $$1, dak $$2, List<dex> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public dfl<dfr> a() {
      return dfl.b;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public deo c() {
      return this.e;
   }

   @Override
   public dfa aq_() {
      if (this.h == null) {
         this.h = dfa.b(this.g);
      }

      return this.h;
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() != this.g.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.g.size() == 1 ? this.g.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public dak a(dep $$0, ji.a $$1) {
      return this.f.v();
   }

   @Override
   public List<dgh> g() {
      return List.of(new dgm(this.g.stream().map(dex::c).toList(), new dgn.f(this.f), new dgn.d(dao.fi)));
   }

   public static class a implements dfl<dfr> {
      private static final MapCodec<dfr> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  deo.e.fieldOf("category").orElse(deo.d).forGetter($$0x -> $$0x.e),
                  dak.d.fieldOf("result").forGetter($$0x -> $$0x.f),
                  dex.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfr::new)
      );
      public static final ze<wp, dfr> w = ze.a(zc.p, $$0 -> $$0.d, deo.g, $$0 -> $$0.e, dak.j, $$0 -> $$0.f, dex.a.a(zc.a()), $$0 -> $$0.g, dfr::new);

      @Override
      public MapCodec<dfr> a() {
         return x;
      }

      @Override
      public ze<wp, dfr> b() {
         return w;
      }
   }
}
