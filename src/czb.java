import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czb implements cyy {
   final cyd a;
   final cyd b;
   final cyd c;

   public czb(cyd $$0, cyd $$1, cyd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(cyz $$0, dcd $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cua a(cyz $$0, jl.a $$1) {
      cua $$2 = $$0.d();
      if (this.b.a($$2)) {
         Optional<jj.c<cwf>> $$3 = cwg.a($$1, $$0.e());
         Optional<jj.c<cwh>> $$4 = cwi.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cwe $$5 = $$2.a(kn.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cua.l;
            }

            cua $$6 = $$2.c(1);
            $$6.b(kn.K, new cwe($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cua.l;
   }

   @Override
   public cua a(jl.a $$0) {
      cua $$1 = new cua(cud.pH);
      Optional<jj.c<cwh>> $$2 = $$0.b(lr.aW).b().findFirst();
      Optional<jj.c<cwf>> $$3 = $$0.b(lr.aV).a(cwg.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kn.K, new cwe($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cua $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cua $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cua $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyl<?> ap_() {
      return cyl.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyd::c);
   }

   public static class a implements cyl<czb> {
      private static final MapCodec<czb> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyd.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyd.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyd.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czb::new)
      );
      public static final ys<wf, czb> x = ys.a(czb.a::a, czb.a::a);

      @Override
      public MapCodec<czb> a() {
         return y;
      }

      @Override
      public ys<wf, czb> b() {
         return x;
      }

      private static czb a(wf $$0) {
         cyd $$1 = cyd.b.decode($$0);
         cyd $$2 = cyd.b.decode($$0);
         cyd $$3 = cyd.b.decode($$0);
         return new czb($$1, $$2, $$3);
      }

      private static void a(wf $$0, czb $$1) {
         cyd.b.encode($$0, $$1.a);
         cyd.b.encode($$0, $$1.b);
         cyd.b.encode($$0, $$1.c);
      }
   }
}
