import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dch implements dau {
   final String c;
   final das d;
   final dbb e;
   final dbb f;
   final jr<cwm> g;
   @Nullable
   private dbe h;

   public dch(String $$0, das $$1, dbb $$2, dbb $$3, jr<cwm> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwq $$5 = $$0.a($$4);
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

   public cwq a(dat $$0, jt.a $$1) {
      cwq $$2 = cwq.j;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwq $$4 = $$0.a($$3);
         if (!$$4.f() && this.e.a($$4) && $$4.h() != this.g.a()) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.g.a(), 1);
   }

   @Override
   public List<dck> g() {
      return List.of(new dcp(List.of(this.e.c(), this.f.c()), new dcq.d(this.g), new dcq.d(cwu.fc)));
   }

   @Override
   public dbp<dch> a() {
      return dbp.m;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbe ao_() {
      if (this.h == null) {
         this.h = dbe.b(List.of(this.e, this.f));
      }

      return this.h;
   }

   @Override
   public das c() {
      return this.d;
   }

   public static class a implements dbp<dch> {
      private static final MapCodec<dch> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  das.e.fieldOf("category").orElse(das.d).forGetter($$0x -> $$0x.d),
                  dbb.d.fieldOf("input").forGetter($$0x -> $$0x.e),
                  dbb.d.fieldOf("material").forGetter($$0x -> $$0x.f),
                  cwm.e.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dch::new)
      );
      public static final yn<wa, dch> w = yn.a(
         yl.o, $$0 -> $$0.c, das.g, $$0 -> $$0.d, dbb.a, $$0 -> $$0.e, dbb.a, $$0 -> $$0.f, yl.b(mc.K), $$0 -> $$0.g, dch::new
      );

      @Override
      public MapCodec<dch> a() {
         return x;
      }

      @Override
      public yn<wa, dch> b() {
         return w;
      }
   }
}
