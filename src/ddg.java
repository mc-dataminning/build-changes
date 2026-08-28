import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class ddg implements dbt {
   final String c;
   final dbr d;
   final dca e;
   final dca f;
   final jq<cxl> g;
   @Nullable
   private dcd h;

   public ddg(String $$0, dbr $$1, dca $$2, dca $$3, jq<cxl> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxp $$5 = $$0.a($$4);
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

   public cxp a(dbs $$0, js.a $$1) {
      cxp $$2 = cxp.j;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cxp $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<ddj> g() {
      return List.of(new ddo(List.of(this.e.b(), this.f.b()), new ddp.d(this.g), new ddp.d(cxt.fa)));
   }

   @Override
   public dco<ddg> a() {
      return dco.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dcd ap_() {
      if (this.h == null) {
         this.h = dcd.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dbr c() {
      return this.d;
   }

   public static class a implements dco<ddg> {
      private static final MapCodec<ddg> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbr.e.fieldOf("category").orElse(dbr.d).forGetter($$0x -> $$0x.d),
                  dca.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  dca.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  cxl.e.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ddg::new)
      );
      public static final zt<xg, ddg> w = zt.a(
         zr.o, $$0 -> $$0.c, dbr.g, $$0 -> $$0.d, dca.a, $$0 -> $$0.e, dca.a, $$0 -> $$0.f, zr.b(mb.K), $$0 -> $$0.g, ddg::new
      );

      @Override
      public MapCodec<ddg> a() {
         return x;
      }

      @Override
      public zt<xg, ddg> b() {
         return w;
      }
   }
}
