import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class ddn implements dca {
   final String c;
   final dby d;
   final dch e;
   final dch f;
   final ddo g;
   @Nullable
   private dck h;

   public ddn(String $$0, dby $$1, dch $$2, dch $$3, ddo $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (!$$2 && this.e.a($$5) && $$5.h() != this.g.b().a()) {
                  $$2 = true;
               } else {
                  if ($$3 || !this.f.a($$5)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cxy a(dbz $$0, ju.a $$1) {
      cxy $$2 = cxy.k;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cxy $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.b().a()) {
            $$2 = $$4;
         }
      }

      return this.g.a($$2);
   }

   @Override
   public List<ddr> g() {
      return List.of(new ddw(List.of(this.e.c(), this.f.c()), this.g.a(), new ddx.d(cyc.fe)));
   }

   @Override
   public dcv<ddn> a() {
      return dcv.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dck ak_() {
      if (this.h == null) {
         this.h = dck.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dby c() {
      return this.d;
   }

   public static class a implements dcv<ddn> {
      private static final MapCodec<ddn> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dby.e.fieldOf("category").orElse(dby.d).forGetter($$0x -> $$0x.d),
                  dch.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  dch.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  ddo.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ddn::new)
      );
      public static final yt<wg, ddn> w = yt.a(yr.o, $$0 -> $$0.c, dby.g, $$0 -> $$0.d, dch.a, $$0 -> $$0.e, dch.a, $$0 -> $$0.f, ddo.b, $$0 -> $$0.g, ddn::new);

      @Override
      public MapCodec<ddn> a() {
         return x;
      }

      @Override
      public yt<wg, ddn> b() {
         return w;
      }
   }
}
