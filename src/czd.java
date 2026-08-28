import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czd implements cza {
   final cyf a;
   final cyf b;
   final cyf c;

   public czd(cyf $$0, cyf $$1, cyf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(czb $$0, dcf $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cuc a(czb $$0, jl.a $$1) {
      cuc $$2 = $$0.d();
      if (this.b.a($$2)) {
         Optional<jj.c<cwh>> $$3 = cwi.a($$1, $$0.e());
         Optional<jj.c<cwj>> $$4 = cwk.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cwg $$5 = $$2.a(kn.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cuc.l;
            }

            cuc $$6 = $$2.c(1);
            $$6.b(kn.K, new cwg($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cuc.l;
   }

   @Override
   public cuc a(jl.a $$0) {
      cuc $$1 = new cuc(cuf.pH);
      Optional<jj.c<cwj>> $$2 = $$0.b(lr.aW).b().findFirst();
      Optional<jj.c<cwh>> $$3 = $$0.b(lr.aV).a(cwi.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kn.K, new cwg($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cuc $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuc $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuc $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyn<?> ap_() {
      return cyn.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyf::c);
   }

   public static class a implements cyn<czd> {
      private static final MapCodec<czd> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyf.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyf.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyf.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czd::new)
      );
      public static final ys<wf, czd> x = ys.a(czd.a::a, czd.a::a);

      @Override
      public MapCodec<czd> a() {
         return y;
      }

      @Override
      public ys<wf, czd> b() {
         return x;
      }

      private static czd a(wf $$0) {
         cyf $$1 = cyf.b.decode($$0);
         cyf $$2 = cyf.b.decode($$0);
         cyf $$3 = cyf.b.decode($$0);
         return new czd($$1, $$2, $$3);
      }

      private static void a(wf $$0, czd $$1) {
         cyf.b.encode($$0, $$1.a);
         cyf.b.encode($$0, $$1.b);
         cyf.b.encode($$0, $$1.c);
      }
   }
}
