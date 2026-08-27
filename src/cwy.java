import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cwy implements cww {
   final cwd a;
   final cwd b;
   final cwd c;

   public cwy(cwd $$0, cwd $$1, cwd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(boj $$0, czu $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public csd a(boj $$0, jj $$1) {
      csd $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<iv.c<cug>> $$3 = cuh.a($$1, $$0.a(2));
         Optional<iv.c<cui>> $$4 = cuj.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cuf $$5 = $$2.a(jz.B);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return csd.i;
            }

            csd $$6 = $$2.c(1);
            $$6.b(jz.B, new cuf($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return csd.i;
   }

   @Override
   public csd a(jj $$0) {
      csd $$1 = new csd(csg.pH);
      Optional<iv.c<cui>> $$2 = $$0.d(ld.aO).h().findFirst();
      Optional<iv.c<cug>> $$3 = $$0.d(ld.aN).b(cuh.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(jz.B, new cuf($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(csd $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(csd $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(csd $$0) {
      return this.c.a($$0);
   }

   @Override
   public cwk<?> ao_() {
      return cwk.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cwd::c);
   }

   public static class a implements cwk<cwy> {
      private static final Codec<cwy> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cwd.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cwd.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cwd.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cwy::new)
      );
      public static final yq<wd, cwy> x = yq.a(cwy.a::a, cwy.a::a);

      @Override
      public Codec<cwy> a() {
         return y;
      }

      @Override
      public yq<wd, cwy> b() {
         return x;
      }

      private static cwy a(wd $$0) {
         cwd $$1 = cwd.b.decode($$0);
         cwd $$2 = cwd.b.decode($$0);
         cwd $$3 = cwd.b.decode($$0);
         return new cwy($$1, $$2, $$3);
      }

      private static void a(wd $$0, cwy $$1) {
         cwd.b.encode($$0, $$1.a);
         cwd.b.encode($$0, $$1.b);
         cwd.b.encode($$0, $$1.c);
      }
   }
}
