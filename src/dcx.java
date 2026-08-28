import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dcx implements dbk {
   final String c;
   final dbi d;
   final dbr e;
   final dbr f;
   final dcy g;
   @Nullable
   private dbu h;

   public dcx(String $$0, dbi $$1, dbr $$2, dbr $$3, dcy $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxh $$5 = $$0.a($$4);
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

   public cxh a(dbj $$0, jt.a $$1) {
      cxh $$2 = cxh.k;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cxh $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.b().a()) {
            $$2 = $$4;
         }
      }

      return this.g.a($$2);
   }

   @Override
   public List<ddb> g() {
      return List.of(new ddg(List.of(this.e.c(), this.f.c()), this.g.a(), new ddh.d(cxl.fe)));
   }

   @Override
   public dcf<dcx> a() {
      return dcf.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbu ao_() {
      if (this.h == null) {
         this.h = dbu.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dbi c() {
      return this.d;
   }

   public static class a implements dcf<dcx> {
      private static final MapCodec<dcx> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbi.e.fieldOf("category").orElse(dbi.d).forGetter($$0x -> $$0x.d),
                  dbr.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  dbr.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  dcy.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcx::new)
      );
      public static final yn<wa, dcx> w = yn.a(yl.o, $$0 -> $$0.c, dbi.g, $$0 -> $$0.d, dbr.a, $$0 -> $$0.e, dbr.a, $$0 -> $$0.f, dcy.b, $$0 -> $$0.g, dcx::new);

      @Override
      public MapCodec<dcx> a() {
         return x;
      }

      @Override
      public yn<wa, dcx> b() {
         return w;
      }
   }
}
