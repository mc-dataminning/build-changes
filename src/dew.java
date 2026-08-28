import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dew implements ddj {
   final String c;
   final ddh d;
   final ddq e;
   final ddq f;
   final dex g;
   @Nullable
   private ddt h;

   public dew(String $$0, ddh $$1, ddq $$2, ddq $$3, dex $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czd $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (!$$2 && this.e.a($$5)) {
                  if (this.g.b($$5)) {
                     return false;
                  }

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

   public czd a(ddi $$0, jg.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         czd $$3 = $$0.a($$2);
         if (!$$3.f() && this.e.a($$3)) {
            return this.g.a($$3);
         }
      }

      return czd.k;
   }

   @Override
   public List<dfa> g() {
      return List.of(new dff(List.of(this.e.c(), this.f.c()), this.g.a(), new dfg.d(czh.fi)));
   }

   @Override
   public dee<dew> a() {
      return dee.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public ddt al_() {
      if (this.h == null) {
         this.h = ddt.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public ddh c() {
      return this.d;
   }

   public static class a implements dee<dew> {
      private static final MapCodec<dew> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  ddh.e.fieldOf("category").orElse(ddh.d).forGetter($$0x -> $$0x.d),
                  ddq.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  ddq.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  dex.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dew::new)
      );
      public static final yw<wj, dew> w = yw.a(yu.o, $$0 -> $$0.c, ddh.g, $$0 -> $$0.d, ddq.a, $$0 -> $$0.e, ddq.a, $$0 -> $$0.f, dex.b, $$0 -> $$0.g, dew::new);

      @Override
      public MapCodec<dew> a() {
         return x;
      }

      @Override
      public yw<wj, dew> b() {
         return w;
      }
   }
}
