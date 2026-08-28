import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class del implements dcy {
   final String c;
   final dcw d;
   final ddf e;
   final ddf f;
   final dem g;
   @Nullable
   private ddi h;

   public del(String $$0, dcw $$1, ddf $$2, ddf $$3, dem $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cys $$5 = $$0.a($$4);
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

   public cys a(dcx $$0, jg.a $$1) {
      cys $$2 = cys.k;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cys $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.b().a()) {
            $$2 = $$4;
         }
      }

      return this.g.a($$2);
   }

   @Override
   public List<dep> g() {
      return List.of(new deu(List.of(this.e.c(), this.f.c()), this.g.a(), new dev.d(cyw.fe)));
   }

   @Override
   public ddt<del> a() {
      return ddt.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public ddi ak_() {
      if (this.h == null) {
         this.h = ddi.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dcw c() {
      return this.d;
   }

   public static class a implements ddt<del> {
      private static final MapCodec<del> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dcw.e.fieldOf("category").orElse(dcw.d).forGetter($$0x -> $$0x.d),
                  ddf.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  ddf.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  dem.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, del::new)
      );
      public static final yu<wh, del> w = yu.a(ys.o, $$0 -> $$0.c, dcw.g, $$0 -> $$0.d, ddf.a, $$0 -> $$0.e, ddf.a, $$0 -> $$0.f, dem.b, $$0 -> $$0.g, del::new);

      @Override
      public MapCodec<del> a() {
         return x;
      }

      @Override
      public yu<wh, del> b() {
         return w;
      }
   }
}
