import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class ddf implements dbs {
   final String c;
   final dbq d;
   final dbz e;
   final dbz f;
   final jq<cxk> g;
   @Nullable
   private dcc h;

   public ddf(String $$0, dbq $$1, dbz $$2, dbz $$3, jq<cxk> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxo $$5 = $$0.a($$4);
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

   public cxo a(dbr $$0, js.a $$1) {
      cxo $$2 = cxo.j;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cxo $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<ddi> g() {
      return List.of(new ddn(List.of(this.e.b(), this.f.b()), new ddo.d(this.g), new ddo.d(cxs.fa)));
   }

   @Override
   public dcn<ddf> a() {
      return dcn.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dcc ap_() {
      if (this.h == null) {
         this.h = dcc.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dbq c() {
      return this.d;
   }

   public static class a implements dcn<ddf> {
      private static final MapCodec<ddf> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbq.e.fieldOf("category").orElse(dbq.d).forGetter($$0x -> $$0x.d),
                  dbz.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  dbz.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  cxk.e.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ddf::new)
      );
      public static final zt<xg, ddf> w = zt.a(
         zr.o, $$0 -> $$0.c, dbq.g, $$0 -> $$0.d, dbz.a, $$0 -> $$0.e, dbz.a, $$0 -> $$0.f, zr.b(mb.K), $$0 -> $$0.g, ddf::new
      );

      @Override
      public MapCodec<ddf> a() {
         return x;
      }

      @Override
      public zt<xg, ddf> b() {
         return w;
      }
   }
}
