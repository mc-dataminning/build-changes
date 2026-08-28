import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cze implements czb {
   final cyg a;
   final cyg b;
   final cyg c;

   public cze(cyg $$0, cyg $$1, cyg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(czc $$0, dcg $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cud a(czc $$0, jl.a $$1) {
      cud $$2 = $$0.d();
      if (this.b.a($$2)) {
         Optional<jj.c<cwi>> $$3 = cwj.a($$1, $$0.e());
         Optional<jj.c<cwk>> $$4 = cwl.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cwh $$5 = $$2.a(kn.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cud.l;
            }

            cud $$6 = $$2.c(1);
            $$6.b(kn.K, new cwh($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cud.l;
   }

   @Override
   public cud a(jl.a $$0) {
      cud $$1 = new cud(cug.pH);
      Optional<jj.c<cwk>> $$2 = $$0.b(lr.aW).b().findFirst();
      Optional<jj.c<cwi>> $$3 = $$0.b(lr.aV).a(cwj.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kn.K, new cwh($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cud $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cud $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cud $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyo<?> ap_() {
      return cyo.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyg::c);
   }

   public static class a implements cyo<cze> {
      private static final MapCodec<cze> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyg.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyg.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyg.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cze::new)
      );
      public static final ys<wf, cze> x = ys.a(cze.a::a, cze.a::a);

      @Override
      public MapCodec<cze> a() {
         return y;
      }

      @Override
      public ys<wf, cze> b() {
         return x;
      }

      private static cze a(wf $$0) {
         cyg $$1 = cyg.b.decode($$0);
         cyg $$2 = cyg.b.decode($$0);
         cyg $$3 = cyg.b.decode($$0);
         return new cze($$1, $$2, $$3);
      }

      private static void a(wf $$0, cze $$1) {
         cyg.b.encode($$0, $$1.a);
         cyg.b.encode($$0, $$1.b);
         cyg.b.encode($$0, $$1.c);
      }
   }
}
