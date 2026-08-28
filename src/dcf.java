import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dcf implements das {
   final String c;
   final daq d;
   final daz e;
   final daz f;
   final jr<cwk> g;
   @Nullable
   private dbc h;

   public dcf(String $$0, daq $$1, daz $$2, daz $$3, jr<cwk> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwo $$5 = $$0.a($$4);
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

   public cwo a(dar $$0, jt.a $$1) {
      cwo $$2 = cwo.j;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwo $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<dci> g() {
      return List.of(new dcn(List.of(this.e.c(), this.f.c()), new dco.d(this.g), new dco.d(cws.fc)));
   }

   @Override
   public dbn<dcf> a() {
      return dbn.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbc ao_() {
      if (this.h == null) {
         this.h = dbc.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public daq c() {
      return this.d;
   }

   public static class a implements dbn<dcf> {
      private static final MapCodec<dcf> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  daq.e.fieldOf("category").orElse(daq.d).forGetter($$0x -> $$0x.d),
                  daz.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  daz.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  cwk.e.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcf::new)
      );
      public static final yn<wa, dcf> w = yn.a(
         yl.o, $$0 -> $$0.c, daq.g, $$0 -> $$0.d, daz.a, $$0 -> $$0.e, daz.a, $$0 -> $$0.f, yl.b(mc.K), $$0 -> $$0.g, dcf::new
      );

      @Override
      public MapCodec<dcf> a() {
         return x;
      }

      @Override
      public yn<wa, dcf> b() {
         return w;
      }
   }
}
