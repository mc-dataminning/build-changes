import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dgd implements deq {
   final String d;
   final deo e;
   final dex f;
   final dex g;
   final dge h;
   @Nullable
   private dfa i;

   public dgd(String $$0, deo $$1, dex $$2, dex $$3, dge $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dak $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (!$$2 && this.f.a($$5)) {
                  if (this.h.b($$5)) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if ($$3 || !this.g.a($$5)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public dak a(dep $$0, ji.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         dak $$3 = $$0.a($$2);
         if (!$$3.f() && this.f.a($$3)) {
            return this.h.a($$3);
         }
      }

      return dak.l;
   }

   @Override
   public List<dgh> g() {
      return List.of(new dgm(List.of(this.f.c(), this.g.c()), this.h.a(), new dgn.d(dao.fi)));
   }

   @Override
   public dfl<dgd> a() {
      return dfl.m;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public dfa aq_() {
      if (this.i == null) {
         this.i = dfa.b(List.of(this.f, this.g));
      }

      return this.i;
   }

   @Override
   public deo c() {
      return this.e;
   }

   public static class a implements dfl<dgd> {
      private static final MapCodec<dgd> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  deo.e.fieldOf("category").orElse(deo.d).forGetter($$0x -> $$0x.e),
                  dex.d.fieldOf("input").forGetter($$0x -> $$0x.f),
                  dex.d.fieldOf("material").forGetter($$0x -> $$0x.g),
                  dge.a.fieldOf("result").forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dgd::new)
      );
      public static final ze<wp, dgd> w = ze.a(zc.p, $$0 -> $$0.d, deo.g, $$0 -> $$0.e, dex.a, $$0 -> $$0.f, dex.a, $$0 -> $$0.g, dge.b, $$0 -> $$0.h, dgd::new);

      @Override
      public MapCodec<dgd> a() {
         return x;
      }

      @Override
      public ze<wp, dgd> b() {
         return w;
      }
   }
}
