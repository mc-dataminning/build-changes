import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dda implements dbp {
   final String c;
   final dbn d;
   final dbv e;
   final dbv f;
   final jq<cxg> g;
   @Nullable
   private dby h;

   public dda(String $$0, dbn $$1, dbv $$2, dbv $$3, jq<cxg> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dbo $$0, dha $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
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

   public cxk a(dbo $$0, js.a $$1) {
      cxk $$2 = cxk.k;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cxk $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<ddc> g() {
      return List.of(new ddh(List.of(this.e.b(), this.f.b()), new ddi.d(this.g), new ddi.d(cxo.fa)));
   }

   @Override
   public dci<dda> a() {
      return dci.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dby ap_() {
      if (this.h == null) {
         this.h = dby.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dbn c() {
      return this.d;
   }

   public static class a implements dci<dda> {
      private static final MapCodec<dda> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbn.e.fieldOf("category").orElse(dbn.d).forGetter($$0x -> $$0x.d),
                  dbv.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  dbv.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  alw.a(mb.K).fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dda::new)
      );
      public static final zt<xg, dda> w = zt.a(
         zr.o, $$0 -> $$0.c, dbn.g, $$0 -> $$0.d, dbv.a, $$0 -> $$0.e, dbv.a, $$0 -> $$0.f, zr.b(mb.K), $$0 -> $$0.g, dda::new
      );

      @Override
      public MapCodec<dda> a() {
         return x;
      }

      @Override
      public zt<xg, dda> b() {
         return w;
      }
   }
}
