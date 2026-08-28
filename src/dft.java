import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dft implements deg {
   final String d;
   final dee e;
   final den f;
   final den g;
   final dfu h;
   @Nullable
   private deq i;

   public dft(String $$0, dee $$1, den $$2, den $$3, dfu $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            daa $$5 = $$0.a($$4);
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

   public daa a(def $$0, ji.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         daa $$3 = $$0.a($$2);
         if (!$$3.f() && this.f.a($$3)) {
            return this.h.a($$3);
         }
      }

      return daa.k;
   }

   @Override
   public List<dfx> g() {
      return List.of(new dgc(List.of(this.f.c(), this.g.c()), this.h.a(), new dgd.d(dae.fi)));
   }

   @Override
   public dfb<dft> a() {
      return dfb.m;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public deq ap_() {
      if (this.i == null) {
         this.i = deq.b(List.of(this.f, this.g));
      }

      return this.i;
   }

   @Override
   public dee c() {
      return this.e;
   }

   public static class a implements dfb<dft> {
      private static final MapCodec<dft> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  dee.e.fieldOf("category").orElse(dee.d).forGetter($$0x -> $$0x.e),
                  den.d.fieldOf("input").forGetter($$0x -> $$0x.f),
                  den.d.fieldOf("material").forGetter($$0x -> $$0x.g),
                  dfu.a.fieldOf("result").forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dft::new)
      );
      public static final za<wn, dft> w = za.a(yy.p, $$0 -> $$0.d, dee.g, $$0 -> $$0.e, den.a, $$0 -> $$0.f, den.a, $$0 -> $$0.g, dfu.b, $$0 -> $$0.h, dft::new);

      @Override
      public MapCodec<dft> a() {
         return x;
      }

      @Override
      public za<wn, dft> b() {
         return w;
      }
   }
}
