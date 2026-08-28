import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dfr implements dee {
   final String d;
   final dec e;
   final del f;
   final del g;
   final dfs h;
   @Nullable
   private deo i;

   public dfr(String $$0, dec $$1, del $$2, del $$3, dfs $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (!$$2 && this.f.a($$5)) {
                  if (this.h.b($$5)) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if ($$3 || !this.g.a($$5)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public czy a(ded $$0, jh.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         czy $$3 = $$0.a($$2);
         if (!$$3.f() && this.f.a($$3)) {
            return this.h.a($$3);
         }
      }

      return czy.k;
   }

   @Override
   public List<dfv> g() {
      return List.of(new dga(List.of(this.f.c(), this.g.c()), this.h.a(), new dgb.d(dac.fi)));
   }

   @Override
   public dez<dfr> a() {
      return dez.m;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public deo ap_() {
      if (this.i == null) {
         this.i = deo.b(List.of(this.f, this.g));
      }

      return this.i;
   }

   @Override
   public dec c() {
      return this.e;
   }

   public static class a implements dez<dfr> {
      private static final MapCodec<dfr> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  dec.e.fieldOf("category").orElse(dec.d).forGetter($$0x -> $$0x.e),
                  del.d.fieldOf("input").forGetter($$0x -> $$0x.f),
                  del.d.fieldOf("material").forGetter($$0x -> $$0x.g),
                  dfs.a.fieldOf("result").forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dfr::new)
      );
      public static final yy<wl, dfr> w = yy.a(yw.p, $$0 -> $$0.d, dec.g, $$0 -> $$0.e, del.a, $$0 -> $$0.f, del.a, $$0 -> $$0.g, dfs.b, $$0 -> $$0.h, dfr::new);

      @Override
      public MapCodec<dfr> a() {
         return x;
      }

      @Override
      public yy<wl, dfr> b() {
         return w;
      }
   }
}
