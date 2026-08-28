import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dfd implements ddq {
   final String d;
   final ddo e;
   final ddx f;
   final ddx g;
   final dfe h;
   @Nullable
   private dea i;

   public dfd(String $$0, ddo $$1, ddx $$2, ddx $$3, dfe $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czk $$5 = $$0.a($$4);
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

   public czk a(ddp $$0, jh.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         czk $$3 = $$0.a($$2);
         if (!$$3.f() && this.f.a($$3)) {
            return this.h.a($$3);
         }
      }

      return czk.k;
   }

   @Override
   public List<dfh> g() {
      return List.of(new dfm(List.of(this.f.c(), this.g.c()), this.h.a(), new dfn.d(czo.fi)));
   }

   @Override
   public del<dfd> a() {
      return del.m;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public dea al_() {
      if (this.i == null) {
         this.i = dea.b(List.of(this.f, this.g));
      }

      return this.i;
   }

   @Override
   public ddo c() {
      return this.e;
   }

   public static class a implements del<dfd> {
      private static final MapCodec<dfd> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  ddo.e.fieldOf("category").orElse(ddo.d).forGetter($$0x -> $$0x.e),
                  ddx.d.fieldOf("input").forGetter($$0x -> $$0x.f),
                  ddx.d.fieldOf("material").forGetter($$0x -> $$0x.g),
                  dfe.a.fieldOf("result").forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dfd::new)
      );
      public static final yw<wj, dfd> w = yw.a(yu.p, $$0 -> $$0.d, ddo.g, $$0 -> $$0.e, ddx.a, $$0 -> $$0.f, ddx.a, $$0 -> $$0.g, dfe.b, $$0 -> $$0.h, dfd::new);

      @Override
      public MapCodec<dfd> a() {
         return x;
      }

      @Override
      public yw<wj, dfd> b() {
         return w;
      }
   }
}
