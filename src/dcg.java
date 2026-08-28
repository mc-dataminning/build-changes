import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dcg implements dat {
   final String c;
   final dar d;
   final dba e;
   final dba f;
   final jr<cwl> g;
   @Nullable
   private dbd h;

   public dcg(String $$0, dar $$1, dba $$2, dba $$3, jr<cwl> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwp $$5 = $$0.a($$4);
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

   public cwp a(das $$0, jt.a $$1) {
      cwp $$2 = cwp.j;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwp $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<dcj> g() {
      return List.of(new dco(List.of(this.e.c(), this.f.c()), new dcp.d(this.g), new dcp.d(cwt.fc)));
   }

   @Override
   public dbo<dcg> a() {
      return dbo.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbd ao_() {
      if (this.h == null) {
         this.h = dbd.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dar c() {
      return this.d;
   }

   public static class a implements dbo<dcg> {
      private static final MapCodec<dcg> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dar.e.fieldOf("category").orElse(dar.d).forGetter($$0x -> $$0x.d),
                  dba.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  dba.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  cwl.e.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcg::new)
      );
      public static final yn<wa, dcg> w = yn.a(
         yl.o, $$0 -> $$0.c, dar.g, $$0 -> $$0.d, dba.a, $$0 -> $$0.e, dba.a, $$0 -> $$0.f, yl.b(mc.K), $$0 -> $$0.g, dcg::new
      );

      @Override
      public MapCodec<dcg> a() {
         return x;
      }

      @Override
      public yn<wa, dcg> b() {
         return w;
      }
   }
}
