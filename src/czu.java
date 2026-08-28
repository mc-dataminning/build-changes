import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czu implements czr {
   final cyw a;
   final cyw b;
   final cyw c;

   public czu(cyw $$0, cyw $$1, cyw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(czs $$0, dcw $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cuq a(czs $$0, jo.a $$1) {
      cuq $$2 = $$0.d();
      if (this.b.a($$2)) {
         Optional<jm.c<cwy>> $$3 = cwz.a($$1, $$0.e());
         Optional<jm.c<cxa>> $$4 = cxb.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cwx $$5 = $$2.a(kq.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cuq.l;
            }

            cuq $$6 = $$2.c(1);
            $$6.b(kq.K, new cwx($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cuq.l;
   }

   @Override
   public cuq a(jo.a $$0) {
      cuq $$1 = new cuq(cut.pH);
      Optional<jm.c<cxa>> $$2 = $$0.b(lu.aX).b().findFirst();
      Optional<jm.c<cwy>> $$3 = $$0.b(lu.aW).a(cwz.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kq.K, new cwx($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cuq $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuq $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuq $$0) {
      return this.c.a($$0);
   }

   @Override
   public cze<?> at_() {
      return cze.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyw::c);
   }

   public static class a implements cze<czu> {
      private static final MapCodec<czu> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyw.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyw.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyw.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czu::new)
      );
      public static final yx<wk, czu> x = yx.a(czu.a::a, czu.a::a);

      @Override
      public MapCodec<czu> a() {
         return y;
      }

      @Override
      public yx<wk, czu> b() {
         return x;
      }

      private static czu a(wk $$0) {
         cyw $$1 = cyw.b.decode($$0);
         cyw $$2 = cyw.b.decode($$0);
         cyw $$3 = cyw.b.decode($$0);
         return new czu($$1, $$2, $$3);
      }

      private static void a(wk $$0, czu $$1) {
         cyw.b.encode($$0, $$1.a);
         cyw.b.encode($$0, $$1.b);
         cyw.b.encode($$0, $$1.c);
      }
   }
}
