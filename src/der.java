import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class der implements dde {
   final String c;
   final ddc d;
   final ddl e;
   final ddl f;
   final des g;
   @Nullable
   private ddo h;

   public der(String $$0, ddc $$1, ddl $$2, ddl $$3, des $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cyy $$5 = $$0.a($$4);
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

   public cyy a(ddd $$0, jg.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cyy $$3 = $$0.a($$2);
         if (!$$3.f() && this.e.a($$3)) {
            return this.g.a($$3);
         }
      }

      return cyy.k;
   }

   @Override
   public List<dev> g() {
      return List.of(new dfa(List.of(this.e.c(), this.f.c()), this.g.a(), new dfb.d(czc.fg)));
   }

   @Override
   public ddz<der> a() {
      return ddz.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public ddo ak_() {
      if (this.h == null) {
         this.h = ddo.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public ddc c() {
      return this.d;
   }

   public static class a implements ddz<der> {
      private static final MapCodec<der> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  ddc.e.fieldOf("category").orElse(ddc.d).forGetter($$0x -> $$0x.d),
                  ddl.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  ddl.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  des.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, der::new)
      );
      public static final yw<wj, der> w = yw.a(yu.o, $$0 -> $$0.c, ddc.g, $$0 -> $$0.d, ddl.a, $$0 -> $$0.e, ddl.a, $$0 -> $$0.f, des.b, $$0 -> $$0.g, der::new);

      @Override
      public MapCodec<der> a() {
         return x;
      }

      @Override
      public yw<wj, der> b() {
         return w;
      }
   }
}
