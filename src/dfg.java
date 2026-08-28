import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dfg implements ddt {
   final String d;
   final ddr e;
   final dea f;
   final dea g;
   final dfh h;
   @Nullable
   private ded i;

   public dfg(String $$0, ddr $$1, dea $$2, dea $$3, dfh $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czn $$5 = $$0.a($$4);
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

   public czn a(dds $$0, jh.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         czn $$3 = $$0.a($$2);
         if (!$$3.f() && this.f.a($$3)) {
            return this.h.a($$3);
         }
      }

      return czn.k;
   }

   @Override
   public List<dfk> g() {
      return List.of(new dfp(List.of(this.f.c(), this.g.c()), this.h.a(), new dfq.d(czr.fi)));
   }

   @Override
   public deo<dfg> a() {
      return deo.m;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public ded al_() {
      if (this.i == null) {
         this.i = ded.b(List.of(this.f, this.g));
      }

      return this.i;
   }

   @Override
   public ddr c() {
      return this.e;
   }

   public static class a implements deo<dfg> {
      private static final MapCodec<dfg> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  ddr.e.fieldOf("category").orElse(ddr.d).forGetter($$0x -> $$0x.e),
                  dea.d.fieldOf("input").forGetter($$0x -> $$0x.f),
                  dea.d.fieldOf("material").forGetter($$0x -> $$0x.g),
                  dfh.a.fieldOf("result").forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dfg::new)
      );
      public static final yw<wj, dfg> w = yw.a(yu.p, $$0 -> $$0.d, ddr.g, $$0 -> $$0.e, dea.a, $$0 -> $$0.f, dea.a, $$0 -> $$0.g, dfh.b, $$0 -> $$0.h, dfg::new);

      @Override
      public MapCodec<dfg> a() {
         return x;
      }

      @Override
      public yw<wj, dfg> b() {
         return w;
      }
   }
}
