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
   final jq<cxc> g;
   @Nullable
   private dbu h;

   public dcx(String $$0, dbi $$1, dbr $$2, dbr $$3, jq<cxc> $$4) {
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
            cxg $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (!$$2 && this.e.a($$5) && $$5.h() != this.g.a()) {
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

   public cxg a(dbj $$0, js.a $$1) {
      cxg $$2 = cxg.j;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cxg $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<dda> g() {
      return List.of(new ddf(List.of(this.e.b(), this.f.b()), new ddg.d(this.g), new ddg.d(cxk.fc)));
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
   public dbu ap_() {
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
                  cxc.e.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcx::new)
      );
      public static final zi<wv, dcx> w = zi.a(
         zg.o, $$0 -> $$0.c, dbi.g, $$0 -> $$0.d, dbr.a, $$0 -> $$0.e, dbr.a, $$0 -> $$0.f, zg.b(mb.K), $$0 -> $$0.g, dcx::new
      );

      @Override
      public MapCodec<dcx> a() {
         return x;
      }

      @Override
      public zi<wv, dcx> b() {
         return w;
      }
   }
}
