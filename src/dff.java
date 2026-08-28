import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dff implements dee {
   final String d;
   final dec e;
   final czy f;
   final List<del> g;
   @Nullable
   private deo h;

   public dff(String $$0, dec $$1, czy $$2, List<del> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public dez<dff> a() {
      return dez.b;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public dec c() {
      return this.e;
   }

   @Override
   public deo ap_() {
      if (this.h == null) {
         this.h = deo.b(this.g);
      }

      return this.h;
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() != this.g.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.g.size() == 1 ? this.g.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public czy a(ded $$0, jh.a $$1) {
      return this.f.v();
   }

   @Override
   public List<dfv> g() {
      return List.of(new dga(this.g.stream().map(del::c).toList(), new dgb.f(this.f), new dgb.d(dac.fi)));
   }

   public static class a implements dez<dff> {
      private static final MapCodec<dff> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  dec.e.fieldOf("category").orElse(dec.d).forGetter($$0x -> $$0x.e),
                  czy.d.fieldOf("result").forGetter($$0x -> $$0x.f),
                  del.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dff::new)
      );
      public static final yy<wl, dff> w = yy.a(yw.p, $$0 -> $$0.d, dec.g, $$0 -> $$0.e, czy.i, $$0 -> $$0.f, del.a.a(yw.a()), $$0 -> $$0.g, dff::new);

      @Override
      public MapCodec<dff> a() {
         return x;
      }

      @Override
      public yy<wl, dff> b() {
         return w;
      }
   }
}
