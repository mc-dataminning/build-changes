import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dce implements dar {
   final String c;
   final dap d;
   final day e;
   final day f;
   final jr<cwj> g;
   @Nullable
   private dbb h;

   public dce(String $$0, dap $$1, day $$2, day $$3, jr<cwj> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwn $$5 = $$0.a($$4);
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

   public cwn a(daq $$0, jt.a $$1) {
      cwn $$2 = cwn.j;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwn $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<dch> g() {
      return List.of(new dcm(List.of(this.e.c(), this.f.c()), new dcn.d(this.g), new dcn.d(cwr.fc)));
   }

   @Override
   public dbm<dce> a() {
      return dbm.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbb ao_() {
      if (this.h == null) {
         this.h = dbb.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public dap c() {
      return this.d;
   }

   public static class a implements dbm<dce> {
      private static final MapCodec<dce> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dap.e.fieldOf("category").orElse(dap.d).forGetter($$0x -> $$0x.d),
                  day.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  day.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  cwj.e.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dce::new)
      );
      public static final ym<vz, dce> w = ym.a(
         yk.o, $$0 -> $$0.c, dap.g, $$0 -> $$0.d, day.a, $$0 -> $$0.e, day.a, $$0 -> $$0.f, yk.b(mc.K), $$0 -> $$0.g, dce::new
      );

      @Override
      public MapCodec<dce> a() {
         return x;
      }

      @Override
      public ym<vz, dce> b() {
         return w;
      }
   }
}
